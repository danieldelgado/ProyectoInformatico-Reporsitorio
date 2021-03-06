package com.hitss.rev.bean;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class FuncionEtiquetaBean implements Serializable{

	private long solicitudRequerimientoId;
	private long funcionId;
	private long groupId;
	private long companyId;
	private String funcion;	
	private boolean exigible;
	private String exigibleText;
	private boolean activo;
	private long usuariocrea;
	private Date fechacrea;
	private String strfechacrea;
	private long usuariomodifica;
	private Date fechacreamodifica;
	private String strfechacreamodifica;
	private boolean nuevo;
	public long getSolicitudRequerimientoId() {
		return solicitudRequerimientoId;
	}
	public void setSolicitudRequerimientoId(long solicitudRequerimientoId) {
		this.solicitudRequerimientoId = solicitudRequerimientoId;
	}
	public boolean isExigible() {
		return exigible;
	}
	public void setExigible(boolean exigible) {
		this.exigible = exigible;
	}
	
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
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
	public String getStrfechacrea() {
		return strfechacrea;
	}
	public void setStrfechacrea(String strfechacrea) {
		this.strfechacrea = strfechacrea;
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
	public String getStrfechacreamodifica() {
		return strfechacreamodifica;
	}
	public void setStrfechacreamodifica(String strfechacreamodifica) {
		this.strfechacreamodifica = strfechacreamodifica;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public String getExigibleText() {
		return exigibleText;
	}
	public void setExigibleText(String exigibleText) {
		this.exigibleText = exigibleText;
	}
	public long getFuncionId() {
		return funcionId;
	}
	public void setFuncionId(long funcionId) {
		this.funcionId = funcionId;
	}
	
	
	
}
