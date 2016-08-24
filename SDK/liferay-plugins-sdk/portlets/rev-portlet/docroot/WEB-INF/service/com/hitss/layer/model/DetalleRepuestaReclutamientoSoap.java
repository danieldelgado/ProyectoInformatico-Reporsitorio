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

import com.hitss.layer.service.persistence.DetalleRepuestaReclutamientoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hitss.layer.service.http.DetalleRepuestaReclutamientoServiceSoap}.
 *
 * @author Danielle Delgado
 * @see com.hitss.layer.service.http.DetalleRepuestaReclutamientoServiceSoap
 * @generated
 */
public class DetalleRepuestaReclutamientoSoap implements Serializable {
	public static DetalleRepuestaReclutamientoSoap toSoapModel(
		DetalleRepuestaReclutamiento model) {
		DetalleRepuestaReclutamientoSoap soapModel = new DetalleRepuestaReclutamientoSoap();

		soapModel.setDetalleRepsuestaId(model.getDetalleRepsuestaId());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setEvaluacionId(model.getEvaluacionId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setPreguntaId(model.getPreguntaId());
		soapModel.setRespuestaSeleccionada(model.getRespuestaSeleccionada());

		return soapModel;
	}

	public static DetalleRepuestaReclutamientoSoap[] toSoapModels(
		DetalleRepuestaReclutamiento[] models) {
		DetalleRepuestaReclutamientoSoap[] soapModels = new DetalleRepuestaReclutamientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DetalleRepuestaReclutamientoSoap[][] toSoapModels(
		DetalleRepuestaReclutamiento[][] models) {
		DetalleRepuestaReclutamientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DetalleRepuestaReclutamientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DetalleRepuestaReclutamientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DetalleRepuestaReclutamientoSoap[] toSoapModels(
		List<DetalleRepuestaReclutamiento> models) {
		List<DetalleRepuestaReclutamientoSoap> soapModels = new ArrayList<DetalleRepuestaReclutamientoSoap>(models.size());

		for (DetalleRepuestaReclutamiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DetalleRepuestaReclutamientoSoap[soapModels.size()]);
	}

	public DetalleRepuestaReclutamientoSoap() {
	}

	public DetalleRepuestaReclutamientoPK getPrimaryKey() {
		return new DetalleRepuestaReclutamientoPK(_detalleRepsuestaId,
			_usuarioId, _evaluacionId, _preguntaId);
	}

	public void setPrimaryKey(DetalleRepuestaReclutamientoPK pk) {
		setDetalleRepsuestaId(pk.detalleRepsuestaId);
		setUsuarioId(pk.usuarioId);
		setEvaluacionId(pk.evaluacionId);
		setPreguntaId(pk.preguntaId);
	}

	public long getDetalleRepsuestaId() {
		return _detalleRepsuestaId;
	}

	public void setDetalleRepsuestaId(long detalleRepsuestaId) {
		_detalleRepsuestaId = detalleRepsuestaId;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public long getEvaluacionId() {
		return _evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		_evaluacionId = evaluacionId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getPreguntaId() {
		return _preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		_preguntaId = preguntaId;
	}

	public int getRespuestaSeleccionada() {
		return _respuestaSeleccionada;
	}

	public void setRespuestaSeleccionada(int respuestaSeleccionada) {
		_respuestaSeleccionada = respuestaSeleccionada;
	}

	private long _detalleRepsuestaId;
	private long _usuarioId;
	private long _evaluacionId;
	private String _descripcion;
	private long _preguntaId;
	private int _respuestaSeleccionada;
}