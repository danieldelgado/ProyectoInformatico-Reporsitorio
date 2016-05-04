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
		StringBundler sb = new StringBundler(23);

		sb.append("{actividadPlanId=");
		sb.append(actividadPlanId);
		sb.append(", planAccionId=");
		sb.append(planAccionId);
		sb.append(", responsable=");
		sb.append(responsable);
		sb.append(", actividad=");
		sb.append(actividad);
		sb.append(", evidencia=");
		sb.append(evidencia);
		sb.append(", objetivo=");
		sb.append(objetivo);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", usuariocrea=");
		sb.append(usuariocrea);
		sb.append(", fechacrea=");
		sb.append(fechacrea);
		sb.append(", usuariomodifica=");
		sb.append(usuariomodifica);
		sb.append(", fechacreamodifica=");
		sb.append(fechacreamodifica);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActividadPlan toEntityModel() {
		ActividadPlanImpl actividadPlanImpl = new ActividadPlanImpl();

		actividadPlanImpl.setActividadPlanId(actividadPlanId);
		actividadPlanImpl.setPlanAccionId(planAccionId);
		actividadPlanImpl.setResponsable(responsable);

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

		if (objetivo == null) {
			actividadPlanImpl.setObjetivo(StringPool.BLANK);
		}
		else {
			actividadPlanImpl.setObjetivo(objetivo);
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

		if (fechacreamodifica == Long.MIN_VALUE) {
			actividadPlanImpl.setFechacreamodifica(null);
		}
		else {
			actividadPlanImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		actividadPlanImpl.resetOriginalValues();

		return actividadPlanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		actividadPlanId = objectInput.readLong();
		planAccionId = objectInput.readLong();
		responsable = objectInput.readLong();
		actividad = objectInput.readUTF();
		evidencia = objectInput.readUTF();
		objetivo = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(actividadPlanId);
		objectOutput.writeLong(planAccionId);
		objectOutput.writeLong(responsable);

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

		if (objetivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(objetivo);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long actividadPlanId;
	public long planAccionId;
	public long responsable;
	public String actividad;
	public String evidencia;
	public String objetivo;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}