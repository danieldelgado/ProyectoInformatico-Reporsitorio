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
public class DetalleRepuestaEvaluacionPK implements Comparable<DetalleRepuestaEvaluacionPK>,
	Serializable {
	public long detalleRepuestaEvaluacionId;
	public long evaluacionId;
	public long usuarioId;

	public DetalleRepuestaEvaluacionPK() {
	}

	public DetalleRepuestaEvaluacionPK(long detalleRepuestaEvaluacionId,
		long evaluacionId, long usuarioId) {
		this.detalleRepuestaEvaluacionId = detalleRepuestaEvaluacionId;
		this.evaluacionId = evaluacionId;
		this.usuarioId = usuarioId;
	}

	public long getDetalleRepuestaEvaluacionId() {
		return detalleRepuestaEvaluacionId;
	}

	public void setDetalleRepuestaEvaluacionId(long detalleRepuestaEvaluacionId) {
		this.detalleRepuestaEvaluacionId = detalleRepuestaEvaluacionId;
	}

	public long getEvaluacionId() {
		return evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public int compareTo(DetalleRepuestaEvaluacionPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (detalleRepuestaEvaluacionId < pk.detalleRepuestaEvaluacionId) {
			value = -1;
		}
		else if (detalleRepuestaEvaluacionId > pk.detalleRepuestaEvaluacionId) {
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

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DetalleRepuestaEvaluacionPK)) {
			return false;
		}

		DetalleRepuestaEvaluacionPK pk = (DetalleRepuestaEvaluacionPK)obj;

		if ((detalleRepuestaEvaluacionId == pk.detalleRepuestaEvaluacionId) &&
				(evaluacionId == pk.evaluacionId) &&
				(usuarioId == pk.usuarioId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(detalleRepuestaEvaluacionId) +
		String.valueOf(evaluacionId) + String.valueOf(usuarioId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("detalleRepuestaEvaluacionId");
		sb.append(StringPool.EQUAL);
		sb.append(detalleRepuestaEvaluacionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("evaluacionId");
		sb.append(StringPool.EQUAL);
		sb.append(evaluacionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("usuarioId");
		sb.append(StringPool.EQUAL);
		sb.append(usuarioId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}