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

import com.hitss.layer.model.Experiencia;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Experiencia in entity cache.
 *
 * @author Danielle Delgado
 * @see Experiencia
 * @generated
 */
public class ExperienciaCacheModel implements CacheModel<Experiencia>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{experienciaId=");
		sb.append(experienciaId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", empresa=");
		sb.append(empresa);
		sb.append(", proyecto=");
		sb.append(proyecto);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", fechaFin=");
		sb.append(fechaFin);
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
	public Experiencia toEntityModel() {
		ExperienciaImpl experienciaImpl = new ExperienciaImpl();

		experienciaImpl.setExperienciaId(experienciaId);
		experienciaImpl.setUsuarioId(usuarioId);

		if (descripcion == null) {
			experienciaImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			experienciaImpl.setDescripcion(descripcion);
		}

		if (empresa == null) {
			experienciaImpl.setEmpresa(StringPool.BLANK);
		}
		else {
			experienciaImpl.setEmpresa(empresa);
		}

		if (proyecto == null) {
			experienciaImpl.setProyecto(StringPool.BLANK);
		}
		else {
			experienciaImpl.setProyecto(proyecto);
		}

		if (fechaInicio == Long.MIN_VALUE) {
			experienciaImpl.setFechaInicio(null);
		}
		else {
			experienciaImpl.setFechaInicio(new Date(fechaInicio));
		}

		if (fechaFin == Long.MIN_VALUE) {
			experienciaImpl.setFechaFin(null);
		}
		else {
			experienciaImpl.setFechaFin(new Date(fechaFin));
		}

		experienciaImpl.setActivo(activo);
		experienciaImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			experienciaImpl.setFechacrea(null);
		}
		else {
			experienciaImpl.setFechacrea(new Date(fechacrea));
		}

		experienciaImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			experienciaImpl.setFechamodifica(null);
		}
		else {
			experienciaImpl.setFechamodifica(new Date(fechamodifica));
		}

		experienciaImpl.resetOriginalValues();

		return experienciaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		experienciaId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		empresa = objectInput.readUTF();
		proyecto = objectInput.readUTF();
		fechaInicio = objectInput.readLong();
		fechaFin = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(experienciaId);
		objectOutput.writeLong(usuarioId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (empresa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empresa);
		}

		if (proyecto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proyecto);
		}

		objectOutput.writeLong(fechaInicio);
		objectOutput.writeLong(fechaFin);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long experienciaId;
	public long usuarioId;
	public String descripcion;
	public String empresa;
	public String proyecto;
	public long fechaInicio;
	public long fechaFin;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}