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

import com.hitss.layer.model.Observaciones;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Observaciones in entity cache.
 *
 * @author Danielle Delgado
 * @see Observaciones
 * @generated
 */
public class ObservacionesCacheModel implements CacheModel<Observaciones>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{observacionId=");
		sb.append(observacionId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", tabla=");
		sb.append(tabla);
		sb.append(", registroId=");
		sb.append(registroId);
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
	public Observaciones toEntityModel() {
		ObservacionesImpl observacionesImpl = new ObservacionesImpl();

		observacionesImpl.setObservacionId(observacionId);

		if (descripcion == null) {
			observacionesImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			observacionesImpl.setDescripcion(descripcion);
		}

		if (tabla == null) {
			observacionesImpl.setTabla(StringPool.BLANK);
		}
		else {
			observacionesImpl.setTabla(tabla);
		}

		observacionesImpl.setRegistroId(registroId);
		observacionesImpl.setActivo(activo);
		observacionesImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			observacionesImpl.setFechacrea(null);
		}
		else {
			observacionesImpl.setFechacrea(new Date(fechacrea));
		}

		observacionesImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			observacionesImpl.setFechamodifica(null);
		}
		else {
			observacionesImpl.setFechamodifica(new Date(fechamodifica));
		}

		observacionesImpl.resetOriginalValues();

		return observacionesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		observacionId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		tabla = objectInput.readUTF();
		registroId = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(observacionId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (tabla == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tabla);
		}

		objectOutput.writeLong(registroId);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long observacionId;
	public String descripcion;
	public String tabla;
	public long registroId;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}