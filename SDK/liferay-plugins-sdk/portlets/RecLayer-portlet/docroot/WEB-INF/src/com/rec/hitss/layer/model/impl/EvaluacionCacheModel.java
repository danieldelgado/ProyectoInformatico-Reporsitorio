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

import com.rec.hitss.layer.model.Evaluacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Evaluacion in entity cache.
 *
 * @author Crossfire
 * @see Evaluacion
 * @generated
 */
public class EvaluacionCacheModel implements CacheModel<Evaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", tiempoMinuto=");
		sb.append(tiempoMinuto);
		sb.append(", enfoque=");
		sb.append(enfoque);
		sb.append(", puestoEvaluacion=");
		sb.append(puestoEvaluacion);
		sb.append(", tiempoPuesto=");
		sb.append(tiempoPuesto);
		sb.append(", TipoEvaluacion=");
		sb.append(TipoEvaluacion);
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
	public Evaluacion toEntityModel() {
		EvaluacionImpl evaluacionImpl = new EvaluacionImpl();

		evaluacionImpl.setEvaluacionId(evaluacionId);
		evaluacionImpl.setTiempoMinuto(tiempoMinuto);
		evaluacionImpl.setEnfoque(enfoque);
		evaluacionImpl.setPuestoEvaluacion(puestoEvaluacion);
		evaluacionImpl.setTiempoPuesto(tiempoPuesto);
		evaluacionImpl.setTipoEvaluacion(TipoEvaluacion);
		evaluacionImpl.setActivo(activo);
		evaluacionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			evaluacionImpl.setFechacrea(null);
		}
		else {
			evaluacionImpl.setFechacrea(new Date(fechacrea));
		}

		evaluacionImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			evaluacionImpl.setFechacreamodifica(null);
		}
		else {
			evaluacionImpl.setFechacreamodifica(new Date(fechacreamodifica));
		}

		evaluacionImpl.resetOriginalValues();

		return evaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		evaluacionId = objectInput.readLong();
		tiempoMinuto = objectInput.readLong();
		enfoque = objectInput.readLong();
		puestoEvaluacion = objectInput.readLong();
		tiempoPuesto = objectInput.readLong();
		TipoEvaluacion = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeLong(tiempoMinuto);
		objectOutput.writeLong(enfoque);
		objectOutput.writeLong(puestoEvaluacion);
		objectOutput.writeLong(tiempoPuesto);
		objectOutput.writeLong(TipoEvaluacion);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long evaluacionId;
	public long tiempoMinuto;
	public long enfoque;
	public long puestoEvaluacion;
	public long tiempoPuesto;
	public long TipoEvaluacion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}