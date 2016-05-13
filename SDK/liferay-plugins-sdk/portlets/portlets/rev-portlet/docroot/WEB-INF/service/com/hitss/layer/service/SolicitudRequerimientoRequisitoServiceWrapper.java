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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SolicitudRequerimientoRequisitoService}.
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimientoRequisitoService
 * @generated
 */
public class SolicitudRequerimientoRequisitoServiceWrapper
	implements SolicitudRequerimientoRequisitoService,
		ServiceWrapper<SolicitudRequerimientoRequisitoService> {
	public SolicitudRequerimientoRequisitoServiceWrapper(
		SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService) {
		_solicitudRequerimientoRequisitoService = solicitudRequerimientoRequisitoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _solicitudRequerimientoRequisitoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_solicitudRequerimientoRequisitoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _solicitudRequerimientoRequisitoService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SolicitudRequerimientoRequisitoService getWrappedSolicitudRequerimientoRequisitoService() {
		return _solicitudRequerimientoRequisitoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSolicitudRequerimientoRequisitoService(
		SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService) {
		_solicitudRequerimientoRequisitoService = solicitudRequerimientoRequisitoService;
	}

	@Override
	public SolicitudRequerimientoRequisitoService getWrappedService() {
		return _solicitudRequerimientoRequisitoService;
	}

	@Override
	public void setWrappedService(
		SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService) {
		_solicitudRequerimientoRequisitoService = solicitudRequerimientoRequisitoService;
	}

	private SolicitudRequerimientoRequisitoService _solicitudRequerimientoRequisitoService;
}