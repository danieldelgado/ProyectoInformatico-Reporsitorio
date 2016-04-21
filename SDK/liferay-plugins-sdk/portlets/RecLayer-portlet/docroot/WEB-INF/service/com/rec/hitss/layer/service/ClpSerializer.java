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

import com.rec.hitss.layer.model.ActividadPlanClp;
import com.rec.hitss.layer.model.ActividadesClp;
import com.rec.hitss.layer.model.CertificadoClp;
import com.rec.hitss.layer.model.ConocimientoClp;
import com.rec.hitss.layer.model.ContratoClp;
import com.rec.hitss.layer.model.CriteriosEvaluacionClp;
import com.rec.hitss.layer.model.CronogramaEvaluacionPersonalClp;
import com.rec.hitss.layer.model.EntrevistaClp;
import com.rec.hitss.layer.model.EstudioClp;
import com.rec.hitss.layer.model.EtiquetaClp;
import com.rec.hitss.layer.model.EvaluacionClp;
import com.rec.hitss.layer.model.EvaluacionPreguntaClp;
import com.rec.hitss.layer.model.ExperienciaClp;
import com.rec.hitss.layer.model.FuncionClp;
import com.rec.hitss.layer.model.FuncionRequerimientoClp;
import com.rec.hitss.layer.model.FuncionUsuarioClp;
import com.rec.hitss.layer.model.InformeRetroalimentacionClp;
import com.rec.hitss.layer.model.ParametroClp;
import com.rec.hitss.layer.model.PlanAccionClp;
import com.rec.hitss.layer.model.PreguntaClp;
import com.rec.hitss.layer.model.PrioridadEquiposClp;
import com.rec.hitss.layer.model.PuestoClp;
import com.rec.hitss.layer.model.ReferenciaClp;
import com.rec.hitss.layer.model.RequerimientoRecursoClp;
import com.rec.hitss.layer.model.RequisitoClp;
import com.rec.hitss.layer.model.RespuestaClp;
import com.rec.hitss.layer.model.ResultadoEvaluacionClp;
import com.rec.hitss.layer.model.SolicitudEvaluacionDesempenoClp;
import com.rec.hitss.layer.model.SolicitudRequerimientoPersonalClp;
import com.rec.hitss.layer.model.UsuarioGrupoClp;
import com.rec.hitss.layer.model.UsuarioHitssClp;

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

		if (oldModelClassName.equals(ActividadesClp.class.getName())) {
			return translateInputActividades(oldModel);
		}

		if (oldModelClassName.equals(ActividadPlanClp.class.getName())) {
			return translateInputActividadPlan(oldModel);
		}

		if (oldModelClassName.equals(CertificadoClp.class.getName())) {
			return translateInputCertificado(oldModel);
		}

		if (oldModelClassName.equals(ConocimientoClp.class.getName())) {
			return translateInputConocimiento(oldModel);
		}

		if (oldModelClassName.equals(ContratoClp.class.getName())) {
			return translateInputContrato(oldModel);
		}

		if (oldModelClassName.equals(CriteriosEvaluacionClp.class.getName())) {
			return translateInputCriteriosEvaluacion(oldModel);
		}

		if (oldModelClassName.equals(
					CronogramaEvaluacionPersonalClp.class.getName())) {
			return translateInputCronogramaEvaluacionPersonal(oldModel);
		}

		if (oldModelClassName.equals(EntrevistaClp.class.getName())) {
			return translateInputEntrevista(oldModel);
		}

		if (oldModelClassName.equals(EstudioClp.class.getName())) {
			return translateInputEstudio(oldModel);
		}

		if (oldModelClassName.equals(EtiquetaClp.class.getName())) {
			return translateInputEtiqueta(oldModel);
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

		if (oldModelClassName.equals(FuncionClp.class.getName())) {
			return translateInputFuncion(oldModel);
		}

		if (oldModelClassName.equals(FuncionRequerimientoClp.class.getName())) {
			return translateInputFuncionRequerimiento(oldModel);
		}

		if (oldModelClassName.equals(FuncionUsuarioClp.class.getName())) {
			return translateInputFuncionUsuario(oldModel);
		}

		if (oldModelClassName.equals(
					InformeRetroalimentacionClp.class.getName())) {
			return translateInputInformeRetroalimentacion(oldModel);
		}

		if (oldModelClassName.equals(ParametroClp.class.getName())) {
			return translateInputParametro(oldModel);
		}

		if (oldModelClassName.equals(PlanAccionClp.class.getName())) {
			return translateInputPlanAccion(oldModel);
		}

		if (oldModelClassName.equals(PreguntaClp.class.getName())) {
			return translateInputPregunta(oldModel);
		}

		if (oldModelClassName.equals(PrioridadEquiposClp.class.getName())) {
			return translateInputPrioridadEquipos(oldModel);
		}

		if (oldModelClassName.equals(PuestoClp.class.getName())) {
			return translateInputPuesto(oldModel);
		}

		if (oldModelClassName.equals(ReferenciaClp.class.getName())) {
			return translateInputReferencia(oldModel);
		}

		if (oldModelClassName.equals(RequerimientoRecursoClp.class.getName())) {
			return translateInputRequerimientoRecurso(oldModel);
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

		if (oldModelClassName.equals(
					SolicitudEvaluacionDesempenoClp.class.getName())) {
			return translateInputSolicitudEvaluacionDesempeno(oldModel);
		}

		if (oldModelClassName.equals(
					SolicitudRequerimientoPersonalClp.class.getName())) {
			return translateInputSolicitudRequerimientoPersonal(oldModel);
		}

		if (oldModelClassName.equals(UsuarioGrupoClp.class.getName())) {
			return translateInputUsuarioGrupo(oldModel);
		}

		if (oldModelClassName.equals(UsuarioHitssClp.class.getName())) {
			return translateInputUsuarioHitss(oldModel);
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

	public static Object translateInputActividades(BaseModel<?> oldModel) {
		ActividadesClp oldClpModel = (ActividadesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getActividadesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputActividadPlan(BaseModel<?> oldModel) {
		ActividadPlanClp oldClpModel = (ActividadPlanClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getActividadPlanRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCertificado(BaseModel<?> oldModel) {
		CertificadoClp oldClpModel = (CertificadoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCertificadoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConocimiento(BaseModel<?> oldModel) {
		ConocimientoClp oldClpModel = (ConocimientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConocimientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputContrato(BaseModel<?> oldModel) {
		ContratoClp oldClpModel = (ContratoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getContratoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCriteriosEvaluacion(
		BaseModel<?> oldModel) {
		CriteriosEvaluacionClp oldClpModel = (CriteriosEvaluacionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCriteriosEvaluacionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCronogramaEvaluacionPersonal(
		BaseModel<?> oldModel) {
		CronogramaEvaluacionPersonalClp oldClpModel = (CronogramaEvaluacionPersonalClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCronogramaEvaluacionPersonalRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEntrevista(BaseModel<?> oldModel) {
		EntrevistaClp oldClpModel = (EntrevistaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEntrevistaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEstudio(BaseModel<?> oldModel) {
		EstudioClp oldClpModel = (EstudioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEstudioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEtiqueta(BaseModel<?> oldModel) {
		EtiquetaClp oldClpModel = (EtiquetaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEtiquetaRemoteModel();

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

	public static Object translateInputFuncion(BaseModel<?> oldModel) {
		FuncionClp oldClpModel = (FuncionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFuncionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFuncionRequerimiento(
		BaseModel<?> oldModel) {
		FuncionRequerimientoClp oldClpModel = (FuncionRequerimientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFuncionRequerimientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFuncionUsuario(BaseModel<?> oldModel) {
		FuncionUsuarioClp oldClpModel = (FuncionUsuarioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFuncionUsuarioRemoteModel();

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

	public static Object translateInputParametro(BaseModel<?> oldModel) {
		ParametroClp oldClpModel = (ParametroClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getParametroRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPlanAccion(BaseModel<?> oldModel) {
		PlanAccionClp oldClpModel = (PlanAccionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPlanAccionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPregunta(BaseModel<?> oldModel) {
		PreguntaClp oldClpModel = (PreguntaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPreguntaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPrioridadEquipos(BaseModel<?> oldModel) {
		PrioridadEquiposClp oldClpModel = (PrioridadEquiposClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPrioridadEquiposRemoteModel();

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

	public static Object translateInputRequerimientoRecurso(
		BaseModel<?> oldModel) {
		RequerimientoRecursoClp oldClpModel = (RequerimientoRecursoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRequerimientoRecursoRemoteModel();

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

	public static Object translateInputSolicitudEvaluacionDesempeno(
		BaseModel<?> oldModel) {
		SolicitudEvaluacionDesempenoClp oldClpModel = (SolicitudEvaluacionDesempenoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSolicitudEvaluacionDesempenoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSolicitudRequerimientoPersonal(
		BaseModel<?> oldModel) {
		SolicitudRequerimientoPersonalClp oldClpModel = (SolicitudRequerimientoPersonalClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSolicitudRequerimientoPersonalRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUsuarioGrupo(BaseModel<?> oldModel) {
		UsuarioGrupoClp oldClpModel = (UsuarioGrupoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUsuarioGrupoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputUsuarioHitss(BaseModel<?> oldModel) {
		UsuarioHitssClp oldClpModel = (UsuarioHitssClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getUsuarioHitssRemoteModel();

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
					"com.rec.hitss.layer.model.impl.ActividadesImpl")) {
			return translateOutputActividades(oldModel);
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
					"com.rec.hitss.layer.model.impl.ActividadPlanImpl")) {
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

		if (oldModelClassName.equals(
					"com.rec.hitss.layer.model.impl.CertificadoImpl")) {
			return translateOutputCertificado(oldModel);
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
					"com.rec.hitss.layer.model.impl.ConocimientoImpl")) {
			return translateOutputConocimiento(oldModel);
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
					"com.rec.hitss.layer.model.impl.CriteriosEvaluacionImpl")) {
			return translateOutputCriteriosEvaluacion(oldModel);
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
					"com.rec.hitss.layer.model.impl.CronogramaEvaluacionPersonalImpl")) {
			return translateOutputCronogramaEvaluacionPersonal(oldModel);
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
					"com.rec.hitss.layer.model.impl.EntrevistaImpl")) {
			return translateOutputEntrevista(oldModel);
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
					"com.rec.hitss.layer.model.impl.EtiquetaImpl")) {
			return translateOutputEtiqueta(oldModel);
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
					"com.rec.hitss.layer.model.impl.FuncionRequerimientoImpl")) {
			return translateOutputFuncionRequerimiento(oldModel);
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
					"com.rec.hitss.layer.model.impl.FuncionUsuarioImpl")) {
			return translateOutputFuncionUsuario(oldModel);
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
					"com.rec.hitss.layer.model.impl.InformeRetroalimentacionImpl")) {
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
					"com.rec.hitss.layer.model.impl.ParametroImpl")) {
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
					"com.rec.hitss.layer.model.impl.PlanAccionImpl")) {
			return translateOutputPlanAccion(oldModel);
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
					"com.rec.hitss.layer.model.impl.PrioridadEquiposImpl")) {
			return translateOutputPrioridadEquipos(oldModel);
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
					"com.rec.hitss.layer.model.impl.RequerimientoRecursoImpl")) {
			return translateOutputRequerimientoRecurso(oldModel);
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
					"com.rec.hitss.layer.model.impl.SolicitudEvaluacionDesempenoImpl")) {
			return translateOutputSolicitudEvaluacionDesempeno(oldModel);
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
					"com.rec.hitss.layer.model.impl.SolicitudRequerimientoPersonalImpl")) {
			return translateOutputSolicitudRequerimientoPersonal(oldModel);
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
					"com.rec.hitss.layer.model.impl.UsuarioGrupoImpl")) {
			return translateOutputUsuarioGrupo(oldModel);
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
					"com.rec.hitss.layer.model.impl.UsuarioHitssImpl")) {
			return translateOutputUsuarioHitss(oldModel);
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

		if (className.equals("com.rec.hitss.layer.NoSuchActividadesException")) {
			return new com.rec.hitss.layer.NoSuchActividadesException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchActividadPlanException")) {
			return new com.rec.hitss.layer.NoSuchActividadPlanException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchCertificadoException")) {
			return new com.rec.hitss.layer.NoSuchCertificadoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchConocimientoException")) {
			return new com.rec.hitss.layer.NoSuchConocimientoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchContratoException")) {
			return new com.rec.hitss.layer.NoSuchContratoException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchCriteriosEvaluacionException")) {
			return new com.rec.hitss.layer.NoSuchCriteriosEvaluacionException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException")) {
			return new com.rec.hitss.layer.NoSuchCronogramaEvaluacionPersonalException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchEntrevistaException")) {
			return new com.rec.hitss.layer.NoSuchEntrevistaException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchEstudioException")) {
			return new com.rec.hitss.layer.NoSuchEstudioException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchEtiquetaException")) {
			return new com.rec.hitss.layer.NoSuchEtiquetaException();
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

		if (className.equals("com.rec.hitss.layer.NoSuchFuncionException")) {
			return new com.rec.hitss.layer.NoSuchFuncionException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchFuncionRequerimientoException")) {
			return new com.rec.hitss.layer.NoSuchFuncionRequerimientoException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchFuncionUsuarioException")) {
			return new com.rec.hitss.layer.NoSuchFuncionUsuarioException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchInformeRetroalimentacionException")) {
			return new com.rec.hitss.layer.NoSuchInformeRetroalimentacionException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchParametroException")) {
			return new com.rec.hitss.layer.NoSuchParametroException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchPlanAccionException")) {
			return new com.rec.hitss.layer.NoSuchPlanAccionException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchPreguntaException")) {
			return new com.rec.hitss.layer.NoSuchPreguntaException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchPrioridadEquiposException")) {
			return new com.rec.hitss.layer.NoSuchPrioridadEquiposException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchPuestoException")) {
			return new com.rec.hitss.layer.NoSuchPuestoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchReferenciaException")) {
			return new com.rec.hitss.layer.NoSuchReferenciaException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchRequerimientoRecursoException")) {
			return new com.rec.hitss.layer.NoSuchRequerimientoRecursoException();
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
					"com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException")) {
			return new com.rec.hitss.layer.NoSuchSolicitudEvaluacionDesempenoException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException")) {
			return new com.rec.hitss.layer.NoSuchSolicitudRequerimientoPersonalException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchUsuarioGrupoException")) {
			return new com.rec.hitss.layer.NoSuchUsuarioGrupoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchUsuarioHitssException")) {
			return new com.rec.hitss.layer.NoSuchUsuarioHitssException();
		}

		return throwable;
	}

	public static Object translateOutputActividades(BaseModel<?> oldModel) {
		ActividadesClp newModel = new ActividadesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setActividadesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputActividadPlan(BaseModel<?> oldModel) {
		ActividadPlanClp newModel = new ActividadPlanClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setActividadPlanRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCertificado(BaseModel<?> oldModel) {
		CertificadoClp newModel = new CertificadoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCertificadoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConocimiento(BaseModel<?> oldModel) {
		ConocimientoClp newModel = new ConocimientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConocimientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputContrato(BaseModel<?> oldModel) {
		ContratoClp newModel = new ContratoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setContratoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCriteriosEvaluacion(
		BaseModel<?> oldModel) {
		CriteriosEvaluacionClp newModel = new CriteriosEvaluacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCriteriosEvaluacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCronogramaEvaluacionPersonal(
		BaseModel<?> oldModel) {
		CronogramaEvaluacionPersonalClp newModel = new CronogramaEvaluacionPersonalClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCronogramaEvaluacionPersonalRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEntrevista(BaseModel<?> oldModel) {
		EntrevistaClp newModel = new EntrevistaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEntrevistaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEstudio(BaseModel<?> oldModel) {
		EstudioClp newModel = new EstudioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEstudioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEtiqueta(BaseModel<?> oldModel) {
		EtiquetaClp newModel = new EtiquetaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEtiquetaRemoteModel(oldModel);

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

	public static Object translateOutputFuncion(BaseModel<?> oldModel) {
		FuncionClp newModel = new FuncionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFuncionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFuncionRequerimiento(
		BaseModel<?> oldModel) {
		FuncionRequerimientoClp newModel = new FuncionRequerimientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFuncionRequerimientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFuncionUsuario(BaseModel<?> oldModel) {
		FuncionUsuarioClp newModel = new FuncionUsuarioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFuncionUsuarioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInformeRetroalimentacion(
		BaseModel<?> oldModel) {
		InformeRetroalimentacionClp newModel = new InformeRetroalimentacionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInformeRetroalimentacionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputParametro(BaseModel<?> oldModel) {
		ParametroClp newModel = new ParametroClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setParametroRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPlanAccion(BaseModel<?> oldModel) {
		PlanAccionClp newModel = new PlanAccionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPlanAccionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPregunta(BaseModel<?> oldModel) {
		PreguntaClp newModel = new PreguntaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPreguntaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPrioridadEquipos(BaseModel<?> oldModel) {
		PrioridadEquiposClp newModel = new PrioridadEquiposClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPrioridadEquiposRemoteModel(oldModel);

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

	public static Object translateOutputRequerimientoRecurso(
		BaseModel<?> oldModel) {
		RequerimientoRecursoClp newModel = new RequerimientoRecursoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRequerimientoRecursoRemoteModel(oldModel);

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

	public static Object translateOutputSolicitudEvaluacionDesempeno(
		BaseModel<?> oldModel) {
		SolicitudEvaluacionDesempenoClp newModel = new SolicitudEvaluacionDesempenoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSolicitudEvaluacionDesempenoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSolicitudRequerimientoPersonal(
		BaseModel<?> oldModel) {
		SolicitudRequerimientoPersonalClp newModel = new SolicitudRequerimientoPersonalClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSolicitudRequerimientoPersonalRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUsuarioGrupo(BaseModel<?> oldModel) {
		UsuarioGrupoClp newModel = new UsuarioGrupoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUsuarioGrupoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputUsuarioHitss(BaseModel<?> oldModel) {
		UsuarioHitssClp newModel = new UsuarioHitssClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setUsuarioHitssRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}