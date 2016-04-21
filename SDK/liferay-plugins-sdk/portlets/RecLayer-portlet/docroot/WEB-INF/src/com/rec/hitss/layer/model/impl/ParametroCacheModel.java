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

import com.rec.hitss.layer.model.Parametro;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Parametro in entity cache.
 *
 * @author Crossfire
 * @see Parametro
 * @generated
 */
public class ParametroCacheModel implements CacheModel<Parametro>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{parametroId=");
		sb.append(parametroId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", llave=");
		sb.append(llave);
		sb.append(", valor=");
		sb.append(valor);
		sb.append(", parametroPadreId=");
		sb.append(parametroPadreId);
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
	public Parametro toEntityModel() {
		ParametroImpl parametroImpl = new ParametroImpl();

		parametroImpl.setParametroId(parametroId);

		if (descripcion == null) {
			parametroImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			parametroImpl.setDescripcion(descripcion);
		}

		if (llave == null) {
			parametroImpl.setLlave(StringPool.BLANK);
		}
		else {
			parametroImpl.setLlave(llave);
		}

		if (valor == null) {
			parametroImpl.setValor(StringPool.BLANK);
		}
		else {
			parametroImpl.setValor(valor);
		}

		parametroImpl.setParametroPadreId(parametroPadreId);
		parametroImpl.setActivo(activo);
		parametroImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			parametroImpl.setFechacrea(null);
		}
		else {
			parametroImpl.setFechacrea(new Date(fechacrea));
		}

		parametroImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			parametroImpl.setFechacreamodifica(null);
		}
		else {
			parametroImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		parametroImpl.resetOriginalValues();

		return parametroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		parametroId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		llave = objectInput.readUTF();
		valor = objectInput.readUTF();
		parametroPadreId = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(parametroId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (llave == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(llave);
		}

		if (valor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(valor);
		}

		objectOutput.writeLong(parametroPadreId);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long parametroId;
	public String descripcion;
	public String llave;
	public String valor;
	public long parametroPadreId;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}