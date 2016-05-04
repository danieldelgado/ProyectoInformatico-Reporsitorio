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

package com.hitss.layer.model;

import com.hitss.layer.service.persistence.DetalleRepuestaEvaluacionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.DetalleRepuestaEvaluacionServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.DetalleRepuestaEvaluacionServiceSoap
 * @generated
 */
public class DetalleRepuestaEvaluacionSoap implements Serializable {
	public static DetalleRepuestaEvaluacionSoap toSoapModel(
		DetalleRepuestaEvaluacion model) {
		DetalleRepuestaEvaluacionSoap soapModel = new DetalleRepuestaEvaluacionSoap();

		soapModel.setDetalleRepuestaEvaluacionId(model.getDetalleRepuestaEvaluacionId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setRespuestaSeleccionada(model.getRespuestaSeleccionada());

		return soapModel;
	}

	public static DetalleRepuestaEvaluacionSoap[] toSoapModels(
		DetalleRepuestaEvaluacion[] models) {
		DetalleRepuestaEvaluacionSoap[] soapModels = new DetalleRepuestaEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DetalleRepuestaEvaluacionSoap[][] toSoapModels(
		DetalleRepuestaEvaluacion[][] models) {
		DetalleRepuestaEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DetalleRepuestaEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DetalleRepuestaEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DetalleRepuestaEvaluacionSoap[] toSoapModels(
		List<DetalleRepuestaEvaluacion> models) {
		List<DetalleRepuestaEvaluacionSoap> soapModels = new ArrayList<DetalleRepuestaEvaluacionSoap>(models.size());

		for (DetalleRepuestaEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DetalleRepuestaEvaluacionSoap[soapModels.size()]);
	}

	public DetalleRepuestaEvaluacionSoap() {
	}

	public DetalleRepuestaEvaluacionPK getPrimaryKey() {
		return new DetalleRepuestaEvaluacionPK(_detalleRepuestaEvaluacionId,
			_evaluacionId, _usuarioId);
	}

	public void setPrimaryKey(DetalleRepuestaEvaluacionPK pk) {
		setDetalleRepuestaEvaluacionId(pk.detalleRepuestaEvaluacionId);
		setEvaluacionId(pk.evaluacionId);
		setUsuarioId(pk.usuarioId);
	}

	public long getDetalleRepuestaEvaluacionId() {
		return _detalleRepuestaEvaluacionId;
	}

	public void setDetalleRepuestaEvaluacionId(long detalleRepuestaEvaluacionId) {
		_detalleRepuestaEvaluacionId = detalleRepuestaEvaluacionId;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getRespuestaSeleccionada() {
		return _respuestaSeleccionada;
	}

	public void setRespuestaSeleccionada(long respuestaSeleccionada) {
		_respuestaSeleccionada = respuestaSeleccionada;
	}

	private long _detalleRepuestaEvaluacionId;
	private long _evaluacionId;
	private long _usuarioId;
	private String _descripcion;
	private long _respuestaSeleccionada;
}