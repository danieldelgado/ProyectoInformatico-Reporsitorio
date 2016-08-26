package com.hitss.rev.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.service.ActualizarSolicitudReclutamientoService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.PropiedadMensaje;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portlet.asset.model.AssetTag;
import com.liferay.util.portlet.PortletProps;

@Service("ActualizarSolicitudReclutamientoService")
public class ActualizarSolicitudReclutamientoServiceImpl extends RevServiceImpl implements ActualizarSolicitudReclutamientoService {

	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudReclutamientoServiceImpl.class);

	
	@Override
	public Map<String, Object> guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user) {
		_log.debug("guardarSolicitudReclutamiento:");
		Map<String, Object> result = new HashMap<String, Object>();
		try {

			SolicitudRequerimiento sRequerimiento = null;

			if (Validator.isNotNull(solicitudRequerimiento.getSolicitudRequerimientoId())) {
				_log.debug("actualizar:");
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimiento.getSolicitudRequerimientoId());

				if (sRequerimiento.getEstado() == Constantes.PARAMETRO_REGISTRADO || sRequerimiento.getEstado() == Constantes.PARAMETRO_OBSERVADO || sRequerimiento.getEstado() == Constantes.PARAMETRO_REVISADO) {
					sRequerimiento.setNew(false);
					sRequerimiento.setCategoriaPuestoId(solicitudRequerimiento.getPuestoId());
					sRequerimiento.setCantidadRecursos(solicitudRequerimiento.getCantidadRecursos());
					sRequerimiento.setAreaSolicitante(solicitudRequerimiento.getAreaSolicitante());
					sRequerimiento.setFechaLimite(solicitudRequerimiento.getFechaLimite());
					sRequerimiento.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
					sRequerimiento.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
					sRequerimiento.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
					sRequerimiento.setCliente(solicitudRequerimiento.getCliente());
					sRequerimiento.setEspecialidad(solicitudRequerimiento.getEspecialidad());
					sRequerimiento.setProyecto(solicitudRequerimiento.getProyecto());
					sRequerimiento.setActivo(true);
					sRequerimiento.setUsuariomodifica(user.getUserId());
					sRequerimiento.setFechamodifica(new Date());
					sRequerimiento.setEstado(parametroService.getParametro(Constantes.PARAMETRO_REGISTRADO).getParametroId());
					sRequerimiento = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sRequerimiento);
					solicitudRequerimiento.setSolicitudRequerimientoId(sRequerimiento.getSolicitudRequerimientoId());
					registrarRequisitosEtiquetas(solicitudRequerimiento, user);
					_log.debug("Actualizado:" + sRequerimiento.getSolicitudRequerimientoId());
					result.put("respuesta", Constantes.TRANSACCION_OK);
					result.put("objeto", solicitudRequerimiento);
					result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("solicitud.reclutamiento.actualizado"), String.valueOf(sRequerimiento.getSolicitudRequerimientoId())));
				} else {
					result.put("respuesta", Constantes.TRANSACCION_NO_OK);
					result.put("objeto", sRequerimiento);
					result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("solicitud.reclutamiento.no.actualizado"), String.valueOf(sRequerimiento.getSolicitudRequerimientoId())));

				}
			} else if (Validator.isNull(solicitudRequerimiento.getSolicitudRequerimientoId())) {
				_log.debug("nuevo:");
				Long id = CounterLocalServiceUtil.increment(SolicitudRequerimiento.class.getName());
				_log.debug("id:" + id);
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.createSolicitudRequerimiento(id);
				sRequerimiento.setNew(true);
				sRequerimiento.setCategoriaPuestoId(solicitudRequerimiento.getPuestoId());
				sRequerimiento.setCantidadRecursos(solicitudRequerimiento.getCantidadRecursos());
				sRequerimiento.setAreaSolicitante(solicitudRequerimiento.getAreaSolicitante());
				sRequerimiento.setFechacrea(solicitudRequerimiento.getFechacrea());
				sRequerimiento.setFechaLimite(solicitudRequerimiento.getFechaLimite());
				sRequerimiento.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
				sRequerimiento.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
				sRequerimiento.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
				sRequerimiento.setCliente(solicitudRequerimiento.getCliente());
				sRequerimiento.setEspecialidad(solicitudRequerimiento.getEspecialidad());
				sRequerimiento.setProyecto(solicitudRequerimiento.getProyecto());
				sRequerimiento.setEstado(parametroService.getParametro(Constantes.PARAMETRO_REGISTRADO).getParametroId());

				sRequerimiento.setActivo(true);
				sRequerimiento.setUsuariocrea(user.getUserId());
				sRequerimiento.setFechacrea(new Date());
				sRequerimiento.setUsuariomodifica(user.getUserId());
				sRequerimiento.setFechamodifica(new Date());
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.addSolicitudRequerimiento(sRequerimiento);
				solicitudRequerimiento.setSolicitudRequerimientoId(sRequerimiento.getSolicitudRequerimientoId());
				registrarRequisitosEtiquetas(solicitudRequerimiento, user);
				_log.debug("Nuevo:" + sRequerimiento.getSolicitudRequerimientoId());
				result.put("respuesta", Constantes.TRANSACCION_OK);
				result.put("objeto", solicitudRequerimiento);
				result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("solicitud.reclutamiento.registro"), String.valueOf(sRequerimiento.getSolicitudRequerimientoId())));

			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al guardar " + e.getMessage(), e);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PortletProps.get("portal.transaccion.error"));
		}
		return result;
	}

	private void registrarRequisitosEtiquetas(SolicitudRequerimientoBean solicitudRequerimiento, User user) {
		try {
			AssetTag tag = null;
			List<RequisitoEtiquetaBean> requisitoEtiquetaBeans = solicitudRequerimiento.getRequisitoEtiquetaBeans();
			List<RequisitoEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoRequisitosExitentesBeans(solicitudRequerimiento);
			boolean exite = false;
			for (RequisitoEtiquetaBean reqAct : requisitoEtiquetaBeans) {
				reqAct.setActivo(true);
				if (Validator.isNull(reqAct.getTagId())) {
					tag = liferayContentService.getTagByName(reqAct.getRequisito());
					if (Validator.isNotNull(tag)) {
						reqAct.setTagId(tag.getTagId());
					}
				}
				if (Validator.isNotNull(reqAct.getTagId())) {
					for (RequisitoEtiquetaBean reqExite : listaSolicitudRequerimientoRequisitosExitentes) {
						if (reqAct.getTagId() == reqExite.getTagId()) {
							exite = true;
						}
					}
					if (exite) {
						if (exite) {
							reqAct.setNuevo(false);
						}
						exite = false;
						continue;
					}
				} else {
					tag = liferayContentService.nuevaEtiqueta(reqAct.getRequisito(), user);
					if (Validator.isNotNull(tag)) {
						reqAct.setTagId(tag.getTagId());
						reqAct.setActivo(true);
					}
				}
			}
			List<SolicitudRequerimientoRequisito> lista = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoRequisitosExitentes(solicitudRequerimiento);
			for (SolicitudRequerimientoRequisito sreq : lista) {
				sreq.setActivo(false);
				sreq.setUsuariomodifica(user.getUserId());
				sreq.setFechamodifica(new Date());
				SolicitudRequerimientoRequisitoLocalServiceUtil.updateSolicitudRequerimientoRequisito(sreq);
			}
			
			SolicitudRequerimientoRequisito rsr = null;
			for (RequisitoEtiquetaBean reqAct : requisitoEtiquetaBeans) {
				SolicitudRequerimientoRequisitoPK solicitudRequerimientoRequisitoPK = new SolicitudRequerimientoRequisitoPK(solicitudRequerimiento.getSolicitudRequerimientoId(), reqAct.getTagId());
				SolicitudRequerimientoRequisito requerimientoRequisito = new SolicitudRequerimientoRequisitoImpl();
				reqAct.setNuevo(true);
				for (SolicitudRequerimientoRequisito sreq : lista) {
					if (sreq.getTagId() == reqAct.getTagId()) {						
						reqAct.setNuevo(false);		
						rsr = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoRequisitoByIds(solicitudRequerimiento.getSolicitudRequerimientoId(), reqAct.getTagId());
						reqAct.setUsuariomodifica(rsr.getUsuariocrea());
						reqAct.setFechacreamodifica(rsr.getFechamodifica());
					}
				}
				requerimientoRequisito.setPrimaryKey(solicitudRequerimientoRequisitoPK);
				if(reqAct.getExigibleText().equals("true")){
					requerimientoRequisito.setExigible(true);
				}else{
					requerimientoRequisito.setExigible(false);					
				}
				
				
				requerimientoRequisito.setNivel(reqAct.getNivel());
				requerimientoRequisito.setTipoRequisito(reqAct.getTipoRequisito());
				requerimientoRequisito.setActivo(reqAct.isActivo());
				if (reqAct.isNuevo()) {
					requerimientoRequisito.setUsuariocrea(user.getUserId());
					requerimientoRequisito.setFechacrea(new Date());
					requerimientoRequisito.setUsuariomodifica(user.getUserId());
					requerimientoRequisito.setFechamodifica(new Date());
					SolicitudRequerimientoRequisitoLocalServiceUtil.addSolicitudRequerimientoRequisito(requerimientoRequisito);
				} else {
					requerimientoRequisito.setUsuariocrea(reqAct.getUsuariocrea());
					requerimientoRequisito.setFechacrea(reqAct.getFechacrea());
					requerimientoRequisito.setUsuariomodifica(user.getUserId());
					requerimientoRequisito.setFechamodifica(new Date());
					SolicitudRequerimientoRequisitoLocalServiceUtil.updateSolicitudRequerimientoRequisito(requerimientoRequisito);
				}
			}
		} catch (SystemException e) {
			_log.error("registrarRequisitosEtiquetas:" + e.getMessage(), e);
		}
	}

	@Override
	public Map<String, Object> anularSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimientoBean, User user) {
		_log.debug("guardarSolicitudReclutamiento:");
		Map<String, Object> result = new HashMap<String, Object>();
		try {

			if (Validator.isNotNull(solicitudRequerimientoBean.getSolicitudRequerimientoId())) {
				_log.debug("actualizar:");
				SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimientoBean.getSolicitudRequerimientoId());

				if (sr.getEstado() == Constantes.PARAMETRO_REGISTRADO || sr.getEstado() == Constantes.PARAMETRO_REVISADO) {
					sr.setEstado(parametroService.getParametro(Constantes.PARAMETRO_ANULADO).getParametroId());
					sr.setActivo(false);
					sr.setUsuariomodifica(user.getUserId());
					sr.setFechamodifica(new Date());
					sr = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sr);
					solicitudRequerimientoBean.setSolicitudRequerimientoId(sr.getSolicitudRequerimientoId());
					solicitudRequerimientoBean.setEstado(sr.getEstado());
					solicitudRequerimientoBean.setActivo(sr.getActivo());
					_log.debug("anulado:" + solicitudRequerimientoBean.getSolicitudRequerimientoId());
					result.put("respuesta", Constantes.TRANSACCION_OK);
					result.put("objeto", solicitudRequerimientoBean);
					result.put("mensaje", PropiedadMensaje.getMessage(PortletProps.get("solicitud.reclutamiento.anulado"), String.valueOf(solicitudRequerimientoBean.getSolicitudRequerimientoId())));
				}
			}
			return result;

		} catch (SystemException | PortalException e) {
			_log.error("Error al guardar " + e.getMessage(), e);
			result.put("respuesta", Constantes.TRANSACCION_NO_OK);
			result.put("mensaje", PortletProps.get("portal.transaccion.error"));
		}
		return null;
	}



}
