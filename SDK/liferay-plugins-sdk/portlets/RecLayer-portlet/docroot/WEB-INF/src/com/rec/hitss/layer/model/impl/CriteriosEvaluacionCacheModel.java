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

import com.rec.hitss.layer.model.CriteriosEvaluacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CriteriosEvaluacion in entity cache.
 *
 * @author Crossfire
 * @see CriteriosEvaluacion
 * @generated
 */
public class CriteriosEvaluacionCacheModel implements CacheModel<CriteriosEvaluacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{criteriosEvaluacionId=");
		sb.append(criteriosEvaluacionId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", nivelCriterio=");
		sb.append(nivelCriterio);
		sb.append(", observacion=");
		sb.append(observacion);
		sb.append(", parametroPadreId=");
		sb.append(parametroPadreId);
		sb.append(", evaluacionId=");
		sb.append(evaluacionId);
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
	public CriteriosEvaluacion toEntityModel() {
		CriteriosEvaluacionImpl criteriosEvaluacionImpl = new CriteriosEvaluacionImpl();

		criteriosEvaluacionImpl.setCriteriosEvaluacionId(criteriosEvaluacionId);

		if (nombre == null) {
			criteriosEvaluacionImpl.setNombre(StringPool.BLANK);
		}
		else {
			criteriosEvaluacionImpl.setNombre(nombre);
		}

		if (nivelCriterio == null) {
			criteriosEvaluacionImpl.setNivelCriterio(StringPool.BLANK);
		}
		else {
			criteriosEvaluacionImpl.setNivelCriterio(nivelCriterio);
		}

		if (observacion == null) {
			criteriosEvaluacionImpl.setObservacion(StringPool.BLANK);
		}
		else {
			criteriosEvaluacionImpl.setObservacion(observacion);
		}

		criteriosEvaluacionImpl.setParametroPadreId(parametroPadreId);
		criteriosEvaluacionImpl.setEvaluacionId(evaluacionId);
		criteriosEvaluacionImpl.setActivo(activo);
		criteriosEvaluacionImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			criteriosEvaluacionImpl.setFechacrea(null);
		}
		else {
			criteriosEvaluacionImpl.setFechacrea(new Date(fechacrea));
		}

		criteriosEvaluacionImpl.setUsuariomodifica(usuariomodifica);

		if (fechacreamodifica == Long.MIN_VALUE) {
			criteriosEvaluacionImpl.setFechacreamodifica(null);
		}
		else {
			criteriosEvaluacionImpl.setFechacreamodifica(new Date(
					fechacreamodifica));
		}

		criteriosEvaluacionImpl.resetOriginalValues();

		return criteriosEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		criteriosEvaluacionId = objectInput.readLong();
		nombre = objectInput.readUTF();
		nivelCriterio = objectInput.readUTF();
		observacion = objectInput.readUTF();
		parametroPadreId = objectInput.readLong();
		evaluacionId = objectInput.readLong();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechacreamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(criteriosEvaluacionId);

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (nivelCriterio == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nivelCriterio);
		}

		if (observacion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(observacion);
		}

		objectOutput.writeLong(parametroPadreId);
		objectOutput.writeLong(evaluacionId);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechacreamodifica);
	}

	public long criteriosEvaluacionId;
	public String nombre;
	public String nivelCriterio;
	public String observacion;
	public long parametroPadreId;
	public long evaluacionId;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechacreamodifica;
}