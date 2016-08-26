package com.hitss.rev.bean;

public class UsuarioBean {

	private long userId;
	private String fullname;
	
	private String fechaPostulacion;
	private String disponibilidad;
	private String fasePostulacion;
	private String estado;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getFechaPostulacion() {
		return fechaPostulacion;
	}
	public void setFechaPostulacion(String fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getFasePostulacion() {
		return fasePostulacion;
	}
	public void setFasePostulacion(String fasePostulacion) {
		this.fasePostulacion = fasePostulacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
