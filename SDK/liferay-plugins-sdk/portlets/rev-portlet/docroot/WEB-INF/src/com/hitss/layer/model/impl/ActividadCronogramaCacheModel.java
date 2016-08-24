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

import com.hitss.layer.model.ActividadCronograma;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ActividadCronograma in entity cache.
 *
 * @author Danielle Delgado
 * @see ActividadCronograma
 * @generated
 */
public class ActividadCronogramaCacheModel implements CacheModel<ActividadCronograma>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{cronogramaId=");
		sb.append(cronogramaId);
		sb.append(", actividadCronogramaId=");
		sb.append(actividadCronogramaId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", fechaFin=");
		sb.append(fechaFin);
		sb.append(", cumplidoEvaluacion=");
		sb.append(cumplidoEvaluacion);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", fechaInicioEvaluacion=");
		sb.append(fechaInicioEvaluacion);
		sb.append(", fechaFinEvaluacion=");
		sb.append(fechaFinEvaluacion);
		sb.append(", grupoUsuario=");
		sb.append(grupoUsuario);
		sb.append(", tipoActividad=");
		sb.append(tipoActividad);
		sb.append(", aprobadoColaborador=");
		sb.append(aprobadoColaborador);
		sb.append(", jerarquiaEvaluar=");
		sb.append(jerarquiaEvaluar);
		sb.append(", aprobadoLider=");
		sb.append(aprobadoLider);
		sb.append(", usuarioGerenteId=");
		sb.append(usuarioGerenteId);
		sb.append(", usuarioLiderId=");
		sb.append(usuarioLiderId);
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
	public ActividadCronograma toEntityModel() {
		ActividadCronogramaImpl actividadCronogramaImpl = new ActividadCronogramaImpl();

		actividadCronogramaImpl.setCronogramaId(cronogramaId);
		actividadCronogramaImpl.setActividadCronogramaId(actividadCronogramaId);

		if (descripcion == null) {
			actividadCronogramaImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			actividadCronogramaImpl.setDescripcion(descripcion);
		}

		if (fechaInicio == Long.MIN_VALUE) {
			actividadCronogramaImpl.setFechaInicio(null);
		}
		else {
			actividadCronogramaImpl.setFechaInicio(new Date(fechaInicio));
		}

		if (fechaFin == Long.MIN_VALUE) {
			actividadCronogramaImpl.setFechaFin(null);
		}
		else {
			actividadCronogramaImpl.setFechaFin(new Date(fechaFin));
		}

		actividadCronogramaImpl.setCumplidoEvaluacion(cumplidoEvaluacion);
		actividadCronogramaImpl.setEstado(estado);

		if (fechaInicioEvaluacion == Long.MIN_VALUE) {
			actividadCronogramaImpl.setFechaInicioEvaluacion(null);
		}
		else {
			actividadCronogramaImpl.setFechaInicioEvaluacion(new Date(
					fechaInicioEvaluacion));
		}

		if (fechaFinEvaluacion == Long.MIN_VALUE) {
			actividadCronogramaImpl.setFechaFinEvaluacion(null);
		}
		else {
			actividadCronogramaImpl.setFechaFinEvaluacion(new Date(
					fechaFinEvaluacion));
		}

		actividadCronogramaImpl.setGrupoUsuario(grupoUsuario);
		actividadCronogramaImpl.setTipoActividad(tipoActividad);
		actividadCronogramaImpl.setAprobadoColaborador(aprobadoColaborador);
		actividadCronogramaImpl.setJerarquiaEvaluar(jerarquiaEvaluar);
		actividadCronogramaImpl.setAprobadoLider(aprobadoLider);
		actividadCronogramaImpl.setUsuarioGerenteId(usuarioGerenteId);
		actividadCronogramaImpl.setUsuarioLiderId(usuarioLiderId);
		actividadCronogramaImpl.setActivo(activo);
		actividadCronogramaImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			actividadCronogramaImpl.setFechacrea(null);
		}
		else {
			actividadCronogramaImpl.setFechacrea(new Date(fechacrea));
		}

		actividadCronogramaImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			actividadCronogramaImpl.setFechamodifica(null);
		}
		else {
			actividadCronogramaImpl.setFechamodifica(new Date(fechamodifica));
		}

		actividadCronogramaImpl.resetOriginalValues();

		return actividadCronogramaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cronogramaId = objectInput.readLong();
		actividadCronogramaId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		fechaInicio = objectInput.readLong();
		fechaFin = objectInput.readLong();
		cumplidoEvaluacion = objectInput.readBoolean();
		estado = objectInput.readLong();
		fechaInicioEvaluacion = objectInput.readLong();
		fechaFinEvaluacion = objectInput.readLong();
		grupoUsuario = objectInput.readLong();
		tipoActividad = objectInput.readLong();
		aprobadoColaborador = objectInput.readLong();
		jerarquiaEvaluar = objectInput.readLong();
		aprobadoLider = objectInput.readLong();
		usuarioGerenteId = objectInput.readLong();
		usuarioLiderId = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cronogramaId);
		objectOutput.writeLong(actividadCronogramaId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(fechaInicio);
		objectOutput.writeLong(fechaFin);
		objectOutput.writeBoolean(cumplidoEvaluacion);
		objectOutput.writeLong(estado);
		objectOutput.writeLong(fechaInicioEvaluacion);
		objectOutput.writeLong(fechaFinEvaluacion);
		objectOutput.writeLong(grupoUsuario);
		objectOutput.writeLong(tipoActividad);
		objectOutput.writeLong(aprobadoColaborador);
		objectOutput.writeLong(jerarquiaEvaluar);
		objectOutput.writeLong(aprobadoLider);
		objectOutput.writeLong(usuarioGerenteId);
		objectOutput.writeLong(usuarioLiderId);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long cronogramaId;
	public long actividadCronogramaId;
	public String descripcion;
	public long fechaInicio;
	public long fechaFin;
	public boolean cumplidoEvaluacion;
	public long estado;
	public long fechaInicioEvaluacion;
	public long fechaFinEvaluacion;
	public long grupoUsuario;
	public long tipoActividad;
	public long aprobadoColaborador;
	public long jerarquiaEvaluar;
	public long aprobadoLider;
	public long usuarioGerenteId;
	public long usuarioLiderId;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}