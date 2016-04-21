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

package com.rec.hitss.layer.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RequerimientoRecurso service. Represents a row in the &quot;RequerimientoRecurso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rec.hitss.layer.model.impl.RequerimientoRecursoImpl}.
 * </p>
 *
 * @author Crossfire
 * @see RequerimientoRecurso
 * @see com.rec.hitss.layer.model.impl.RequerimientoRecursoImpl
 * @see com.rec.hitss.layer.model.impl.RequerimientoRecursoModelImpl
 * @generated
 */
public interface RequerimientoRecursoModel extends BaseModel<RequerimientoRecurso> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a requerimiento recurso model instance should use the {@link RequerimientoRecurso} interface instead.
	 */

	/**
	 * Returns the primary key of this requerimiento recurso.
	 *
	 * @return the primary key of this requerimiento recurso
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this requerimiento recurso.
	 *
	 * @param primaryKey the primary key of this requerimiento recurso
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the requerimiento recurso ID of this requerimiento recurso.
	 *
	 * @return the requerimiento recurso ID of this requerimiento recurso
	 */
	public long getRequerimientoRecursoId();

	/**
	 * Sets the requerimiento recurso ID of this requerimiento recurso.
	 *
	 * @param requerimientoRecursoId the requerimiento recurso ID of this requerimiento recurso
	 */
	public void setRequerimientoRecursoId(long requerimientoRecursoId);

	/**
	 * Returns the especialidad of this requerimiento recurso.
	 *
	 * @return the especialidad of this requerimiento recurso
	 */
	@AutoEscape
	public String getEspecialidad();

	/**
	 * Sets the especialidad of this requerimiento recurso.
	 *
	 * @param especialidad the especialidad of this requerimiento recurso
	 */
	public void setEspecialidad(String especialidad);

	/**
	 * Returns the meta of this requerimiento recurso.
	 *
	 * @return the meta of this requerimiento recurso
	 */
	@AutoEscape
	public String getMeta();

	/**
	 * Sets the meta of this requerimiento recurso.
	 *
	 * @param meta the meta of this requerimiento recurso
	 */
	public void setMeta(String meta);

	/**
	 * Returns the prioridad of this requerimiento recurso.
	 *
	 * @return the prioridad of this requerimiento recurso
	 */
	public long getPrioridad();

	/**
	 * Sets the prioridad of this requerimiento recurso.
	 *
	 * @param prioridad the prioridad of this requerimiento recurso
	 */
	public void setPrioridad(long prioridad);

	/**
	 * Returns the motivo of this requerimiento recurso.
	 *
	 * @return the motivo of this requerimiento recurso
	 */
	@AutoEscape
	public String getMotivo();

	/**
	 * Sets the motivo of this requerimiento recurso.
	 *
	 * @param motivo the motivo of this requerimiento recurso
	 */
	public void setMotivo(String motivo);

	/**
	 * Returns the fecha solicitada of this requerimiento recurso.
	 *
	 * @return the fecha solicitada of this requerimiento recurso
	 */
	public Date getFechaSolicitada();

	/**
	 * Sets the fecha solicitada of this requerimiento recurso.
	 *
	 * @param fechaSolicitada the fecha solicitada of this requerimiento recurso
	 */
	public void setFechaSolicitada(Date fechaSolicitada);

	/**
	 * Returns the fecha meta ingreso of this requerimiento recurso.
	 *
	 * @return the fecha meta ingreso of this requerimiento recurso
	 */
	@AutoEscape
	public String getFechaMetaIngreso();

	/**
	 * Sets the fecha meta ingreso of this requerimiento recurso.
	 *
	 * @param fechaMetaIngreso the fecha meta ingreso of this requerimiento recurso
	 */
	public void setFechaMetaIngreso(String fechaMetaIngreso);

	/**
	 * Returns the estado of this requerimiento recurso.
	 *
	 * @return the estado of this requerimiento recurso
	 */
	@AutoEscape
	public String getEstado();

	/**
	 * Sets the estado of this requerimiento recurso.
	 *
	 * @param estado the estado of this requerimiento recurso
	 */
	public void setEstado(String estado);

	/**
	 * Returns the modalidad of this requerimiento recurso.
	 *
	 * @return the modalidad of this requerimiento recurso
	 */
	public long getModalidad();

	/**
	 * Sets the modalidad of this requerimiento recurso.
	 *
	 * @param modalidad the modalidad of this requerimiento recurso
	 */
	public void setModalidad(long modalidad);

	/**
	 * Returns the lugar trabajo of this requerimiento recurso.
	 *
	 * @return the lugar trabajo of this requerimiento recurso
	 */
	@AutoEscape
	public String getLugarTrabajo();

	/**
	 * Sets the lugar trabajo of this requerimiento recurso.
	 *
	 * @param lugarTrabajo the lugar trabajo of this requerimiento recurso
	 */
	public void setLugarTrabajo(String lugarTrabajo);

	/**
	 * Returns the observacion of this requerimiento recurso.
	 *
	 * @return the observacion of this requerimiento recurso
	 */
	@AutoEscape
	public String getObservacion();

	/**
	 * Sets the observacion of this requerimiento recurso.
	 *
	 * @param observacion the observacion of this requerimiento recurso
	 */
	public void setObservacion(String observacion);

	/**
	 * Returns the proyecto of this requerimiento recurso.
	 *
	 * @return the proyecto of this requerimiento recurso
	 */
	@AutoEscape
	public String getProyecto();

	/**
	 * Sets the proyecto of this requerimiento recurso.
	 *
	 * @param proyecto the proyecto of this requerimiento recurso
	 */
	public void setProyecto(String proyecto);

	/**
	 * Returns the requiereequipotenico of this requerimiento recurso.
	 *
	 * @return the requiereequipotenico of this requerimiento recurso
	 */
	public boolean getRequiereequipotenico();

	/**
	 * Returns <code>true</code> if this requerimiento recurso is requiereequipotenico.
	 *
	 * @return <code>true</code> if this requerimiento recurso is requiereequipotenico; <code>false</code> otherwise
	 */
	public boolean isRequiereequipotenico();

	/**
	 * Sets whether this requerimiento recurso is requiereequipotenico.
	 *
	 * @param requiereequipotenico the requiereequipotenico of this requerimiento recurso
	 */
	public void setRequiereequipotenico(boolean requiereequipotenico);

	/**
	 * Returns the reemplazo of this requerimiento recurso.
	 *
	 * @return the reemplazo of this requerimiento recurso
	 */
	public boolean getReemplazo();

	/**
	 * Returns <code>true</code> if this requerimiento recurso is reemplazo.
	 *
	 * @return <code>true</code> if this requerimiento recurso is reemplazo; <code>false</code> otherwise
	 */
	public boolean isReemplazo();

	/**
	 * Sets whether this requerimiento recurso is reemplazo.
	 *
	 * @param reemplazo the reemplazo of this requerimiento recurso
	 */
	public void setReemplazo(boolean reemplazo);

	/**
	 * Returns the revisado of this requerimiento recurso.
	 *
	 * @return the revisado of this requerimiento recurso
	 */
	public boolean getRevisado();

	/**
	 * Returns <code>true</code> if this requerimiento recurso is revisado.
	 *
	 * @return <code>true</code> if this requerimiento recurso is revisado; <code>false</code> otherwise
	 */
	public boolean isRevisado();

	/**
	 * Sets whether this requerimiento recurso is revisado.
	 *
	 * @param revisado the revisado of this requerimiento recurso
	 */
	public void setRevisado(boolean revisado);

	/**
	 * Returns the aprobado ficha ingreso capital humano of this requerimiento recurso.
	 *
	 * @return the aprobado ficha ingreso capital humano of this requerimiento recurso
	 */
	public boolean getAprobadoFichaIngresoCapitalHumano();

	/**
	 * Returns <code>true</code> if this requerimiento recurso is aprobado ficha ingreso capital humano.
	 *
	 * @return <code>true</code> if this requerimiento recurso is aprobado ficha ingreso capital humano; <code>false</code> otherwise
	 */
	public boolean isAprobadoFichaIngresoCapitalHumano();

	/**
	 * Sets whether this requerimiento recurso is aprobado ficha ingreso capital humano.
	 *
	 * @param aprobadoFichaIngresoCapitalHumano the aprobado ficha ingreso capital humano of this requerimiento recurso
	 */
	public void setAprobadoFichaIngresoCapitalHumano(
		boolean aprobadoFichaIngresoCapitalHumano);

	/**
	 * Returns the observacion ficha ingreso capital humano of this requerimiento recurso.
	 *
	 * @return the observacion ficha ingreso capital humano of this requerimiento recurso
	 */
	@AutoEscape
	public String getObservacionFichaIngresoCapitalHumano();

	/**
	 * Sets the observacion ficha ingreso capital humano of this requerimiento recurso.
	 *
	 * @param observacionFichaIngresoCapitalHumano the observacion ficha ingreso capital humano of this requerimiento recurso
	 */
	public void setObservacionFichaIngresoCapitalHumano(
		String observacionFichaIngresoCapitalHumano);

	/**
	 * Returns the aprobado ficha ingreso operaciones of this requerimiento recurso.
	 *
	 * @return the aprobado ficha ingreso operaciones of this requerimiento recurso
	 */
	public boolean getAprobadoFichaIngresoOperaciones();

	/**
	 * Returns <code>true</code> if this requerimiento recurso is aprobado ficha ingreso operaciones.
	 *
	 * @return <code>true</code> if this requerimiento recurso is aprobado ficha ingreso operaciones; <code>false</code> otherwise
	 */
	public boolean isAprobadoFichaIngresoOperaciones();

	/**
	 * Sets whether this requerimiento recurso is aprobado ficha ingreso operaciones.
	 *
	 * @param aprobadoFichaIngresoOperaciones the aprobado ficha ingreso operaciones of this requerimiento recurso
	 */
	public void setAprobadoFichaIngresoOperaciones(
		boolean aprobadoFichaIngresoOperaciones);

	/**
	 * Returns the observacion ficha ingreso operaciones of this requerimiento recurso.
	 *
	 * @return the observacion ficha ingreso operaciones of this requerimiento recurso
	 */
	@AutoEscape
	public String getObservacionFichaIngresoOperaciones();

	/**
	 * Sets the observacion ficha ingreso operaciones of this requerimiento recurso.
	 *
	 * @param observacionFichaIngresoOperaciones the observacion ficha ingreso operaciones of this requerimiento recurso
	 */
	public void setObservacionFichaIngresoOperaciones(
		String observacionFichaIngresoOperaciones);

	/**
	 * Returns the tipo reclutamiento of this requerimiento recurso.
	 *
	 * @return the tipo reclutamiento of this requerimiento recurso
	 */
	public long getTipoReclutamiento();

	/**
	 * Sets the tipo reclutamiento of this requerimiento recurso.
	 *
	 * @param tipoReclutamiento the tipo reclutamiento of this requerimiento recurso
	 */
	public void setTipoReclutamiento(long tipoReclutamiento);

	/**
	 * Returns the solicitud requerimiento personal ID of this requerimiento recurso.
	 *
	 * @return the solicitud requerimiento personal ID of this requerimiento recurso
	 */
	public long getSolicitudRequerimientoPersonalId();

	/**
	 * Sets the solicitud requerimiento personal ID of this requerimiento recurso.
	 *
	 * @param solicitudRequerimientoPersonalId the solicitud requerimiento personal ID of this requerimiento recurso
	 */
	public void setSolicitudRequerimientoPersonalId(
		long solicitudRequerimientoPersonalId);

	/**
	 * Returns the activo of this requerimiento recurso.
	 *
	 * @return the activo of this requerimiento recurso
	 */
	public boolean getActivo();

	/**
	 * Returns <code>true</code> if this requerimiento recurso is activo.
	 *
	 * @return <code>true</code> if this requerimiento recurso is activo; <code>false</code> otherwise
	 */
	public boolean isActivo();

	/**
	 * Sets whether this requerimiento recurso is activo.
	 *
	 * @param activo the activo of this requerimiento recurso
	 */
	public void setActivo(boolean activo);

	/**
	 * Returns the usuariocrea of this requerimiento recurso.
	 *
	 * @return the usuariocrea of this requerimiento recurso
	 */
	public long getUsuariocrea();

	/**
	 * Sets the usuariocrea of this requerimiento recurso.
	 *
	 * @param usuariocrea the usuariocrea of this requerimiento recurso
	 */
	public void setUsuariocrea(long usuariocrea);

	/**
	 * Returns the fechacrea of this requerimiento recurso.
	 *
	 * @return the fechacrea of this requerimiento recurso
	 */
	public Date getFechacrea();

	/**
	 * Sets the fechacrea of this requerimiento recurso.
	 *
	 * @param fechacrea the fechacrea of this requerimiento recurso
	 */
	public void setFechacrea(Date fechacrea);

	/**
	 * Returns the usuariomodifica of this requerimiento recurso.
	 *
	 * @return the usuariomodifica of this requerimiento recurso
	 */
	public long getUsuariomodifica();

	/**
	 * Sets the usuariomodifica of this requerimiento recurso.
	 *
	 * @param usuariomodifica the usuariomodifica of this requerimiento recurso
	 */
	public void setUsuariomodifica(long usuariomodifica);

	/**
	 * Returns the fechacreamodifica of this requerimiento recurso.
	 *
	 * @return the fechacreamodifica of this requerimiento recurso
	 */
	public Date getFechacreamodifica();

	/**
	 * Sets the fechacreamodifica of this requerimiento recurso.
	 *
	 * @param fechacreamodifica the fechacreamodifica of this requerimiento recurso
	 */
	public void setFechacreamodifica(Date fechacreamodifica);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.rec.hitss.layer.model.RequerimientoRecurso requerimientoRecurso);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rec.hitss.layer.model.RequerimientoRecurso> toCacheModel();

	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso toEscapedModel();

	@Override
	public com.rec.hitss.layer.model.RequerimientoRecurso toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}