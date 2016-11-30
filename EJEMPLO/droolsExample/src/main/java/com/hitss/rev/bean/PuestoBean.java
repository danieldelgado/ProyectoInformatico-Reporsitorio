package com.hitss.rev.bean;

import java.util.List;

public class PuestoBean {

	private long id;
	private String nombre;

	private ExperienciaBean experienciaRubro;
	
	private long tipoNegocioRequierido;
	
	private List<RequisitoBean> listaConocimientos;
	private List<RequisitoBean> listaCertificados;

	private List<EvaluacionPuestoBean> listaEvaluacionPiscologicas;
	private List<EvaluacionPuestoBean> listaEvaluacionTecnicas;
	private List<EvaluacionPuestoBean> listaEntrevista;

	public PuestoBean() {
	}
	
	public PuestoBean(long id, String nombre, 
			List<RequisitoBean> listaConocimientos, List<RequisitoBean> listaCertificados,
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas,
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas, List<EvaluacionPuestoBean> listaEntrevista) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.listaConocimientos = listaConocimientos;
		this.listaCertificados = listaCertificados;
		this.listaEvaluacionPiscologicas = listaEvaluacionPiscologicas;
		this.listaEvaluacionTecnicas = listaEvaluacionTecnicas;
		this.listaEntrevista = listaEntrevista;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<RequisitoBean> getListaConocimientos() {
		return listaConocimientos;
	}
	public void setListaConocimientos(List<RequisitoBean> listaConocimientos) {
		this.listaConocimientos = listaConocimientos;
	}
	public List<RequisitoBean> getListaCertificados() {
		return listaCertificados;
	}
	public void setListaCertificados(List<RequisitoBean> listaCertificados) {
		this.listaCertificados = listaCertificados;
	}

	public List<EvaluacionPuestoBean> getListaEvaluacionPiscologicas() {
		return listaEvaluacionPiscologicas;
	}
	public void setListaEvaluacionPiscologicas(List<EvaluacionPuestoBean> listaEvaluacionPiscologicas) {
		this.listaEvaluacionPiscologicas = listaEvaluacionPiscologicas;
	}
	public List<EvaluacionPuestoBean> getListaEvaluacionTecnicas() {
		return listaEvaluacionTecnicas;
	}
	public void setListaEvaluacionTecnicas(List<EvaluacionPuestoBean> listaEvaluacionTecnicas) {
		this.listaEvaluacionTecnicas = listaEvaluacionTecnicas;
	}
	public List<EvaluacionPuestoBean> getListaEntrevista() {
		return listaEntrevista;
	}
	public void setListaEntrevista(List<EvaluacionPuestoBean> listaEntrevista) {
		this.listaEntrevista = listaEntrevista;
	}

	public long getTipoNegocioRequierido() {
		return tipoNegocioRequierido;
	}

	public void setTipoNegocioRequierido(long tipoNegocioRequierido) {
		this.tipoNegocioRequierido = tipoNegocioRequierido;
	}

	public ExperienciaBean getExperienciaRubro() {
		return experienciaRubro;
	}

	public void setExperienciaRubro(ExperienciaBean experienciaRubro) {
		this.experienciaRubro = experienciaRubro;
	}
	
	
	
	
	
}
