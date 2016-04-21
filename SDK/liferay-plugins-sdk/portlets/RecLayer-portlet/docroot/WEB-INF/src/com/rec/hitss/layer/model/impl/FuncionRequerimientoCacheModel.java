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

import com.rec.hitss.layer.model.FuncionRequerimiento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FuncionRequerimiento in entity cache.
 *
 * @author Crossfire
 * @see FuncionRequerimiento
 * @generated
 */
public class FuncionRequerimientoCacheModel implements CacheModel<FuncionRequerimiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{funcionId=");
		sb.append(funcionId);
		sb.append(", requerimientoRecursoId=");
		sb.append(requerimientoRecursoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FuncionRequerimiento toEntityModel() {
		FuncionRequerimientoImpl funcionRequerimientoImpl = new FuncionRequerimientoImpl();

		funcionRequerimientoImpl.setFuncionId(funcionId);
		funcionRequerimientoImpl.setRequerimientoRecursoId(requerimientoRecursoId);

		funcionRequerimientoImpl.resetOriginalValues();

		return funcionRequerimientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		funcionId = objectInput.readLong();
		requerimientoRecursoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(funcionId);
		objectOutput.writeLong(requerimientoRecursoId);
	}

	public long funcionId;
	public long requerimientoRecursoId;
}