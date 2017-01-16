package com.hitss.rev.dools.impl;

public class EvaluacionBean {

	public static final long EVALUAION_PSICOLOGICA_01=1L;
	public static final long EVALUAION_PSICOLOGICA_02=2L;
	public static final long EVALUAION_PSICOLOGICA_03=3L;
	public static final long EVALUAION_PSICOLOGICA_04=4L;
	

	public static final long EVALUAION_TECNICA_01=1L;
	public static final long EVALUAION_TECNICA_02=2L;
	public static final long EVALUAION_TECNICA_03=3L;
	
	public static final long EVALUAION_ENTREVISTA_COORDINADOR_RRHH = 4L;
	public static final long EVALUAION_ENTREVISTA_GERENTE_AREA = 5L;
	
	private long id;
	private long tipoEvaluacion;
	private String descripcion;
	private double puntajeObtenido;
	private boolean evaluacionAceptada;
	
	public EvaluacionBean() {
		// TODO Auto-generated constructor stub
	}
	
	

	public EvaluacionBean(long id, long tipoEvaluacion, String descripcion, double puntajeObtenido) {
		super();
		this.id = id;
		this.tipoEvaluacion = tipoEvaluacion;
		this.descripcion = descripcion;
		this.puntajeObtenido = puntajeObtenido;
	}
	
	public EvaluacionBean(long id, long tipoEvaluacion,  double puntajeObtenido) {
		super();
		this.id = id;
		this.tipoEvaluacion = tipoEvaluacion;
		this.puntajeObtenido = puntajeObtenido;
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
	public double getPuntajeObtenido() {
		return puntajeObtenido;
	}
	public void setPuntajeObtenido(double puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}



	public boolean isEvaluacionAceptada() {
		return evaluacionAceptada;
	}



	public void setEvaluacionAceptada(boolean evaluacionAceptada) {
		this.evaluacionAceptada = evaluacionAceptada;
	}
	
	
	
	
	
}
