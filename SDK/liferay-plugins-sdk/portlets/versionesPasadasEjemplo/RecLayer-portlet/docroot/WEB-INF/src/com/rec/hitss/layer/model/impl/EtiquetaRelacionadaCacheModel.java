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

import com.rec.hitss.layer.model.EtiquetaRelacionada;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EtiquetaRelacionada in entity cache.
 *
 * @author Crossfire
 * @see EtiquetaRelacionada
 * @generated
 */
public class EtiquetaRelacionadaCacheModel implements CacheModel<EtiquetaRelacionada>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{etiquetaRelacionadaId=");
		sb.append(etiquetaRelacionadaId);
		sb.append(", registroId=");
		sb.append(registroId);
		sb.append(", etiqueta=");
		sb.append(etiqueta);
		sb.append(", tabla=");
		sb.append(tabla);
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
	public EtiquetaRelacionada toEntityModel() {
		EtiquetaRelacionadaImpl etiquetaRelacionadaImpl = new EtiquetaRelacionadaImpl();

		etiquetaRelacionadaImpl.setEtiquetaRelacionadaId(etiquetaRelacionadaId);
		etiquetaRelacionadaImpl.setRegistroId(registroId);
		etiquetaRelacionadaImpl.setEtiqueta(etiqueta);
		etiquetaRelacionadaImpl.setTabla(tabla);
		etiquetaRelacionadaImpl.setTagId(tagId);
		etiquetaRelacionadaImpl.setGroupId(groupId);
		etiquetaRelacionadaImpl.setCompanyId(companyId);

		etiquetaRelacionadaImpl.resetOriginalValues();

		return etiquetaRelacionadaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		etiquetaRelacionadaId = objectInput.readLong();
		registroId = objectInput.readLong();
		etiqueta = objectInput.readLong();
		tabla = objectInput.readLong();
		tagId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(etiquetaRelacionadaId);
		objectOutput.writeLong(registroId);
		objectOutput.writeLong(etiqueta);
		objectOutput.writeLong(tabla);
		objectOutput.writeLong(tagId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
	}

	public long etiquetaRelacionadaId;
	public long registroId;
	public long etiqueta;
	public long tabla;
	public long tagId;
	public long groupId;
	public long companyId;
}