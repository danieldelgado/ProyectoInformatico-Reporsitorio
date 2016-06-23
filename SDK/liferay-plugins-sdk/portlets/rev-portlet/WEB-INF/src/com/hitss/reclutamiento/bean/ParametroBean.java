package com.hitss.reclutamiento.bean;

import java.util.Date;

public class ParametroBean {

	private	long parametroId;
	private long parametroIdpadre;
	
	private	String codigo;
	private	String  descripcion;
	private String valor;
	private	String tipodato;

	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	
	public ParametroBean() {
		
	}

	public long getParametroId() {
		return parametroId;
	}

	public void setParametroId(long parametroId) {
		this.parametroId = parametroId;
	}

	public long getParametroIdpadre() {
		return parametroIdpadre;
	}

	public void setParametroIdpadre(long parametroIdpadre) {
		this.parametroIdpadre = parametroIdpadre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipodato() {
		return tipodato;
	}

	public void setTipodato(String tipodato) {
		this.tipodato = tipodato;
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

	
	
}
