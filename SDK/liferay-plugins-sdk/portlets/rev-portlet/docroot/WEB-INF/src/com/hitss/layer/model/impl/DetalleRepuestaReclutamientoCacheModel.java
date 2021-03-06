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

import com.hitss.layer.model.DetalleRepuestaReclutamiento;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DetalleRepuestaReclutamiento in entity cache.
 *
 * @author Danielle Delgado
 * @see DetalleRepuestaReclutamiento
 * @generated
 */
public class DetalleRepuestaReclutamientoCacheModel implements CacheModel<DetalleRepuestaReclutamiento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{detalleRepsuestaId=");
		sb.append(detalleRepsuestaId);
		sb.append(", usuarioId=");
		sb.append(usuarioId);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
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
	public DetalleRepuestaReclutamiento toEntityModel() {
		DetalleRepuestaReclutamientoImpl detalleRepuestaReclutamientoImpl = new DetalleRepuestaReclutamientoImpl();

		detalleRepuestaReclutamientoImpl.setDetalleRepsuestaId(detalleRepsuestaId);
		detalleRepuestaReclutamientoImpl.setUsuarioId(usuarioId);
		detalleRepuestaReclutamientoImpl.setEvaluacionId(evaluacionId);

		if (descripcion == null) {
			detalleRepuestaReclutamientoImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			detalleRepuestaReclutamientoImpl.setDescripcion(descripcion);
		}

		detalleRepuestaReclutamientoImpl.setPreguntaId(preguntaId);
		detalleRepuestaReclutamientoImpl.setRespuestaSeleccionada(respuestaSeleccionada);

		detalleRepuestaReclutamientoImpl.resetOriginalValues();

		return detalleRepuestaReclutamientoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		detalleRepsuestaId = objectInput.readLong();
		usuarioId = objectInput.readLong();
		evaluacionId = objectInput.readLong();
		descripcion = objectInput.readUTF();
		preguntaId = objectInput.readLong();
		respuestaSeleccionada = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(detalleRepsuestaId);
		objectOutput.writeLong(usuarioId);
		objectOutput.writeLong(evaluacionId);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeLong(preguntaId);
		objectOutput.writeInt(respuestaSeleccionada);
	}

	public long detalleRepsuestaId;
	public long usuarioId;
	public long evaluacionId;
	public String descripcion;
	public long preguntaId;
	public int respuestaSeleccionada;
}