package com.hitss.rev.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.Funcion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.SolicitudRequerimientoFuncion;
import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.layer.model.impl.FuncionImpl;
import com.hitss.layer.model.impl.SolicitudRequerimientoFuncionImpl;
import com.hitss.layer.model.impl.SolicitudRequerimientoRequisitoImpl;
import com.hitss.layer.service.FuncionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.persistence.SolicitudRequerimientoFuncionPK;
import com.hitss.layer.service.persistence.SolicitudRequerimientoRequisitoPK;
import com.hitss.rev.bean.FuncionEtiquetaBean;
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
	public Map<String, Object> guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user, long scopeGroupId) {
		_log.debug("guardarSolicitudReclutamiento:");
		Map<String, Object> result = new HashMap<String, Object>();
		try {

			SolicitudRequerimiento sRequerimiento = null;

			if (Validator.isNotNull(solicitudRequerimiento.getSolicitudRequerimientoId())) {
				
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimiento.getSolicitudRequerimientoId());
				_log.info("actualizar sRequerimiento:"+sRequerimiento.getEstado());
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
					registrarRequisitosEtiquetas(solicitudRequerimiento, user,scopeGroupId);
					registrarFuncionEtiquetas(solicitudRequerimiento, user,scopeGroupId);
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
				registrarRequisitosEtiquetas(solicitudRequerimiento, user,scopeGroupId);
				registrarFuncionEtiquetas(solicitudRequerimiento, user,scopeGroupId);
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

	private void registrarFuncionEtiquetas(
			SolicitudRequerimientoBean solicitudRequerimiento, User user, long scopeGroupId) {
		try {
			List<com.hitss.layer.model.Funcion> lstemp = null;
			Funcion funcion = null;
			List<FuncionEtiquetaBean> requisitoEtiquetaBeans = solicitudRequerimiento.getFuncionEtiquetaBeans();
			List<FuncionEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoFuncionsExitentesBeans(solicitudRequerimiento);
			boolean exite = false;
			for (FuncionEtiquetaBean funcionBean : requisitoEtiquetaBeans) {
				funcionBean.setActivo(true);
				System.out.println(Validator.isNull(funcionBean.getFuncionId()));
				System.out.println(Validator.isNull(Validator.equals(funcionBean.getFuncionId(), 0)));
				if (Validator.isNull(funcionBean.getFuncionId()) || Validator.equals(funcionBean.getFuncionId(), 0)) {
					lstemp = FuncionLocalServiceUtil.findByDescripcion(funcionBean.getFuncion());
					if(!lstemp.isEmpty()){
						funcion = lstemp.get(0);
						if (Validator.isNotNull(funcion)) {
							funcionBean.setFuncionId(funcion.getFuncionId());
						}
					}
				}
				if (Validator.isNotNull(funcionBean.getFuncionId())) {
					for (FuncionEtiquetaBean reqExite : listaSolicitudRequerimientoRequisitosExitentes) {
						if (funcionBean.getFuncionId() == reqExite.getFuncionId()) {
							exite = true;
						}
					}
					if (exite) {
						if (exite) {
							funcionBean.setNuevo(false);
						}
						exite = false;
						continue;
					}
				} else {
					funcion =  new FuncionImpl();
					funcion.setNew(true);
					funcion.setDescripcion(funcionBean.getFuncion());
					funcion.setActivo(true);			
					funcion.setExigible(funcionBean.isExigible());
					funcion.setUsuariocrea(user.getUserId());
					funcion.setFechacrea(new Date());
					funcion.setUsuariomodifica(user.getUserId());
					funcion.setFechamodifica(new Date());
					funcion = FuncionLocalServiceUtil.addFuncion(funcion);
					if (Validator.isNotNull(funcion)) {
						funcionBean.setFuncionId(funcion.getFuncionId());
						funcionBean.setActivo(true);
					}
				}
			}
			List<SolicitudRequerimientoFuncion> lista = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoFuncionsExitentes(solicitudRequerimiento);
			for (SolicitudRequerimientoFuncion sreq : lista) {
				sreq.setActivo(false);
				sreq.setUsuariomodifica(user.getUserId());
				sreq.setFechamodifica(new Date());
				SolicitudRequerimientoFuncionLocalServiceUtil.updateSolicitudRequerimientoFuncion(sreq);
			}
			
			SolicitudRequerimientoFuncion rsr = null;
			for (FuncionEtiquetaBean reqAct : requisitoEtiquetaBeans) {
				SolicitudRequerimientoFuncionPK solicitudRequerimientoRequisitoPK = new SolicitudRequerimientoFuncionPK(solicitudRequerimiento.getSolicitudRequerimientoId(), reqAct.getFuncionId());
				SolicitudRequerimientoFuncion requerimientoRequisito = new SolicitudRequerimientoFuncionImpl();
				reqAct.setNuevo(true);
				for (SolicitudRequerimientoFuncion sreq : lista) {
					if (sreq.getFuncionId() == reqAct.getFuncionId()) {						
						reqAct.setNuevo(false);		
						rsr = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoFuncionByIds(solicitudRequerimiento.getSolicitudRequerimientoId(), reqAct.getFuncionId());
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
				requerimientoRequisito.setActivo(reqAct.isActivo());
				if (reqAct.isNuevo()) {
					requerimientoRequisito.setUsuariocrea(user.getUserId());
					requerimientoRequisito.setFechacrea(new Date());
					requerimientoRequisito.setUsuariomodifica(user.getUserId());
					requerimientoRequisito.setFechamodifica(new Date());
					SolicitudRequerimientoFuncionLocalServiceUtil.addSolicitudRequerimientoFuncion(requerimientoRequisito);
				} else {
					requerimientoRequisito.setUsuariocrea(reqAct.getUsuariocrea());
					requerimientoRequisito.setFechacrea(reqAct.getFechacrea());
					requerimientoRequisito.setUsuariomodifica(user.getUserId());
					requerimientoRequisito.setFechamodifica(new Date());
					SolicitudRequerimientoFuncionLocalServiceUtil.updateSolicitudRequerimientoFuncion(requerimientoRequisito);
				}
			}
		} catch (SystemException  e) {
			_log.error("registrarFuncionEtiquetas:" + e.getMessage(), e);
		}
	}

	private void registrarRequisitosEtiquetas(SolicitudRequerimientoBean solicitudRequerimiento, User user, long scopeGroupId) {
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
					tag = liferayContentService.nuevaEtiqueta(reqAct.getRequisito(), user,scopeGroupId);
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
				
				if(Validator.isNotNull(reqAct.getAnnos())){
					requerimientoRequisito.setAnnos(reqAct.getAnnos());
				}
				
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
