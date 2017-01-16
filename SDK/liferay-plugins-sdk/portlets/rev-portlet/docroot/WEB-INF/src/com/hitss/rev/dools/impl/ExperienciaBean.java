package com.hitss.rev.dools.impl;

import java.util.Calendar;
import java.util.Date;

public class ExperienciaBean {

	public static final long EXPERIENCIA_NINGUNO = 0;
	public static final long EXPERIENCIA_FINANZA = 1L;
	public static final long EXPERIENCIA_BANCA = 2L;
	public static final long EXPERIENCIA_BOLSA = 3L;
	public static final long EXPERIENCIA_SEGUROS = 4L;

	private long id;
	private String empresa;
	private long tipoNegocioProyecto;
	private double annos;
	private String proyecto;
	private Date fechaInicio;
	private Date fechaFin;

	private long tiempoExperincia;

	public ExperienciaBean() {
	}

	public ExperienciaBean(long id, String empresa, long tipoNegocioProyecto, String proyecto, Date fechaInicio,
	Date fechaFin) {
	super();
	this.id = id;
	this.empresa = empresa;
	this.tipoNegocioProyecto = tipoNegocioProyecto;
	this.proyecto = proyecto;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.annos=this.getAnnos();
	}

	public ExperienciaBean(long id, long tipoNegocioProyecto) {
	super();
	this.id = id;
	this.tipoNegocioProyecto = tipoNegocioProyecto;
	}

	public ExperienciaBean(long id, long tipoNegocioProyecto, double annos) {
	super();
	this.id = id;
	this.tipoNegocioProyecto = tipoNegocioProyecto;
	this.annos = annos;
	}

	public long getId() {
	return id;
	}

	public void setId(long id) {
	this.id = id;
	}

	public String getEmpresa() {
	return empresa;
	}

	public void setEmpresa(String empresa) {
	this.empresa = empresa;
	}

	public Date getFechaInicio() {
	return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
	this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
	return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
	this.fechaFin = fechaFin;
	}

	public long getTiempoExperincia() {
	return tiempoExperincia;
	}

	public void setTiempoExperincia(long tiempoExperincia) {
	this.tiempoExperincia = tiempoExperincia;
	}

	public String getProyecto() {
	return proyecto;
	}

	public void setProyecto(String proyecto) {
	this.proyecto = proyecto;
	}

	public long getTipoNegocioProyecto() {
	return tipoNegocioProyecto;
	}

	public void setTipoNegocioProyecto(long tipoNegocioProyecto) {
	this.tipoNegocioProyecto = tipoNegocioProyecto;
	}

	public double getAnnos() {
	if (annos == 0) {
	Calendar a = Calendar.getInstance();
	a.setTimeInMillis(fechaInicio.getTime());
	Calendar b = Calendar.getInstance();
	b.setTimeInMillis(fechaFin.getTime());
	double diff = (double) (new Double(b.get(Calendar.YEAR)) - new Double(a.get(Calendar.YEAR)))
	+ (new Double(b.get(Calendar.MONTH) / 12.0));
	annos = diff;
	}
//	System.out.println("inter getAnnos:"+annos +" | id:"+id+" | fechaInicio:"+fechaInicio+" | fechaFin:"+fechaFin);
	return annos;
	}

	public void setAnnos(double annos) {
	this.annos = annos;
	}

}