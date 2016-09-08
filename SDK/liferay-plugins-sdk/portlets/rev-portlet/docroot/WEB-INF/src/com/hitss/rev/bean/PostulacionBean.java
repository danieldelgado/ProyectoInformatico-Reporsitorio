package com.hitss.rev.bean;

import java.util.Date;

public class PostulacionBean {

	private long solicitudId;
	private long usuarioId;
	private long estado;
	private boolean seleccionado;
	private Date fechaPostulacion;
	private String strFechaPostulacion;
	
	public long getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(long solicitudId) {
		this.solicitudId = solicitudId;
	}
	public long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public long getEstado() {
		return estado;
	}
	public void setEstado(long estado) {
		this.estado = estado;
	}
	public boolean isSeleccionado() {
		return seleccionado;
	}
	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}
	public Date getFechaPostulacion() {
		return fechaPostulacion;
	}
	public void setFechaPostulacion(Date fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
	}
	public String getStrFechaPostulacion() {
		return strFechaPostulacion;
	}
	public void setStrFechaPostulacion(String strFechaPostulacion) {
		this.strFechaPostulacion = strFechaPostulacion;
	}
	
}
