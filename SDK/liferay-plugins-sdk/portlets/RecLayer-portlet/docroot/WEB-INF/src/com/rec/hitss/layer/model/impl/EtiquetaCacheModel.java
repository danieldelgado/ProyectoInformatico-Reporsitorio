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

import com.rec.hitss.layer.model.Etiqueta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Etiqueta in entity cache.
 *
 * @author Crossfire
 * @see Etiqueta
 * @generated
 */
public class EtiquetaCacheModel implements CacheModel<Etiqueta>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{etiquetaId=");
		sb.append(etiquetaId);
		sb.append(", tagId=");
		sb.append(tagId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Etiqueta toEntityModel() {
		EtiquetaImpl etiquetaImpl = new EtiquetaImpl();

		etiquetaImpl.setEtiquetaId(etiquetaId);
		etiquetaImpl.setTagId(tagId);
		etiquetaImpl.setGroupId(groupId);
		etiquetaImpl.setCompanyId(companyId);

		etiquetaImpl.resetOriginalValues();

		return etiquetaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		etiquetaId = objectInput.readLong();
		tagId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(etiquetaId);
		objectOutput.writeLong(tagId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
	}

	public long etiquetaId;
	public long tagId;
	public long groupId;
	public long companyId;
}