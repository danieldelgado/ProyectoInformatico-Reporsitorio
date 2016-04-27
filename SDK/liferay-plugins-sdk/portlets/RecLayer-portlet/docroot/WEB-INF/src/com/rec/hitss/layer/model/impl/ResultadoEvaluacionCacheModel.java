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

import com.rec.hitss.layer.model.ResultadoEvaluacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ResultadoEvaluacion in entity cache.
 *
 * @author Crossfire
 * @see ResultadoEvaluacion
 * @generated
 */
public class ResultadoEvaluacionCacheModel implements CacheModel<ResultadoEvaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{resultadoEvaluacionId=");
		sb.append(resultadoEvaluacionId);
		sb.append(", respuestaSelccionada=");
		sb.append(respuestaSelccionada);
		sb.append(", habilidadCumplida=");
		sb.append(habilidadCumplida);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", usuarioHitssId=");
		sb.append(usuarioHitssId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResultadoEvaluacion toEntityModel() {
		ResultadoEvaluacionImpl resultadoEvaluacionImpl = new ResultadoEvaluacionImpl();

		resultadoEvaluacionImpl.setResultadoEvaluacionId(resultadoEvaluacionId);
		resultadoEvaluacionImpl.setRespuestaSelccionada(respuestaSelccionada);
		resultadoEvaluacionImpl.setHabilidadCumplida(habilidadCumplida);
		resultadoEvaluacionImpl.setEvaluacionId(evaluacionId);
		resultadoEvaluacionImpl.setUsuarioHitssId(usuarioHitssId);

		resultadoEvaluacionImpl.resetOriginalValues();

		return resultadoEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		resultadoEvaluacionId = objectInput.readLong();
		respuestaSelccionada = objectInput.readLong();
		habilidadCumplida = objectInput.readBoolean();
		evaluacionId = objectInput.readLong();
		usuarioHitssId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(resultadoEvaluacionId);
		objectOutput.writeLong(respuestaSelccionada);
		objectOutput.writeBoolean(habilidadCumplida);
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeLong(usuarioHitssId);
	}

	public long resultadoEvaluacionId;
	public long respuestaSelccionada;
	public boolean habilidadCumplida;
	public long evaluacionId;
	public long usuarioHitssId;
}