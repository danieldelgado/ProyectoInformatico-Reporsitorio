package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.Funcion;
import com.hitss.layer.model.SolicitudRequerimientoFuncion;
import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.service.FuncionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;
import com.hitss.rev.bean.FuncionEtiquetaBean;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Service("SolicitudRequerimientoRequisitoService")
public class SolicitudRequerimientoRequisitoServiceImpl implements SolicitudRequerimientoRequisitoService {

	private static Log _log = LogFactoryUtil.getLog(SolicitudRequerimientoRequisitoServiceImpl.class);

	@Autowired
	private ParametroService parametroService;

	@Autowired
	private LiferayApiService liferayContentService;
	
	
	@Override
	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitosExitentesBeans(SolicitudRequerimientoBean solicitudRequerimiento) {
		List<RequisitoEtiquetaBean> requisitoEtiquetaBeans =  new ArrayList<RequisitoEtiquetaBean>();
		try {
			RequisitoEtiquetaBean re = null;
			List<SolicitudRequerimientoRequisito> listaSolicitudRequerimientoRequisitosExitentes = SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisito(solicitudRequerimiento.getSolicitudRequerimientoId());
			for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : listaSolicitudRequerimientoRequisitosExitentes) {
				re =  new RequisitoEtiquetaBean();
				re.setSolicitudRequerimientoId(solicitudRequerimientoRequisito.getSolicitudRequerimientoId());
				re.setTagId(solicitudRequerimientoRequisito.getTagId());
				re.setRequisito(liferayContentService.getEtiqueta(solicitudRequerimientoRequisito.getTagId()).getValue());
				re.setNivel(solicitudRequerimientoRequisito.getNivel());				
				re.setNivelText(parametroService.getParametro(solicitudRequerimientoRequisito.getNivel()).getValor());				
				re.setExigible(solicitudRequerimientoRequisito.isExigible());
				re.setTagId(solicitudRequerimientoRequisito.getTagId());
				re.setTipoRequisito(solicitudRequerimientoRequisito.getTipoRequisito());
				re.setTipoRequisitoText(parametroService.getParametro(solicitudRequerimientoRequisito.getTipoRequisito()).getValor());
				re.setActivo(solicitudRequerimientoRequisito.isActivo());
				requisitoEtiquetaBeans.add(re);
			}		
		} catch (SystemException e) {
			_log.error("getListaSolicitudRequerimientoRequisitosExitentesBeans:" + e.getMessage(), e);
		}		
		return requisitoEtiquetaBeans;
	}
	

	@Override
	public List<FuncionEtiquetaBean> getListaSolicitudRequerimientoFuncionsExitentesBeans(
			SolicitudRequerimientoBean solicitudRequerimiento) {
		List<FuncionEtiquetaBean> funcionEtiquetaBeans =  new ArrayList<FuncionEtiquetaBean>();
		try {
			FuncionEtiquetaBean re = null;
			List<SolicitudRequerimientoFuncion> listaSolicitudRequerimientoRequisitosExitentes = SolicitudRequerimientoFuncionLocalServiceUtil.getListaSolicitudRequerimientoFuncion(solicitudRequerimiento.getSolicitudRequerimientoId());
			for (SolicitudRequerimientoFuncion solicitudRequerimientoRequisito : listaSolicitudRequerimientoRequisitosExitentes) {
				re =  new FuncionEtiquetaBean();
				re.setSolicitudRequerimientoId(solicitudRequerimientoRequisito.getSolicitudFuncionId());
				re.setFuncionId(solicitudRequerimientoRequisito.getFuncionId());
				re.setFuncion(FuncionLocalServiceUtil.getFuncion(solicitudRequerimientoRequisito.getFuncionId()).getDescripcion());						
				re.setExigible(solicitudRequerimientoRequisito.isExigible());		
				re.setActivo(solicitudRequerimientoRequisito.isActivo());
				funcionEtiquetaBeans.add(re);
			}		
		} catch (SystemException | PortalException e) {
			_log.error("getListaSolicitudRequerimientoFuncionsExitentesBeans:" + e.getMessage(), e);
		}		
		return funcionEtiquetaBeans;
	}


	@Override
	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitoActivo(SolicitudRequerimientoBean solicitudRequerimiento) {
		List<RequisitoEtiquetaBean> requisitoEtiquetaBeans =  new ArrayList<RequisitoEtiquetaBean>();
		try {
			RequisitoEtiquetaBean re = null;
			List<SolicitudRequerimientoRequisito> listaSolicitudRequerimientoRequisitosExitentes = SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisitoActivo(solicitudRequerimiento.getSolicitudRequerimientoId());
			_log.info("listaSolicitudRequerimientoRequisitosExitentes");
			_log.info(listaSolicitudRequerimientoRequisitosExitentes);
			for (SolicitudRequerimientoRequisito solicitudRequerimientoRequisito : listaSolicitudRequerimientoRequisitosExitentes) {
				re =  new RequisitoEtiquetaBean();
				re.setSolicitudRequerimientoId(solicitudRequerimientoRequisito.getSolicitudRequerimientoId());
				re.setTagId(solicitudRequerimientoRequisito.getTagId());
				re.setRequisito(liferayContentService.getEtiqueta(solicitudRequerimientoRequisito.getTagId()).getValue());
				re.setNivel(solicitudRequerimientoRequisito.getNivel());				
				re.setNivelText(parametroService.getParametro(solicitudRequerimientoRequisito.getNivel()).getValor());				
				re.setExigible(solicitudRequerimientoRequisito.isExigible());
				re.setTagId(solicitudRequerimientoRequisito.getTagId());
				re.setTipoRequisito(solicitudRequerimientoRequisito.getTipoRequisito());
				re.setTipoRequisitoText(parametroService.getParametro(solicitudRequerimientoRequisito.getTipoRequisito()).getValor());
				re.setActivo(solicitudRequerimientoRequisito.isActivo());
				requisitoEtiquetaBeans.add(re);
			}		
		} catch (SystemException e) {
			_log.error("getListaSolicitudRequerimientoRequisitoActivo:" + e.getMessage(), e);
		}		
		return requisitoEtiquetaBeans;
	}
	
	@Override
	public List<FuncionEtiquetaBean> getListaSolicitudRequerimientoFuncionActivo(
			SolicitudRequerimientoBean solicitudRequerimiento) {
		List<FuncionEtiquetaBean> requisitoEtiquetaBeans =  new ArrayList<FuncionEtiquetaBean>();
		try {
			FuncionEtiquetaBean re = null;
			List<SolicitudRequerimientoFuncion> listaSolicitudRequerimientoRequisitosExitentes = SolicitudRequerimientoFuncionLocalServiceUtil.getListaSolicitudRequerimientoFuncionActivo(solicitudRequerimiento.getSolicitudRequerimientoId());
			_log.info("listaSolicitudRequerimientoRequisitosExitentes");
			_log.info(listaSolicitudRequerimientoRequisitosExitentes);
			for (SolicitudRequerimientoFuncion solicitudRequerimientoRequisito : listaSolicitudRequerimientoRequisitosExitentes) {
				re =  new FuncionEtiquetaBean();
				re.setSolicitudRequerimientoId(solicitudRequerimientoRequisito.getSolicitudFuncionId());
				re.setFuncionId(solicitudRequerimientoRequisito.getFuncionId());
				re.setFuncion(FuncionLocalServiceUtil.getFuncion(solicitudRequerimientoRequisito.getFuncionId()).getDescripcion());						
				re.setExigible(solicitudRequerimientoRequisito.isExigible());		
				re.setActivo(solicitudRequerimientoRequisito.isActivo());
				requisitoEtiquetaBeans.add(re);
			}		
		} catch (SystemException | PortalException e) {
			_log.error("getListaSolicitudRequerimientoFuncionActivo:" + e.getMessage(), e);
		}		
		return requisitoEtiquetaBeans;
	}

	
	@Override
	public List<SolicitudRequerimientoRequisito> getListaSolicitudRequerimientoRequisitosExitentes(SolicitudRequerimientoBean solicitudRequerimiento) {		
		List<SolicitudRequerimientoRequisito>  l =  new ArrayList<SolicitudRequerimientoRequisito>();
		try {
			l = SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisito(solicitudRequerimiento.getSolicitudRequerimientoId());
		} catch (SystemException e) {
			_log.error("getListaSolicitudRequerimientoRequisitosExitentes:" + e.getMessage(), e);
		}
		return l;
	}

	@Override
	public List<SolicitudRequerimientoFuncion> getListaSolicitudRequerimientoFuncionsExitentes(
			SolicitudRequerimientoBean solicitudRequerimiento) {
		List<SolicitudRequerimientoFuncion>  l =  new ArrayList<SolicitudRequerimientoFuncion>();
		try {
			l = SolicitudRequerimientoFuncionLocalServiceUtil.getListaSolicitudRequerimientoFuncion(solicitudRequerimiento.getSolicitudRequerimientoId());
		} catch (SystemException e) {
			_log.error("getListaSolicitudRequerimientoFuncionsExitentes:" + e.getMessage(), e);
		}
		return l;
	}

	
	
	@Override
	public SolicitudRequerimientoRequisito getListaSolicitudRequerimientoRequisitoByIds(long solicitudRequerimientoId, long tagId) {
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK = new SolicitudRequerimientoRequisitoPK(solicitudRequerimientoId, tagId);
		
		try {
			SolicitudRequerimientoRequisito srr = SolicitudRequerimientoRequisitoLocalServiceUtil.getSolicitudRequerimientoRequisito(solicitudRequerimientoRequisitoPK);
			return srr;
		
		} catch (PortalException | SystemException e) {
			_log.error("getListaSolicitudRequerimientoRequisitoByIds:" + e.getMessage(), e);
		}
		
		return null;
	}


	@Override
	public SolicitudRequerimientoFuncion getListaSolicitudRequerimientoFuncionByIds(
			long solicitudRequerimientoId, long tagId) {
		SolicitudRequerimientoFuncionPK solicitudRequerimientoRequisitoPK = new SolicitudRequerimientoFuncionPK(solicitudRequerimientoId, tagId);
		
		try {
			SolicitudRequerimientoFuncion srr = SolicitudRequerimientoFuncionLocalServiceUtil.getSolicitudRequerimientoFuncion(solicitudRequerimientoRequisitoPK);
			return srr;
		
		} catch (PortalException | SystemException e) {
			_log.error("getListaSolicitudRequerimientoFuncionByIds:" + e.getMessage(), e);
		}
		
		return null;
	}

	
}
