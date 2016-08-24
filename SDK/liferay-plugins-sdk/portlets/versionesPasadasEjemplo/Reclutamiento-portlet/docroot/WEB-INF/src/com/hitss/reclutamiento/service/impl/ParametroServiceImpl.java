package com.hitss.reclutamiento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.reclutamiento.bean.ParametroBean;
import com.hitss.reclutamiento.service.ParametroService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rec.hitss.layer.model.Parametro;
import com.rec.hitss.layer.service.ParametroLocalServiceUtil;


@Service("ParametroService")
public class ParametroServiceImpl implements ParametroService {

	private static Log _log = LogFactoryUtil.getLog(ParametroServiceImpl.class);
	
	@Override
	public List<ParametroBean> getListaParametroGrupo(long parametroIdpadre) {
		_log.debug("getListaParametroGrupo");
		List<ParametroBean> parametroBeans = new ArrayList<ParametroBean>();		
		try {
			List<Parametro> listaparametro = ParametroLocalServiceUtil.findByparametroPadre(parametroIdpadre);
			_log.debug(listaparametro);
			ParametroBean parametroBean = null;
			for (Parametro parametro : listaparametro) {
				parametroBean =  new ParametroBean();
				parametroBean.setParametroId(parametro.getParametroId());
				parametroBean.setParametroIdpadre(parametro.getParametroIdpadre());
				parametroBean.setValor(parametro.getValor());
				parametroBeans.add(parametroBean);
			}
		} catch (SystemException e) {
			_log.error("Error getListaParametroGrupo : "+e.getLocalizedMessage(),e);
		}		
		return parametroBeans;
	}

	@Override
	public List<ParametroBean> getListaParametroPadre() {
		_log.debug("getListaParametroPadre");
		List<ParametroBean> parametroBeans = new ArrayList<ParametroBean>();		
		try {
			List<Parametro> listaparametro = ParametroLocalServiceUtil.findByparametroPadre(0L);
			_log.debug(listaparametro);
			ParametroBean parametroBean = null;
			for (Parametro parametro : listaparametro) {
				parametroBean =  new ParametroBean();
				parametroBean.setParametroId(parametro.getParametroId());
				parametroBean.setParametroIdpadre(parametro.getParametroIdpadre());
				parametroBean.setValor(parametro.getValor());
				parametroBeans.add(parametroBean);
			}
		} catch (SystemException e) {
			_log.error("Error getListaParametroPadre : "+e.getLocalizedMessage(),e);
		}		
		return parametroBeans;
	}

	@Override
	public ParametroBean getParametro(long parametro) {
		_log.debug("getParametro");
		ParametroBean parametroBean = null;		
		try {
			Parametro p = ParametroLocalServiceUtil.getParametro(parametro);
			parametroBean =  new ParametroBean();
			parametroBean.setParametroId(p.getParametroId());
			parametroBean.setParametroIdpadre(p.getParametroIdpadre());
			parametroBean.setValor(p.getValor());
			_log.debug(p);
		} catch (PortalException | SystemException e) {
			_log.error("Error getParametro : "+e.getLocalizedMessage(),e);
		}
		return parametroBean;
	}

}
