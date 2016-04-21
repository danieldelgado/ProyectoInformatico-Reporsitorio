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

import com.rec.hitss.layer.model.UsuarioHitss;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UsuarioHitss in entity cache.
 *
 * @author Crossfire
 * @see UsuarioHitss
 * @generated
 */
public class UsuarioHitssCacheModel implements CacheModel<UsuarioHitss>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userUuId=");
		sb.append(userUuId);
		sb.append(", actividadPlanId=");
		sb.append(actividadPlanId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UsuarioHitss toEntityModel() {
		UsuarioHitssImpl usuarioHitssImpl = new UsuarioHitssImpl();

		usuarioHitssImpl.setUsuarioHitssId(usuarioHitssId);

		if (userId == null) {
			usuarioHitssImpl.setUserId(StringPool.BLANK);
		}
		else {
			usuarioHitssImpl.setUserId(userId);
		}

		if (userUuId == null) {
			usuarioHitssImpl.setUserUuId(StringPool.BLANK);
		}
		else {
			usuarioHitssImpl.setUserUuId(userUuId);
		}

		usuarioHitssImpl.setActividadPlanId(actividadPlanId);

		usuarioHitssImpl.resetOriginalValues();

		return usuarioHitssImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		usuarioHitssId = objectInput.readLong();
		userId = objectInput.readUTF();
		userUuId = objectInput.readUTF();
		actividadPlanId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(usuarioHitssId);

		if (userId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userId);
		}

		if (userUuId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userUuId);
		}

		objectOutput.writeLong(actividadPlanId);
	}

	public long usuarioHitssId;
	public String userId;
	public String userUuId;
	public long actividadPlanId;
}