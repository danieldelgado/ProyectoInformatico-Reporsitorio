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

import com.rec.hitss.layer.model.EvaluacionPregunta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EvaluacionPregunta in entity cache.
 *
 * @author Crossfire
 * @see EvaluacionPregunta
 * @generated
 */
public class EvaluacionPreguntaCacheModel implements CacheModel<EvaluacionPregunta>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{evaluacionPreguntaId=");
		sb.append(evaluacionPreguntaId);
		sb.append(", preguntaId=");
		sb.append(preguntaId);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", nivel=");
		sb.append(nivel);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EvaluacionPregunta toEntityModel() {
		EvaluacionPreguntaImpl evaluacionPreguntaImpl = new EvaluacionPreguntaImpl();

		evaluacionPreguntaImpl.setEvaluacionPreguntaId(evaluacionPreguntaId);
		evaluacionPreguntaImpl.setPreguntaId(preguntaId);
		evaluacionPreguntaImpl.setEvaluacionId(evaluacionId);

		if (descripcion == null) {
			evaluacionPreguntaImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			evaluacionPreguntaImpl.setDescripcion(descripcion);
		}

		evaluacionPreguntaImpl.setNivel(nivel);

		evaluacionPreguntaImpl.resetOriginalValues();

		return evaluacionPreguntaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		evaluacionPreguntaId = objectInput.readLong();
		preguntaId = objectInput.readLong();
		evaluacionId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		nivel = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(evaluacionPreguntaId);
		objectOutput.writeLong(preguntaId);
		objectOutput.writeLong(evaluacionId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(nivel);
	}

	public long evaluacionPreguntaId;
	public long preguntaId;
	public long evaluacionId;
	public String descripcion;
	public long nivel;
}