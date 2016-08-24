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

package com.hitss.layer.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Danielle Delgado
 * @generated
 */
public class DetalleRepuestaReclutamientoPK implements Comparable<DetalleRepuestaReclutamientoPK>,
	Serializable {
	public long detalleRepsuestaId;
	public long usuarioId;
	public long evaluacionId;
	public long preguntaId;

	public DetalleRepuestaReclutamientoPK() {
	}

	public DetalleRepuestaReclutamientoPK(long detalleRepsuestaId,
		long usuarioId, long evaluacionId, long preguntaId) {
		this.detalleRepsuestaId = detalleRepsuestaId;
		this.usuarioId = usuarioId;
		this.evaluacionId = evaluacionId;
		this.preguntaId = preguntaId;
	}

	public long getDetalleRepsuestaId() {
		return detalleRepsuestaId;
	}

	public void setDetalleRepsuestaId(long detalleRepsuestaId) {
		this.detalleRepsuestaId = detalleRepsuestaId;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public long getEvaluacionId() {
		return evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	public long getPreguntaId() {
		return preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		this.preguntaId = preguntaId;
	}

	@Override
	public int compareTo(DetalleRepuestaReclutamientoPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (detalleRepsuestaId < pk.detalleRepsuestaId) {
			value = -1;
		}
		else if (detalleRepsuestaId > pk.detalleRepsuestaId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (usuarioId < pk.usuarioId) {
			value = -1;
		}
		else if (usuarioId > pk.usuarioId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (evaluacionId < pk.evaluacionId) {
			value = -1;
		}
		else if (evaluacionId > pk.evaluacionId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (preguntaId < pk.preguntaId) {
			value = -1;
		}
		else if (preguntaId > pk.preguntaId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetalleRepuestaReclutamientoPK)) {
			return false;
		}

		DetalleRepuestaReclutamientoPK pk = (DetalleRepuestaReclutamientoPK)obj;

		if ((detalleRepsuestaId == pk.detalleRepsuestaId) &&
				(usuarioId == pk.usuarioId) &&
				(evaluacionId == pk.evaluacionId) &&
				(preguntaId == pk.preguntaId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(detalleRepsuestaId) + String.valueOf(usuarioId) +
		String.valueOf(evaluacionId) + String.valueOf(preguntaId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(20);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("detalleRepsuestaId");
		sb.append(StringPool.EQUAL);
		sb.append(detalleRepsuestaId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("usuarioId");
		sb.append(StringPool.EQUAL);
		sb.append(usuarioId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("evaluacionId");
		sb.append(StringPool.EQUAL);
		sb.append(evaluacionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("preguntaId");
		sb.append(StringPool.EQUAL);
		sb.append(preguntaId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}