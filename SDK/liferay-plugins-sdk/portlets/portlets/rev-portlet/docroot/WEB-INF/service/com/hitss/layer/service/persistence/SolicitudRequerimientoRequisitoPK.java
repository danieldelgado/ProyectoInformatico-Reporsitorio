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
public class SolicitudRequerimientoRequisitoPK implements Comparable<SolicitudRequerimientoRequisitoPK>,
	Serializable {
	public long solicitudRequerimientoId;
	public long tagId;

	public SolicitudRequerimientoRequisitoPK() {
	}

	public SolicitudRequerimientoRequisitoPK(long solicitudRequerimientoId,
		long tagId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
		this.tagId = tagId;
	}

	public long getSolicitudRequerimientoId() {
		return solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getTagId() {
		return tagId;
	}

	public void setTagId(long tagId) {
		this.tagId = tagId;
	}

	@Override
	public int compareTo(SolicitudRequerimientoRequisitoPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (solicitudRequerimientoId < pk.solicitudRequerimientoId) {
			value = -1;
		}
		else if (solicitudRequerimientoId > pk.solicitudRequerimientoId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (tagId < pk.tagId) {
			value = -1;
		}
		else if (tagId > pk.tagId) {
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

		if (!(obj instanceof SolicitudRequerimientoRequisitoPK)) {
			return false;
		}

		SolicitudRequerimientoRequisitoPK pk = (SolicitudRequerimientoRequisitoPK)obj;

		if ((solicitudRequerimientoId == pk.solicitudRequerimientoId) &&
				(tagId == pk.tagId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(solicitudRequerimientoId) +
		String.valueOf(tagId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("solicitudRequerimientoId");
		sb.append(StringPool.EQUAL);
		sb.append(solicitudRequerimientoId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("tagId");
		sb.append(StringPool.EQUAL);
		sb.append(tagId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}