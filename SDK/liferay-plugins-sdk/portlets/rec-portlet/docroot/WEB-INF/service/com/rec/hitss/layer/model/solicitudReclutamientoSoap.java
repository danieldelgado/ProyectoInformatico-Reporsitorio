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

package com.rec.hitss.layer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.solicitudReclutamientoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.solicitudReclutamientoServiceSoap
 * @generated
 */
public class solicitudReclutamientoSoap implements Serializable {
	public static solicitudReclutamientoSoap toSoapModel(
		solicitudReclutamiento model) {
		solicitudReclutamientoSoap soapModel = new solicitudReclutamientoSoap();

		soapModel.setSR_ID(model.getSR_ID());
		soapModel.setSR_PL_ID(model.getSR_PL_ID());
		soapModel.setSR_ESTADO(model.getSR_ESTADO());
		soapModel.setSR_ACTIVO(model.getSR_ACTIVO());
		soapModel.setSR_USUARIO_CREA(model.getSR_USUARIO_CREA());
		soapModel.setSR_FECHA_CREA(model.getSR_FECHA_CREA());
		soapModel.setSR_USUARIO_MODIFICA(model.getSR_USUARIO_MODIFICA());
		soapModel.setSR_FECHA_MODIFICA(model.getSR_FECHA_MODIFICA());

		return soapModel;
	}

	public static solicitudReclutamientoSoap[] toSoapModels(
		solicitudReclutamiento[] models) {
		solicitudReclutamientoSoap[] soapModels = new solicitudReclutamientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static solicitudReclutamientoSoap[][] toSoapModels(
		solicitudReclutamiento[][] models) {
		solicitudReclutamientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new solicitudReclutamientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new solicitudReclutamientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static solicitudReclutamientoSoap[] toSoapModels(
		List<solicitudReclutamiento> models) {
		List<solicitudReclutamientoSoap> soapModels = new ArrayList<solicitudReclutamientoSoap>(models.size());

		for (solicitudReclutamiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new solicitudReclutamientoSoap[soapModels.size()]);
	}

	public solicitudReclutamientoSoap() {
	}

	public long getPrimaryKey() {
		return _SR_ID;
	}

	public void setPrimaryKey(long pk) {
		setSR_ID(pk);
	}

	public long getSR_ID() {
		return _SR_ID;
	}

	public void setSR_ID(long SR_ID) {
		_SR_ID = SR_ID;
	}

	public String getSR_PL_ID() {
		return _SR_PL_ID;
	}

	public void setSR_PL_ID(String SR_PL_ID) {
		_SR_PL_ID = SR_PL_ID;
	}

	public long getSR_ESTADO() {
		return _SR_ESTADO;
	}

	public void setSR_ESTADO(long SR_ESTADO) {
		_SR_ESTADO = SR_ESTADO;
	}

	public String getSR_ACTIVO() {
		return _SR_ACTIVO;
	}

	public void setSR_ACTIVO(String SR_ACTIVO) {
		_SR_ACTIVO = SR_ACTIVO;
	}

	public long getSR_USUARIO_CREA() {
		return _SR_USUARIO_CREA;
	}

	public void setSR_USUARIO_CREA(long SR_USUARIO_CREA) {
		_SR_USUARIO_CREA = SR_USUARIO_CREA;
	}

	public Date getSR_FECHA_CREA() {
		return _SR_FECHA_CREA;
	}

	public void setSR_FECHA_CREA(Date SR_FECHA_CREA) {
		_SR_FECHA_CREA = SR_FECHA_CREA;
	}

	public long getSR_USUARIO_MODIFICA() {
		return _SR_USUARIO_MODIFICA;
	}

	public void setSR_USUARIO_MODIFICA(long SR_USUARIO_MODIFICA) {
		_SR_USUARIO_MODIFICA = SR_USUARIO_MODIFICA;
	}

	public Date getSR_FECHA_MODIFICA() {
		return _SR_FECHA_MODIFICA;
	}

	public void setSR_FECHA_MODIFICA(Date SR_FECHA_MODIFICA) {
		_SR_FECHA_MODIFICA = SR_FECHA_MODIFICA;
	}

	private long _SR_ID;
	private String _SR_PL_ID;
	private long _SR_ESTADO;
	private String _SR_ACTIVO;
	private long _SR_USUARIO_CREA;
	private Date _SR_FECHA_CREA;
	private long _SR_USUARIO_MODIFICA;
	private Date _SR_FECHA_MODIFICA;
}