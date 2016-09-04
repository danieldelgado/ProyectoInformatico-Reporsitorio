package com.hitss.rev.bean;

import java.util.Date;

public class FasePostulacionBean {

	private long fasepostulacionId;
	private long solicitudRequerimientoId;
	private long usuarioId;
	private long tipoFase;
	private Date fechaFase;
	private String strfechaFase;
	private long estado;
	private String strestado;
	private boolean apruebaFase;
	private boolean asistio;
	private double puntuacion;
	private double salario;
	public long getFasepostulacionId() {
		return fasepostulacionId;
	}
	public void setFasepostulacionId(long fasepostulacionId) {
		this.fasepostulacionId = fasepostulacionId;
	}
	public long getSolicitudRequerimientoId() {
		return solicitudRequerimientoId;
	}
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
	}
	public long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public long getTipoFase() {
		return tipoFase;
	}
	public void setTipoFase(long tipoFase) {
		this.tipoFase = tipoFase;
	}
	public Date getFechaFase() {
		return fechaFase;
	}
	public void setFechaFase(Date fechaFase) {
		this.fechaFase = fechaFase;
	}
	public String getStrfechaFase() {
		return strfechaFase;
	}
	public void setStrfechaFase(String strfechaFase) {
		this.strfechaFase = strfechaFase;
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
	public boolean isApruebaFase() {
		return apruebaFase;
	}
	public void setApruebaFase(boolean apruebaFase) {
		this.apruebaFase = apruebaFase;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAsistio() {
		return asistio;
	}
	public void setAsistio(boolean asistio) {
		this.asistio = asistio;
	}
	
	
}
