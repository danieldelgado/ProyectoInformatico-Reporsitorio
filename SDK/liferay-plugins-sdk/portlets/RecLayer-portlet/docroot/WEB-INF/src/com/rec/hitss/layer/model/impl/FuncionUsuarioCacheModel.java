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
import com.liferay.portal.model.CacheModel;

import com.rec.hitss.layer.model.FuncionUsuario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FuncionUsuario in entity cache.
 *
 * @author Crossfire
 * @see FuncionUsuario
 * @generated
 */
public class FuncionUsuarioCacheModel implements CacheModel<FuncionUsuario>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{funcionId=");
		sb.append(funcionId);
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FuncionUsuario toEntityModel() {
		FuncionUsuarioImpl funcionUsuarioImpl = new FuncionUsuarioImpl();

		funcionUsuarioImpl.setFuncionId(funcionId);
		funcionUsuarioImpl.setUsuarioHitssId(usuarioHitssId);

		funcionUsuarioImpl.resetOriginalValues();

		return funcionUsuarioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		funcionId = objectInput.readLong();
		usuarioHitssId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(funcionId);
		objectOutput.writeLong(usuarioHitssId);
	}

	public long funcionId;
	public long usuarioHitssId;
}