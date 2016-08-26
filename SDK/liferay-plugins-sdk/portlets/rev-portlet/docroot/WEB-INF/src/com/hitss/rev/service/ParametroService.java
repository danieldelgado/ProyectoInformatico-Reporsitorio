package com.hitss.rev.service;

import java.util.List;

import com.hitss.rev.bean.ParametroBean;

public interface ParametroService {

	public List<ParametroBean> getListaParametroGrupo(long parametroIdpadre);
	public List<ParametroBean> getListaParametroPadre();
	public ParametroBean getParametro(long parametro);
	public List<ParametroBean> getParametros();
	
	
	
}
