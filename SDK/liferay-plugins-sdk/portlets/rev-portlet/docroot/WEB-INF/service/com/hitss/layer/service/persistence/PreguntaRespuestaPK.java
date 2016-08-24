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
public class PreguntaRespuestaPK implements Comparable<PreguntaRespuestaPK>,
	Serializable {
	public long preguntaId;
	public long respuestaId;

	public PreguntaRespuestaPK() {
	}

	public PreguntaRespuestaPK(long preguntaId, long respuestaId) {
		this.preguntaId = preguntaId;
		this.respuestaId = respuestaId;
	}

	public long getPreguntaId() {
		return preguntaId;
	}

	public void setPreguntaId(long preguntaId) {
		this.preguntaId = preguntaId;
	}

	public long getRespuestaId() {
		return respuestaId;
	}

	public void setRespuestaId(long respuestaId) {
		this.respuestaId = respuestaId;
	}

	@Override
	public int compareTo(PreguntaRespuestaPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

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

		if (respuestaId < pk.respuestaId) {
			value = -1;
		}
		else if (respuestaId > pk.respuestaId) {
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

		if (!(obj instanceof PreguntaRespuestaPK)) {
			return false;
		}

		PreguntaRespuestaPK pk = (PreguntaRespuestaPK)obj;

		if ((preguntaId == pk.preguntaId) && (respuestaId == pk.respuestaId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(preguntaId) + String.valueOf(respuestaId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("preguntaId");
		sb.append(StringPool.EQUAL);
		sb.append(preguntaId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("respuestaId");
		sb.append(StringPool.EQUAL);
		sb.append(respuestaId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}