package com.hitss.rev.bean;

import java.io.Serializable;
import java.util.Date;


public class ActividadCronogramaBean implements Serializable{

	private long cronogramaId;
	private long actividadCronogramaId;
	private String descripcion;
	private Date fechaEvaluacionInicio;
	private String strfechaEvaluacionInicio;
	private Date fechaEvaluacionFin;	
	private String strfechaEvaluacionFin;
	private boolean cumplioEvalucion;
	
	private long estado;
	private String strestado;
	
	private Date fechaPlanAccionInicio;
	private String strfechaPlanAccionInicio;
	private Date fechaPlanAccionFin;
	private String strfechaPlanAccionFin;

	private long grupoUsuario;
	private long tipoActividad;

	private long aprobarColaborador;
	private long jerarquiaEvaluar;
	private long aprobardoLider;
	private long usuarioGerenteId;
	private String strGerenteArea;
	private long usuarioLiderId;
	private String strUsuarioLider;
	
	public ActividadCronogramaBean() {
		strfechaPlanAccionFin = "";
		strfechaPlanAccionInicio = "";
		strfechaEvaluacionFin = "" ;
		strfechaEvaluacionInicio  = "";
	}
	
	public long getCronogramaId() {
		return cronogramaId;
	}
	public void setCronogramaId(long cronogramaId) {
		this.cronogramaId = cronogramaId;
	}
	public long getActividadCronogramaId() {
		return actividadCronogramaId;
	}
	public void setActividadCronogramaId(long actividadCronogramaId) {
		this.actividadCronogramaId = actividadCronogramaId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaEvaluacionInicio() {
		return fechaEvaluacionInicio;
	}
	public void setFechaEvaluacionInicio(Date fechaEvaluacionInicio) {
		this.fechaEvaluacionInicio = fechaEvaluacionInicio;
	}
	public String getStrfechaEvaluacionInicio() {
		return strfechaEvaluacionInicio;
	}
	public void setStrfechaEvaluacionInicio(String strfechaEvaluacionInicio) {
		this.strfechaEvaluacionInicio = strfechaEvaluacionInicio;
	}
	public Date getFechaEvaluacionFin() {
		return fechaEvaluacionFin;
	}
	public void setFechaEvaluacionFin(Date fechaEvaluacionFin) {
		this.fechaEvaluacionFin = fechaEvaluacionFin;
	}
	public String getStrfechaEvaluacionFin() {
		return strfechaEvaluacionFin;
	}
	public void setStrfechaEvaluacionFin(String strfechaEvaluacionFin) {
		this.strfechaEvaluacionFin = strfechaEvaluacionFin;
	}
	public boolean isCumplioEvalucion() {
		return cumplioEvalucion;
	}
	public void setCumplioEvalucion(boolean cumplioEvalucion) {
		this.cumplioEvalucion = cumplioEvalucion;
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
	public Date getFechaPlanAccionInicio() {
		return fechaPlanAccionInicio;
	}
	public void setFechaPlanAccionInicio(Date fechaPlanAccionInicio) {
		this.fechaPlanAccionInicio = fechaPlanAccionInicio;
	}
	public String getStrfechaPlanAccionInicio() {
		return strfechaPlanAccionInicio;
	}
	public void setStrfechaPlanAccionInicio(String strfechaPlanAccionInicio) {
		this.strfechaPlanAccionInicio = strfechaPlanAccionInicio;
	}
	public Date getFechaPlanAccionFin() {
		return fechaPlanAccionFin;
	}
	public void setFechaPlanAccionFin(Date fechaPlanAccionFin) {
		this.fechaPlanAccionFin = fechaPlanAccionFin;
	}
	public String getStrfechaPlanAccionFin() {
		return strfechaPlanAccionFin;
	}
	public void setStrfechaPlanAccionFin(String strfechaPlanAccionFin) {
		this.strfechaPlanAccionFin = strfechaPlanAccionFin;
	}
	public long getGrupoUsuario() {
		return grupoUsuario;
	}
	public void setGrupoUsuario(long grupoUsuario) {
		this.grupoUsuario = grupoUsuario;
	}
	public long getTipoActividad() {
		return tipoActividad;
	}
	public void setTipoActividad(long tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	public long getAprobarColaborador() {
		return aprobarColaborador;
	}
	public void setAprobarColaborador(long aprobarColaborador) {
		this.aprobarColaborador = aprobarColaborador;
	}
	public long getJerarquiaEvaluar() {
		return jerarquiaEvaluar;
	}
	public void setJerarquiaEvaluar(long jerarquiaEvaluar) {
		this.jerarquiaEvaluar = jerarquiaEvaluar;
	}
	public long getAprobardoLider() {
		return aprobardoLider;
	}
	public void setAprobardoLider(long aprobardoLider) {
		this.aprobardoLider = aprobardoLider;
	}
	public long getUsuarioGerenteId() {
		return usuarioGerenteId;
	}
	public void setUsuarioGerenteId(long usuarioGerenteId) {
		this.usuarioGerenteId = usuarioGerenteId;
	}
	public long getUsuarioLiderId() {
		return usuarioLiderId;
	}
	public void setUsuarioLiderId(long usuarioLiderId) {
		this.usuarioLiderId = usuarioLiderId;
	}
	public String getStrUsuarioLider() {
		return strUsuarioLider;
	}
	public void setStrUsuarioLider(String strUsuarioLider) {
		this.strUsuarioLider = strUsuarioLider;
	}
	public String getStrGerenteArea() {
		return strGerenteArea;
	}
	public void setStrGerenteArea(String strGerenteArea) {
		this.strGerenteArea = strGerenteArea;
	}
	
	
	
	
}
