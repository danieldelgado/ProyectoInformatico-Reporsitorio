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
public class PostulacionPK implements Comparable<PostulacionPK>, Serializable {
	public long solicitudRequerimientoId;
	public long usuarioId;

	public PostulacionPK() {
	}

	public PostulacionPK(long solicitudRequerimientoId, long usuarioId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
		this.usuarioId = usuarioId;
	}

	public long getSolicitudRequerimientoId() {
		return solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public int compareTo(PostulacionPK pk) {
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

		if (!(obj instanceof PostulacionPK)) {
			return false;
		}

		PostulacionPK pk = (PostulacionPK)obj;

		if ((solicitudRequerimientoId == pk.solicitudRequerimientoId) &&
				(usuarioId == pk.usuarioId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(solicitudRequerimientoId) +
		String.valueOf(usuarioId)).hashCode();
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
		sb.append("usuarioId");
		sb.append(StringPool.EQUAL);
		sb.append(usuarioId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}