package com.hitss.rev.bean;

import java.util.Date;

public class EvaluacionBean {

	private long evaluacionId;
	private long enfoque;
	private long puestoCategoriaEvaluacion;
	private long tipoEvaluacion;
	private String descripcion;
	private long estado;
	private String strestado;
	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private String strfechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	private String strfechacreamodifica;
	
	public EvaluacionBean() {
	}

	public long getEvaluacionId() {
		return evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	public long getEnfoque() {
		return enfoque;
	}

	public void setEnfoque(long enfoque) {
		this.enfoque = enfoque;
	}

	public long getPuestoCategoriaEvaluacion() {
		return puestoCategoriaEvaluacion;
	}

	public void setPuestoCategoriaEvaluacion(long puestoCategoriaEvaluacion) {
		this.puestoCategoriaEvaluacion = puestoCategoriaEvaluacion;
	}

	public long getTipoEvaluacion() {
		return tipoEvaluacion;
	}

	public void setTipoEvaluacion(long tipoEvaluacion) {
		this.tipoEvaluacion = tipoEvaluacion;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public long getUsuariocrea() {
		return usuariocrea;
	}

	public void setUsuariocrea(long usuariocrea) {
		this.usuariocrea = usuariocrea;
	}

	public Date getFechacrea() {
		return fechacrea;
	}

	public void setFechacrea(Date fechacrea) {
		this.fechacrea = fechacrea;
	}

	public String getStrfechacrea() {
		return strfechacrea;
	}

	public void setStrfechacrea(String strfechacrea) {
		this.strfechacrea = strfechacrea;
	}

	public long getUsuariomodifica() {
		return usuariomodifica;
	}

	public void setUsuariomodifica(long usuariomodifica) {
		this.usuariomodifica = usuariomodifica;
	}

	public Date getFechacreamodifica() {
		return fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		this.fechacreamodifica = fechacreamodifica;
	}

	public String getStrfechacreamodifica() {
		return strfechacreamodifica;
	}

	public void setStrfechacreamodifica(String strfechacreamodifica) {
		this.strfechacreamodifica = strfechacreamodifica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
