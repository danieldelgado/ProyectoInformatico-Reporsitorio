package com.hitss.rev.bean;

public class OfertalLaboral {

	private long solicitudreclutamiento;
	private long journalArticuleId;
	
	private String titulo;
	private String resumen;
	private String strFechaCreado;
	private String contenido;
	public long getSolicitudreclutamiento() {
		return solicitudreclutamiento;
	}
	public void setSolicitudreclutamiento(long solicitudreclutamiento) {
		this.solicitudreclutamiento = solicitudreclutamiento;
	}
	public long getJournalArticuleId() {
		return journalArticuleId;
	}
	public void setJournalArticuleId(long journalArticuleId) {
		this.journalArticuleId = journalArticuleId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getStrFechaCreado() {
		return strFechaCreado;
	}
	public void setStrFechaCreado(String strFechaCreado) {
		this.strFechaCreado = strFechaCreado;
	}
	
	
	
}
