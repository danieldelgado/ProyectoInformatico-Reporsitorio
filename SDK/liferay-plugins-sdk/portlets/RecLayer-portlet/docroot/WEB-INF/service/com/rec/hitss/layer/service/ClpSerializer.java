/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rec.hitss.layer.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.rec.hitss.layer.model.ContratoClp;
import com.rec.hitss.layer.model.EstudioClp;
import com.rec.hitss.layer.model.EtiquetaRelacionadaClp;
import com.rec.hitss.layer.model.EvaluacionClp;
import com.rec.hitss.layer.model.EvaluacionPreguntaClp;
import com.rec.hitss.layer.model.ExperienciaClp;
import com.rec.hitss.layer.model.FasePostulacionClp;
import com.rec.hitss.layer.model.FuncionClp;
import com.rec.hitss.layer.model.PostulacionClp;
import com.rec.hitss.layer.model.PreguntaClp;
import com.rec.hitss.layer.model.PuestoClp;
import com.rec.hitss.layer.model.ReferenciaClp;
import com.rec.hitss.layer.model.RequisitoClp;
import com.rec.hitss.layer.model.RespuestaClp;
import com.rec.hitss.layer.model.ResultadoEvaluacionClp;
import com.rec.hitss.layer.model.SolicitudRequerimientoClp;
import com.rec.hitss.layer.model.SolicitudRequerimientoRequisitoClp;
import com.rec.hitss.layer.model.UsuarioClp;
import com.rec.hitss.layer.model.UsuarioRequisitoClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Crossfire
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"RecLayer-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"RecLayer-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "RecLayer-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ContratoClp.class.getName())) {
			return translateInputContrato(oldModel);
		}

		if (oldModelClassName.equals(EstudioClp.class.getName())) {
			return translateInputEstudio(oldModel);
		}

		if (oldModelClassName.equals(EtiquetaRelacionadaClp.class.getName())) {
			return translateInputEtiquetaRelacionada(oldModel);
		}

		if (oldModelClassName.equals(EvaluacionClp.class.getName())) {
			return translateInputEvaluacion(oldModel);
		}

		if (oldModelClassName.equals(EvaluacionPreguntaClp.class.getName())) {
			return translateInputEvaluacionPregunta(oldModel);
		}

		if (oldModelClassName.equals(ExperienciaClp.class.getName())) {
			return translateInputExperiencia(oldModel);
		}

		if (oldModelClassName.equals(FasePostulacionClp.class.getName())) {
			return translateInputFasePostulacion(oldModel);
		}

		if (oldModelClassName.equals(FuncionClp.class.getName())) {
			return translateInputFuncion(oldModel);
		}

		if (oldModelClassName.equals(PostulacionClp.class.getName())) {
			return translateInputPostulacion(oldModel);
		}

		if (oldModelClassName.equals(PreguntaClp.class.getName())) {
			return translateInputPregunta(oldModel);
		}

		if (oldModelClassName.equals(PuestoClp.class.getName())) {
			return translateInputPuesto(oldModel);
		}

		if (oldModelClassName.equals(ReferenciaClp.class.getName())) {
			return translateInputReferencia(oldModel);
		}

		if (oldModelClassName.equals(RequisitoClp.class.getName())) {
			return translateInputRequisito(oldModel);
		}

		if (oldModelClassName.equals(RespuestaClp.class.getName())) {
			return translateInputRespuesta(oldModel);
		}

		if (oldModelClassName.equals(ResultadoEvaluacionClp.class.getName())) {
			return translateInputResultadoEvaluacion(oldModel);
		}

		if (oldModelClassName.equals(SolicitudRequerimientoClp.class.getName())) {
			return translateInputSolicitudRequerimiento(oldModel);
		}

		if (oldModelClassName.equals(
					SolicitudRequerimientoRequisitoClp.class.getName())) {
			return translateInputSolicitudRequerimientoRequisito(oldModel);
		}

		if (oldModelClassName.equals(UsuarioClp.class.getName())) {
			return translateInputUsuario(oldModel);
		}

		if (oldModelClassName.equals(UsuarioRequisitoClp.class.getName())) {
			return translateInputUsuarioRequisito(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputContrato(BaseModel<?> oldModel) {
		ContratoClp oldClpModel = (ContratoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getContratoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEstudio(BaseModel<?> oldModel) {
		EstudioClp oldClpModel = (EstudioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEstudioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEtiquetaRelacionada(
		BaseModel<?> oldModel) {
		EtiquetaRelacionadaClp oldClpModel = (EtiquetaRelacionadaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEtiquetaRelacionadaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEvaluacion(BaseModel<?> oldModel) {
		EvaluacionClp oldClpModel = (EvaluacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEvaluacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEvaluacionPregunta(BaseModel<?> oldModel) {
		EvaluacionPreguntaClp oldClpModel = (EvaluacionPreguntaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEvaluacionPreguntaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputExperiencia(BaseModel<?> oldModel) {
		ExperienciaClp oldClpModel = (ExperienciaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getExperienciaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFasePostulacion(BaseModel<?> oldModel) {
		FasePostulacionClp oldClpModel = (FasePostulacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFasePostulacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFuncion(BaseModel<?> oldModel) {
		FuncionClp oldClpModel = (FuncionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFuncionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPostulacion(BaseModel<?> oldModel) {
		PostulacionClp oldClpModel = (PostulacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPostulacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPregunta(BaseModel<?> oldModel) {
		PreguntaClp oldClpModel = (PreguntaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPreguntaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPuesto(BaseModel<?> oldModel) {
		PuestoClp oldClpModel = (PuestoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPuestoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputReferencia(BaseModel<?> oldModel) {
		ReferenciaClp oldClpModel = (ReferenciaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getReferenciaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRequisito(BaseModel<?> oldModel) {
		RequisitoClp oldClpModel = (RequisitoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRequisitoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRespuesta(BaseModel<?> oldModel) {
		RespuestaClp oldClpModel = (RespuestaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRespuestaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputResultadoEvaluacion(
		BaseModel<?> oldModel) {
		ResultadoEvaluacionClp oldClpModel = (ResultadoEvaluacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getResultadoEvaluacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSolicitudRequerimiento(
		BaseModel<?> oldModel) {
		SolicitudRequerimientoClp oldClpModel = (SolicitudRequerimientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSolicitudRequerimientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSolicitudRequerimientoRequisito(
		BaseModel<?> oldModel) {
		SolicitudRequerimientoRequisitoClp oldClpModel = (SolicitudRequerimientoRequisitoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSolicitudRequerimientoRequisitoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUsuario(BaseModel<?> oldModel) {
		UsuarioClp oldClpModel = (UsuarioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUsuarioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUsuarioRequisito(BaseModel<?> oldModel) {
		UsuarioRequisitoClp oldClpModel = (UsuarioRequisitoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUsuarioRequisitoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.ContratoImpl")) {
			return translateOutputContrato(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.EstudioImpl")) {
			return translateOutputEstudio(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.EtiquetaRelacionadaImpl")) {
			return translateOutputEtiquetaRelacionada(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.EvaluacionImpl")) {
			return translateOutputEvaluacion(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.EvaluacionPreguntaImpl")) {
			return translateOutputEvaluacionPregunta(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.ExperienciaImpl")) {
			return translateOutputExperiencia(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.FasePostulacionImpl")) {
			return translateOutputFasePostulacion(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.FuncionImpl")) {
			return translateOutputFuncion(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.PostulacionImpl")) {
			return translateOutputPostulacion(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.PreguntaImpl")) {
			return translateOutputPregunta(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.PuestoImpl")) {
			return translateOutputPuesto(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.ReferenciaImpl")) {
			return translateOutputReferencia(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.RequisitoImpl")) {
			return translateOutputRequisito(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.RespuestaImpl")) {
			return translateOutputRespuesta(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.ResultadoEvaluacionImpl")) {
			return translateOutputResultadoEvaluacion(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.SolicitudRequerimientoImpl")) {
			return translateOutputSolicitudRequerimiento(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl")) {
			return translateOutputSolicitudRequerimientoRequisito(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.UsuarioImpl")) {
			return translateOutputUsuario(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.UsuarioRequisitoImpl")) {
			return translateOutputUsuarioRequisito(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchContratoException")) {
			return new com.rec.hitss.layer.NoSuchContratoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchEstudioException")) {
			return new com.rec.hitss.layer.NoSuchEstudioException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException")) {
			return new com.rec.hitss.layer.NoSuchEtiquetaRelacionadaException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchEvaluacionException")) {
			return new com.rec.hitss.layer.NoSuchEvaluacionException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchEvaluacionPreguntaException")) {
			return new com.rec.hitss.layer.NoSuchEvaluacionPreguntaException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchExperienciaException")) {
			return new com.rec.hitss.layer.NoSuchExperienciaException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchFasePostulacionException")) {
			return new com.rec.hitss.layer.NoSuchFasePostulacionException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchFuncionException")) {
			return new com.rec.hitss.layer.NoSuchFuncionException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchPostulacionException")) {
			return new com.rec.hitss.layer.NoSuchPostulacionException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchPreguntaException")) {
			return new com.rec.hitss.layer.NoSuchPreguntaException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchPuestoException")) {
			return new com.rec.hitss.layer.NoSuchPuestoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchReferenciaException")) {
			return new com.rec.hitss.layer.NoSuchReferenciaException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchRequisitoException")) {
			return new com.rec.hitss.layer.NoSuchRequisitoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchRespuestaException")) {
			return new com.rec.hitss.layer.NoSuchRespuestaException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchResultadoEvaluacionException")) {
			return new com.rec.hitss.layer.NoSuchResultadoEvaluacionException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchSolicitudRequerimientoException")) {
			return new com.rec.hitss.layer.NoSuchSolicitudRequerimientoException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException")) {
			return new com.rec.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchUsuarioException")) {
			return new com.rec.hitss.layer.NoSuchUsuarioException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchUsuarioRequisitoException")) {
			return new com.rec.hitss.layer.NoSuchUsuarioRequisitoException();
		}

		return throwable;
	}

	public static Object translateOutputContrato(BaseModel<?> oldModel) {
		ContratoClp newModel = new ContratoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setContratoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEstudio(BaseModel<?> oldModel) {
		EstudioClp newModel = new EstudioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEstudioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEtiquetaRelacionada(
		BaseModel<?> oldModel) {
		EtiquetaRelacionadaClp newModel = new EtiquetaRelacionadaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEtiquetaRelacionadaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEvaluacion(BaseModel<?> oldModel) {
		EvaluacionClp newModel = new EvaluacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEvaluacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEvaluacionPregunta(
		BaseModel<?> oldModel) {
		EvaluacionPreguntaClp newModel = new EvaluacionPreguntaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEvaluacionPreguntaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputExperiencia(BaseModel<?> oldModel) {
		ExperienciaClp newModel = new ExperienciaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setExperienciaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFasePostulacion(BaseModel<?> oldModel) {
		FasePostulacionClp newModel = new FasePostulacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFasePostulacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFuncion(BaseModel<?> oldModel) {
		FuncionClp newModel = new FuncionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFuncionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPostulacion(BaseModel<?> oldModel) {
		PostulacionClp newModel = new PostulacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPostulacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPregunta(BaseModel<?> oldModel) {
		PreguntaClp newModel = new PreguntaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPreguntaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPuesto(BaseModel<?> oldModel) {
		PuestoClp newModel = new PuestoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPuestoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputReferencia(BaseModel<?> oldModel) {
		ReferenciaClp newModel = new ReferenciaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setReferenciaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRequisito(BaseModel<?> oldModel) {
		RequisitoClp newModel = new RequisitoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRequisitoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRespuesta(BaseModel<?> oldModel) {
		RespuestaClp newModel = new RespuestaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRespuestaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputResultadoEvaluacion(
		BaseModel<?> oldModel) {
		ResultadoEvaluacionClp newModel = new ResultadoEvaluacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setResultadoEvaluacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSolicitudRequerimiento(
		BaseModel<?> oldModel) {
		SolicitudRequerimientoClp newModel = new SolicitudRequerimientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSolicitudRequerimientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSolicitudRequerimientoRequisito(
		BaseModel<?> oldModel) {
		SolicitudRequerimientoRequisitoClp newModel = new SolicitudRequerimientoRequisitoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSolicitudRequerimientoRequisitoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUsuario(BaseModel<?> oldModel) {
		UsuarioClp newModel = new UsuarioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUsuarioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUsuarioRequisito(BaseModel<?> oldModel) {
		UsuarioRequisitoClp newModel = new UsuarioRequisitoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUsuarioRequisitoRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}