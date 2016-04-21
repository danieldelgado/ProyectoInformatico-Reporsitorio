package com.hitss.rec.registrarResultadoEntrevista.bean;

import java.util.Date;

public class SolicitudRequerimientoBean {

	private long solicitudrequerimeintoId;
	private String codigo;
	private String puesto;
	private String cargo;
	private int numero;
	private String arearequerida;
	private String responsable;
	private String fechaEmitida;
	private String fechaLimite;
	private String tiempoContrato;
	private String estado;
	
	

	private long requerimeintoId;
	private String especialidad;
	private String meta;
	private long prioridad;
	private String motivo;
	private Date fechaSolicitada;
	private String fechaMetaIngreso;
	private String estadoRequerimiento;
	private long modalidad;
	private String lugarTrabajo;
	private String observacion;
	private String proyecto;
	private boolean requiereequipotenico;
	private boolean reemplazo;
	private boolean revisado;
	private boolean aprobadoFichaIngresoCapitalHumano;
	private String observacionFichaIngresoCapitalHumano;
	private boolean aprobadoFichaIngresoOperaciones;
	private String observacionFichaIngresoOperaciones;
	private long tipoReclutamiento;
	
	private int countEvaluacionesAprobadas;
	
	public long getSolicitudrequerimeintoId() {
		return solicitudrequerimeintoId;
	}
	public void setSolicitudrequerimeintoId(long solicitudrequerimeintoId) {
		this.solicitudrequerimeintoId = solicitudrequerimeintoId;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getArearequerida() {
		return arearequerida;
	}
	public void setArearequerida(String arearequerida) {
		this.arearequerida = arearequerida;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getFechaEmitida() {
		return fechaEmitida;
	}
	public void setFechaEmitida(String fechaEmitida) {
		this.fechaEmitida = fechaEmitida;
	}
	public String getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public String getTiempoContrato() {
		return tiempoContrato;
	}
	public void setTiempoContrato(String tiempoContrato) {
		this.tiempoContrato = tiempoContrato;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
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
	public Date getFechaSolicitada() {
		return fechaSolicitada;
	}
	public void setFechaSolicitada(Date fechaSolicitada) {
		this.fechaSolicitada = fechaSolicitada;
	}
	public String getFechaMetaIngreso() {
		return fechaMetaIngreso;
	}
	public void setFechaMetaIngreso(String fechaMetaIngreso) {
		this.fechaMetaIngreso = fechaMetaIngreso;
	}
	public String getEstadoRequerimiento() {
		return estadoRequerimiento;
	}
	public void setEstadoRequerimiento(String estadoRequerimiento) {
		this.estadoRequerimiento = estadoRequerimiento;
	}
	public long getModalidad() {
		return modalidad;
	}
	public void setModalidad(long modalidad) {
		this.modalidad = modalidad;
	}
	public String getLugarTrabajo() {
		return lugarTrabajo;
	}
	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public boolean isRequiereequipotenico() {
		return requiereequipotenico;
	}
	public void setRequiereequipotenico(boolean requiereequipotenico) {
		this.requiereequipotenico = requiereequipotenico;
	}
	public boolean isReemplazo() {
		return reemplazo;
	}
	public void setReemplazo(boolean reemplazo) {
		this.reemplazo = reemplazo;
	}
	public boolean isRevisado() {
		return revisado;
	}
	public void setRevisado(boolean revisado) {
		this.revisado = revisado;
	}
	public boolean isAprobadoFichaIngresoCapitalHumano() {
		return aprobadoFichaIngresoCapitalHumano;
	}
	public void setAprobadoFichaIngresoCapitalHumano(boolean aprobadoFichaIngresoCapitalHumano) {
		this.aprobadoFichaIngresoCapitalHumano = aprobadoFichaIngresoCapitalHumano;
	}
	public String getObservacionFichaIngresoCapitalHumano() {
		return observacionFichaIngresoCapitalHumano;
	}
	public void setObservacionFichaIngresoCapitalHumano(String observacionFichaIngresoCapitalHumano) {
		this.observacionFichaIngresoCapitalHumano = observacionFichaIngresoCapitalHumano;
	}
	public boolean isAprobadoFichaIngresoOperaciones() {
		return aprobadoFichaIngresoOperaciones;
	}
	public void setAprobadoFichaIngresoOperaciones(boolean aprobadoFichaIngresoOperaciones) {
		this.aprobadoFichaIngresoOperaciones = aprobadoFichaIngresoOperaciones;
	}
	public String getObservacionFichaIngresoOperaciones() {
		return observacionFichaIngresoOperaciones;
	}
	public void setObservacionFichaIngresoOperaciones(String observacionFichaIngresoOperaciones) {
		this.observacionFichaIngresoOperaciones = observacionFichaIngresoOperaciones;
	}
	public long getTipoReclutamiento() {
		return tipoReclutamiento;
	}
	public void setTipoReclutamiento(long tipoReclutamiento) {
		this.tipoReclutamiento = tipoReclutamiento;
	}
	public int getCountEvaluacionesAprobadas() {
		return countEvaluacionesAprobadas;
	}
	public void setCountEvaluacionesAprobadas(int countEvaluacionesAprobadas) {
		this.countEvaluacionesAprobadas = countEvaluacionesAprobadas;
	}
	public long getRequerimeintoId() {
		return requerimeintoId;
	}
	public void setRequerimeintoId(long requerimeintoId) {
		this.requerimeintoId = requerimeintoId;
	}

	
	
	
}
