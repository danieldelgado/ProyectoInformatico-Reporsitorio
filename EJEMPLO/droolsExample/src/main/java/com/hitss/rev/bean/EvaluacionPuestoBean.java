package com.hitss.rev.bean;

public class EvaluacionPuestoBean {

	public static final long EVALUAION_PSICOLOGICA_01 = 1L;
	public static final long EVALUAION_PSICOLOGICA_02 = 2L;
	public static final long EVALUAION_PSICOLOGICA_03 = 3L;
	public static final long EVALUAION_PSICOLOGICA_04 = 4L;

	public static final long EVALUAION_TECNICA_01 = 1L;
	public static final long EVALUAION_TECNICA_02 = 2L;
	public static final long EVALUAION_TECNICA_03 = 3L;
	

	public static final long EVALUAION_TECNICA_04 = 4L;
	public static final long EVALUAION_TECNICA_05 = 5L;
	
	
	public static final long EVALUAION_ENTREVISTA_COORDINADOR_RRHH = 4L;
	public static final long EVALUAION_ENTREVISTA_GERENTE_AREA = 5L;

	private long id;
	private long tipoEvaluacion;
	private String descripcion;
	private double limitePorcentajeSuperior;
	private double limitePorcentajeInferior;

	public EvaluacionPuestoBean() {
	}

	public EvaluacionPuestoBean(long id, long tipoEvaluacion, String descripcion,double limitePorcentajeInferior, double limitePorcentajeSuperior) {
		super();
		this.id = id;
		this.tipoEvaluacion = tipoEvaluacion;
		this.descripcion = descripcion;
		this.limitePorcentajeInferior = limitePorcentajeInferior;
		this.limitePorcentajeSuperior = limitePorcentajeSuperior;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTipoEvaluacion() {
		return tipoEvaluacion;
	}

	public void setTipoEvaluacion(long tipoEvaluacion) {
		this.tipoEvaluacion = tipoEvaluacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getLimitePorcentajeSuperior() {
		return limitePorcentajeSuperior;
	}

	public void setLimitePorcentajeSuperior(double limitePorcentajeSuperior) {
		this.limitePorcentajeSuperior = limitePorcentajeSuperior;
	}

	public double getLimitePorcentajeInferior() {
		return limitePorcentajeInferior;
	}

	public void setLimitePorcentajeInferior(double limitePorcentajeInferior) {
		this.limitePorcentajeInferior = limitePorcentajeInferior;
	}

}
