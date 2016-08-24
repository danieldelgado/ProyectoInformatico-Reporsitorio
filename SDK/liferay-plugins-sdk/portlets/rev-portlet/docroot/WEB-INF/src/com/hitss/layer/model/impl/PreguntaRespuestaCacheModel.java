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

import com.hitss.layer.model.PreguntaRespuesta;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PreguntaRespuesta in entity cache.
 *
 * @author Danielle Delgado
 * @see PreguntaRespuesta
 * @generated
 */
public class PreguntaRespuestaCacheModel implements CacheModel<PreguntaRespuesta>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{preguntaId=");
		sb.append(preguntaId);
		sb.append(", respuestaId=");
		sb.append(respuestaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PreguntaRespuesta toEntityModel() {
		PreguntaRespuestaImpl preguntaRespuestaImpl = new PreguntaRespuestaImpl();

		preguntaRespuestaImpl.setPreguntaId(preguntaId);
		preguntaRespuestaImpl.setRespuestaId(respuestaId);

		preguntaRespuestaImpl.resetOriginalValues();

		return preguntaRespuestaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		preguntaId = objectInput.readLong();
		respuestaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(preguntaId);
		objectOutput.writeLong(respuestaId);
	}

	public long preguntaId;
	public long respuestaId;
}