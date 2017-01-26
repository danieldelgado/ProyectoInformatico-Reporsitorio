package com.hitss.rev.bean;

import java.io.Serializable;
import java.util.List;

import com.hitss.rev.dools.impl.Traza;

public class UsuarioBean implements Serializable{

	private long solicitudId;	
	private long userId;	
	private String fullname;
	private String fechaPostulacion;
	private String disponibilidad;
	private String interno;
	private String fasePostulacion;
	private String estado;
	
	private boolean filtroPostulacion;
	private boolean filtroExperiencia;

	private boolean filtroConocimiento;
	private int cantidadReqCon;	
	private double porcentajeReqCum;
	private boolean recomendableReqCum;
	private double porcentajeRequisitosCumplidoPorUsuario;
	private boolean recomendableRequisitosCumplidoPorUsuario;

	private boolean requiereCertificado;
	private boolean tieneCertificadoExperiencia;	
	private boolean filtroCertificado;
	private int cantidadReqCerti;
	private double porcentajeReqCertiCum;
	private boolean recomendableReqCertiCum;
	private double porcentajeCertificadoCumplidoPorUsuario;
	private boolean recomendableCertificadoCumplidoPorUsuario;
	
	private boolean filtroPsicologico;
	
	private boolean filtroTecnico;
	private boolean filtroEtrevistas;
	
	

	private double distanciaHammingPsicologico;
	private double distanciaEuclidianaPsicologico;
	
	private double distanciaHammingTecnico;
	private double distanciaEuclidianaTecnico;

	private double distanciaHammingEntrevista;
	private double distanciaEuclidianaEntrevista;

	private boolean analizadoCercania;
	private double cercania;
	
	private List<Traza> listaTrazaAnalisis;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getFechaPostulacion() {
		return fechaPostulacion;
	}
	public void setFechaPostulacion(String fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getInterno() {
		return interno;
	}
	public void setInterno(String interno) {
		this.interno = interno;
	}
	public String getFasePostulacion() {
		return fasePostulacion;
	}
	public void setFasePostulacion(String fasePostulacion) {
		this.fasePostulacion = fasePostulacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public long getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(long solicitudId) {
		this.solicitudId = solicitudId;
	}
	public boolean isFiltroPostulacion() {
		return filtroPostulacion;
	}
	public void setFiltroPostulacion(boolean filtroPostulacion) {
		this.filtroPostulacion = filtroPostulacion;
	}
	public boolean isFiltroExperiencia() {
		return filtroExperiencia;
	}
	public void setFiltroExperiencia(boolean filtroExperiencia) {
		this.filtroExperiencia = filtroExperiencia;
	}
	public boolean isFiltroConocimiento() {
		return filtroConocimiento;
	}
	public void setFiltroConocimiento(boolean filtroConocimiento) {
		this.filtroConocimiento = filtroConocimiento;
	}
	public int getCantidadReqCon() {
		return cantidadReqCon;
	}
	public void setCantidadReqCon(int cantidadReqCon) {
		this.cantidadReqCon = cantidadReqCon;
	}
	public double getPorcentajeReqCum() {
		return porcentajeReqCum;
	}
	public void setPorcentajeReqCum(double porcentajeReqCum) {
		this.porcentajeReqCum = porcentajeReqCum;
	}
	public boolean isRecomendableReqCum() {
		return recomendableReqCum;
	}
	public void setRecomendableReqCum(boolean recomendableReqCum) {
		this.recomendableReqCum = recomendableReqCum;
	}
	public double getPorcentajeRequisitosCumplidoPorUsuario() {
		return porcentajeRequisitosCumplidoPorUsuario;
	}
	public void setPorcentajeRequisitosCumplidoPorUsuario(double porcentajeRequisitosCumplidoPorUsuario) {
		this.porcentajeRequisitosCumplidoPorUsuario = porcentajeRequisitosCumplidoPorUsuario;
	}
	public boolean isRecomendableRequisitosCumplidoPorUsuario() {
		return recomendableRequisitosCumplidoPorUsuario;
	}
	public void setRecomendableRequisitosCumplidoPorUsuario(boolean recomendableRequisitosCumplidoPorUsuario) {
		this.recomendableRequisitosCumplidoPorUsuario = recomendableRequisitosCumplidoPorUsuario;
	}
	public boolean isRequiereCertificado() {
		return requiereCertificado;
	}
	public void setRequiereCertificado(boolean requiereCertificado) {
		this.requiereCertificado = requiereCertificado;
	}
	public boolean isTieneCertificadoExperiencia() {
		return tieneCertificadoExperiencia;
	}
	public void setTieneCertificadoExperiencia(boolean tieneCertificadoExperiencia) {
		this.tieneCertificadoExperiencia = tieneCertificadoExperiencia;
	}
	public boolean isFiltroCertificado() {
		return filtroCertificado;
	}
	public void setFiltroCertificado(boolean filtroCertificado) {
		this.filtroCertificado = filtroCertificado;
	}
	public int getCantidadReqCerti() {
		return cantidadReqCerti;
	}
	public void setCantidadReqCerti(int cantidadReqCerti) {
		this.cantidadReqCerti = cantidadReqCerti;
	}
	public double getPorcentajeReqCertiCum() {
		return porcentajeReqCertiCum;
	}
	public void setPorcentajeReqCertiCum(double porcentajeReqCertiCum) {
		this.porcentajeReqCertiCum = porcentajeReqCertiCum;
	}
	public boolean isRecomendableReqCertiCum() {
		return recomendableReqCertiCum;
	}
	public void setRecomendableReqCertiCum(boolean recomendableReqCertiCum) {
		this.recomendableReqCertiCum = recomendableReqCertiCum;
	}
	public double getPorcentajeCertificadoCumplidoPorUsuario() {
		return porcentajeCertificadoCumplidoPorUsuario;
	}
	public void setPorcentajeCertificadoCumplidoPorUsuario(double porcentajeCertificadoCumplidoPorUsuario) {
		this.porcentajeCertificadoCumplidoPorUsuario = porcentajeCertificadoCumplidoPorUsuario;
	}
	public boolean isRecomendableCertificadoCumplidoPorUsuario() {
		return recomendableCertificadoCumplidoPorUsuario;
	}
	public void setRecomendableCertificadoCumplidoPorUsuario(boolean recomendableCertificadoCumplidoPorUsuario) {
		this.recomendableCertificadoCumplidoPorUsuario = recomendableCertificadoCumplidoPorUsuario;
	}
	public boolean isFiltroPsicologico() {
		return filtroPsicologico;
	}
	public void setFiltroPsicologico(boolean filtroPsicologico) {
		this.filtroPsicologico = filtroPsicologico;
	}
	public boolean isFiltroTecnico() {
		return filtroTecnico;
	}
	public void setFiltroTecnico(boolean filtroTecnico) {
		this.filtroTecnico = filtroTecnico;
	}
	public boolean isFiltroEtrevistas() {
		return filtroEtrevistas;
	}
	public void setFiltroEtrevistas(boolean filtroEtrevistas) {
		this.filtroEtrevistas = filtroEtrevistas;
	}
	public double getDistanciaHammingPsicologico() {
		return distanciaHammingPsicologico;
	}
	public void setDistanciaHammingPsicologico(double distanciaHammingPsicologico) {
		this.distanciaHammingPsicologico = distanciaHammingPsicologico;
	}
	public double getDistanciaEuclidianaPsicologico() {
		return distanciaEuclidianaPsicologico;
	}
	public void setDistanciaEuclidianaPsicologico(double distanciaEuclidianaPsicologico) {
		this.distanciaEuclidianaPsicologico = distanciaEuclidianaPsicologico;
	}
	public double getDistanciaHammingTecnico() {
		return distanciaHammingTecnico;
	}
	public void setDistanciaHammingTecnico(double distanciaHammingTecnico) {
		this.distanciaHammingTecnico = distanciaHammingTecnico;
	}
	public double getDistanciaEuclidianaTecnico() {
		return distanciaEuclidianaTecnico;
	}
	public void setDistanciaEuclidianaTecnico(double distanciaEuclidianaTecnico) {
		this.distanciaEuclidianaTecnico = distanciaEuclidianaTecnico;
	}
	public double getDistanciaHammingEntrevista() {
		return distanciaHammingEntrevista;
	}
	public void setDistanciaHammingEntrevista(double distanciaHammingEntrevista) {
		this.distanciaHammingEntrevista = distanciaHammingEntrevista;
	}
	public double getDistanciaEuclidianaEntrevista() {
		return distanciaEuclidianaEntrevista;
	}
	public void setDistanciaEuclidianaEntrevista(double distanciaEuclidianaEntrevista) {
		this.distanciaEuclidianaEntrevista = distanciaEuclidianaEntrevista;
	}
	public boolean isAnalizadoCercania() {
		return analizadoCercania;
	}
	public void setAnalizadoCercania(boolean analizadoCercania) {
		this.analizadoCercania = analizadoCercania;
	}
	public double getCercania() {
		return cercania;
	}
	public void setCercania(double cercania) {
		this.cercania = cercania;
	}
	public List<Traza> getListaTrazaAnalisis() {
		return listaTrazaAnalisis;
	}
	public void setListaTrazaAnalisis(List<Traza> listaTrazaAnalisis) {
		this.listaTrazaAnalisis = listaTrazaAnalisis;
	}
	
	
	
	
	
	
	
}
