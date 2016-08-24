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

package com.hitss.layer.model.impl;

import com.hitss.layer.model.SolicitudRequerimiento;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SolicitudRequerimiento in entity cache.
 *
 * @author Danielle Delgado
 * @see SolicitudRequerimiento
 * @generated
 */
public class SolicitudRequerimientoCacheModel implements CacheModel<SolicitudRequerimiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{solicitudRequerimientoId=");
		sb.append(solicitudRequerimientoId);
		sb.append(", areaSolicitante=");
		sb.append(areaSolicitante);
		sb.append(", cantidadRecursos=");
		sb.append(cantidadRecursos);
		sb.append(", responsableRRHH=");
		sb.append(responsableRRHH);
		sb.append(", fechaLimite=");
		sb.append(fechaLimite);
		sb.append(", tiempoContrato=");
		sb.append(tiempoContrato);
		sb.append(", tipoNegocio=");
		sb.append(tipoNegocio);
		sb.append(", presupuestoMaximo=");
		sb.append(presupuestoMaximo);
		sb.append(", presupuestoMinimo=");
		sb.append(presupuestoMinimo);
		sb.append(", cliente=");
		sb.append(cliente);
		sb.append(", especialidad=");
		sb.append(especialidad);
		sb.append(", meta=");
		sb.append(meta);
		sb.append(", fechameta=");
		sb.append(fechameta);
		sb.append(", prioridad=");
		sb.append(prioridad);
		sb.append(", motivo=");
		sb.append(motivo);
		sb.append(", descripcionPublicacion=");
		sb.append(descripcionPublicacion);
		sb.append(", modalidadjornada=");
		sb.append(modalidadjornada);
		sb.append(", modalidadcontrato=");
		sb.append(modalidadcontrato);
		sb.append(", lugarTrabajo=");
		sb.append(lugarTrabajo);
		sb.append(", categoriaPuestoId=");
		sb.append(categoriaPuestoId);
		sb.append(", proyecto=");
		sb.append(proyecto);
		sb.append(", tiporeclutamiento=");
		sb.append(tiporeclutamiento);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", usuariocrea=");
		sb.append(usuariocrea);
		sb.append(", fechacrea=");
		sb.append(fechacrea);
		sb.append(", usuariomodifica=");
		sb.append(usuariomodifica);
		sb.append(", fechamodifica=");
		sb.append(fechamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SolicitudRequerimiento toEntityModel() {
		SolicitudRequerimientoImpl solicitudRequerimientoImpl = new SolicitudRequerimientoImpl();

		solicitudRequerimientoImpl.setSolicitudRequerimientoId(solicitudRequerimientoId);
		solicitudRequerimientoImpl.setAreaSolicitante(areaSolicitante);
		solicitudRequerimientoImpl.setCantidadRecursos(cantidadRecursos);
		solicitudRequerimientoImpl.setResponsableRRHH(responsableRRHH);

		if (fechaLimite == Long.MIN_VALUE) {
			solicitudRequerimientoImpl.setFechaLimite(null);
		}
		else {
			solicitudRequerimientoImpl.setFechaLimite(new Date(fechaLimite));
		}

		solicitudRequerimientoImpl.setTiempoContrato(tiempoContrato);
		solicitudRequerimientoImpl.setTipoNegocio(tipoNegocio);
		solicitudRequerimientoImpl.setPresupuestoMaximo(presupuestoMaximo);
		solicitudRequerimientoImpl.setPresupuestoMinimo(presupuestoMinimo);
		solicitudRequerimientoImpl.setCliente(cliente);

		if (especialidad == null) {
			solicitudRequerimientoImpl.setEspecialidad(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoImpl.setEspecialidad(especialidad);
		}

		if (meta == null) {
			solicitudRequerimientoImpl.setMeta(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoImpl.setMeta(meta);
		}

		if (fechameta == Long.MIN_VALUE) {
			solicitudRequerimientoImpl.setFechameta(null);
		}
		else {
			solicitudRequerimientoImpl.setFechameta(new Date(fechameta));
		}

		solicitudRequerimientoImpl.setPrioridad(prioridad);

		if (motivo == null) {
			solicitudRequerimientoImpl.setMotivo(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoImpl.setMotivo(motivo);
		}

		if (descripcionPublicacion == null) {
			solicitudRequerimientoImpl.setDescripcionPublicacion(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoImpl.setDescripcionPublicacion(descripcionPublicacion);
		}

		solicitudRequerimientoImpl.setModalidadjornada(modalidadjornada);
		solicitudRequerimientoImpl.setModalidadcontrato(modalidadcontrato);

		if (lugarTrabajo == null) {
			solicitudRequerimientoImpl.setLugarTrabajo(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoImpl.setLugarTrabajo(lugarTrabajo);
		}

		solicitudRequerimientoImpl.setCategoriaPuestoId(categoriaPuestoId);

		if (proyecto == null) {
			solicitudRequerimientoImpl.setProyecto(StringPool.BLANK);
		}
		else {
			solicitudRequerimientoImpl.setProyecto(proyecto);
		}

		solicitudRequerimientoImpl.setTiporeclutamiento(tiporeclutamiento);
		solicitudRequerimientoImpl.setEstado(estado);
		solicitudRequerimientoImpl.setActivo(activo);
		solicitudRequerimientoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			solicitudRequerimientoImpl.setFechacrea(null);
		}
		else {
			solicitudRequerimientoImpl.setFechacrea(new Date(fechacrea));
		}

		solicitudRequerimientoImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			solicitudRequerimientoImpl.setFechamodifica(null);
		}
		else {
			solicitudRequerimientoImpl.setFechamodifica(new Date(fechamodifica));
		}

		solicitudRequerimientoImpl.resetOriginalValues();

		return solicitudRequerimientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudRequerimientoId = objectInput.readLong();
		areaSolicitante = objectInput.readLong();
		cantidadRecursos = objectInput.readInt();
		responsableRRHH = objectInput.readLong();
		fechaLimite = objectInput.readLong();
		tiempoContrato = objectInput.readLong();
		tipoNegocio = objectInput.readLong();
		presupuestoMaximo = objectInput.readLong();
		presupuestoMinimo = objectInput.readLong();
		cliente = objectInput.readLong();
		especialidad = objectInput.readUTF();
		meta = objectInput.readUTF();
		fechameta = objectInput.readLong();
		prioridad = objectInput.readLong();
		motivo = objectInput.readUTF();
		descripcionPublicacion = objectInput.readUTF();
		modalidadjornada = objectInput.readLong();
		modalidadcontrato = objectInput.readLong();
		lugarTrabajo = objectInput.readUTF();
		categoriaPuestoId = objectInput.readLong();
		proyecto = objectInput.readUTF();
		tiporeclutamiento = objectInput.readLong();
		estado = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(solicitudRequerimientoId);
		objectOutput.writeLong(areaSolicitante);
		objectOutput.writeInt(cantidadRecursos);
		objectOutput.writeLong(responsableRRHH);
		objectOutput.writeLong(fechaLimite);
		objectOutput.writeLong(tiempoContrato);
		objectOutput.writeLong(tipoNegocio);
		objectOutput.writeLong(presupuestoMaximo);
		objectOutput.writeLong(presupuestoMinimo);
		objectOutput.writeLong(cliente);

		if (especialidad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(especialidad);
		}

		if (meta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(meta);
		}

		objectOutput.writeLong(fechameta);
		objectOutput.writeLong(prioridad);

		if (motivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(motivo);
		}

		if (descripcionPublicacion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcionPublicacion);
		}

		objectOutput.writeLong(modalidadjornada);
		objectOutput.writeLong(modalidadcontrato);

		if (lugarTrabajo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lugarTrabajo);
		}

		objectOutput.writeLong(categoriaPuestoId);

		if (proyecto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proyecto);
		}

		objectOutput.writeLong(tiporeclutamiento);
		objectOutput.writeLong(estado);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long solicitudRequerimientoId;
	public long areaSolicitante;
	public int cantidadRecursos;
	public long responsableRRHH;
	public long fechaLimite;
	public long tiempoContrato;
	public long tipoNegocio;
	public long presupuestoMaximo;
	public long presupuestoMinimo;
	public long cliente;
	public String especialidad;
	public String meta;
	public long fechameta;
	public long prioridad;
	public String motivo;
	public String descripcionPublicacion;
	public long modalidadjornada;
	public long modalidadcontrato;
	public String lugarTrabajo;
	public long categoriaPuestoId;
	public String proyecto;
	public long tiporeclutamiento;
	public long estado;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}