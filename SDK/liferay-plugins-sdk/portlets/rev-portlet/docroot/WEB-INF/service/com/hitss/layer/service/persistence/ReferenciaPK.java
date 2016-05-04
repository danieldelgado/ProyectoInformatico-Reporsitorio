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
public class ReferenciaPK implements Comparable<ReferenciaPK>, Serializable {
	public long referenciaId;
	public long usuarioId;

	public ReferenciaPK() {
	}

	public ReferenciaPK(long referenciaId, long usuarioId) {
		this.referenciaId = referenciaId;
		this.usuarioId = usuarioId;
	}

	public long getReferenciaId() {
		return referenciaId;
	}

	public void setReferenciaId(long referenciaId) {
		this.referenciaId = referenciaId;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public int compareTo(ReferenciaPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (referenciaId < pk.referenciaId) {
			value = -1;
		}
		else if (referenciaId > pk.referenciaId) {
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

		if (!(obj instanceof ReferenciaPK)) {
			return false;
		}

		ReferenciaPK pk = (ReferenciaPK)obj;

		if ((referenciaId == pk.referenciaId) && (usuarioId == pk.usuarioId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(referenciaId) + String.valueOf(usuarioId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("referenciaId");
		sb.append(StringPool.EQUAL);
		sb.append(referenciaId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("usuarioId");
		sb.append(StringPool.EQUAL);
		sb.append(usuarioId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}