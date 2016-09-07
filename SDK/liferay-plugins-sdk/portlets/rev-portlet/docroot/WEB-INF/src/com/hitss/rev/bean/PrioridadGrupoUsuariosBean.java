package com.hitss.rev.bean;

import java.io.Serializable;


public class PrioridadGrupoUsuariosBean implements Serializable{

	private long prioridadGrupoUsuariosId;
	private long solicitudEvaluacionId;
	private long liderGrupo;
	private long liderGerenteArea;
	private long grupoUsuario;
	private String strgrupoUsuario;
	private int order;

	private ActividadCronogramaBean actividadCronogramaBean;
	
	public long getPrioridadGrupoUsuariosId() {
		return prioridadGrupoUsuariosId;
	}
	public void setPrioridadGrupoUsuariosId(long prioridadGrupoUsuariosId) {
		this.prioridadGrupoUsuariosId = prioridadGrupoUsuariosId;
	}
	public long getSolicitudEvaluacionId() {
		return solicitudEvaluacionId;
	}
	public void setSolicitudEvaluacionId(long solicitudEvaluacionId) {
		this.solicitudEvaluacionId = solicitudEvaluacionId;
	}
	public long getLiderGrupo() {
		return liderGrupo;
	}
	public void setLiderGrupo(long liderGrupo) {
		this.liderGrupo = liderGrupo;
	}
	public long getLiderGerenteArea() {
		return liderGerenteArea;
	}
	public void setLiderGerenteArea(long liderGerenteArea) {
		this.liderGerenteArea = liderGerenteArea;
	}
	public long getGrupoUsuario() {
		return grupoUsuario;
	}
	public void setGrupoUsuario(long grupoUsuario) {
		this.grupoUsuario = grupoUsuario;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getStrgrupoUsuario() {
		return strgrupoUsuario;
	}
	public void setStrgrupoUsuario(String strgrupoUsuario) {
		this.strgrupoUsuario = strgrupoUsuario;
	}
	public ActividadCronogramaBean getActividadCronogramaBean() {
		return actividadCronogramaBean;
	}
	public void setActividadCronogramaBean(ActividadCronogramaBean actividadCronogramaBean) {
		this.actividadCronogramaBean = actividadCronogramaBean;
	}
	
	
	
}
