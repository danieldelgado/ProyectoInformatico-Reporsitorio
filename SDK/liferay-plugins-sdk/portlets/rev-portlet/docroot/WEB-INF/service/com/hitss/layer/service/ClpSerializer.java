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

package com.hitss.layer.service;

import com.hitss.layer.model.ActividadCronogramaClp;
import com.hitss.layer.model.ActividadPlanClp;
import com.hitss.layer.model.ContratoClp;
import com.hitss.layer.model.CronogramaClp;
import com.hitss.layer.model.DetalleRepuestaEvaluacionClp;
import com.hitss.layer.model.DetalleRepuestaReclutamientoClp;
import com.hitss.layer.model.EstudioClp;
import com.hitss.layer.model.EvaluacionClp;
import com.hitss.layer.model.EvaluacionPreguntaClp;
import com.hitss.layer.model.ExperienciaClp;
import com.hitss.layer.model.FasePostulacionClp;
import com.hitss.layer.model.FichaIngresoClp;
import com.hitss.layer.model.FuncionClp;
import com.hitss.layer.model.InformeRetroalimentacionClp;
import com.hitss.layer.model.LogOperacionesClp;
import com.hitss.layer.model.ObservacionesClp;
import com.hitss.layer.model.ParametroClp;
import com.hitss.layer.model.PostulacionClp;
import com.hitss.layer.model.PreguntaClp;
import com.hitss.layer.model.PreguntaRespuestaClp;
import com.hitss.layer.model.PrioridadGrupoUsuariosClp;
import com.hitss.layer.model.ReferenciaClp;
import com.hitss.layer.model.RegistrarActividadPlanUsuarioClp;
import com.hitss.layer.model.RespuestaClp;
import com.hitss.layer.model.SolicitudEvaluacionDesempennoClp;
import com.hitss.layer.model.SolicitudRequerimientoClp;
import com.hitss.layer.model.SolicitudRequerimientoRequisitoClp;
import com.hitss.layer.model.UsuarioClp;
import com.hitss.layer.model.UsuarioEvaluacionClp;
import com.hitss.layer.model.UsuarioRequisitoClp;

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

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Danielle Delgado
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
						"rev-portlet-deployment-context");

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
							"rev-portlet-deployment-context");

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
				_servletContextName = "rev-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ActividadCronogramaClp.class.getName())) {
			return translateInputActividadCronograma(oldModel);
		}

		if (oldModelClassName.equals(ActividadPlanClp.class.getName())) {
			return translateInputActividadPlan(oldModel);
		}

		if (oldModelClassName.equals(ContratoClp.class.getName())) {
			return translateInputContrato(oldModel);
		}

		if (oldModelClassName.equals(CronogramaClp.class.getName())) {
			return translateInputCronograma(oldModel);
		}

		if (oldModelClassName.equals(
					DetalleRepuestaEvaluacionClp.class.getName())) {
			return translateInputDetalleRepuestaEvaluacion(oldModel);
		}

		if (oldModelClassName.equals(
					DetalleRepuestaReclutamientoClp.class.getName())) {
			return translateInputDetalleRepuestaReclutamiento(oldModel);
		}

		if (oldModelClassName.equals(EstudioClp.class.getName())) {
			return translateInputEstudio(oldModel);
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

		if (oldModelClassName.equals(FichaIngresoClp.class.getName())) {
			return translateInputFichaIngreso(oldModel);
		}

		if (oldModelClassName.equals(FuncionClp.class.getName())) {
			return translateInputFuncion(oldModel);
		}

		if (oldModelClassName.equals(
					InformeRetroalimentacionClp.class.getName())) {
			return translateInputInformeRetroalimentacion(oldModel);
		}

		if (oldModelClassName.equals(LogOperacionesClp.class.getName())) {
			return translateInputLogOperaciones(oldModel);
		}

		if (oldModelClassName.equals(ObservacionesClp.class.getName())) {
			return translateInputObservaciones(oldModel);
		}

		if (oldModelClassName.equals(ParametroClp.class.getName())) {
			return translateInputParametro(oldModel);
		}

		if (oldModelClassName.equals(PostulacionClp.class.getName())) {
			return translateInputPostulacion(oldModel);
		}

		if (oldModelClassName.equals(PreguntaClp.class.getName())) {
			return translateInputPregunta(oldModel);
		}

		if (oldModelClassName.equals(PreguntaRespuestaClp.class.getName())) {
			return translateInputPreguntaRespuesta(oldModel);
		}

		if (oldModelClassName.equals(PrioridadGrupoUsuariosClp.class.getName())) {
			return translateInputPrioridadGrupoUsuarios(oldModel);
		}

		if (oldModelClassName.equals(ReferenciaClp.class.getName())) {
			return translateInputReferencia(oldModel);
		}

		if (oldModelClassName.equals(
					RegistrarActividadPlanUsuarioClp.class.getName())) {
			return translateInputRegistrarActividadPlanUsuario(oldModel);
		}

		if (oldModelClassName.equals(RespuestaClp.class.getName())) {
			return translateInputRespuesta(oldModel);
		}

		if (oldModelClassName.equals(
					SolicitudEvaluacionDesempennoClp.class.getName())) {
			return translateInputSolicitudEvaluacionDesempenno(oldModel);
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

		if (oldModelClassName.equals(UsuarioEvaluacionClp.class.getName())) {
			return translateInputUsuarioEvaluacion(oldModel);
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

	public static Object translateInputActividadCronograma(
		BaseModel<?> oldModel) {
		ActividadCronogramaClp oldClpModel = (ActividadCronogramaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getActividadCronogramaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputActividadPlan(BaseModel<?> oldModel) {
		ActividadPlanClp oldClpModel = (ActividadPlanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getActividadPlanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputContrato(BaseModel<?> oldModel) {
		ContratoClp oldClpModel = (ContratoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getContratoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCronograma(BaseModel<?> oldModel) {
		CronogramaClp oldClpModel = (CronogramaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCronogramaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDetalleRepuestaEvaluacion(
		BaseModel<?> oldModel) {
		DetalleRepuestaEvaluacionClp oldClpModel = (DetalleRepuestaEvaluacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDetalleRepuestaEvaluacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDetalleRepuestaReclutamiento(
		BaseModel<?> oldModel) {
		DetalleRepuestaReclutamientoClp oldClpModel = (DetalleRepuestaReclutamientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDetalleRepuestaReclutamientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEstudio(BaseModel<?> oldModel) {
		EstudioClp oldClpModel = (EstudioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEstudioRemoteModel();

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

	public static Object translateInputFichaIngreso(BaseModel<?> oldModel) {
		FichaIngresoClp oldClpModel = (FichaIngresoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFichaIngresoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFuncion(BaseModel<?> oldModel) {
		FuncionClp oldClpModel = (FuncionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFuncionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInformeRetroalimentacion(
		BaseModel<?> oldModel) {
		InformeRetroalimentacionClp oldClpModel = (InformeRetroalimentacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInformeRetroalimentacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLogOperaciones(BaseModel<?> oldModel) {
		LogOperacionesClp oldClpModel = (LogOperacionesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLogOperacionesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputObservaciones(BaseModel<?> oldModel) {
		ObservacionesClp oldClpModel = (ObservacionesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getObservacionesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputParametro(BaseModel<?> oldModel) {
		ParametroClp oldClpModel = (ParametroClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getParametroRemoteModel();

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

	public static Object translateInputPreguntaRespuesta(BaseModel<?> oldModel) {
		PreguntaRespuestaClp oldClpModel = (PreguntaRespuestaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPreguntaRespuestaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPrioridadGrupoUsuarios(
		BaseModel<?> oldModel) {
		PrioridadGrupoUsuariosClp oldClpModel = (PrioridadGrupoUsuariosClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPrioridadGrupoUsuariosRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputReferencia(BaseModel<?> oldModel) {
		ReferenciaClp oldClpModel = (ReferenciaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getReferenciaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRegistrarActividadPlanUsuario(
		BaseModel<?> oldModel) {
		RegistrarActividadPlanUsuarioClp oldClpModel = (RegistrarActividadPlanUsuarioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRegistrarActividadPlanUsuarioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRespuesta(BaseModel<?> oldModel) {
		RespuestaClp oldClpModel = (RespuestaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRespuestaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSolicitudEvaluacionDesempenno(
		BaseModel<?> oldModel) {
		SolicitudEvaluacionDesempennoClp oldClpModel = (SolicitudEvaluacionDesempennoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSolicitudEvaluacionDesempennoRemoteModel();

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

	public static Object translateInputUsuarioEvaluacion(BaseModel<?> oldModel) {
		UsuarioEvaluacionClp oldClpModel = (UsuarioEvaluacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUsuarioEvaluacionRemoteModel();

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
					"com.hitss.layer.model.impl.ActividadCronogramaImpl")) {
			return translateOutputActividadCronograma(oldModel);
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
					"com.hitss.layer.model.impl.ActividadPlanImpl")) {
			return translateOutputActividadPlan(oldModel);
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.ContratoImpl")) {
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
					"com.hitss.layer.model.impl.CronogramaImpl")) {
			return translateOutputCronograma(oldModel);
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
					"com.hitss.layer.model.impl.DetalleRepuestaEvaluacionImpl")) {
			return translateOutputDetalleRepuestaEvaluacion(oldModel);
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
					"com.hitss.layer.model.impl.DetalleRepuestaReclutamientoImpl")) {
			return translateOutputDetalleRepuestaReclutamiento(oldModel);
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.EstudioImpl")) {
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
					"com.hitss.layer.model.impl.EvaluacionImpl")) {
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
					"com.hitss.layer.model.impl.EvaluacionPreguntaImpl")) {
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
					"com.hitss.layer.model.impl.ExperienciaImpl")) {
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
					"com.hitss.layer.model.impl.FasePostulacionImpl")) {
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
					"com.hitss.layer.model.impl.FichaIngresoImpl")) {
			return translateOutputFichaIngreso(oldModel);
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.FuncionImpl")) {
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
					"com.hitss.layer.model.impl.InformeRetroalimentacionImpl")) {
			return translateOutputInformeRetroalimentacion(oldModel);
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
					"com.hitss.layer.model.impl.LogOperacionesImpl")) {
			return translateOutputLogOperaciones(oldModel);
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
					"com.hitss.layer.model.impl.ObservacionesImpl")) {
			return translateOutputObservaciones(oldModel);
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.ParametroImpl")) {
			return translateOutputParametro(oldModel);
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
					"com.hitss.layer.model.impl.PostulacionImpl")) {
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.PreguntaImpl")) {
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
					"com.hitss.layer.model.impl.PreguntaRespuestaImpl")) {
			return translateOutputPreguntaRespuesta(oldModel);
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
					"com.hitss.layer.model.impl.PrioridadGrupoUsuariosImpl")) {
			return translateOutputPrioridadGrupoUsuarios(oldModel);
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
					"com.hitss.layer.model.impl.ReferenciaImpl")) {
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
					"com.hitss.layer.model.impl.RegistrarActividadPlanUsuarioImpl")) {
			return translateOutputRegistrarActividadPlanUsuario(oldModel);
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.RespuestaImpl")) {
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
					"com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoImpl")) {
			return translateOutputSolicitudEvaluacionDesempenno(oldModel);
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
					"com.hitss.layer.model.impl.SolicitudRequerimientoImpl")) {
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
					"com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl")) {
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

		if (oldModelClassName.equals("com.hitss.layer.model.impl.UsuarioImpl")) {
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
					"com.hitss.layer.model.impl.UsuarioEvaluacionImpl")) {
			return translateOutputUsuarioEvaluacion(oldModel);
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
					"com.hitss.layer.model.impl.UsuarioRequisitoImpl")) {
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

		if (className.equals(
					"com.hitss.layer.NoSuchActividadCronogramaException")) {
			return new com.hitss.layer.NoSuchActividadCronogramaException();
		}

		if (className.equals("com.hitss.layer.NoSuchActividadPlanException")) {
			return new com.hitss.layer.NoSuchActividadPlanException();
		}

		if (className.equals("com.hitss.layer.NoSuchContratoException")) {
			return new com.hitss.layer.NoSuchContratoException();
		}

		if (className.equals("com.hitss.layer.NoSuchCronogramaException")) {
			return new com.hitss.layer.NoSuchCronogramaException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException")) {
			return new com.hitss.layer.NoSuchDetalleRepuestaEvaluacionException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException")) {
			return new com.hitss.layer.NoSuchDetalleRepuestaReclutamientoException();
		}

		if (className.equals("com.hitss.layer.NoSuchEstudioException")) {
			return new com.hitss.layer.NoSuchEstudioException();
		}

		if (className.equals("com.hitss.layer.NoSuchEvaluacionException")) {
			return new com.hitss.layer.NoSuchEvaluacionException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchEvaluacionPreguntaException")) {
			return new com.hitss.layer.NoSuchEvaluacionPreguntaException();
		}

		if (className.equals("com.hitss.layer.NoSuchExperienciaException")) {
			return new com.hitss.layer.NoSuchExperienciaException();
		}

		if (className.equals("com.hitss.layer.NoSuchFasePostulacionException")) {
			return new com.hitss.layer.NoSuchFasePostulacionException();
		}

		if (className.equals("com.hitss.layer.NoSuchFichaIngresoException")) {
			return new com.hitss.layer.NoSuchFichaIngresoException();
		}

		if (className.equals("com.hitss.layer.NoSuchFuncionException")) {
			return new com.hitss.layer.NoSuchFuncionException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchInformeRetroalimentacionException")) {
			return new com.hitss.layer.NoSuchInformeRetroalimentacionException();
		}

		if (className.equals("com.hitss.layer.NoSuchLogOperacionesException")) {
			return new com.hitss.layer.NoSuchLogOperacionesException();
		}

		if (className.equals("com.hitss.layer.NoSuchObservacionesException")) {
			return new com.hitss.layer.NoSuchObservacionesException();
		}

		if (className.equals("com.hitss.layer.NoSuchParametroException")) {
			return new com.hitss.layer.NoSuchParametroException();
		}

		if (className.equals("com.hitss.layer.NoSuchPostulacionException")) {
			return new com.hitss.layer.NoSuchPostulacionException();
		}

		if (className.equals("com.hitss.layer.NoSuchPreguntaException")) {
			return new com.hitss.layer.NoSuchPreguntaException();
		}

		if (className.equals("com.hitss.layer.NoSuchPreguntaRespuestaException")) {
			return new com.hitss.layer.NoSuchPreguntaRespuestaException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchPrioridadGrupoUsuariosException")) {
			return new com.hitss.layer.NoSuchPrioridadGrupoUsuariosException();
		}

		if (className.equals("com.hitss.layer.NoSuchReferenciaException")) {
			return new com.hitss.layer.NoSuchReferenciaException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException")) {
			return new com.hitss.layer.NoSuchRegistrarActividadPlanUsuarioException();
		}

		if (className.equals("com.hitss.layer.NoSuchRespuestaException")) {
			return new com.hitss.layer.NoSuchRespuestaException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException")) {
			return new com.hitss.layer.NoSuchSolicitudEvaluacionDesempennoException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchSolicitudRequerimientoException")) {
			return new com.hitss.layer.NoSuchSolicitudRequerimientoException();
		}

		if (className.equals(
					"com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException")) {
			return new com.hitss.layer.NoSuchSolicitudRequerimientoRequisitoException();
		}

		if (className.equals("com.hitss.layer.NoSuchUsuarioException")) {
			return new com.hitss.layer.NoSuchUsuarioException();
		}

		if (className.equals("com.hitss.layer.NoSuchUsuarioEvaluacionException")) {
			return new com.hitss.layer.NoSuchUsuarioEvaluacionException();
		}

		if (className.equals("com.hitss.layer.NoSuchUsuarioRequisitoException")) {
			return new com.hitss.layer.NoSuchUsuarioRequisitoException();
		}

		return throwable;
	}

	public static Object translateOutputActividadCronograma(
		BaseModel<?> oldModel) {
		ActividadCronogramaClp newModel = new ActividadCronogramaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setActividadCronogramaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputActividadPlan(BaseModel<?> oldModel) {
		ActividadPlanClp newModel = new ActividadPlanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setActividadPlanRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputContrato(BaseModel<?> oldModel) {
		ContratoClp newModel = new ContratoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setContratoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCronograma(BaseModel<?> oldModel) {
		CronogramaClp newModel = new CronogramaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCronogramaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDetalleRepuestaEvaluacion(
		BaseModel<?> oldModel) {
		DetalleRepuestaEvaluacionClp newModel = new DetalleRepuestaEvaluacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDetalleRepuestaEvaluacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDetalleRepuestaReclutamiento(
		BaseModel<?> oldModel) {
		DetalleRepuestaReclutamientoClp newModel = new DetalleRepuestaReclutamientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDetalleRepuestaReclutamientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEstudio(BaseModel<?> oldModel) {
		EstudioClp newModel = new EstudioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEstudioRemoteModel(oldModel);

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

	public static Object translateOutputFichaIngreso(BaseModel<?> oldModel) {
		FichaIngresoClp newModel = new FichaIngresoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFichaIngresoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFuncion(BaseModel<?> oldModel) {
		FuncionClp newModel = new FuncionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFuncionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInformeRetroalimentacion(
		BaseModel<?> oldModel) {
		InformeRetroalimentacionClp newModel = new InformeRetroalimentacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInformeRetroalimentacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLogOperaciones(BaseModel<?> oldModel) {
		LogOperacionesClp newModel = new LogOperacionesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLogOperacionesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputObservaciones(BaseModel<?> oldModel) {
		ObservacionesClp newModel = new ObservacionesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setObservacionesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputParametro(BaseModel<?> oldModel) {
		ParametroClp newModel = new ParametroClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setParametroRemoteModel(oldModel);

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

	public static Object translateOutputPreguntaRespuesta(BaseModel<?> oldModel) {
		PreguntaRespuestaClp newModel = new PreguntaRespuestaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPreguntaRespuestaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPrioridadGrupoUsuarios(
		BaseModel<?> oldModel) {
		PrioridadGrupoUsuariosClp newModel = new PrioridadGrupoUsuariosClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPrioridadGrupoUsuariosRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputReferencia(BaseModel<?> oldModel) {
		ReferenciaClp newModel = new ReferenciaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setReferenciaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRegistrarActividadPlanUsuario(
		BaseModel<?> oldModel) {
		RegistrarActividadPlanUsuarioClp newModel = new RegistrarActividadPlanUsuarioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRegistrarActividadPlanUsuarioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRespuesta(BaseModel<?> oldModel) {
		RespuestaClp newModel = new RespuestaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRespuestaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSolicitudEvaluacionDesempenno(
		BaseModel<?> oldModel) {
		SolicitudEvaluacionDesempennoClp newModel = new SolicitudEvaluacionDesempennoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSolicitudEvaluacionDesempennoRemoteModel(oldModel);

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

	public static Object translateOutputUsuarioEvaluacion(BaseModel<?> oldModel) {
		UsuarioEvaluacionClp newModel = new UsuarioEvaluacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUsuarioEvaluacionRemoteModel(oldModel);

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