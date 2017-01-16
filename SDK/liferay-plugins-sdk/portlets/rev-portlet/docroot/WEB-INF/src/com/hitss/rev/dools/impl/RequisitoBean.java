package com.hitss.rev.dools.impl;

public class RequisitoBean {
	public static final long  REQUISITO_CONOCIMIENTO = 1L;
	public static final long  REQUISITO_CERTIFICADO = 2L;

	private long id;
	private long tipo;
	private String descripcion;
	private int annos;
	private boolean exigible;
	private double porcetageIgualdad;
	private boolean annosMinimoAceptado;
	
	public RequisitoBean() {		
	}
	
	public RequisitoBean(long id, long tipo, String descripcion, int annos, boolean exigible) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.annos = annos;
		this.exigible = exigible;
	}
	public RequisitoBean(long id, long tipo, String descripcion, int annos) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.annos = annos;
	}

	public RequisitoBean(long id, long tipo, String descripcion, boolean exigible) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.exigible = exigible;
	}

	public RequisitoBean(long id, long tipo, String descripcion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTipo() {
		return tipo;
	}
	public void setTipo(long tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getAnnos() {
		return annos;
	}
	public void setAnnos(int annos) {
		this.annos = annos;
	}
	public boolean isExigible() {
		return exigible;
	}
	public void setExigible(boolean exigible) {
		this.exigible = exigible;
	}

	public double getPorcetageIgualdad() {
		return porcetageIgualdad;
	}

	public void setPorcetageIgualdad(double porcetageIgualdad) {
		if(this.porcetageIgualdad==0){
			this.porcetageIgualdad = porcetageIgualdad;
			
		}else{
			if(this.porcetageIgualdad <= porcetageIgualdad){
				this.porcetageIgualdad = porcetageIgualdad;
			}
		}		
	}

	public boolean isAnnosMinimoAceptado() {
		return annosMinimoAceptado;
	}

	public void setAnnosMinimoAceptado(boolean annosMinimoAceptado) {
		this.annosMinimoAceptado = annosMinimoAceptado;
	}

	
	
}