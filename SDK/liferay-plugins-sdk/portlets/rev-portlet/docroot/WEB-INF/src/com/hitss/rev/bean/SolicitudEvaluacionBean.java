package com.hitss.rev.bean;

import java.util.Date;

public class SolicitudEvaluacionBean {

	private long solicitudEvaluacionId;
	private String descripcion;
	private Date fechaInicioEvaluacion;
	private String strfechaInicioEvaluacion;
	private String strfechaFinalizacionEvaluacion;
	private long estado;
	private String strestado;
	
	public long getSolicitudEvaluacionId() {
		return solicitudEvaluacionId;
	}
	public void setSolicitudEvaluacionId(long solicitudEvaluacionId) {
		this.solicitudEvaluacionId = solicitudEvaluacionId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicioEvaluacion() {
		return fechaInicioEvaluacion;
	}
	public void setFechaInicioEvaluacion(Date fechaInicioEvaluacion) {
		this.fechaInicioEvaluacion = fechaInicioEvaluacion;
	}
	public String getStrfechaInicioEvaluacion() {
		return strfechaInicioEvaluacion;
	}
	public void setStrfechaInicioEvaluacion(String strfechaInicioEvaluacion) {
		this.strfechaInicioEvaluacion = strfechaInicioEvaluacion;
	}
	public long getEstado() {
		return estado;
	}
	public void setEstado(long estado) {
		this.estado = estado;
	}
	public String getStrestado() {
		return strestado;
	}
	public void setStrestado(String strestado) {
		this.strestado = strestado;
	}
	public String getStrfechaFinalizacionEvaluacion() {
		return strfechaFinalizacionEvaluacion;
	}
	public void setStrfechaFinalizacionEvaluacion(
			String strfechaFinalizacionEvaluacion) {
		this.strfechaFinalizacionEvaluacion = strfechaFinalizacionEvaluacion;
	}
	
	
	
}
