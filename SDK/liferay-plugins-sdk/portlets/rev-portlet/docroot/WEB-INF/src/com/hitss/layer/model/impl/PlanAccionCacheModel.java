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

import com.hitss.layer.model.PlanAccion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PlanAccion in entity cache.
 *
 * @author Danielle Delgado
 * @see PlanAccion
 * @generated
 */
public class PlanAccionCacheModel implements CacheModel<PlanAccion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{planAccionId=");
		sb.append(planAccionId);
		sb.append(", cronogramaId=");
		sb.append(cronogramaId);
		sb.append(", responsable=");
		sb.append(responsable);
		sb.append(", fechaProgramada=");
		sb.append(fechaProgramada);
		sb.append(", aprobadorColaborador=");
		sb.append(aprobadorColaborador);
		sb.append(", aprobadorLider=");
		sb.append(aprobadorLider);
		sb.append(", jerarquiaEvaluar=");
		sb.append(jerarquiaEvaluar);
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
	public PlanAccion toEntityModel() {
		PlanAccionImpl planAccionImpl = new PlanAccionImpl();

		planAccionImpl.setPlanAccionId(planAccionId);
		planAccionImpl.setCronogramaId(cronogramaId);
		planAccionImpl.setResponsable(responsable);

		if (fechaProgramada == Long.MIN_VALUE) {
			planAccionImpl.setFechaProgramada(null);
		}
		else {
			planAccionImpl.setFechaProgramada(new Date(fechaProgramada));
		}

		planAccionImpl.setAprobadorColaborador(aprobadorColaborador);
		planAccionImpl.setAprobadorLider(aprobadorLider);
		planAccionImpl.setJerarquiaEvaluar(jerarquiaEvaluar);
		planAccionImpl.setActivo(activo);
		planAccionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			planAccionImpl.setFechacrea(null);
		}
		else {
			planAccionImpl.setFechacrea(new Date(fechacrea));
		}

		planAccionImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			planAccionImpl.setFechamodifica(null);
		}
		else {
			planAccionImpl.setFechamodifica(new Date(fechamodifica));
		}

		planAccionImpl.resetOriginalValues();

		return planAccionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		planAccionId = objectInput.readLong();
		cronogramaId = objectInput.readLong();
		responsable = objectInput.readLong();
		fechaProgramada = objectInput.readLong();
		aprobadorColaborador = objectInput.readBoolean();
		aprobadorLider = objectInput.readBoolean();
		jerarquiaEvaluar = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(planAccionId);
		objectOutput.writeLong(cronogramaId);
		objectOutput.writeLong(responsable);
		objectOutput.writeLong(fechaProgramada);
		objectOutput.writeBoolean(aprobadorColaborador);
		objectOutput.writeBoolean(aprobadorLider);
		objectOutput.writeLong(jerarquiaEvaluar);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long planAccionId;
	public long cronogramaId;
	public long responsable;
	public long fechaProgramada;
	public boolean aprobadorColaborador;
	public boolean aprobadorLider;
	public long jerarquiaEvaluar;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}