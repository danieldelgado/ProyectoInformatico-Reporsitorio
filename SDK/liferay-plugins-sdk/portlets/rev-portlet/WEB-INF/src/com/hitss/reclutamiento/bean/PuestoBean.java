package com.hitss.reclutamiento.bean;

import java.util.Date;

public class PuestoBean {

	private long puestoId;
	private String descripcion;
	private long categoria;
	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	
	public PuestoBean() {
		
	}

	public long getPuestoId() {
		return puestoId;
	}

	public void setPuestoId(long puestoId) {
		this.puestoId = puestoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getCategoria() {
		return categoria;
	}

	public void setCategoria(long categoria) {
		this.categoria = categoria;
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

	
	
	
}
