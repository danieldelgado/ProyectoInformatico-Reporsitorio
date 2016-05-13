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

import com.hitss.layer.model.EvaluacionPregunta;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EvaluacionPregunta in entity cache.
 *
 * @author Danielle Delgado
 * @see EvaluacionPregunta
 * @generated
 */
public class EvaluacionPreguntaCacheModel implements CacheModel<EvaluacionPregunta>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", preguntaId=");
		sb.append(preguntaId);
		sb.append(", nivel=");
		sb.append(nivel);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EvaluacionPregunta toEntityModel() {
		EvaluacionPreguntaImpl evaluacionPreguntaImpl = new EvaluacionPreguntaImpl();

		evaluacionPreguntaImpl.setEvaluacionId(evaluacionId);
		evaluacionPreguntaImpl.setPreguntaId(preguntaId);
		evaluacionPreguntaImpl.setNivel(nivel);

		evaluacionPreguntaImpl.resetOriginalValues();

		return evaluacionPreguntaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		evaluacionId = objectInput.readLong();
		preguntaId = objectInput.readLong();
		nivel = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeLong(preguntaId);
		objectOutput.writeLong(nivel);
	}

	public long evaluacionId;
	public long preguntaId;
	public long nivel;
}