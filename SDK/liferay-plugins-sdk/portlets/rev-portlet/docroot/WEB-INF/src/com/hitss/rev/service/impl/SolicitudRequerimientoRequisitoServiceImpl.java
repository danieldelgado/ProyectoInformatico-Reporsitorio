package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;
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
			_log.error("getListaSolicitudRequerimientoRequisitosExitentes:" + e.getMessage(), e);
		}		
		return requisitoEtiquetaBeans;
	}

	@Override
	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitoActivo(SolicitudRequerimientoBean solicitudRequerimiento) {
		List<RequisitoEtiquetaBean> requisitoEtiquetaBeans =  new ArrayList<RequisitoEtiquetaBean>();
		try {
			RequisitoEtiquetaBean re = null;
			List<SolicitudRequerimientoRequisito> listaSolicitudRequerimientoRequisitosExitentes = SolicitudRequerimientoRequisitoLocalServiceUtil.getListaSolicitudRequerimientoRequisitoActivo(solicitudRequerimiento.getSolicitudRequerimientoId());
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
			_log.error("getListaSolicitudRequerimientoRequisitosExitentes:" + e.getMessage(), e);
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
	public SolicitudRequerimientoRequisito getListaSolicitudRequerimientoRequisitoByIds(long solicitudRequerimientoId, long tagId) {
		SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK = new SolicitudRequerimientoRequisitoPK(solicitudRequerimientoId, tagId);
		
		try {
			SolicitudRequerimientoRequisito srr = SolicitudRequerimientoRequisitoLocalServiceUtil.getSolicitudRequerimientoRequisito(solicitudRequerimientoRequisitoPK);
			return srr;
		
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
