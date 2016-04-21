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
import com.liferay.portal.model.CacheModel;

import com.rec.hitss.layer.model.PrioridadEquipos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PrioridadEquipos in entity cache.
 *
 * @author Crossfire
 * @see PrioridadEquipos
 * @generated
 */
public class PrioridadEquiposCacheModel implements CacheModel<PrioridadEquipos>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{prioridadEquiposId=");
		sb.append(prioridadEquiposId);
		sb.append(", solicitudEvaluacionDesempenoId=");
		sb.append(solicitudEvaluacionDesempenoId);
		sb.append(", responsable=");
		sb.append(responsable);
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
	public PrioridadEquipos toEntityModel() {
		PrioridadEquiposImpl prioridadEquiposImpl = new PrioridadEquiposImpl();

		prioridadEquiposImpl.setPrioridadEquiposId(prioridadEquiposId);
		prioridadEquiposImpl.setSolicitudEvaluacionDesempenoId(solicitudEvaluacionDesempenoId);
		prioridadEquiposImpl.setResponsable(responsable);
		prioridadEquiposImpl.setActivo(activo);
		prioridadEquiposImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			prioridadEquiposImpl.setFechacrea(null);
		}
		else {
			prioridadEquiposImpl.setFechacrea(new Date(fechacrea));
		}

		prioridadEquiposImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			prioridadEquiposImpl.setFechacreamodifica(null);
		}
		else {
			prioridadEquiposImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		prioridadEquiposImpl.resetOriginalValues();

		return prioridadEquiposImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		prioridadEquiposId = objectInput.readLong();
		solicitudEvaluacionDesempenoId = objectInput.readLong();
		responsable = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(prioridadEquiposId);
		objectOutput.writeLong(solicitudEvaluacionDesempenoId);
		objectOutput.writeLong(responsable);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long prioridadEquiposId;
	public long solicitudEvaluacionDesempenoId;
	public long responsable;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}