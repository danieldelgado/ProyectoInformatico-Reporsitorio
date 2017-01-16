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

import com.hitss.layer.model.FasePostulacionPuestoEvaluacion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FasePostulacionPuestoEvaluacion in entity cache.
 *
 * @author Danielle Delgado
 * @see FasePostulacionPuestoEvaluacion
 * @generated
 */
public class FasePostulacionPuestoEvaluacionCacheModel implements CacheModel<FasePostulacionPuestoEvaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{fasePostulacionId=");
		sb.append(fasePostulacionId);
		sb.append(", solicitudFuncionId=");
		sb.append(solicitudFuncionId);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", resultado=");
		sb.append(resultado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FasePostulacionPuestoEvaluacion toEntityModel() {
		FasePostulacionPuestoEvaluacionImpl fasePostulacionPuestoEvaluacionImpl = new FasePostulacionPuestoEvaluacionImpl();

		fasePostulacionPuestoEvaluacionImpl.setFasePostulacionId(fasePostulacionId);
		fasePostulacionPuestoEvaluacionImpl.setSolicitudFuncionId(solicitudFuncionId);
		fasePostulacionPuestoEvaluacionImpl.setEvaluacionId(evaluacionId);
		fasePostulacionPuestoEvaluacionImpl.setResultado(resultado);

		fasePostulacionPuestoEvaluacionImpl.resetOriginalValues();

		return fasePostulacionPuestoEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fasePostulacionId = objectInput.readLong();
		solicitudFuncionId = objectInput.readLong();
		evaluacionId = objectInput.readLong();
		resultado = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fasePostulacionId);
		objectOutput.writeLong(solicitudFuncionId);
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeDouble(resultado);
	}

	public long fasePostulacionId;
	public long solicitudFuncionId;
	public long evaluacionId;
	public double resultado;
}