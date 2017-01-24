package com.hitss.rev.dools.impl;

import java.util.Date;

public class Traza {

	private Date dateTraza;
	private Long solicitudId;
	private Long usuarioId;
	private String mensaje;
	
	public Traza() {
	}

	public Traza(Date dateTraza, Long solicitudId, Long usuarioId, String mensaje) {
		super();
		this.dateTraza = dateTraza;
		this.solicitudId = solicitudId;
		this.usuarioId = usuarioId;
		this.mensaje = mensaje;
	}

	public Date getDateTraza() {
		return dateTraza;
	}

	public void setDateTraza(Date dateTraza) {
		this.dateTraza = dateTraza;
	}

	public Long getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(Long solicitudId) {
		this.solicitudId = solicitudId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	
}
