package com.hitss.reclutamiento.bean;

import java.util.Date;

public class SolicitudRequerimientoBean {

	private long solicitudRequerimientoId;
	private long areaSolicitante;
	private int cantidadRecursos;
	private long responsableRRHH;
	private Date fechaLimite;
	private long tiempoContrato;
	private long tipoNegocio;
	private long presupuestoMaximo;
	private long presupuestoMinimo;
	private long cliente;
	private long especialidad;
	private String meta;
	private long prioridad;
	private String motivo;
	private long modalidadjornada;
	private long modalidadcontrato;
	private String lugarTrabajo;
	private long puestoId;
	private String proyecto;
	private boolean requieroEquipoTecnico;
	private boolean reemplazo;
	private boolean aprobacionFichaIngresoCapitalHumano;
	private boolean aprobacionFichaIngresoOperaciones;
	private long tiporeclutamiento;
	private long estado;
	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	
	public SolicitudRequerimientoBean() {
	}

	public long getSolicitudRequerimientoId() {
		return solicitudRequerimientoId;
	}

	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
	}

	public long getAreaSolicitante() {
		return areaSolicitante;
	}

	public void setAreaSolicitante(long areaSolicitante) {
		this.areaSolicitante = areaSolicitante;
	}

	public int getCantidadRecursos() {
		return cantidadRecursos;
	}

	public void setCantidadRecursos(int cantidadRecursos) {
		this.cantidadRecursos = cantidadRecursos;
	}

	public long getResponsableRRHH() {
		return responsableRRHH;
	}

	public void setResponsableRRHH(long responsableRRHH) {
		this.responsableRRHH = responsableRRHH;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public long getTiempoContrato() {
		return tiempoContrato;
	}

	public void setTiempoContrato(long tiempoContrato) {
		this.tiempoContrato = tiempoContrato;
	}

	public long getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(long tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public long getPresupuestoMaximo() {
		return presupuestoMaximo;
	}

	public void setPresupuestoMaximo(long presupuestoMaximo) {
		this.presupuestoMaximo = presupuestoMaximo;
	}

	public long getPresupuestoMinimo() {
		return presupuestoMinimo;
	}

	public void setPresupuestoMinimo(long presupuestoMinimo) {
		this.presupuestoMinimo = presupuestoMinimo;
	}

	public long getCliente() {
		return cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public long getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(long especialidad) {
		this.especialidad = especialidad;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public long getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(long prioridad) {
		this.prioridad = prioridad;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public long getModalidadjornada() {
		return modalidadjornada;
	}

	public void setModalidadjornada(long modalidadjornada) {
		this.modalidadjornada = modalidadjornada;
	}

	public long getModalidadcontrato() {
		return modalidadcontrato;
	}

	public void setModalidadcontrato(long modalidadcontrato) {
		this.modalidadcontrato = modalidadcontrato;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public long getPuestoId() {
		return puestoId;
	}

	public void setPuestoId(long puestoId) {
		this.puestoId = puestoId;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public boolean isRequieroEquipoTecnico() {
		return requieroEquipoTecnico;
	}

	public void setRequieroEquipoTecnico(boolean requieroEquipoTecnico) {
		this.requieroEquipoTecnico = requieroEquipoTecnico;
	}

	public boolean isReemplazo() {
		return reemplazo;
	}

	public void setReemplazo(boolean reemplazo) {
		this.reemplazo = reemplazo;
	}

	public boolean isAprobacionFichaIngresoCapitalHumano() {
		return aprobacionFichaIngresoCapitalHumano;
	}

	public void setAprobacionFichaIngresoCapitalHumano(boolean aprobacionFichaIngresoCapitalHumano) {
		this.aprobacionFichaIngresoCapitalHumano = aprobacionFichaIngresoCapitalHumano;
	}

	public boolean isAprobacionFichaIngresoOperaciones() {
		return aprobacionFichaIngresoOperaciones;
	}

	public void setAprobacionFichaIngresoOperaciones(boolean aprobacionFichaIngresoOperaciones) {
		this.aprobacionFichaIngresoOperaciones = aprobacionFichaIngresoOperaciones;
	}

	public long getTiporeclutamiento() {
		return tiporeclutamiento;
	}

	public void setTiporeclutamiento(long tiporeclutamiento) {
		this.tiporeclutamiento = tiporeclutamiento;
	}

	public long getEstado() {
		return estado;
	}

	public void setEstado(long estado) {
		this.estado = estado;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public long getUsuariocrea() {
		return usuariocrea;
	}

	public void setUsuariocrea(long usuariocrea) {
		this.usuariocrea = usuariocrea;
	}

	public Date getFechacrea() {
		return fechacrea;
	}

	public void setFechacrea(Date fechacrea) {
		this.fechacrea = fechacrea;
	}

	public long getUsuariomodifica() {
		return usuariomodifica;
	}

	public void setUsuariomodifica(long usuariomodifica) {
		this.usuariomodifica = usuariomodifica;
	}

	public Date getFechacreamodifica() {
		return fechacreamodifica;
	}

	public void setFechacreamodifica(Date fechacreamodifica) {
		this.fechacreamodifica = fechacreamodifica;
	}
	
	

}
