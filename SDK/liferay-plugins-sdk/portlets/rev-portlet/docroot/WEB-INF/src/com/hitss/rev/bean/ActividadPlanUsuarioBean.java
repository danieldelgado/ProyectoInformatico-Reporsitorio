package com.hitss.rev.bean;



public class ActividadPlanUsuarioBean {

	private long actividadPlanId;
	private long actividadPlanUsuarioId;
	private long usuarioId;
	private boolean cumplio;
	private int puntuacion;
	private String evidencia;
	public long getActividadPlanId() {
		return actividadPlanId;
	}
	public void setActividadPlanId(long actividadPlanId) {
		this.actividadPlanId = actividadPlanId;
	}
	public long getActividadPlanUsuarioId() {
		return actividadPlanUsuarioId;
	}
	public void setActividadPlanUsuarioId(long actividadPlanUsuarioId) {
		this.actividadPlanUsuarioId = actividadPlanUsuarioId;
	}
	public long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public boolean isCumplio() {
		return cumplio;
	}
	public void setCumplio(boolean cumplio) {
		this.cumplio = cumplio;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	} 
	
	
	
	
}
