package com.hitss.rev.bean;

public class FasePostulacionPuestoEvaluacionBean {

	private Long fasePostulacionId;
	private Long solicitudFuncionId;
	private Long tipoEvaluacionId;
	private Long evaluacionId;
	
	private Double resultado;
	
	public FasePostulacionPuestoEvaluacionBean() {
	}

	public Long getFasePostulacionId() {
		return fasePostulacionId;
	}

	public void setFasePostulacionId(Long fasePostulacionId) {
		this.fasePostulacionId = fasePostulacionId;
	}

	public Long getSolicitudFuncionId() {
		return solicitudFuncionId;
	}

	public void setSolicitudFuncionId(Long solicitudFuncionId) {
		this.solicitudFuncionId = solicitudFuncionId;
	}

	public Long getEvaluacionId() {
		return evaluacionId;
	}

	public void setEvaluacionId(Long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Long getTipoEvaluacionId() {
		return tipoEvaluacionId;
	}

	public void setTipoEvaluacionId(Long tipoEvaluacionId) {
		this.tipoEvaluacionId = tipoEvaluacionId;
	}
	
	

}
