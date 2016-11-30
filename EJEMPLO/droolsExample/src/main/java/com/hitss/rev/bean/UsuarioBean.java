package com.hitss.rev.bean;

import java.util.List;

public class UsuarioBean {

	private long idUsuario;
	private String nombre;
	private double salario;            
	
	private List<RequisitoBean> listaConocimientos;
	private List<RequisitoBean> listaCertificados;

	private List<ExperienciaBean> listaExperiencias;

	private List<EvaluacionBean> listaEvaluacionPiscologicas;
	private List<EvaluacionBean> listaEvaluacionTecnicas;
	private List<EvaluacionBean> listaEntrevista;
	
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
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
	public List<ExperienciaBean> getListaExperiencias() {
		return listaExperiencias;
	}
	public void setListaExperiencias(List<ExperienciaBean> listaExperiencias) {
		this.listaExperiencias = listaExperiencias;
	}
	public List<EvaluacionBean> getListaEvaluacionPiscologicas() {
		return listaEvaluacionPiscologicas;
	}
	public void setListaEvaluacionPiscologicas(List<EvaluacionBean> listaEvaluacionPiscologicas) {
		this.listaEvaluacionPiscologicas = listaEvaluacionPiscologicas;
	}
	public List<EvaluacionBean> getListaEvaluacionTecnicas() {
		return listaEvaluacionTecnicas;
	}
	public void setListaEvaluacionTecnicas(List<EvaluacionBean> listaEvaluacionTecnicas) {
		this.listaEvaluacionTecnicas = listaEvaluacionTecnicas;
	}
	public List<EvaluacionBean> getListaEntrevista() {
		return listaEntrevista;
	}
	public void setListaEntrevista(List<EvaluacionBean> listaEntrevista) {
		this.listaEntrevista = listaEntrevista;
	}
	
	
	
}
