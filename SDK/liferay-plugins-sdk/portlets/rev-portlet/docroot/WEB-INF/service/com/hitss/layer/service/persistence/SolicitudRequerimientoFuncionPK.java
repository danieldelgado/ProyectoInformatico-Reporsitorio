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
public class SolicitudRequerimientoFuncionPK implements Comparable<SolicitudRequerimientoFuncionPK>,
	Serializable {
	public long solicitudFuncionId;
	public long funcionId;

	public SolicitudRequerimientoFuncionPK() {
	}

	public SolicitudRequerimientoFuncionPK(long solicitudFuncionId,
		long funcionId) {
		this.solicitudFuncionId = solicitudFuncionId;
		this.funcionId = funcionId;
	}

	public long getSolicitudFuncionId() {
		return solicitudFuncionId;
	}

	public void setSolicitudFuncionId(long solicitudFuncionId) {
		this.solicitudFuncionId = solicitudFuncionId;
	}

	public long getFuncionId() {
		return funcionId;
	}

	public void setFuncionId(long funcionId) {
		this.funcionId = funcionId;
	}

	@Override
	public int compareTo(SolicitudRequerimientoFuncionPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

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

		if (funcionId < pk.funcionId) {
			value = -1;
		}
		else if (funcionId > pk.funcionId) {
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

		if (!(obj instanceof SolicitudRequerimientoFuncionPK)) {
			return false;
		}

		SolicitudRequerimientoFuncionPK pk = (SolicitudRequerimientoFuncionPK)obj;

		if ((solicitudFuncionId == pk.solicitudFuncionId) &&
				(funcionId == pk.funcionId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(solicitudFuncionId) + String.valueOf(funcionId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("solicitudFuncionId");
		sb.append(StringPool.EQUAL);
		sb.append(solicitudFuncionId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("funcionId");
		sb.append(StringPool.EQUAL);
		sb.append(funcionId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}