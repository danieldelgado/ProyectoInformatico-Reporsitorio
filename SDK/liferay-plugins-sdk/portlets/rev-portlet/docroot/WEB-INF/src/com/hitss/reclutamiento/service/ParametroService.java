package com.hitss.reclutamiento.service;

import java.util.List;

import com.hitss.reclutamiento.bean.ParametroBean;

public interface ParametroService {

	public List<ParametroBean> getListaParametroGrupo(long parametroIdpadre);
	public List<ParametroBean> getListaParametroPadre();
	public ParametroBean getParametro(long parametro);
	public List<ParametroBean> getParametros();
	
	
	
}
