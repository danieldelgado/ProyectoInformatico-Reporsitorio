package com.hitss.rev.bean;

import java.util.Date;
import java.util.List;

public class SolicitudRequerimientoBean {

	private long solicitudRequerimientoId;
	private long areaSolicitante;
	private String strareaSolicitante;
	private int cantidadRecursos;
	private long responsableRRHH;
	private String strresponsableRRHH;
	private Date fechaLimite;
	private String strfechaLimite;
	private long tiempoContrato;
	private String strtiempoContrato;
	private long tipoNegocio;
	private String strtipoNegocio;
	private long presupuestoMaximo;
	private long presupuestoMinimo;
	private long cliente;
	private String strcliente;
	private String especialidad;
	private String meta;
	private long prioridad;
	private String strprioridad;
	private String motivo;
	private long modalidadjornada;
	private String strmodalidadjornada;
	private long modalidadcontrato;
	private String strmodalidadcontrato;
	private String lugarTrabajo;
	private long puestoId;
	private String strpuesto;
	private String proyecto;
	private boolean requieroEquipoTecnico;
	private boolean reemplazo;
	private boolean aprobacionFichaIngresoCapitalHumano;
	private boolean aprobacionFichaIngresoOperaciones;
	private long tiporeclutamiento;
	private String strtiporeclutamiento;
	private long estado;
	private String strestado;
	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private String strfechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	private String strfechacreamodifica;
	private List<RequisitoEtiquetaBean> requisitoEtiquetaBeans;
	
	private ObservacionBean observacionBean;
	
	
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

	public String getStrareaSolicitante() {
		return strareaSolicitante;
	}

	public void setStrareaSolicitante(String strareaSolicitante) {
		this.strareaSolicitante = strareaSolicitante;
	}

	public String getStrresponsableRRHH() {
		return strresponsableRRHH;
	}

	public void setStrresponsableRRHH(String strresponsableRRHH) {
		this.strresponsableRRHH = strresponsableRRHH;
	}

	public String getStrtiempoContrato() {
		return strtiempoContrato;
	}

	public void setStrtiempoContrato(String strtiempoContrato) {
		this.strtiempoContrato = strtiempoContrato;
	}

	public String getStrtipoNegocio() {
		return strtipoNegocio;
	}

	public void setStrtipoNegocio(String strtipoNegocio) {
		this.strtipoNegocio = strtipoNegocio;
	}

	public String getStrcliente() {
		return strcliente;
	}

	public void setStrcliente(String strcliente) {
		this.strcliente = strcliente;
	}

	public String getStrprioridad() {
		return strprioridad;
	}

	public void setStrprioridad(String strprioridad) {
		this.strprioridad = strprioridad;
	}

	public String getStrmodalidadjornada() {
		return strmodalidadjornada;
	}

	public void setStrmodalidadjornada(String strmodalidadjornada) {
		this.strmodalidadjornada = strmodalidadjornada;
	}

	public String getStrmodalidadcontrato() {
		return strmodalidadcontrato;
	}

	public void setStrmodalidadcontrato(String strmodalidadcontrato) {
		this.strmodalidadcontrato = strmodalidadcontrato;
	}

	public String getStrpuesto() {
		return strpuesto;
	}

	public void setStrpuesto(String strpuesto) {
		this.strpuesto = strpuesto;
	}

	public String getStrtiporeclutamiento() {
		return strtiporeclutamiento;
	}

	public void setStrtiporeclutamiento(String strtiporeclutamiento) {
		this.strtiporeclutamiento = strtiporeclutamiento;
	}

	public String getStrestado() {
		return strestado;
	}

	public void setStrestado(String strestado) {
		this.strestado = strestado;
	}

	public String getStrfechaLimite() {
		return strfechaLimite;
	}

	public void setStrfechaLimite(String strfechaLimite) {
		this.strfechaLimite = strfechaLimite;
	}

	public String getStrfechacrea() {
		return strfechacrea;
	}

	public void setStrfechacrea(String strfechacrea) {
		this.strfechacrea = strfechacrea;
	}

	public String getStrfechacreamodifica() {
		return strfechacreamodifica;
	}

	public void setStrfechacreamodifica(String strfechacreamodifica) {
		this.strfechacreamodifica = strfechacreamodifica;
	}

	public List<RequisitoEtiquetaBean> getRequisitoEtiquetaBeans() {
		return requisitoEtiquetaBeans;
	}

	public void setRequisitoEtiquetaBeans(List<RequisitoEtiquetaBean> requisitoEtiquetaBeans) {
		this.requisitoEtiquetaBeans = requisitoEtiquetaBeans;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public ObservacionBean getObservacionBean() {
		return observacionBean;
	}

	public void setObservacionBean(ObservacionBean observacionBean) {
		this.observacionBean = observacionBean;
	}

	
	

}
