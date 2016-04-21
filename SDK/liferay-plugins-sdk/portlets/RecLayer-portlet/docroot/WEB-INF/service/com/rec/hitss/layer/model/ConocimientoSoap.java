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
 * This class is used by SOAP remote services, specifically {@link com.rec.hitss.layer.service.http.ConocimientoServiceSoap}.
 *
 * @author Crossfire
 * @see com.rec.hitss.layer.service.http.ConocimientoServiceSoap
 * @generated
 */
public class ConocimientoSoap implements Serializable {
	public static ConocimientoSoap toSoapModel(Conocimiento model) {
		ConocimientoSoap soapModel = new ConocimientoSoap();

		soapModel.setConocimientoId(model.getConocimientoId());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEtiquetaId(model.getEtiquetaId());
		soapModel.setNivel(model.getNivel());
		soapModel.setHerramiento(model.getHerramiento());
		soapModel.setImplementacion(model.getImplementacion());
		soapModel.setActivo(model.getActivo());
		soapModel.setUsuariocrea(model.getUsuariocrea());
		soapModel.setFechacrea(model.getFechacrea());
		soapModel.setUsuariomodifica(model.getUsuariomodifica());
		soapModel.setFechacreamodifica(model.getFechacreamodifica());
		soapModel.setUsuarioHitssId(model.getUsuarioHitssId());

		return soapModel;
	}

	public static ConocimientoSoap[] toSoapModels(Conocimiento[] models) {
		ConocimientoSoap[] soapModels = new ConocimientoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConocimientoSoap[][] toSoapModels(Conocimiento[][] models) {
		ConocimientoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConocimientoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConocimientoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConocimientoSoap[] toSoapModels(List<Conocimiento> models) {
		List<ConocimientoSoap> soapModels = new ArrayList<ConocimientoSoap>(models.size());

		for (Conocimiento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConocimientoSoap[soapModels.size()]);
	}

	public ConocimientoSoap() {
	}

	public long getPrimaryKey() {
		return _conocimientoId;
	}

	public void setPrimaryKey(long pk) {
		setConocimientoId(pk);
	}

	public long getConocimientoId() {
		return _conocimientoId;
	}

	public void setConocimientoId(long conocimientoId) {
		_conocimientoId = conocimientoId;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public long getEtiquetaId() {
		return _etiquetaId;
	}

	public void setEtiquetaId(long etiquetaId) {
		_etiquetaId = etiquetaId;
	}

	public String getNivel() {
		return _nivel;
	}

	public void setNivel(String nivel) {
		_nivel = nivel;
	}

	public String getHerramiento() {
		return _herramiento;
	}

	public void setHerramiento(String herramiento) {
		_herramiento = herramiento;
	}

	public String getImplementacion() {
		return _implementacion;
	}

	public void setImplementacion(String implementacion) {
		_implementacion = implementacion;
	}

	public boolean getActivo() {
		return _activo;
	}

	public boolean isActivo() {
		return _activo;
	}

	public void setActivo(boolean activo) {
		_activo = activo;
	}

	public long getUsuariocrea() {
		return _usuariocrea;
	}

	public void setUsuariocrea(long usuariocrea) {
		_usuariocrea = usuariocrea;
	}

	public Date getFechacrea() {
		return _fechacrea;
	}

	public void setFechacrea(Date fechacrea) {
		_fechacrea = fechacrea;
	}

	public long getUsuariomodifica() {
		return _usuariomodifica;
	}

	public void setUsuariomodifica(long usuariomodifica) {
		_usuariomodifica = usuariomodifica;
	}

	public Date getFechacreamodifica() {
		return _fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		_fechacreamodifica = fechacreamodifica;
	}

	public long getUsuarioHitssId() {
		return _usuarioHitssId;
	}

	public void setUsuarioHitssId(long usuarioHitssId) {
		_usuarioHitssId = usuarioHitssId;
	}

	private long _conocimientoId;
	private String _descripcion;
	private long _etiquetaId;
	private String _nivel;
	private String _herramiento;
	private String _implementacion;
	private boolean _activo;
	private long _usuariocrea;
	private Date _fechacrea;
	private long _usuariomodifica;
	private Date _fechacreamodifica;
	private long _usuarioHitssId;
}