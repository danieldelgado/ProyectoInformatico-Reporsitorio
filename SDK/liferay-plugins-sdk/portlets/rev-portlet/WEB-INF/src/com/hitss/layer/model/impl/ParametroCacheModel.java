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

import com.hitss.layer.model.Parametro;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Parametro in entity cache.
 *
 * @author Danielle Delgado
 * @see Parametro
 * @generated
 */
public class ParametroCacheModel implements CacheModel<Parametro>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{parametroId=");
		sb.append(parametroId);
		sb.append(", parametroIdpadre=");
		sb.append(parametroIdpadre);
		sb.append(", codigo=");
		sb.append(codigo);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", valor=");
		sb.append(valor);
		sb.append(", tipodato=");
		sb.append(tipodato);
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
		parametroImpl.setParametroIdpadre(parametroIdpadre);

		if (codigo == null) {
			parametroImpl.setCodigo(StringPool.BLANK);
		}
		else {
			parametroImpl.setCodigo(codigo);
		}

		if (descripcion == null) {
			parametroImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			parametroImpl.setDescripcion(descripcion);
		}

		if (valor == null) {
			parametroImpl.setValor(StringPool.BLANK);
		}
		else {
			parametroImpl.setValor(valor);
		}

		if (tipodato == null) {
			parametroImpl.setTipodato(StringPool.BLANK);
		}
		else {
			parametroImpl.setTipodato(tipodato);
		}

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
		parametroIdpadre = objectInput.readLong();
		codigo = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		valor = objectInput.readUTF();
		tipodato = objectInput.readUTF();
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
		objectOutput.writeLong(parametroIdpadre);

		if (codigo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(codigo);
		}

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (valor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(valor);
		}

		if (tipodato == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tipodato);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long parametroId;
	public long parametroIdpadre;
	public String codigo;
	public String descripcion;
	public String valor;
	public String tipodato;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}