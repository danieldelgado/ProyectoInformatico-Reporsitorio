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

package com.rec.hitss.layer.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.rec.hitss.layer.model.curriculumVitae;
import com.rec.hitss.layer.service.curriculumVitaeService;
import com.rec.hitss.layer.service.persistence.ContratoPersistence;
import com.rec.hitss.layer.service.persistence.EvaluacionReclutamientoPersistence;
import com.rec.hitss.layer.service.persistence.FooPersistence;
import com.rec.hitss.layer.service.persistence.avanceEstadoSolicitudReclutamientoPersistence;
import com.rec.hitss.layer.service.persistence.cartillaReclutamientoPersistence;
import com.rec.hitss.layer.service.persistence.curriculumVitaePersistence;
import com.rec.hitss.layer.service.persistence.fichaIngresoPersistence;
import com.rec.hitss.layer.service.persistence.nueveCuadrantesPersistence;
import com.rec.hitss.layer.service.persistence.puestosLaboralesPersistence;
import com.rec.hitss.layer.service.persistence.requerimientoPersonalPersistence;
import com.rec.hitss.layer.service.persistence.solicitudReclutamientoPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the curriculum vitae remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.rec.hitss.layer.service.impl.curriculumVitaeServiceImpl}.
 * </p>
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.impl.curriculumVitaeServiceImpl
 * @see com.rec.hitss.layer.service.curriculumVitaeServiceUtil
 * @generated
 */
public abstract class curriculumVitaeServiceBaseImpl extends BaseServiceImpl
	implements curriculumVitaeService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.rec.hitss.layer.service.curriculumVitaeServiceUtil} to access the curriculum vitae remote service.
	 */

	/**
	 * Returns the avance estado solicitud reclutamiento local service.
	 *
	 * @return the avance estado solicitud reclutamiento local service
	 */
	public com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoLocalService getavanceEstadoSolicitudReclutamientoLocalService() {
		return avanceEstadoSolicitudReclutamientoLocalService;
	}

	/**
	 * Sets the avance estado solicitud reclutamiento local service.
	 *
	 * @param avanceEstadoSolicitudReclutamientoLocalService the avance estado solicitud reclutamiento local service
	 */
	public void setavanceEstadoSolicitudReclutamientoLocalService(
		com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoLocalService avanceEstadoSolicitudReclutamientoLocalService) {
		this.avanceEstadoSolicitudReclutamientoLocalService = avanceEstadoSolicitudReclutamientoLocalService;
	}

	/**
	 * Returns the avance estado solicitud reclutamiento remote service.
	 *
	 * @return the avance estado solicitud reclutamiento remote service
	 */
	public com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoService getavanceEstadoSolicitudReclutamientoService() {
		return avanceEstadoSolicitudReclutamientoService;
	}

	/**
	 * Sets the avance estado solicitud reclutamiento remote service.
	 *
	 * @param avanceEstadoSolicitudReclutamientoService the avance estado solicitud reclutamiento remote service
	 */
	public void setavanceEstadoSolicitudReclutamientoService(
		com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoService avanceEstadoSolicitudReclutamientoService) {
		this.avanceEstadoSolicitudReclutamientoService = avanceEstadoSolicitudReclutamientoService;
	}

	/**
	 * Returns the avance estado solicitud reclutamiento persistence.
	 *
	 * @return the avance estado solicitud reclutamiento persistence
	 */
	public avanceEstadoSolicitudReclutamientoPersistence getavanceEstadoSolicitudReclutamientoPersistence() {
		return avanceEstadoSolicitudReclutamientoPersistence;
	}

	/**
	 * Sets the avance estado solicitud reclutamiento persistence.
	 *
	 * @param avanceEstadoSolicitudReclutamientoPersistence the avance estado solicitud reclutamiento persistence
	 */
	public void setavanceEstadoSolicitudReclutamientoPersistence(
		avanceEstadoSolicitudReclutamientoPersistence avanceEstadoSolicitudReclutamientoPersistence) {
		this.avanceEstadoSolicitudReclutamientoPersistence = avanceEstadoSolicitudReclutamientoPersistence;
	}

	/**
	 * Returns the cartilla reclutamiento local service.
	 *
	 * @return the cartilla reclutamiento local service
	 */
	public com.rec.hitss.layer.service.cartillaReclutamientoLocalService getcartillaReclutamientoLocalService() {
		return cartillaReclutamientoLocalService;
	}

	/**
	 * Sets the cartilla reclutamiento local service.
	 *
	 * @param cartillaReclutamientoLocalService the cartilla reclutamiento local service
	 */
	public void setcartillaReclutamientoLocalService(
		com.rec.hitss.layer.service.cartillaReclutamientoLocalService cartillaReclutamientoLocalService) {
		this.cartillaReclutamientoLocalService = cartillaReclutamientoLocalService;
	}

	/**
	 * Returns the cartilla reclutamiento remote service.
	 *
	 * @return the cartilla reclutamiento remote service
	 */
	public com.rec.hitss.layer.service.cartillaReclutamientoService getcartillaReclutamientoService() {
		return cartillaReclutamientoService;
	}

	/**
	 * Sets the cartilla reclutamiento remote service.
	 *
	 * @param cartillaReclutamientoService the cartilla reclutamiento remote service
	 */
	public void setcartillaReclutamientoService(
		com.rec.hitss.layer.service.cartillaReclutamientoService cartillaReclutamientoService) {
		this.cartillaReclutamientoService = cartillaReclutamientoService;
	}

	/**
	 * Returns the cartilla reclutamiento persistence.
	 *
	 * @return the cartilla reclutamiento persistence
	 */
	public cartillaReclutamientoPersistence getcartillaReclutamientoPersistence() {
		return cartillaReclutamientoPersistence;
	}

	/**
	 * Sets the cartilla reclutamiento persistence.
	 *
	 * @param cartillaReclutamientoPersistence the cartilla reclutamiento persistence
	 */
	public void setcartillaReclutamientoPersistence(
		cartillaReclutamientoPersistence cartillaReclutamientoPersistence) {
		this.cartillaReclutamientoPersistence = cartillaReclutamientoPersistence;
	}

	/**
	 * Returns the contrato local service.
	 *
	 * @return the contrato local service
	 */
	public com.rec.hitss.layer.service.ContratoLocalService getContratoLocalService() {
		return contratoLocalService;
	}

	/**
	 * Sets the contrato local service.
	 *
	 * @param contratoLocalService the contrato local service
	 */
	public void setContratoLocalService(
		com.rec.hitss.layer.service.ContratoLocalService contratoLocalService) {
		this.contratoLocalService = contratoLocalService;
	}

	/**
	 * Returns the contrato remote service.
	 *
	 * @return the contrato remote service
	 */
	public com.rec.hitss.layer.service.ContratoService getContratoService() {
		return contratoService;
	}

	/**
	 * Sets the contrato remote service.
	 *
	 * @param contratoService the contrato remote service
	 */
	public void setContratoService(
		com.rec.hitss.layer.service.ContratoService contratoService) {
		this.contratoService = contratoService;
	}

	/**
	 * Returns the contrato persistence.
	 *
	 * @return the contrato persistence
	 */
	public ContratoPersistence getContratoPersistence() {
		return contratoPersistence;
	}

	/**
	 * Sets the contrato persistence.
	 *
	 * @param contratoPersistence the contrato persistence
	 */
	public void setContratoPersistence(ContratoPersistence contratoPersistence) {
		this.contratoPersistence = contratoPersistence;
	}

	/**
	 * Returns the curriculum vitae local service.
	 *
	 * @return the curriculum vitae local service
	 */
	public com.rec.hitss.layer.service.curriculumVitaeLocalService getcurriculumVitaeLocalService() {
		return curriculumVitaeLocalService;
	}

	/**
	 * Sets the curriculum vitae local service.
	 *
	 * @param curriculumVitaeLocalService the curriculum vitae local service
	 */
	public void setcurriculumVitaeLocalService(
		com.rec.hitss.layer.service.curriculumVitaeLocalService curriculumVitaeLocalService) {
		this.curriculumVitaeLocalService = curriculumVitaeLocalService;
	}

	/**
	 * Returns the curriculum vitae remote service.
	 *
	 * @return the curriculum vitae remote service
	 */
	public com.rec.hitss.layer.service.curriculumVitaeService getcurriculumVitaeService() {
		return curriculumVitaeService;
	}

	/**
	 * Sets the curriculum vitae remote service.
	 *
	 * @param curriculumVitaeService the curriculum vitae remote service
	 */
	public void setcurriculumVitaeService(
		com.rec.hitss.layer.service.curriculumVitaeService curriculumVitaeService) {
		this.curriculumVitaeService = curriculumVitaeService;
	}

	/**
	 * Returns the curriculum vitae persistence.
	 *
	 * @return the curriculum vitae persistence
	 */
	public curriculumVitaePersistence getcurriculumVitaePersistence() {
		return curriculumVitaePersistence;
	}

	/**
	 * Sets the curriculum vitae persistence.
	 *
	 * @param curriculumVitaePersistence the curriculum vitae persistence
	 */
	public void setcurriculumVitaePersistence(
		curriculumVitaePersistence curriculumVitaePersistence) {
		this.curriculumVitaePersistence = curriculumVitaePersistence;
	}

	/**
	 * Returns the evaluacion reclutamiento local service.
	 *
	 * @return the evaluacion reclutamiento local service
	 */
	public com.rec.hitss.layer.service.EvaluacionReclutamientoLocalService getEvaluacionReclutamientoLocalService() {
		return evaluacionReclutamientoLocalService;
	}

	/**
	 * Sets the evaluacion reclutamiento local service.
	 *
	 * @param evaluacionReclutamientoLocalService the evaluacion reclutamiento local service
	 */
	public void setEvaluacionReclutamientoLocalService(
		com.rec.hitss.layer.service.EvaluacionReclutamientoLocalService evaluacionReclutamientoLocalService) {
		this.evaluacionReclutamientoLocalService = evaluacionReclutamientoLocalService;
	}

	/**
	 * Returns the evaluacion reclutamiento remote service.
	 *
	 * @return the evaluacion reclutamiento remote service
	 */
	public com.rec.hitss.layer.service.EvaluacionReclutamientoService getEvaluacionReclutamientoService() {
		return evaluacionReclutamientoService;
	}

	/**
	 * Sets the evaluacion reclutamiento remote service.
	 *
	 * @param evaluacionReclutamientoService the evaluacion reclutamiento remote service
	 */
	public void setEvaluacionReclutamientoService(
		com.rec.hitss.layer.service.EvaluacionReclutamientoService evaluacionReclutamientoService) {
		this.evaluacionReclutamientoService = evaluacionReclutamientoService;
	}

	/**
	 * Returns the evaluacion reclutamiento persistence.
	 *
	 * @return the evaluacion reclutamiento persistence
	 */
	public EvaluacionReclutamientoPersistence getEvaluacionReclutamientoPersistence() {
		return evaluacionReclutamientoPersistence;
	}

	/**
	 * Sets the evaluacion reclutamiento persistence.
	 *
	 * @param evaluacionReclutamientoPersistence the evaluacion reclutamiento persistence
	 */
	public void setEvaluacionReclutamientoPersistence(
		EvaluacionReclutamientoPersistence evaluacionReclutamientoPersistence) {
		this.evaluacionReclutamientoPersistence = evaluacionReclutamientoPersistence;
	}

	/**
	 * Returns the ficha ingreso local service.
	 *
	 * @return the ficha ingreso local service
	 */
	public com.rec.hitss.layer.service.fichaIngresoLocalService getfichaIngresoLocalService() {
		return fichaIngresoLocalService;
	}

	/**
	 * Sets the ficha ingreso local service.
	 *
	 * @param fichaIngresoLocalService the ficha ingreso local service
	 */
	public void setfichaIngresoLocalService(
		com.rec.hitss.layer.service.fichaIngresoLocalService fichaIngresoLocalService) {
		this.fichaIngresoLocalService = fichaIngresoLocalService;
	}

	/**
	 * Returns the ficha ingreso remote service.
	 *
	 * @return the ficha ingreso remote service
	 */
	public com.rec.hitss.layer.service.fichaIngresoService getfichaIngresoService() {
		return fichaIngresoService;
	}

	/**
	 * Sets the ficha ingreso remote service.
	 *
	 * @param fichaIngresoService the ficha ingreso remote service
	 */
	public void setfichaIngresoService(
		com.rec.hitss.layer.service.fichaIngresoService fichaIngresoService) {
		this.fichaIngresoService = fichaIngresoService;
	}

	/**
	 * Returns the ficha ingreso persistence.
	 *
	 * @return the ficha ingreso persistence
	 */
	public fichaIngresoPersistence getfichaIngresoPersistence() {
		return fichaIngresoPersistence;
	}

	/**
	 * Sets the ficha ingreso persistence.
	 *
	 * @param fichaIngresoPersistence the ficha ingreso persistence
	 */
	public void setfichaIngresoPersistence(
		fichaIngresoPersistence fichaIngresoPersistence) {
		this.fichaIngresoPersistence = fichaIngresoPersistence;
	}

	/**
	 * Returns the foo local service.
	 *
	 * @return the foo local service
	 */
	public com.rec.hitss.layer.service.FooLocalService getFooLocalService() {
		return fooLocalService;
	}

	/**
	 * Sets the foo local service.
	 *
	 * @param fooLocalService the foo local service
	 */
	public void setFooLocalService(
		com.rec.hitss.layer.service.FooLocalService fooLocalService) {
		this.fooLocalService = fooLocalService;
	}

	/**
	 * Returns the foo remote service.
	 *
	 * @return the foo remote service
	 */
	public com.rec.hitss.layer.service.FooService getFooService() {
		return fooService;
	}

	/**
	 * Sets the foo remote service.
	 *
	 * @param fooService the foo remote service
	 */
	public void setFooService(com.rec.hitss.layer.service.FooService fooService) {
		this.fooService = fooService;
	}

	/**
	 * Returns the foo persistence.
	 *
	 * @return the foo persistence
	 */
	public FooPersistence getFooPersistence() {
		return fooPersistence;
	}

	/**
	 * Sets the foo persistence.
	 *
	 * @param fooPersistence the foo persistence
	 */
	public void setFooPersistence(FooPersistence fooPersistence) {
		this.fooPersistence = fooPersistence;
	}

	/**
	 * Returns the nueve cuadrantes local service.
	 *
	 * @return the nueve cuadrantes local service
	 */
	public com.rec.hitss.layer.service.nueveCuadrantesLocalService getnueveCuadrantesLocalService() {
		return nueveCuadrantesLocalService;
	}

	/**
	 * Sets the nueve cuadrantes local service.
	 *
	 * @param nueveCuadrantesLocalService the nueve cuadrantes local service
	 */
	public void setnueveCuadrantesLocalService(
		com.rec.hitss.layer.service.nueveCuadrantesLocalService nueveCuadrantesLocalService) {
		this.nueveCuadrantesLocalService = nueveCuadrantesLocalService;
	}

	/**
	 * Returns the nueve cuadrantes remote service.
	 *
	 * @return the nueve cuadrantes remote service
	 */
	public com.rec.hitss.layer.service.nueveCuadrantesService getnueveCuadrantesService() {
		return nueveCuadrantesService;
	}

	/**
	 * Sets the nueve cuadrantes remote service.
	 *
	 * @param nueveCuadrantesService the nueve cuadrantes remote service
	 */
	public void setnueveCuadrantesService(
		com.rec.hitss.layer.service.nueveCuadrantesService nueveCuadrantesService) {
		this.nueveCuadrantesService = nueveCuadrantesService;
	}

	/**
	 * Returns the nueve cuadrantes persistence.
	 *
	 * @return the nueve cuadrantes persistence
	 */
	public nueveCuadrantesPersistence getnueveCuadrantesPersistence() {
		return nueveCuadrantesPersistence;
	}

	/**
	 * Sets the nueve cuadrantes persistence.
	 *
	 * @param nueveCuadrantesPersistence the nueve cuadrantes persistence
	 */
	public void setnueveCuadrantesPersistence(
		nueveCuadrantesPersistence nueveCuadrantesPersistence) {
		this.nueveCuadrantesPersistence = nueveCuadrantesPersistence;
	}

	/**
	 * Returns the puestos laborales local service.
	 *
	 * @return the puestos laborales local service
	 */
	public com.rec.hitss.layer.service.puestosLaboralesLocalService getpuestosLaboralesLocalService() {
		return puestosLaboralesLocalService;
	}

	/**
	 * Sets the puestos laborales local service.
	 *
	 * @param puestosLaboralesLocalService the puestos laborales local service
	 */
	public void setpuestosLaboralesLocalService(
		com.rec.hitss.layer.service.puestosLaboralesLocalService puestosLaboralesLocalService) {
		this.puestosLaboralesLocalService = puestosLaboralesLocalService;
	}

	/**
	 * Returns the puestos laborales remote service.
	 *
	 * @return the puestos laborales remote service
	 */
	public com.rec.hitss.layer.service.puestosLaboralesService getpuestosLaboralesService() {
		return puestosLaboralesService;
	}

	/**
	 * Sets the puestos laborales remote service.
	 *
	 * @param puestosLaboralesService the puestos laborales remote service
	 */
	public void setpuestosLaboralesService(
		com.rec.hitss.layer.service.puestosLaboralesService puestosLaboralesService) {
		this.puestosLaboralesService = puestosLaboralesService;
	}

	/**
	 * Returns the puestos laborales persistence.
	 *
	 * @return the puestos laborales persistence
	 */
	public puestosLaboralesPersistence getpuestosLaboralesPersistence() {
		return puestosLaboralesPersistence;
	}

	/**
	 * Sets the puestos laborales persistence.
	 *
	 * @param puestosLaboralesPersistence the puestos laborales persistence
	 */
	public void setpuestosLaboralesPersistence(
		puestosLaboralesPersistence puestosLaboralesPersistence) {
		this.puestosLaboralesPersistence = puestosLaboralesPersistence;
	}

	/**
	 * Returns the requerimiento personal local service.
	 *
	 * @return the requerimiento personal local service
	 */
	public com.rec.hitss.layer.service.requerimientoPersonalLocalService getrequerimientoPersonalLocalService() {
		return requerimientoPersonalLocalService;
	}

	/**
	 * Sets the requerimiento personal local service.
	 *
	 * @param requerimientoPersonalLocalService the requerimiento personal local service
	 */
	public void setrequerimientoPersonalLocalService(
		com.rec.hitss.layer.service.requerimientoPersonalLocalService requerimientoPersonalLocalService) {
		this.requerimientoPersonalLocalService = requerimientoPersonalLocalService;
	}

	/**
	 * Returns the requerimiento personal remote service.
	 *
	 * @return the requerimiento personal remote service
	 */
	public com.rec.hitss.layer.service.requerimientoPersonalService getrequerimientoPersonalService() {
		return requerimientoPersonalService;
	}

	/**
	 * Sets the requerimiento personal remote service.
	 *
	 * @param requerimientoPersonalService the requerimiento personal remote service
	 */
	public void setrequerimientoPersonalService(
		com.rec.hitss.layer.service.requerimientoPersonalService requerimientoPersonalService) {
		this.requerimientoPersonalService = requerimientoPersonalService;
	}

	/**
	 * Returns the requerimiento personal persistence.
	 *
	 * @return the requerimiento personal persistence
	 */
	public requerimientoPersonalPersistence getrequerimientoPersonalPersistence() {
		return requerimientoPersonalPersistence;
	}

	/**
	 * Sets the requerimiento personal persistence.
	 *
	 * @param requerimientoPersonalPersistence the requerimiento personal persistence
	 */
	public void setrequerimientoPersonalPersistence(
		requerimientoPersonalPersistence requerimientoPersonalPersistence) {
		this.requerimientoPersonalPersistence = requerimientoPersonalPersistence;
	}

	/**
	 * Returns the solicitud reclutamiento local service.
	 *
	 * @return the solicitud reclutamiento local service
	 */
	public com.rec.hitss.layer.service.solicitudReclutamientoLocalService getsolicitudReclutamientoLocalService() {
		return solicitudReclutamientoLocalService;
	}

	/**
	 * Sets the solicitud reclutamiento local service.
	 *
	 * @param solicitudReclutamientoLocalService the solicitud reclutamiento local service
	 */
	public void setsolicitudReclutamientoLocalService(
		com.rec.hitss.layer.service.solicitudReclutamientoLocalService solicitudReclutamientoLocalService) {
		this.solicitudReclutamientoLocalService = solicitudReclutamientoLocalService;
	}

	/**
	 * Returns the solicitud reclutamiento remote service.
	 *
	 * @return the solicitud reclutamiento remote service
	 */
	public com.rec.hitss.layer.service.solicitudReclutamientoService getsolicitudReclutamientoService() {
		return solicitudReclutamientoService;
	}

	/**
	 * Sets the solicitud reclutamiento remote service.
	 *
	 * @param solicitudReclutamientoService the solicitud reclutamiento remote service
	 */
	public void setsolicitudReclutamientoService(
		com.rec.hitss.layer.service.solicitudReclutamientoService solicitudReclutamientoService) {
		this.solicitudReclutamientoService = solicitudReclutamientoService;
	}

	/**
	 * Returns the solicitud reclutamiento persistence.
	 *
	 * @return the solicitud reclutamiento persistence
	 */
	public solicitudReclutamientoPersistence getsolicitudReclutamientoPersistence() {
		return solicitudReclutamientoPersistence;
	}

	/**
	 * Sets the solicitud reclutamiento persistence.
	 *
	 * @param solicitudReclutamientoPersistence the solicitud reclutamiento persistence
	 */
	public void setsolicitudReclutamientoPersistence(
		solicitudReclutamientoPersistence solicitudReclutamientoPersistence) {
		this.solicitudReclutamientoPersistence = solicitudReclutamientoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return curriculumVitae.class;
	}

	protected String getModelClassName() {
		return curriculumVitae.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = curriculumVitaePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoLocalService.class)
	protected com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoLocalService avanceEstadoSolicitudReclutamientoLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoService.class)
	protected com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoService avanceEstadoSolicitudReclutamientoService;
	@BeanReference(type = avanceEstadoSolicitudReclutamientoPersistence.class)
	protected avanceEstadoSolicitudReclutamientoPersistence avanceEstadoSolicitudReclutamientoPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.cartillaReclutamientoLocalService.class)
	protected com.rec.hitss.layer.service.cartillaReclutamientoLocalService cartillaReclutamientoLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.cartillaReclutamientoService.class)
	protected com.rec.hitss.layer.service.cartillaReclutamientoService cartillaReclutamientoService;
	@BeanReference(type = cartillaReclutamientoPersistence.class)
	protected cartillaReclutamientoPersistence cartillaReclutamientoPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.ContratoLocalService.class)
	protected com.rec.hitss.layer.service.ContratoLocalService contratoLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.ContratoService.class)
	protected com.rec.hitss.layer.service.ContratoService contratoService;
	@BeanReference(type = ContratoPersistence.class)
	protected ContratoPersistence contratoPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.curriculumVitaeLocalService.class)
	protected com.rec.hitss.layer.service.curriculumVitaeLocalService curriculumVitaeLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.curriculumVitaeService.class)
	protected com.rec.hitss.layer.service.curriculumVitaeService curriculumVitaeService;
	@BeanReference(type = curriculumVitaePersistence.class)
	protected curriculumVitaePersistence curriculumVitaePersistence;
	@BeanReference(type = com.rec.hitss.layer.service.EvaluacionReclutamientoLocalService.class)
	protected com.rec.hitss.layer.service.EvaluacionReclutamientoLocalService evaluacionReclutamientoLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.EvaluacionReclutamientoService.class)
	protected com.rec.hitss.layer.service.EvaluacionReclutamientoService evaluacionReclutamientoService;
	@BeanReference(type = EvaluacionReclutamientoPersistence.class)
	protected EvaluacionReclutamientoPersistence evaluacionReclutamientoPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.fichaIngresoLocalService.class)
	protected com.rec.hitss.layer.service.fichaIngresoLocalService fichaIngresoLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.fichaIngresoService.class)
	protected com.rec.hitss.layer.service.fichaIngresoService fichaIngresoService;
	@BeanReference(type = fichaIngresoPersistence.class)
	protected fichaIngresoPersistence fichaIngresoPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.FooLocalService.class)
	protected com.rec.hitss.layer.service.FooLocalService fooLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.FooService.class)
	protected com.rec.hitss.layer.service.FooService fooService;
	@BeanReference(type = FooPersistence.class)
	protected FooPersistence fooPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.nueveCuadrantesLocalService.class)
	protected com.rec.hitss.layer.service.nueveCuadrantesLocalService nueveCuadrantesLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.nueveCuadrantesService.class)
	protected com.rec.hitss.layer.service.nueveCuadrantesService nueveCuadrantesService;
	@BeanReference(type = nueveCuadrantesPersistence.class)
	protected nueveCuadrantesPersistence nueveCuadrantesPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.puestosLaboralesLocalService.class)
	protected com.rec.hitss.layer.service.puestosLaboralesLocalService puestosLaboralesLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.puestosLaboralesService.class)
	protected com.rec.hitss.layer.service.puestosLaboralesService puestosLaboralesService;
	@BeanReference(type = puestosLaboralesPersistence.class)
	protected puestosLaboralesPersistence puestosLaboralesPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.requerimientoPersonalLocalService.class)
	protected com.rec.hitss.layer.service.requerimientoPersonalLocalService requerimientoPersonalLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.requerimientoPersonalService.class)
	protected com.rec.hitss.layer.service.requerimientoPersonalService requerimientoPersonalService;
	@BeanReference(type = requerimientoPersonalPersistence.class)
	protected requerimientoPersonalPersistence requerimientoPersonalPersistence;
	@BeanReference(type = com.rec.hitss.layer.service.solicitudReclutamientoLocalService.class)
	protected com.rec.hitss.layer.service.solicitudReclutamientoLocalService solicitudReclutamientoLocalService;
	@BeanReference(type = com.rec.hitss.layer.service.solicitudReclutamientoService.class)
	protected com.rec.hitss.layer.service.solicitudReclutamientoService solicitudReclutamientoService;
	@BeanReference(type = solicitudReclutamientoPersistence.class)
	protected solicitudReclutamientoPersistence solicitudReclutamientoPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private curriculumVitaeServiceClpInvoker _clpInvoker = new curriculumVitaeServiceClpInvoker();
}