package com.hitss.rev.bean;

import java.util.Date;

public class Postulacion {

	private SolicitudReclutamiento solicitudReclutamiento;
	private UsuarioBean usuarioBean;
	private Date fechaPostulacion;
	private String strfechaPostulacion;

	private boolean filtroPostulacion;
	private boolean filtroExperiencia;

	private boolean filtroConocimiento;
	private int cantidadReqCon;	
	private double porcentajeReqCum;	
	private double porcentajeRequisitosCumplidoPorUsuario;

	private boolean requiereCertificado;
	private boolean tieneCertificadoExperiencia;	
	private boolean filtroCertificado;
	private int cantidadReqCerti;
	private double porcentajeReqCertiCum;
	private double porcentajeCertificadoCumplidoPorUsuario;
	
	private boolean filtroPsicologico;
	
	private boolean filtroTecnico;
	private boolean filtroEtrevistas;
	
	public SolicitudReclutamiento getSolicitudReclutamiento() {
		
	return solicitudReclutamiento;
	}

	public void setSolicitudReclutamiento(SolicitudReclutamiento solicitudReclutamiento) {
	this.solicitudReclutamiento = solicitudReclutamiento;
	}

	public UsuarioBean getUsuarioBean() {
	return usuarioBean;
	}

	public void setUsuarioBean(UsuarioBean usuarioBean) {
	this.usuarioBean = usuarioBean;
	}

	public Date getFechaPostulacion() {
	return fechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
	this.fechaPostulacion = fechaPostulacion;
	}

	public String getStrfechaPostulacion() {
	return strfechaPostulacion;
	}

	public void setStrfechaPostulacion(String strfechaPostulacion) {
	this.strfechaPostulacion = strfechaPostulacion;
	}

	public boolean isFiltroPostulacion() {
	return filtroPostulacion;
	}

	public void setFiltroPostulacion(boolean filtroPostulacion) {
	this.filtroPostulacion = filtroPostulacion;
	}

	public boolean isFiltroExperiencia() {
	return filtroExperiencia;
	}

	public void setFiltroExperiencia(boolean filtroExperiencia) {
	this.filtroExperiencia = filtroExperiencia;
	}

	public boolean isFiltroPsicologico() {
	return filtroPsicologico;
	}

	public void setFiltroPsicologico(boolean filtroPsicologico) {
	this.filtroPsicologico = filtroPsicologico;
	}

	public boolean isFiltroTecnico() {
	return filtroTecnico;
	}

	public void setFiltroTecnico(boolean filtroTecnico) {
	this.filtroTecnico = filtroTecnico;
	}

	public boolean isFiltroEtrevistas() {
	return filtroEtrevistas;
	}

	public void setFiltroEtrevistas(boolean filtroEtrevistas) {
	this.filtroEtrevistas = filtroEtrevistas;
	}

	public int getCantidadReqCerti() {
	return cantidadReqCerti;
	}

	public void setCantidadReqCerti(int cantidadReqCerti) {
	this.cantidadReqCerti = cantidadReqCerti;
	}

	public int getCantidadReqCon() {
	return cantidadReqCon;
	}

	public void setCantidadReqCon(int cantidadReqCon) {
	this.cantidadReqCon = cantidadReqCon;
	}

	public double getPorcentajeReqCum() {
		return porcentajeReqCum;
	}

	public void setPorcentajeReqCum(double porcentajeReqCum) {
		this.porcentajeReqCum = porcentajeReqCum;
	}

	public double getPorcentajeReqCertiCum() {
		return porcentajeReqCertiCum;
	}

	public void setPorcentajeReqCertiCum(double porcentajeReqCertiCum) {
		this.porcentajeReqCertiCum = porcentajeReqCertiCum;
	}

	public double getPorcentajeRequisitosCumplidoPorUsuario() {
		return porcentajeRequisitosCumplidoPorUsuario;
	}

	public void setPorcentajeRequisitosCumplidoPorUsuario(double porcentajeRequisitosCumplidoPorUsuario) {
		this.porcentajeRequisitosCumplidoPorUsuario = porcentajeRequisitosCumplidoPorUsuario;
	}

	public double getPorcentajeCertificadoCumplidoPorUsuario() {
		return porcentajeCertificadoCumplidoPorUsuario;
	}

	public void setPorcentajeCertificadoCumplidoPorUsuario(double porcentajeCertificadoCumplidoPorUsuario) {
		this.porcentajeCertificadoCumplidoPorUsuario = porcentajeCertificadoCumplidoPorUsuario;
	}

	public boolean isFiltroConocimiento() {
		return filtroConocimiento;
	}

	public void setFiltroConocimiento(boolean filtroConocimiento) {
		this.filtroConocimiento = filtroConocimiento;
	}

	public boolean isTieneCertificadoExperiencia() {
		return tieneCertificadoExperiencia;
	}

	public void setTieneCertificadoExperiencia(boolean tieneCertificadoExperiencia) {
		this.tieneCertificadoExperiencia = tieneCertificadoExperiencia;
	}

	public boolean isFiltroCertificado() {
		return filtroCertificado;
	}

	public void setFiltroCertificado(boolean filtroCertificado) {
		this.filtroCertificado = filtroCertificado;
	}

	public boolean isRequiereCertificado() {
		return requiereCertificado;
	}

	public void setRequiereCertificado(boolean requiereCertificado) {
		this.requiereCertificado = requiereCertificado;
	}

}

