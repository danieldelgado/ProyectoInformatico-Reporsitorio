package com.hitss.rev.bean;

import java.io.Serializable;
import java.util.Date;

public class SolicitudPostulacionBean implements Serializable {

	private long userId;
	private long solicitudId;
	private long	puestoId;
	private String	strpuesto;
	private String	disponibilidad;
	private long	tipoPostulante;
	private String	strTipoPostulante;
	private String	postulante; // fullname
	private long	fasePostulante;
	private String strFasePostulacion;
	private Date	fechaPostulacion;
	private String	strfechaPostulacion;
	private Date	fechaPsicologica;
	private String strfechaPsicologica;
	private Date	fechaTecnica;
	private String strfechaTecnica;
	private Date	fechaRRHH;
	private String strfechaRRHH;
	private Date	fechaGerenteArea;
	private String strfechaGerenteArea;
	
	public SolicitudPostulacionBean() {
		strFasePostulacion = "";
		strTipoPostulante = "";
		strfechaPostulacion = "";
		strfechaPsicologica = "";
		strfechaTecnica = "";
		strfechaRRHH = "";
		strfechaGerenteArea = "";
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(long solicitudId) {
		this.solicitudId = solicitudId;
	}
	public long getPuestoId() {
		return puestoId;
	}
	public void setPuestoId(long puestoId) {
		this.puestoId = puestoId;
	}
	public String getStrpuesto() {
		return strpuesto;
	}
	public void setStrpuesto(String strpuesto) {
		this.strpuesto = strpuesto;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public long getTipoPostulante() {
		return tipoPostulante;
	}
	public void setTipoPostulante(long tipoPostulante) {
		this.tipoPostulante = tipoPostulante;
	}
	public String getStrTipoPostulante() {
		return strTipoPostulante;
	}
	public void setStrTipoPostulante(String strTipoPostulante) {
		this.strTipoPostulante = strTipoPostulante;
	}
	public String getPostulante() {
		return postulante;
	}
	public void setPostulante(String postulante) {
		this.postulante = postulante;
	}
	public long getFasePostulante() {
		return fasePostulante;
	}
	public void setFasePostulante(long fasePostulante) {
		this.fasePostulante = fasePostulante;
	}
	public String getStrFasePostulacion() {
		return strFasePostulacion;
	}
	public void setStrFasePostulacion(String strFasePostulacion) {
		this.strFasePostulacion = strFasePostulacion;
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
	public Date getFechaPsicologica() {
		return fechaPsicologica;
	}
	public void setFechaPsicologica(Date fechaPsicologica) {
		this.fechaPsicologica = fechaPsicologica;
	}
	public String getStrfechaPsicologica() {
		return strfechaPsicologica;
	}
	public void setStrfechaPsicologica(String strfechaPsicologica) {
		this.strfechaPsicologica = strfechaPsicologica;
	}
	public Date getFechaTecnica() {
		return fechaTecnica;
	}
	public void setFechaTecnica(Date fechaTecnica) {
		this.fechaTecnica = fechaTecnica;
	}
	public String getStrfechaTecnica() {
		return strfechaTecnica;
	}
	public void setStrfechaTecnica(String strfechaTecnica) {
		this.strfechaTecnica = strfechaTecnica;
	}
	public Date getFechaRRHH() {
		return fechaRRHH;
	}
	public void setFechaRRHH(Date fechaRRHH) {
		this.fechaRRHH = fechaRRHH;
	}
	public String getStrfechaRRHH() {
		return strfechaRRHH;
	}
	public void setStrfechaRRHH(String strfechaRRHH) {
		this.strfechaRRHH = strfechaRRHH;
	}
	public Date getFechaGerenteArea() {
		return fechaGerenteArea;
	}
	public void setFechaGerenteArea(Date fechaGerenteArea) {
		this.fechaGerenteArea = fechaGerenteArea;
	}
	public String getStrfechaGerenteArea() {
		return strfechaGerenteArea;
	}
	public void setStrfechaGerenteArea(String strfechaGerenteArea) {
		this.strfechaGerenteArea = strfechaGerenteArea;
	}

}
