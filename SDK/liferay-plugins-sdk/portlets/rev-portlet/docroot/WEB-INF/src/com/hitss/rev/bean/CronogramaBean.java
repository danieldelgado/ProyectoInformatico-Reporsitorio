package com.hitss.rev.bean;


public class CronogramaBean {

	private long cronogramaId;
	private long solicitudEvaluacionId;
	private String descripcion;
	private long estado;
	private String strestado;
	private boolean aprobacionCronograma;
	
	public long getCronogramaId() {
		return cronogramaId;
	}
	public void setCronogramaId(long cronogramaId) {
		this.cronogramaId = cronogramaId;
	}
	public long getSolicitudEvaluacionId() {
		return solicitudEvaluacionId;
	}
	public void setSolicitudEvaluacionId(long solicitudEvaluacionId) {
		this.solicitudEvaluacionId = solicitudEvaluacionId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public boolean isAprobacionCronograma() {
		return aprobacionCronograma;
	}
	public void setAprobacionCronograma(boolean aprobacionCronograma) {
		this.aprobacionCronograma = aprobacionCronograma;
	}
	
	
	
}
