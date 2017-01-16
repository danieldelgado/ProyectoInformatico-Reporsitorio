package com.hitss.rev.bean;

public class PuestoEvaluacionBean {
	
	private long solicitudEvaluacionId;
	private long evaluacionId;

	private EvaluacionBean evaluacionBean;
	private long tipoEvaluacion;

	private double rangoSuperior;
	private double rangoInferior;
	
	public PuestoEvaluacionBean() {
	}

	public long getSolicitudEvaluacionId() {
		return solicitudEvaluacionId;
	}

	public void setSolicitudEvaluacionId(long solicitudEvaluacionId) {
		this.solicitudEvaluacionId = solicitudEvaluacionId;
	}

	public long getEvaluacionId() {
		return evaluacionId;
	}

	public void setEvaluacionId(long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	public double getRangoSuperior() {
		return rangoSuperior;
	}

	public void setRangoSuperior(double rangoSuperior) {
		this.rangoSuperior = rangoSuperior;
	}

	public double getRangoInferior() {
		return rangoInferior;
	}

	public void setRangoInferior(double rangoInferior) {
		this.rangoInferior = rangoInferior;
	}

	public EvaluacionBean getEvaluacionBean() {
		return evaluacionBean;
	}

	public void setEvaluacionBean(EvaluacionBean evaluacionBean) {
		this.evaluacionBean = evaluacionBean;
	}

	public long getTipoEvaluacion() {
		return tipoEvaluacion;
	}

	public void setTipoEvaluacion(long tipoEvaluacion) {
		this.tipoEvaluacion = tipoEvaluacion;
	}

}
