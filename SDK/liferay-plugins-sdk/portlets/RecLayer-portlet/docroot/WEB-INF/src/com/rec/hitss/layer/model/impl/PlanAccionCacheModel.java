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

package com.rec.hitss.layer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rec.hitss.layer.model.PlanAccion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PlanAccion in entity cache.
 *
 * @author Crossfire
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
		sb.append(", actividadesId=");
		sb.append(actividadesId);
		sb.append(", responsable=");
		sb.append(responsable);
		sb.append(", fechaEmitida=");
		sb.append(fechaEmitida);
		sb.append(", fechaProgramada=");
		sb.append(fechaProgramada);
		sb.append(", aprobadorColaborador=");
		sb.append(aprobadorColaborador);
		sb.append(", aprobadorLideres=");
		sb.append(aprobadorLideres);
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
	public PlanAccion toEntityModel() {
		PlanAccionImpl planAccionImpl = new PlanAccionImpl();

		planAccionImpl.setPlanAccionId(planAccionId);
		planAccionImpl.setActividadesId(actividadesId);

		if (responsable == null) {
			planAccionImpl.setResponsable(StringPool.BLANK);
		}
		else {
			planAccionImpl.setResponsable(responsable);
		}

		if (fechaEmitida == Long.MIN_VALUE) {
			planAccionImpl.setFechaEmitida(null);
		}
		else {
			planAccionImpl.setFechaEmitida(new Date(fechaEmitida));
		}

		if (fechaProgramada == Long.MIN_VALUE) {
			planAccionImpl.setFechaProgramada(null);
		}
		else {
			planAccionImpl.setFechaProgramada(new Date(fechaProgramada));
		}

		planAccionImpl.setAprobadorColaborador(aprobadorColaborador);
		planAccionImpl.setAprobadorLideres(aprobadorLideres);
		planAccionImpl.setActivo(activo);
		planAccionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			planAccionImpl.setFechacrea(null);
		}
		else {
			planAccionImpl.setFechacrea(new Date(fechacrea));
		}

		planAccionImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			planAccionImpl.setFechacreamodifica(null);
		}
		else {
			planAccionImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		planAccionImpl.resetOriginalValues();

		return planAccionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		planAccionId = objectInput.readLong();
		actividadesId = objectInput.readLong();
		responsable = objectInput.readUTF();
		fechaEmitida = objectInput.readLong();
		fechaProgramada = objectInput.readLong();
		aprobadorColaborador = objectInput.readBoolean();
		aprobadorLideres = objectInput.readBoolean();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(planAccionId);
		objectOutput.writeLong(actividadesId);

		if (responsable == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responsable);
		}

		objectOutput.writeLong(fechaEmitida);
		objectOutput.writeLong(fechaProgramada);
		objectOutput.writeBoolean(aprobadorColaborador);
		objectOutput.writeBoolean(aprobadorLideres);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long planAccionId;
	public long actividadesId;
	public String responsable;
	public long fechaEmitida;
	public long fechaProgramada;
	public boolean aprobadorColaborador;
	public boolean aprobadorLideres;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}