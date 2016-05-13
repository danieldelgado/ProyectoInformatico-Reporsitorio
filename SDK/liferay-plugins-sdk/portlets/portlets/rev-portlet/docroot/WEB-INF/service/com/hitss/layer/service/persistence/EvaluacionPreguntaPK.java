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
public class EvaluacionPreguntaPK implements Comparable<EvaluacionPreguntaPK>,
	Serializable {
	public long evaluacionId;
	public long preguntaId;

	public EvaluacionPreguntaPK() {
	}

	public EvaluacionPreguntaPK(long evaluacionId, long preguntaId) {
		this.evaluacionId = evaluacionId;
		this.preguntaId = preguntaId;
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
	public int compareTo(EvaluacionPreguntaPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

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

		if (!(obj instanceof EvaluacionPreguntaPK)) {
			return false;
		}

		EvaluacionPreguntaPK pk = (EvaluacionPreguntaPK)obj;

		if ((evaluacionId == pk.evaluacionId) && (preguntaId == pk.preguntaId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(evaluacionId) + String.valueOf(preguntaId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

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