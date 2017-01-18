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
public class EstudioPK implements Comparable<EstudioPK>, Serializable {
	public long estudioId;
	public long usuarioId;

	public EstudioPK() {
	}

	public EstudioPK(long estudioId, long usuarioId) {
		this.estudioId = estudioId;
		this.usuarioId = usuarioId;
	}

	public long getEstudioId() {
		return estudioId;
	}

	public void setEstudioId(long estudioId) {
		this.estudioId = estudioId;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public int compareTo(EstudioPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (estudioId < pk.estudioId) {
			value = -1;
		}
		else if (estudioId > pk.estudioId) {
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

		if (!(obj instanceof EstudioPK)) {
			return false;
		}

		EstudioPK pk = (EstudioPK)obj;

		if ((estudioId == pk.estudioId) && (usuarioId == pk.usuarioId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(estudioId) + String.valueOf(usuarioId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("estudioId");
		sb.append(StringPool.EQUAL);
		sb.append(estudioId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("usuarioId");
		sb.append(StringPool.EQUAL);
		sb.append(usuarioId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}