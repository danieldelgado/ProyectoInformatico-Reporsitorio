package com.hitss.rev.bean;

import java.util.Date;

public class ObservacionBean {

	private long observacionId;
	private String descripcion;
	private String tabla;
	private long registroId;
	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private String strfechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	private String strfechacreamodifica;
	public long getObservacionId() {
		return observacionId;
	}
	public void setObservacionId(long observacionId) {
		this.observacionId = observacionId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTabla() {
		return tabla;
	}
	public void setTabla(String tabla) {
		this.tabla = tabla;
	}
	public long getRegistroId() {
		return registroId;
	}
	public void setRegistroId(long registroId) {
		this.registroId = registroId;
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
	
	
	
	
}
