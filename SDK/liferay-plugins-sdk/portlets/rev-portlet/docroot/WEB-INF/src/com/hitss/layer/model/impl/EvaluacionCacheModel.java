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

import com.hitss.layer.model.Evaluacion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Evaluacion in entity cache.
 *
 * @author Danielle Delgado
 * @see Evaluacion
 * @generated
 */
public class EvaluacionCacheModel implements CacheModel<Evaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{evaluacionId=");
		sb.append(evaluacionId);
		sb.append(", enfoque=");
		sb.append(enfoque);
		sb.append(", puestoCategoriaEvaluacion=");
		sb.append(puestoCategoriaEvaluacion);
		sb.append(", tipoEvaluacion=");
		sb.append(tipoEvaluacion);
		sb.append(", descripcion=");
		sb.append(descripcion);
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
	public Evaluacion toEntityModel() {
		EvaluacionImpl evaluacionImpl = new EvaluacionImpl();

		evaluacionImpl.setEvaluacionId(evaluacionId);
		evaluacionImpl.setEnfoque(enfoque);
		evaluacionImpl.setPuestoCategoriaEvaluacion(puestoCategoriaEvaluacion);
		evaluacionImpl.setTipoEvaluacion(tipoEvaluacion);

		if (descripcion == null) {
			evaluacionImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			evaluacionImpl.setDescripcion(descripcion);
		}

		evaluacionImpl.setActivo(activo);
		evaluacionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			evaluacionImpl.setFechacrea(null);
		}
		else {
			evaluacionImpl.setFechacrea(new Date(fechacrea));
		}

		evaluacionImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			evaluacionImpl.setFechamodifica(null);
		}
		else {
			evaluacionImpl.setFechamodifica(new Date(fechamodifica));
		}

		evaluacionImpl.resetOriginalValues();

		return evaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		evaluacionId = objectInput.readLong();
		enfoque = objectInput.readLong();
		puestoCategoriaEvaluacion = objectInput.readLong();
		tipoEvaluacion = objectInput.readLong();
		descripcion = objectInput.readUTF();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeLong(enfoque);
		objectOutput.writeLong(puestoCategoriaEvaluacion);
		objectOutput.writeLong(tipoEvaluacion);

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long evaluacionId;
	public long enfoque;
	public long puestoCategoriaEvaluacion;
	public long tipoEvaluacion;
	public String descripcion;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}