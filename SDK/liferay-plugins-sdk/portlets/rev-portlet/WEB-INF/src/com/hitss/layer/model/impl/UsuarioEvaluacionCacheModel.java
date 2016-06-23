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

import com.hitss.layer.model.UsuarioEvaluacion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UsuarioEvaluacion in entity cache.
 *
 * @author Danielle Delgado
 * @see UsuarioEvaluacion
 * @generated
 */
public class UsuarioEvaluacionCacheModel implements CacheModel<UsuarioEvaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{actividadCronogramaId=");
		sb.append(actividadCronogramaId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UsuarioEvaluacion toEntityModel() {
		UsuarioEvaluacionImpl usuarioEvaluacionImpl = new UsuarioEvaluacionImpl();

		usuarioEvaluacionImpl.setActividadCronogramaId(actividadCronogramaId);
		usuarioEvaluacionImpl.setUsuarioId(usuarioId);
		usuarioEvaluacionImpl.setEvaluacionId(evaluacionId);

		usuarioEvaluacionImpl.resetOriginalValues();

		return usuarioEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		actividadCronogramaId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		evaluacionId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(actividadCronogramaId);
		objectOutput.writeLong(usuarioId);
		objectOutput.writeLong(evaluacionId);
	}

	public long actividadCronogramaId;
	public long usuarioId;
	public long evaluacionId;
}