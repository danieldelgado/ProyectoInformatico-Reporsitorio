package com.hitss.rev.dools.impl;

import java.util.Date;

public class SolicitudReclutamiento {

	
	private long id;
	private PuestoBean puesto;
	private Date fechaActual;
	private Date fechaLimite;
	private String strfechaLimite;
	private Date fechaRegistro;
	private String strfechaRegistro;
	private double presupuestoMaximo;
	private double presupuestoMinimo;

	
	public double getPresupuestoMaximo() {
		return presupuestoMaximo;
	}
	public void setPresupuestoMaximo(double presupuestoMaximo) {
		this.presupuestoMaximo = presupuestoMaximo;
	}
	public double getPresupuestoMinimo() {
		return presupuestoMinimo;
	}
	public void setPresupuestoMinimo(double presupuestoMinimo) {
		this.presupuestoMinimo = presupuestoMinimo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public PuestoBean getPuesto() {
		return puesto;
	}
	public void setPuesto(PuestoBean puesto) {
		this.puesto = puesto;
	}
	public Date getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public String getStrfechaLimite() {
		return strfechaLimite;
	}
	public void setStrfechaLimite(String strfechaLimite) {
		this.strfechaLimite = strfechaLimite;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getStrfechaRegistro() {
		return strfechaRegistro;
	}
	public void setStrfechaRegistro(String strfechaRegistro) {
		this.strfechaRegistro = strfechaRegistro;
	}
	public Date getFechaActual() {
		if(fechaActual == null){
			fechaActual = new Date();
		}
		return fechaActual;
	}
	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}
	
	
	
}
