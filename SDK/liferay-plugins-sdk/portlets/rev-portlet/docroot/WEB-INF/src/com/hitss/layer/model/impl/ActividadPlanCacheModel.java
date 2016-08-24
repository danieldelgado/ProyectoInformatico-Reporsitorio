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

package com.hitss.layer.model.impl;

import com.hitss.layer.model.ActividadPlan;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ActividadPlan in entity cache.
 *
 * @author Danielle Delgado
 * @see ActividadPlan
 * @generated
 */
public class ActividadPlanCacheModel implements CacheModel<ActividadPlan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{actividadCronogramaId=");
		sb.append(actividadCronogramaId);
		sb.append(", actividadPlanId=");
		sb.append(actividadPlanId);
		sb.append(", planAccionId=");
		sb.append(planAccionId);
		sb.append(", actividad=");
		sb.append(actividad);
		sb.append(", evidencia=");
		sb.append(evidencia);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", usuariocrea=");
		sb.append(usuariocrea);
		sb.append(", fechacrea=");
		sb.append(fechacrea);
		sb.append(", usuariomodifica=");
		sb.append(usuariomodifica);
		sb.append(", fechamodifica=");
		sb.append(fechamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActividadPlan toEntityModel() {
		ActividadPlanImpl actividadPlanImpl = new ActividadPlanImpl();

		actividadPlanImpl.setActividadCronogramaId(actividadCronogramaId);
		actividadPlanImpl.setActividadPlanId(actividadPlanId);
		actividadPlanImpl.setPlanAccionId(planAccionId);

		if (actividad == null) {
			actividadPlanImpl.setActividad(StringPool.BLANK);
		}
		else {
			actividadPlanImpl.setActividad(actividad);
		}

		if (evidencia == null) {
			actividadPlanImpl.setEvidencia(StringPool.BLANK);
		}
		else {
			actividadPlanImpl.setEvidencia(evidencia);
		}

		actividadPlanImpl.setActivo(activo);
		actividadPlanImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			actividadPlanImpl.setFechacrea(null);
		}
		else {
			actividadPlanImpl.setFechacrea(new Date(fechacrea));
		}

		actividadPlanImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			actividadPlanImpl.setFechamodifica(null);
		}
		else {
			actividadPlanImpl.setFechamodifica(new Date(fechamodifica));
		}

		actividadPlanImpl.resetOriginalValues();

		return actividadPlanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		actividadCronogramaId = objectInput.readLong();
		actividadPlanId = objectInput.readLong();
		planAccionId = objectInput.readLong();
		actividad = objectInput.readUTF();
		evidencia = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(actividadCronogramaId);
		objectOutput.writeLong(actividadPlanId);
		objectOutput.writeLong(planAccionId);

		if (actividad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actividad);
		}

		if (evidencia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(evidencia);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long actividadCronogramaId;
	public long actividadPlanId;
	public long planAccionId;
	public String actividad;
	public String evidencia;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}