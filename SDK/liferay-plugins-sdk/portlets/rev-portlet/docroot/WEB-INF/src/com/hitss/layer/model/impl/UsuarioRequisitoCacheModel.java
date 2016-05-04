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

import com.hitss.layer.model.UsuarioRequisito;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UsuarioRequisito in entity cache.
 *
 * @author Danielle Delgado
 * @see UsuarioRequisito
 * @generated
 */
public class UsuarioRequisitoCacheModel implements CacheModel<UsuarioRequisito>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", requisitoId=");
		sb.append(requisitoId);
		sb.append(", cumplerequisito=");
		sb.append(cumplerequisito);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UsuarioRequisito toEntityModel() {
		UsuarioRequisitoImpl usuarioRequisitoImpl = new UsuarioRequisitoImpl();

		usuarioRequisitoImpl.setUserId(userId);
		usuarioRequisitoImpl.setRequisitoId(requisitoId);
		usuarioRequisitoImpl.setCumplerequisito(cumplerequisito);

		usuarioRequisitoImpl.resetOriginalValues();

		return usuarioRequisitoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		requisitoId = objectInput.readLong();
		cumplerequisito = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);
		objectOutput.writeLong(requisitoId);
		objectOutput.writeBoolean(cumplerequisito);
	}

	public long userId;
	public long requisitoId;
	public boolean cumplerequisito;
}