package com.hitss.rev.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class SolicitudPostulacionBean implements Serializable {

	private long userId;
	private long solicitudId;
	private long puestoId;
	private String strpuesto;
	private String disponibilidad;
	private long tipoPostulante;
	private String strTipoPostulante;
	private String postulante; // fullname
	private long fasePostulante;
	private String strFasePostulacion;
	private Date fechaPostulacion;
	private String strfechaPostulacion;

	private FasePostulacionBean fasePostulacionPsicologico;
	private Date fechaPsicologica;
	private String strfechaPsicologica;

	private FasePostulacionBean fasePostulacionTecnico;
	private Date fechaTecnica;
	private String strfechaTecnica;

	private FasePostulacionBean fasePostulacionEntrevistaRRHH;
	private Date fechaRRHH;
	private String strfechaRRHH;

	private FasePostulacionBean fasePostulacionEntrevistaGerenteArea;
	private Date fechaGerenteArea;
	private String strfechaGerenteArea;

	private boolean asistio;
	
	private long estado;
	private String strEstado;

	private long estadoSolicitud;
	private String strEstadoSolicitud;
	
	private List<PuestoEvaluacionBean> listaEvaluacionesPuestoEnfoque;
	private List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean;
	
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

	public String getStrEstado() {
		return strEstado;
	}

	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}

	public long getEstado() {
		return estado;
	}

	public void setEstado(long estado) {
		this.estado = estado;
	}

	public long getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(long estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getStrEstadoSolicitud() {
		return strEstadoSolicitud;
	}

	public void setStrEstadoSolicitud(String strEstadoSolicitud) {
		this.strEstadoSolicitud = strEstadoSolicitud;
	}

	public FasePostulacionBean getFasePostulacionPsicologico() {
		return fasePostulacionPsicologico;
	}

	public void setFasePostulacionPsicologico(FasePostulacionBean fasePostulacionPsicologico) {
		this.fasePostulacionPsicologico = fasePostulacionPsicologico;
	}

	public FasePostulacionBean getFasePostulacionTecnico() {
		return fasePostulacionTecnico;
	}

	public void setFasePostulacionTecnico(FasePostulacionBean fasePostulacionTecnico) {
		this.fasePostulacionTecnico = fasePostulacionTecnico;
	}

	public FasePostulacionBean getFasePostulacionEntrevistaRRHH() {
		return fasePostulacionEntrevistaRRHH;
	}

	public void setFasePostulacionEntrevistaRRHH(FasePostulacionBean fasePostulacionEntrevistaRRHH) {
		this.fasePostulacionEntrevistaRRHH = fasePostulacionEntrevistaRRHH;
	}

	public FasePostulacionBean getFasePostulacionEntrevistaGerenteArea() {
		return fasePostulacionEntrevistaGerenteArea;
	}

	public void setFasePostulacionEntrevistaGerenteArea(FasePostulacionBean fasePostulacionEntrevistaGerenteArea) {
		this.fasePostulacionEntrevistaGerenteArea = fasePostulacionEntrevistaGerenteArea;
	}

	public List<PuestoEvaluacionBean> getListaEvaluacionesPuestoEnfoque() {
		return listaEvaluacionesPuestoEnfoque;
	}

	public void setListaEvaluacionesPuestoEnfoque(List<PuestoEvaluacionBean> listaEvaluacionesPuestoEnfoque) {
		this.listaEvaluacionesPuestoEnfoque = listaEvaluacionesPuestoEnfoque;
	}

	public List<FasePostulacionPuestoEvaluacionBean> getListaFasePostulacionPuestoEvaluacionBean() {
		return listaFasePostulacionPuestoEvaluacionBean;
	}

	public void setListaFasePostulacionPuestoEvaluacionBean(List<FasePostulacionPuestoEvaluacionBean> listaFasePostulacionPuestoEvaluacionBean) {
		this.listaFasePostulacionPuestoEvaluacionBean = listaFasePostulacionPuestoEvaluacionBean;
	}

	public boolean isAsistio() {
		return asistio;
	}

	public void setAsistio(boolean asistio) {
		this.asistio = asistio;
	}

}
