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

import com.rec.hitss.layer.model.Puesto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Puesto in entity cache.
 *
 * @author Crossfire
 * @see Puesto
 * @generated
 */
public class PuestoCacheModel implements CacheModel<Puesto>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{puestoId=");
		sb.append(puestoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fechaContrato=");
		sb.append(fechaContrato);
		sb.append(", fechaEvaluacionPsicologica=");
		sb.append(fechaEvaluacionPsicologica);
		sb.append(", fechaEvalucionTecnica=");
		sb.append(fechaEvalucionTecnica);
		sb.append(", fechaEntrevistaGerenteArea=");
		sb.append(fechaEntrevistaGerenteArea);
		sb.append(", fechaEvaluacionRRHH=");
		sb.append(fechaEvaluacionRRHH);
		sb.append(", fechaPostulacion=");
		sb.append(fechaPostulacion);
		sb.append(", seleccionado=");
		sb.append(seleccionado);
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
		sb.append(", requerimientoRecursoId=");
		sb.append(requerimientoRecursoId);
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Puesto toEntityModel() {
		PuestoImpl puestoImpl = new PuestoImpl();

		puestoImpl.setPuestoId(puestoId);

		if (descripcion == null) {
			puestoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			puestoImpl.setDescripcion(descripcion);
		}

		if (fechaContrato == Long.MIN_VALUE) {
			puestoImpl.setFechaContrato(null);
		}
		else {
			puestoImpl.setFechaContrato(new Date(fechaContrato));
		}

		if (fechaEvaluacionPsicologica == Long.MIN_VALUE) {
			puestoImpl.setFechaEvaluacionPsicologica(null);
		}
		else {
			puestoImpl.setFechaEvaluacionPsicologica(new Date(
					fechaEvaluacionPsicologica));
		}

		if (fechaEvalucionTecnica == Long.MIN_VALUE) {
			puestoImpl.setFechaEvalucionTecnica(null);
		}
		else {
			puestoImpl.setFechaEvalucionTecnica(new Date(fechaEvalucionTecnica));
		}

		if (fechaEntrevistaGerenteArea == Long.MIN_VALUE) {
			puestoImpl.setFechaEntrevistaGerenteArea(null);
		}
		else {
			puestoImpl.setFechaEntrevistaGerenteArea(new Date(
					fechaEntrevistaGerenteArea));
		}

		if (fechaEvaluacionRRHH == Long.MIN_VALUE) {
			puestoImpl.setFechaEvaluacionRRHH(null);
		}
		else {
			puestoImpl.setFechaEvaluacionRRHH(new Date(fechaEvaluacionRRHH));
		}

		if (fechaPostulacion == Long.MIN_VALUE) {
			puestoImpl.setFechaPostulacion(null);
		}
		else {
			puestoImpl.setFechaPostulacion(new Date(fechaPostulacion));
		}

		puestoImpl.setSeleccionado(seleccionado);
		puestoImpl.setActivo(activo);
		puestoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			puestoImpl.setFechacrea(null);
		}
		else {
			puestoImpl.setFechacrea(new Date(fechacrea));
		}

		puestoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			puestoImpl.setFechacreamodifica(null);
		}
		else {
			puestoImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		puestoImpl.setRequerimientoRecursoId(requerimientoRecursoId);
		puestoImpl.setUsuarioHitssId(usuarioHitssId);

		puestoImpl.resetOriginalValues();

		return puestoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		puestoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		fechaContrato = objectInput.readLong();
		fechaEvaluacionPsicologica = objectInput.readLong();
		fechaEvalucionTecnica = objectInput.readLong();
		fechaEntrevistaGerenteArea = objectInput.readLong();
		fechaEvaluacionRRHH = objectInput.readLong();
		fechaPostulacion = objectInput.readLong();
		seleccionado = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
		requerimientoRecursoId = objectInput.readLong();
		usuarioHitssId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(puestoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(fechaContrato);
		objectOutput.writeLong(fechaEvaluacionPsicologica);
		objectOutput.writeLong(fechaEvalucionTecnica);
		objectOutput.writeLong(fechaEntrevistaGerenteArea);
		objectOutput.writeLong(fechaEvaluacionRRHH);
		objectOutput.writeLong(fechaPostulacion);
		objectOutput.writeBoolean(seleccionado);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
		objectOutput.writeLong(requerimientoRecursoId);
		objectOutput.writeLong(usuarioHitssId);
	}

	public long puestoId;
	public String descripcion;
	public long fechaContrato;
	public long fechaEvaluacionPsicologica;
	public long fechaEvalucionTecnica;
	public long fechaEntrevistaGerenteArea;
	public long fechaEvaluacionRRHH;
	public long fechaPostulacion;
	public boolean seleccionado;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
	public long requerimientoRecursoId;
	public long usuarioHitssId;
}