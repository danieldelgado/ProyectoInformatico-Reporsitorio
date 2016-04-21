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

package com.rec.hitss.layer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rec.hitss.layer.model.RequerimientoRecurso;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RequerimientoRecurso in entity cache.
 *
 * @author Crossfire
 * @see RequerimientoRecurso
 * @generated
 */
public class RequerimientoRecursoCacheModel implements CacheModel<RequerimientoRecurso>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{requerimientoRecursoId=");
		sb.append(requerimientoRecursoId);
		sb.append(", especialidad=");
		sb.append(especialidad);
		sb.append(", meta=");
		sb.append(meta);
		sb.append(", prioridad=");
		sb.append(prioridad);
		sb.append(", motivo=");
		sb.append(motivo);
		sb.append(", fechaSolicitada=");
		sb.append(fechaSolicitada);
		sb.append(", fechaMetaIngreso=");
		sb.append(fechaMetaIngreso);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", modalidad=");
		sb.append(modalidad);
		sb.append(", lugarTrabajo=");
		sb.append(lugarTrabajo);
		sb.append(", observacion=");
		sb.append(observacion);
		sb.append(", proyecto=");
		sb.append(proyecto);
		sb.append(", requiereequipotenico=");
		sb.append(requiereequipotenico);
		sb.append(", reemplazo=");
		sb.append(reemplazo);
		sb.append(", revisado=");
		sb.append(revisado);
		sb.append(", aprobadoFichaIngresoCapitalHumano=");
		sb.append(aprobadoFichaIngresoCapitalHumano);
		sb.append(", observacionFichaIngresoCapitalHumano=");
		sb.append(observacionFichaIngresoCapitalHumano);
		sb.append(", aprobadoFichaIngresoOperaciones=");
		sb.append(aprobadoFichaIngresoOperaciones);
		sb.append(", observacionFichaIngresoOperaciones=");
		sb.append(observacionFichaIngresoOperaciones);
		sb.append(", tipoReclutamiento=");
		sb.append(tipoReclutamiento);
		sb.append(", solicitudRequerimientoPersonalId=");
		sb.append(solicitudRequerimientoPersonalId);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", usuariocrea=");
		sb.append(usuariocrea);
		sb.append(", fechacrea=");
		sb.append(fechacrea);
		sb.append(", usuariomodifica=");
		sb.append(usuariomodifica);
		sb.append(", fechacreamodifica=");
		sb.append(fechacreamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RequerimientoRecurso toEntityModel() {
		RequerimientoRecursoImpl requerimientoRecursoImpl = new RequerimientoRecursoImpl();

		requerimientoRecursoImpl.setRequerimientoRecursoId(requerimientoRecursoId);

		if (especialidad == null) {
			requerimientoRecursoImpl.setEspecialidad(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setEspecialidad(especialidad);
		}

		if (meta == null) {
			requerimientoRecursoImpl.setMeta(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setMeta(meta);
		}

		requerimientoRecursoImpl.setPrioridad(prioridad);

		if (motivo == null) {
			requerimientoRecursoImpl.setMotivo(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setMotivo(motivo);
		}

		if (fechaSolicitada == Long.MIN_VALUE) {
			requerimientoRecursoImpl.setFechaSolicitada(null);
		}
		else {
			requerimientoRecursoImpl.setFechaSolicitada(new Date(
					fechaSolicitada));
		}

		if (fechaMetaIngreso == null) {
			requerimientoRecursoImpl.setFechaMetaIngreso(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setFechaMetaIngreso(fechaMetaIngreso);
		}

		if (estado == null) {
			requerimientoRecursoImpl.setEstado(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setEstado(estado);
		}

		requerimientoRecursoImpl.setModalidad(modalidad);

		if (lugarTrabajo == null) {
			requerimientoRecursoImpl.setLugarTrabajo(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setLugarTrabajo(lugarTrabajo);
		}

		if (observacion == null) {
			requerimientoRecursoImpl.setObservacion(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setObservacion(observacion);
		}

		if (proyecto == null) {
			requerimientoRecursoImpl.setProyecto(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setProyecto(proyecto);
		}

		requerimientoRecursoImpl.setRequiereequipotenico(requiereequipotenico);
		requerimientoRecursoImpl.setReemplazo(reemplazo);
		requerimientoRecursoImpl.setRevisado(revisado);
		requerimientoRecursoImpl.setAprobadoFichaIngresoCapitalHumano(aprobadoFichaIngresoCapitalHumano);

		if (observacionFichaIngresoCapitalHumano == null) {
			requerimientoRecursoImpl.setObservacionFichaIngresoCapitalHumano(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setObservacionFichaIngresoCapitalHumano(observacionFichaIngresoCapitalHumano);
		}

		requerimientoRecursoImpl.setAprobadoFichaIngresoOperaciones(aprobadoFichaIngresoOperaciones);

		if (observacionFichaIngresoOperaciones == null) {
			requerimientoRecursoImpl.setObservacionFichaIngresoOperaciones(StringPool.BLANK);
		}
		else {
			requerimientoRecursoImpl.setObservacionFichaIngresoOperaciones(observacionFichaIngresoOperaciones);
		}

		requerimientoRecursoImpl.setTipoReclutamiento(tipoReclutamiento);
		requerimientoRecursoImpl.setSolicitudRequerimientoPersonalId(solicitudRequerimientoPersonalId);
		requerimientoRecursoImpl.setActivo(activo);
		requerimientoRecursoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			requerimientoRecursoImpl.setFechacrea(null);
		}
		else {
			requerimientoRecursoImpl.setFechacrea(new Date(fechacrea));
		}

		requerimientoRecursoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			requerimientoRecursoImpl.setFechacreamodifica(null);
		}
		else {
			requerimientoRecursoImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		requerimientoRecursoImpl.resetOriginalValues();

		return requerimientoRecursoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		requerimientoRecursoId = objectInput.readLong();
		especialidad = objectInput.readUTF();
		meta = objectInput.readUTF();
		prioridad = objectInput.readLong();
		motivo = objectInput.readUTF();
		fechaSolicitada = objectInput.readLong();
		fechaMetaIngreso = objectInput.readUTF();
		estado = objectInput.readUTF();
		modalidad = objectInput.readLong();
		lugarTrabajo = objectInput.readUTF();
		observacion = objectInput.readUTF();
		proyecto = objectInput.readUTF();
		requiereequipotenico = objectInput.readBoolean();
		reemplazo = objectInput.readBoolean();
		revisado = objectInput.readBoolean();
		aprobadoFichaIngresoCapitalHumano = objectInput.readBoolean();
		observacionFichaIngresoCapitalHumano = objectInput.readUTF();
		aprobadoFichaIngresoOperaciones = objectInput.readBoolean();
		observacionFichaIngresoOperaciones = objectInput.readUTF();
		tipoReclutamiento = objectInput.readLong();
		solicitudRequerimientoPersonalId = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(requerimientoRecursoId);

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

		objectOutput.writeLong(prioridad);

		if (motivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(motivo);
		}

		objectOutput.writeLong(fechaSolicitada);

		if (fechaMetaIngreso == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fechaMetaIngreso);
		}

		if (estado == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(estado);
		}

		objectOutput.writeLong(modalidad);

		if (lugarTrabajo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lugarTrabajo);
		}

		if (observacion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observacion);
		}

		if (proyecto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proyecto);
		}

		objectOutput.writeBoolean(requiereequipotenico);
		objectOutput.writeBoolean(reemplazo);
		objectOutput.writeBoolean(revisado);
		objectOutput.writeBoolean(aprobadoFichaIngresoCapitalHumano);

		if (observacionFichaIngresoCapitalHumano == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observacionFichaIngresoCapitalHumano);
		}

		objectOutput.writeBoolean(aprobadoFichaIngresoOperaciones);

		if (observacionFichaIngresoOperaciones == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observacionFichaIngresoOperaciones);
		}

		objectOutput.writeLong(tipoReclutamiento);
		objectOutput.writeLong(solicitudRequerimientoPersonalId);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long requerimientoRecursoId;
	public String especialidad;
	public String meta;
	public long prioridad;
	public String motivo;
	public long fechaSolicitada;
	public String fechaMetaIngreso;
	public String estado;
	public long modalidad;
	public String lugarTrabajo;
	public String observacion;
	public String proyecto;
	public boolean requiereequipotenico;
	public boolean reemplazo;
	public boolean revisado;
	public boolean aprobadoFichaIngresoCapitalHumano;
	public String observacionFichaIngresoCapitalHumano;
	public boolean aprobadoFichaIngresoOperaciones;
	public String observacionFichaIngresoOperaciones;
	public long tipoReclutamiento;
	public long solicitudRequerimientoPersonalId;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}