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
public class FasePostulacionPuestoEvaluacionPK implements Comparable<FasePostulacionPuestoEvaluacionPK>,
	Serializable {
	public long fasePostulacionId;
	public long solicitudFuncionId;
	public long evaluacionId;

	public FasePostulacionPuestoEvaluacionPK() {
	}

	public FasePostulacionPuestoEvaluacionPK(long fasePostulacionId,
		long solicitudFuncionId, long evaluacionId) {
		this.fasePostulacionId = fasePostulacionId;
		this.solicitudFuncionId = solicitudFuncionId;
		this.evaluacionId = evaluacionId;
	}

	public long getFasePostulacionId() {
		return fasePostulacionId;
	}

	public void setFasePostulacionId(long fasePostulacionId) {
		this.fasePostulacionId = fasePostulacionId;
	}

	public long getSolicitudFuncionId() {
		return solicitudFuncionId;
	}

	public void setSolicitudFuncionId(long solicitudFuncionId) {
		this.solicitudFuncionId = solicitudFuncionId;
	}

	public long getEvaluacionId() {
		return evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	@Override
	public int compareTo(FasePostulacionPuestoEvaluacionPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (fasePostulacionId < pk.fasePostulacionId) {
			value = -1;
		}
		else if (fasePostulacionId > pk.fasePostulacionId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (solicitudFuncionId < pk.solicitudFuncionId) {
			value = -1;
		}
		else if (solicitudFuncionId > pk.solicitudFuncionId) {
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

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FasePostulacionPuestoEvaluacionPK)) {
			return false;
		}

		FasePostulacionPuestoEvaluacionPK pk = (FasePostulacionPuestoEvaluacionPK)obj;

		if ((fasePostulacionId == pk.fasePostulacionId) &&
				(solicitudFuncionId == pk.solicitudFuncionId) &&
				(evaluacionId == pk.evaluacionId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(fasePostulacionId) +
		String.valueOf(solicitudFuncionId) + String.valueOf(evaluacionId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("fasePostulacionId");
		sb.append(StringPool.EQUAL);
		sb.append(fasePostulacionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("solicitudFuncionId");
		sb.append(StringPool.EQUAL);
		sb.append(solicitudFuncionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("evaluacionId");
		sb.append(StringPool.EQUAL);
		sb.append(evaluacionId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}