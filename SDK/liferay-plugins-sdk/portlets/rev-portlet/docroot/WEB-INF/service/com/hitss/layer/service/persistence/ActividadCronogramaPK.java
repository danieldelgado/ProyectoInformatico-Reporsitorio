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
public class ActividadCronogramaPK implements Comparable<ActividadCronogramaPK>,
	Serializable {
	public long cronogramaId;
	public long actividadCronogramaId;

	public ActividadCronogramaPK() {
	}

	public ActividadCronogramaPK(long cronogramaId, long actividadCronogramaId) {
		this.cronogramaId = cronogramaId;
		this.actividadCronogramaId = actividadCronogramaId;
	}

	public long getCronogramaId() {
		return cronogramaId;
	}

	public void setCronogramaId(long cronogramaId) {
		this.cronogramaId = cronogramaId;
	}

	public long getActividadCronogramaId() {
		return actividadCronogramaId;
	}

	public void setActividadCronogramaId(long actividadCronogramaId) {
		this.actividadCronogramaId = actividadCronogramaId;
	}

	@Override
	public int compareTo(ActividadCronogramaPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (cronogramaId < pk.cronogramaId) {
			value = -1;
		}
		else if (cronogramaId > pk.cronogramaId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (actividadCronogramaId < pk.actividadCronogramaId) {
			value = -1;
		}
		else if (actividadCronogramaId > pk.actividadCronogramaId) {
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

		if (!(obj instanceof ActividadCronogramaPK)) {
			return false;
		}

		ActividadCronogramaPK pk = (ActividadCronogramaPK)obj;

		if ((cronogramaId == pk.cronogramaId) &&
				(actividadCronogramaId == pk.actividadCronogramaId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(cronogramaId) +
		String.valueOf(actividadCronogramaId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("cronogramaId");
		sb.append(StringPool.EQUAL);
		sb.append(cronogramaId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("actividadCronogramaId");
		sb.append(StringPool.EQUAL);
		sb.append(actividadCronogramaId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}