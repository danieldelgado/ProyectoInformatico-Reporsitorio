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
public class RegistrarActividadPlanUsuarioPK implements Comparable<RegistrarActividadPlanUsuarioPK>,
	Serializable {
	public long actividadPlanId;
	public long regisitrarActividadPlanUsuariocoId;

	public RegistrarActividadPlanUsuarioPK() {
	}

	public RegistrarActividadPlanUsuarioPK(long actividadPlanId,
		long regisitrarActividadPlanUsuariocoId) {
		this.actividadPlanId = actividadPlanId;
		this.regisitrarActividadPlanUsuariocoId = regisitrarActividadPlanUsuariocoId;
	}

	public long getActividadPlanId() {
		return actividadPlanId;
	}

	public void setActividadPlanId(long actividadPlanId) {
		this.actividadPlanId = actividadPlanId;
	}

	public long getRegisitrarActividadPlanUsuariocoId() {
		return regisitrarActividadPlanUsuariocoId;
	}

	public void setRegisitrarActividadPlanUsuariocoId(
		long regisitrarActividadPlanUsuariocoId) {
		this.regisitrarActividadPlanUsuariocoId = regisitrarActividadPlanUsuariocoId;
	}

	@Override
	public int compareTo(RegistrarActividadPlanUsuarioPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (actividadPlanId < pk.actividadPlanId) {
			value = -1;
		}
		else if (actividadPlanId > pk.actividadPlanId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (regisitrarActividadPlanUsuariocoId < pk.regisitrarActividadPlanUsuariocoId) {
			value = -1;
		}
		else if (regisitrarActividadPlanUsuariocoId > pk.regisitrarActividadPlanUsuariocoId) {
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

		if (!(obj instanceof RegistrarActividadPlanUsuarioPK)) {
			return false;
		}

		RegistrarActividadPlanUsuarioPK pk = (RegistrarActividadPlanUsuarioPK)obj;

		if ((actividadPlanId == pk.actividadPlanId) &&
				(regisitrarActividadPlanUsuariocoId == pk.regisitrarActividadPlanUsuariocoId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(actividadPlanId) +
		String.valueOf(regisitrarActividadPlanUsuariocoId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("actividadPlanId");
		sb.append(StringPool.EQUAL);
		sb.append(actividadPlanId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("regisitrarActividadPlanUsuariocoId");
		sb.append(StringPool.EQUAL);
		sb.append(regisitrarActividadPlanUsuariocoId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}