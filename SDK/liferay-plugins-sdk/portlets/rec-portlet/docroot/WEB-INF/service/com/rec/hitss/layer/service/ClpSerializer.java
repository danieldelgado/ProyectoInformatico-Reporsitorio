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
import com.rec.hitss.layer.model.EvaluacionReclutamientoClp;
import com.rec.hitss.layer.model.FooClp;
import com.rec.hitss.layer.model.avanceEstadoSolicitudReclutamientoClp;
import com.rec.hitss.layer.model.cartillaReclutamientoClp;
import com.rec.hitss.layer.model.curriculumVitaeClp;
import com.rec.hitss.layer.model.fichaIngresoClp;
import com.rec.hitss.layer.model.nueveCuadrantesClp;
import com.rec.hitss.layer.model.puestosLaboralesClp;
import com.rec.hitss.layer.model.requerimientoPersonalClp;
import com.rec.hitss.layer.model.solicitudReclutamientoClp;

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
						"rec-portlet-deployment-context");

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
							"rec-portlet-deployment-context");

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
				_servletContextName = "rec-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					avanceEstadoSolicitudReclutamientoClp.class.getName())) {
			return translateInputavanceEstadoSolicitudReclutamiento(oldModel);
		}

		if (oldModelClassName.equals(cartillaReclutamientoClp.class.getName())) {
			return translateInputcartillaReclutamiento(oldModel);
		}

		if (oldModelClassName.equals(ContratoClp.class.getName())) {
			return translateInputContrato(oldModel);
		}

		if (oldModelClassName.equals(curriculumVitaeClp.class.getName())) {
			return translateInputcurriculumVitae(oldModel);
		}

		if (oldModelClassName.equals(EvaluacionReclutamientoClp.class.getName())) {
			return translateInputEvaluacionReclutamiento(oldModel);
		}

		if (oldModelClassName.equals(fichaIngresoClp.class.getName())) {
			return translateInputfichaIngreso(oldModel);
		}

		if (oldModelClassName.equals(FooClp.class.getName())) {
			return translateInputFoo(oldModel);
		}

		if (oldModelClassName.equals(nueveCuadrantesClp.class.getName())) {
			return translateInputnueveCuadrantes(oldModel);
		}

		if (oldModelClassName.equals(puestosLaboralesClp.class.getName())) {
			return translateInputpuestosLaborales(oldModel);
		}

		if (oldModelClassName.equals(requerimientoPersonalClp.class.getName())) {
			return translateInputrequerimientoPersonal(oldModel);
		}

		if (oldModelClassName.equals(solicitudReclutamientoClp.class.getName())) {
			return translateInputsolicitudReclutamiento(oldModel);
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

	public static Object translateInputavanceEstadoSolicitudReclutamiento(
		BaseModel<?> oldModel) {
		avanceEstadoSolicitudReclutamientoClp oldClpModel = (avanceEstadoSolicitudReclutamientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getavanceEstadoSolicitudReclutamientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcartillaReclutamiento(
		BaseModel<?> oldModel) {
		cartillaReclutamientoClp oldClpModel = (cartillaReclutamientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcartillaReclutamientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputContrato(BaseModel<?> oldModel) {
		ContratoClp oldClpModel = (ContratoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getContratoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcurriculumVitae(BaseModel<?> oldModel) {
		curriculumVitaeClp oldClpModel = (curriculumVitaeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcurriculumVitaeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEvaluacionReclutamiento(
		BaseModel<?> oldModel) {
		EvaluacionReclutamientoClp oldClpModel = (EvaluacionReclutamientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEvaluacionReclutamientoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputfichaIngreso(BaseModel<?> oldModel) {
		fichaIngresoClp oldClpModel = (fichaIngresoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getfichaIngresoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputFoo(BaseModel<?> oldModel) {
		FooClp oldClpModel = (FooClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFooRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputnueveCuadrantes(BaseModel<?> oldModel) {
		nueveCuadrantesClp oldClpModel = (nueveCuadrantesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getnueveCuadrantesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputpuestosLaborales(BaseModel<?> oldModel) {
		puestosLaboralesClp oldClpModel = (puestosLaboralesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getpuestosLaboralesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputrequerimientoPersonal(
		BaseModel<?> oldModel) {
		requerimientoPersonalClp oldClpModel = (requerimientoPersonalClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getrequerimientoPersonalRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsolicitudReclutamiento(
		BaseModel<?> oldModel) {
		solicitudReclutamientoClp oldClpModel = (solicitudReclutamientoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsolicitudReclutamientoRemoteModel();

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
					"com.rec.hitss.layer.model.impl.avanceEstadoSolicitudReclutamientoImpl")) {
			return translateOutputavanceEstadoSolicitudReclutamiento(oldModel);
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
					"com.rec.hitss.layer.model.impl.cartillaReclutamientoImpl")) {
			return translateOutputcartillaReclutamiento(oldModel);
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
					"com.rec.hitss.layer.model.impl.curriculumVitaeImpl")) {
			return translateOutputcurriculumVitae(oldModel);
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
					"com.rec.hitss.layer.model.impl.EvaluacionReclutamientoImpl")) {
			return translateOutputEvaluacionReclutamiento(oldModel);
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
					"com.rec.hitss.layer.model.impl.fichaIngresoImpl")) {
			return translateOutputfichaIngreso(oldModel);
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

		if (oldModelClassName.equals("com.rec.hitss.layer.model.impl.FooImpl")) {
			return translateOutputFoo(oldModel);
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
					"com.rec.hitss.layer.model.impl.nueveCuadrantesImpl")) {
			return translateOutputnueveCuadrantes(oldModel);
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
					"com.rec.hitss.layer.model.impl.puestosLaboralesImpl")) {
			return translateOutputpuestosLaborales(oldModel);
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
					"com.rec.hitss.layer.model.impl.requerimientoPersonalImpl")) {
			return translateOutputrequerimientoPersonal(oldModel);
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
					"com.rec.hitss.layer.model.impl.solicitudReclutamientoImpl")) {
			return translateOutputsolicitudReclutamiento(oldModel);
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
					"com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException")) {
			return new com.rec.hitss.layer.NoSuchavanceEstadoSolicitudReclutamientoException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchcartillaReclutamientoException")) {
			return new com.rec.hitss.layer.NoSuchcartillaReclutamientoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchContratoException")) {
			return new com.rec.hitss.layer.NoSuchContratoException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchcurriculumVitaeException")) {
			return new com.rec.hitss.layer.NoSuchcurriculumVitaeException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException")) {
			return new com.rec.hitss.layer.NoSuchEvaluacionReclutamientoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchfichaIngresoException")) {
			return new com.rec.hitss.layer.NoSuchfichaIngresoException();
		}

		if (className.equals("com.rec.hitss.layer.NoSuchFooException")) {
			return new com.rec.hitss.layer.NoSuchFooException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchnueveCuadrantesException")) {
			return new com.rec.hitss.layer.NoSuchnueveCuadrantesException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchpuestosLaboralesException")) {
			return new com.rec.hitss.layer.NoSuchpuestosLaboralesException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchrequerimientoPersonalException")) {
			return new com.rec.hitss.layer.NoSuchrequerimientoPersonalException();
		}

		if (className.equals(
					"com.rec.hitss.layer.NoSuchsolicitudReclutamientoException")) {
			return new com.rec.hitss.layer.NoSuchsolicitudReclutamientoException();
		}

		return throwable;
	}

	public static Object translateOutputavanceEstadoSolicitudReclutamiento(
		BaseModel<?> oldModel) {
		avanceEstadoSolicitudReclutamientoClp newModel = new avanceEstadoSolicitudReclutamientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setavanceEstadoSolicitudReclutamientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcartillaReclutamiento(
		BaseModel<?> oldModel) {
		cartillaReclutamientoClp newModel = new cartillaReclutamientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcartillaReclutamientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputContrato(BaseModel<?> oldModel) {
		ContratoClp newModel = new ContratoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setContratoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcurriculumVitae(BaseModel<?> oldModel) {
		curriculumVitaeClp newModel = new curriculumVitaeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcurriculumVitaeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEvaluacionReclutamiento(
		BaseModel<?> oldModel) {
		EvaluacionReclutamientoClp newModel = new EvaluacionReclutamientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEvaluacionReclutamientoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputfichaIngreso(BaseModel<?> oldModel) {
		fichaIngresoClp newModel = new fichaIngresoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setfichaIngresoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputFoo(BaseModel<?> oldModel) {
		FooClp newModel = new FooClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFooRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputnueveCuadrantes(BaseModel<?> oldModel) {
		nueveCuadrantesClp newModel = new nueveCuadrantesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setnueveCuadrantesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputpuestosLaborales(BaseModel<?> oldModel) {
		puestosLaboralesClp newModel = new puestosLaboralesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setpuestosLaboralesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputrequerimientoPersonal(
		BaseModel<?> oldModel) {
		requerimientoPersonalClp newModel = new requerimientoPersonalClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setrequerimientoPersonalRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsolicitudReclutamiento(
		BaseModel<?> oldModel) {
		solicitudReclutamientoClp newModel = new solicitudReclutamientoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsolicitudReclutamientoRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}