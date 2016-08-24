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

import com.rec.hitss.layer.model.SolicitudRequerimientoRequisito;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SolicitudRequerimientoRequisito in entity cache.
 *
 * @author Crossfire
 * @see SolicitudRequerimientoRequisito
 * @generated
 */
public class SolicitudRequerimientoRequisitoCacheModel implements CacheModel<SolicitudRequerimientoRequisito>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{solicitudRequerimientoId=");
		sb.append(solicitudRequerimientoId);
		sb.append(", requisitosId=");
		sb.append(requisitosId);
		sb.append(", exigible=");
		sb.append(exigible);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SolicitudRequerimientoRequisito toEntityModel() {
		SolicitudRequerimientoRequisitoImpl solicitudRequerimientoRequisitoImpl = new SolicitudRequerimientoRequisitoImpl();

		solicitudRequerimientoRequisitoImpl.setSolicitudRequerimientoId(solicitudRequerimientoId);
		solicitudRequerimientoRequisitoImpl.setRequisitosId(requisitosId);
		solicitudRequerimientoRequisitoImpl.setExigible(exigible);

		solicitudRequerimientoRequisitoImpl.resetOriginalValues();

		return solicitudRequerimientoRequisitoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		solicitudRequerimientoId = objectInput.readLong();
		requisitosId = objectInput.readLong();
		exigible = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(solicitudRequerimientoId);
		objectOutput.writeLong(requisitosId);
		objectOutput.writeBoolean(exigible);
	}

	public long solicitudRequerimientoId;
	public long requisitosId;
	public boolean exigible;
}