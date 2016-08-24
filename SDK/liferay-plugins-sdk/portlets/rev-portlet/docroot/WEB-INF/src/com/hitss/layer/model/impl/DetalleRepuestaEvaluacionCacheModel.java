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

import com.hitss.layer.model.DetalleRepuestaEvaluacion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DetalleRepuestaEvaluacion in entity cache.
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaEvaluacion
 * @generated
 */
public class DetalleRepuestaEvaluacionCacheModel implements CacheModel<DetalleRepuestaEvaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{detalleRepuestaEvaluacionId=");
		sb.append(detalleRepuestaEvaluacionId);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", preguntaId=");
		sb.append(preguntaId);
		sb.append(", respuestaSeleccionada=");
		sb.append(respuestaSeleccionada);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DetalleRepuestaEvaluacion toEntityModel() {
		DetalleRepuestaEvaluacionImpl detalleRepuestaEvaluacionImpl = new DetalleRepuestaEvaluacionImpl();

		detalleRepuestaEvaluacionImpl.setDetalleRepuestaEvaluacionId(detalleRepuestaEvaluacionId);
		detalleRepuestaEvaluacionImpl.setEvaluacionId(evaluacionId);
		detalleRepuestaEvaluacionImpl.setUsuarioId(usuarioId);

		if (descripcion == null) {
			detalleRepuestaEvaluacionImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			detalleRepuestaEvaluacionImpl.setDescripcion(descripcion);
		}

		detalleRepuestaEvaluacionImpl.setPreguntaId(preguntaId);
		detalleRepuestaEvaluacionImpl.setRespuestaSeleccionada(respuestaSeleccionada);

		detalleRepuestaEvaluacionImpl.resetOriginalValues();

		return detalleRepuestaEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		detalleRepuestaEvaluacionId = objectInput.readLong();
		evaluacionId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		preguntaId = objectInput.readLong();
		respuestaSeleccionada = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(detalleRepuestaEvaluacionId);
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeLong(usuarioId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(preguntaId);
		objectOutput.writeLong(respuestaSeleccionada);
	}

	public long detalleRepuestaEvaluacionId;
	public long evaluacionId;
	public long usuarioId;
	public String descripcion;
	public long preguntaId;
	public long respuestaSeleccionada;
}