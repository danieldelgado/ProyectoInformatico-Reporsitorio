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

import com.hitss.layer.model.PrioridadGrupoUsuarios;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PrioridadGrupoUsuarios in entity cache.
 *
 * @author Danielle Delgado
 * @see PrioridadGrupoUsuarios
 * @generated
 */
public class PrioridadGrupoUsuariosCacheModel implements CacheModel<PrioridadGrupoUsuarios>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{prioridadGrupoUsuariosId=");
		sb.append(prioridadGrupoUsuariosId);
		sb.append(", solicitudEvaluacionDesempennoId=");
		sb.append(solicitudEvaluacionDesempennoId);
		sb.append(", responsableGrupo=");
		sb.append(responsableGrupo);
		sb.append(", grupoUsuario=");
		sb.append(grupoUsuario);
		sb.append(", orden=");
		sb.append(orden);
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
	public PrioridadGrupoUsuarios toEntityModel() {
		PrioridadGrupoUsuariosImpl prioridadGrupoUsuariosImpl = new PrioridadGrupoUsuariosImpl();

		prioridadGrupoUsuariosImpl.setPrioridadGrupoUsuariosId(prioridadGrupoUsuariosId);
		prioridadGrupoUsuariosImpl.setSolicitudEvaluacionDesempennoId(solicitudEvaluacionDesempennoId);

		if (responsableGrupo == null) {
			prioridadGrupoUsuariosImpl.setResponsableGrupo(StringPool.BLANK);
		}
		else {
			prioridadGrupoUsuariosImpl.setResponsableGrupo(responsableGrupo);
		}

		if (grupoUsuario == null) {
			prioridadGrupoUsuariosImpl.setGrupoUsuario(StringPool.BLANK);
		}
		else {
			prioridadGrupoUsuariosImpl.setGrupoUsuario(grupoUsuario);
		}

		prioridadGrupoUsuariosImpl.setOrden(orden);
		prioridadGrupoUsuariosImpl.setActivo(activo);
		prioridadGrupoUsuariosImpl.setUsuariocrea(usuariocrea);

		if (fechacrea == Long.MIN_VALUE) {
			prioridadGrupoUsuariosImpl.setFechacrea(null);
		}
		else {
			prioridadGrupoUsuariosImpl.setFechacrea(new Date(fechacrea));
		}

		prioridadGrupoUsuariosImpl.setUsuariomodifica(usuariomodifica);

		if (fechamodifica == Long.MIN_VALUE) {
			prioridadGrupoUsuariosImpl.setFechamodifica(null);
		}
		else {
			prioridadGrupoUsuariosImpl.setFechamodifica(new Date(fechamodifica));
		}

		prioridadGrupoUsuariosImpl.resetOriginalValues();

		return prioridadGrupoUsuariosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		prioridadGrupoUsuariosId = objectInput.readLong();
		solicitudEvaluacionDesempennoId = objectInput.readLong();
		responsableGrupo = objectInput.readUTF();
		grupoUsuario = objectInput.readUTF();
		orden = objectInput.readInt();
		activo = objectInput.readBoolean();
		usuariocrea = objectInput.readLong();
		fechacrea = objectInput.readLong();
		usuariomodifica = objectInput.readLong();
		fechamodifica = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(prioridadGrupoUsuariosId);
		objectOutput.writeLong(solicitudEvaluacionDesempennoId);

		if (responsableGrupo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responsableGrupo);
		}

		if (grupoUsuario == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grupoUsuario);
		}

		objectOutput.writeInt(orden);
		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(usuariocrea);
		objectOutput.writeLong(fechacrea);
		objectOutput.writeLong(usuariomodifica);
		objectOutput.writeLong(fechamodifica);
	}

	public long prioridadGrupoUsuariosId;
	public long solicitudEvaluacionDesempennoId;
	public String responsableGrupo;
	public String grupoUsuario;
	public int orden;
	public boolean activo;
	public long usuariocrea;
	public long fechacrea;
	public long usuariomodifica;
	public long fechamodifica;
}