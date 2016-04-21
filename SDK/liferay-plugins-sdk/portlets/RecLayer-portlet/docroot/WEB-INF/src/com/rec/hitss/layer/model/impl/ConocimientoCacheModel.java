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

import com.rec.hitss.layer.model.Conocimiento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Conocimiento in entity cache.
 *
 * @author Crossfire
 * @see Conocimiento
 * @generated
 */
public class ConocimientoCacheModel implements CacheModel<Conocimiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{conocimientoId=");
		sb.append(conocimientoId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", etiquetaId=");
		sb.append(etiquetaId);
		sb.append(", nivel=");
		sb.append(nivel);
		sb.append(", herramiento=");
		sb.append(herramiento);
		sb.append(", implementacion=");
		sb.append(implementacion);
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
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Conocimiento toEntityModel() {
		ConocimientoImpl conocimientoImpl = new ConocimientoImpl();

		conocimientoImpl.setConocimientoId(conocimientoId);

		if (descripcion == null) {
			conocimientoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			conocimientoImpl.setDescripcion(descripcion);
		}

		conocimientoImpl.setEtiquetaId(etiquetaId);

		if (nivel == null) {
			conocimientoImpl.setNivel(StringPool.BLANK);
		}
		else {
			conocimientoImpl.setNivel(nivel);
		}

		if (herramiento == null) {
			conocimientoImpl.setHerramiento(StringPool.BLANK);
		}
		else {
			conocimientoImpl.setHerramiento(herramiento);
		}

		if (implementacion == null) {
			conocimientoImpl.setImplementacion(StringPool.BLANK);
		}
		else {
			conocimientoImpl.setImplementacion(implementacion);
		}

		conocimientoImpl.setActivo(activo);
		conocimientoImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			conocimientoImpl.setFechacrea(null);
		}
		else {
			conocimientoImpl.setFechacrea(new Date(fechacrea));
		}

		conocimientoImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			conocimientoImpl.setFechacreamodifica(null);
		}
		else {
			conocimientoImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		conocimientoImpl.setUsuarioHitssId(usuarioHitssId);

		conocimientoImpl.resetOriginalValues();

		return conocimientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		conocimientoId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		etiquetaId = objectInput.readLong();
		nivel = objectInput.readUTF();
		herramiento = objectInput.readUTF();
		implementacion = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
		usuarioHitssId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(conocimientoId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(etiquetaId);

		if (nivel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nivel);
		}

		if (herramiento == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(herramiento);
		}

		if (implementacion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(implementacion);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
		objectOutput.writeLong(usuarioHitssId);
	}

	public long conocimientoId;
	public String descripcion;
	public long etiquetaId;
	public String nivel;
	public String herramiento;
	public String implementacion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
	public long usuarioHitssId;
}