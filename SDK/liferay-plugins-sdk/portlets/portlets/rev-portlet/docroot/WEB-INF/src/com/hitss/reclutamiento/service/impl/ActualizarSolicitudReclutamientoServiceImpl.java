package com.hitss.reclutamiento.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.reclutamiento.bean.ComboBean;
import com.hitss.reclutamiento.bean.ParametroBean;
import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.bean.UsuarioBean;
import com.hitss.reclutamiento.service.ActualizarSolicitudReclutamientoService;
import com.hitss.reclutamiento.service.LiferayContentService;
import com.hitss.reclutamiento.service.ParametroService;
import com.hitss.reclutamiento.util.Constantes;
import com.hitss.reclutamiento.util.PropiedadMensaje;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.portlet.PortletProps;

@Service("ActualizarSolicitudReclutamientoService")
public class ActualizarSolicitudReclutamientoServiceImpl implements ActualizarSolicitudReclutamientoService {

	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudReclutamientoServiceImpl.class);

	@Autowired
	private ParametroService parametroService;

	@Autowired
	private LiferayContentService liferayContentService;

	@Override
	public List<ParametroBean> getTiempoContrato() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIEMPO_CONTRATO);
		return listaTiempoContrato;
	}

	@Override
	public List<PuestoBean> getListaPuestos(long groupId, String filtroCategoria) {
		List<PuestoBean> puestoBeans = new ArrayList<PuestoBean>();

		PuestoBean puestoBean = null;
		List<ComboBean> listaPuesto = liferayContentService.getListarCategorias(groupId, Constantes.VOCABULARIO_PUESTO, filtroCategoria);
		_log.debug("listaPuesto:" + listaPuesto);
		for (ComboBean p : listaPuesto) {
			puestoBean = new PuestoBean();
			puestoBean.setPuestoId(p.getId());
			puestoBean.setDescripcion(p.getValue());
			puestoBeans.add(puestoBean);
		}

		return puestoBeans;
	}

	@Override
	public List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId) {
		List<UsuarioBean> listaUsuarioBeans = new ArrayList<UsuarioBean>();
		try {
			UsuarioBean ub = null;
			List<User> listaUser = UsuarioLocalServiceUtil.listarUsuariosByRole(companyId, companyGroupId, "COORDINADOR DE RRHH");
			_log.debug("listaUser:" + listaUser);
			for (User u : listaUser) {
				ub = new UsuarioBean();
				ub.setUserId(u.getUserId());
				ub.setFullname(u.getFullName());
				listaUsuarioBeans.add(ub);
			}
		} catch (PortalException | SystemException e) {
			_log.error("getListaResponsable:" + e.getMessage(), e);
		}
		return listaUsuarioBeans;
	}

	@Override
	public Map<String, Object> guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user) {
		_log.debug("guardarSolicitudReclutamiento:");
		Map<String, Object> result = new HashMap<String, Object>();
		try {

			SolicitudRequerimiento sRequerimiento = null;

			if (Validator.isNotNull(solicitudRequerimiento.getSolicitudRequerimientoId())) {
				_log.debug("actualizar:");
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimiento.getSolicitudRequerimientoId());

				if (sRequerimiento.getEstado() == Constantes.PARAMETRO_REGISTRADO || sRequerimiento.getEstado() == Constantes.PARAMETRO_REVISADO) {
					sRequerimiento.setNew(false);
					sRequerimiento.setCategoriaPuestoId(solicitudRequerimiento.getPuestoId());
					sRequerimiento.setCantidadRecursos(solicitudRequerimiento.getCantidadRecursos());
					sRequerimiento.setAreaSolicitante(solicitudRequerimiento.getAreaSolicitante());
					sRequerimiento.setFechaLimite(solicitudRequerimiento.getFechaLimite());
					sRequerimiento.setPresupuestoMinimo(solicitudRequerimiento.getPresupuestoMinimo());
					sRequerimiento.setPresupuestoMaximo(solicitudRequerimiento.getPresupuestoMaximo());
					sRequerimiento.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
					sRequerimiento.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
					sRequerimiento.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
					sRequerimiento.setCliente(solicitudRequerimiento.getCliente());

					sRequerimiento.setActivo(true);
					sRequerimiento.setUsuariomodifica(user.getUserId());
					sRequerimiento.setFechacreamodifica(new Date());

					sRequerimiento = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sRequerimiento);
					solicitudRequerimiento.setSolicitudRequerimientoId(sRequerimiento.getSolicitudRequerimientoId());
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
				sRequerimiento.setFechaLimite(solicitudRequerimiento.getFechaLimite());
				sRequerimiento.setPresupuestoMinimo(solicitudRequerimiento.getPresupuestoMinimo());
				sRequerimiento.setPresupuestoMaximo(solicitudRequerimiento.getPresupuestoMaximo());
				sRequerimiento.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
				sRequerimiento.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
				sRequerimiento.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
				sRequerimiento.setCliente(solicitudRequerimiento.getCliente());
				sRequerimiento.setEstado(parametroService.getParametro(Constantes.PARAMETRO_REGISTRADO).getParametroId());

				sRequerimiento.setActivo(true);
				sRequerimiento.setUsuariocrea(user.getUserId());
				sRequerimiento.setFechacrea(new Date());
				sRequerimiento.setUsuariomodifica(user.getUserId());
				sRequerimiento.setFechacreamodifica(new Date());
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.addSolicitudRequerimiento(sRequerimiento);
				solicitudRequerimiento.setSolicitudRequerimientoId(sRequerimiento.getSolicitudRequerimientoId());
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
					sr.setFechacreamodifica(new Date());
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

	@Override
	public Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden) {
		Map<String, Object> result = new HashMap<String, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<SolicitudRequerimientoBean> lista = null;
		SolicitudRequerimiento solicitudRequerimiento = SolicitudRequerimientoLocalServiceUtil.newInstance();
		solicitudRequerimiento.setCategoriaPuestoId(puestoId);
		solicitudRequerimiento.setResponsableRRHH(responsable);
		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
		int total = 0;
		int records = 0;
		Long count = null;
		try {
			count = SolicitudRequerimientoLocalServiceUtil.listaSolicitudRequerimientoCount(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin);
			if (count != null && count > 0) {
				int c = count.intValue();
				if (c > 0) {
					total = (c / filas);
				}
				int init = (filas * pagina - filas);
				int fin = init + filas;
				_log.debug("records :" + records + " init:" + init + " fin:" + fin);
				List<SolicitudRequerimiento> listaSolicitudRequerimientos = SolicitudRequerimientoLocalServiceUtil.listaSolicitudRequerimiento(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin, init, fin, orden, campoOrden);
				SolicitudRequerimientoBean solicitudRequerimientoBean = null;
				lista = new ArrayList<SolicitudRequerimientoBean>();
				for (SolicitudRequerimiento sr : listaSolicitudRequerimientos) {
					solicitudRequerimientoBean = new SolicitudRequerimientoBean();
					solicitudRequerimientoBean.setSolicitudRequerimientoId(sr.getSolicitudRequerimientoId());
					solicitudRequerimientoBean.setPuestoId(sr.getCategoriaPuestoId());
					solicitudRequerimientoBean.setStrpuesto(liferayContentService.getCategoria(sr.getCategoriaPuestoId()).getValue());
					solicitudRequerimientoBean.setCantidadRecursos(sr.getCantidadRecursos());
					solicitudRequerimientoBean.setAreaSolicitante(sr.getAreaSolicitante());
					solicitudRequerimientoBean.setStrareaSolicitante(parametroService.getParametro(sr.getAreaSolicitante()).getValor());
					solicitudRequerimientoBean.setFechaLimite(sr.getFechaLimite());
					solicitudRequerimientoBean.setStrfechaLimite(sdf.format(sr.getFechaLimite()));
					solicitudRequerimientoBean.setFechacrea(sr.getFechacrea());
					solicitudRequerimientoBean.setStrfechacrea(sdf.format(sr.getFechacrea()));
					solicitudRequerimientoBean.setPresupuestoMinimo(sr.getPresupuestoMinimo());
					solicitudRequerimientoBean.setPresupuestoMaximo(sr.getPresupuestoMaximo());
					solicitudRequerimientoBean.setResponsableRRHH(sr.getResponsableRRHH());
					solicitudRequerimientoBean.setStrresponsableRRHH(UserLocalServiceUtil.getUser(sr.getResponsableRRHH()).getFullName());
					if (Validator.isNotNull(sr.getPrioridad())) {
						solicitudRequerimientoBean.setPrioridad(sr.getPrioridad());
						solicitudRequerimientoBean.setStrprioridad(parametroService.getParametro(sr.getPrioridad()).getValor());
					} else {
						solicitudRequerimientoBean.setStrprioridad("Sin definir");
					}
					solicitudRequerimientoBean.setTiempoContrato(sr.getTiempoContrato());
					solicitudRequerimientoBean.setStrtiempoContrato(parametroService.getParametro(sr.getTiempoContrato()).getValor());
					solicitudRequerimientoBean.setTipoNegocio(sr.getTipoNegocio());
					solicitudRequerimientoBean.setStrtipoNegocio(parametroService.getParametro(sr.getTipoNegocio()).getValor());
					solicitudRequerimientoBean.setCliente(sr.getCliente());
					solicitudRequerimientoBean.setStrcliente(parametroService.getParametro(sr.getCliente()).getValor());
					solicitudRequerimientoBean.setEstado(sr.getEstado());
					solicitudRequerimientoBean.setStrestado(parametroService.getParametro(sr.getEstado()).getValor());
					lista.add(solicitudRequerimientoBean);
				}
			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		result.put("pagina", pagina);
		result.put("total", total);
		if (lista != null) {
			records = lista.size();
		}
		result.put("count", count);
		result.put("records", records);
		result.put("lista", lista);
		return result;
	}

	@Override
	public List<ParametroBean> getTipoNegocio() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIPO_NEGOCIO);
		return listaTiempoContrato;
	}

	@Override
	public List<ParametroBean> getClientes() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_CLIENTES);
		return listaTiempoContrato;
	}

	@Override
	public List<ParametroBean> getAreas() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_AREA);
		return listaTiempoContrato;
	}

	@Override
	public SolicitudRequerimientoBean getSolicitudRequerimiento(Long solicitudRequerimientoId) {
		SolicitudRequerimientoBean solicitudRequerimientoBean = new SolicitudRequerimientoBean();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimientoId);
			solicitudRequerimientoBean.setSolicitudRequerimientoId(sr.getSolicitudRequerimientoId());
			solicitudRequerimientoBean.setPuestoId(sr.getCategoriaPuestoId());
			solicitudRequerimientoBean.setStrpuesto(liferayContentService.getCategoria(sr.getCategoriaPuestoId()).getValue());
			solicitudRequerimientoBean.setCantidadRecursos(sr.getCantidadRecursos());
			solicitudRequerimientoBean.setAreaSolicitante(sr.getAreaSolicitante());
			solicitudRequerimientoBean.setFechaLimite(sr.getFechaLimite());
			solicitudRequerimientoBean.setStrfechaLimite(sdf.format(sr.getFechaLimite()));
			solicitudRequerimientoBean.setFechacrea(sr.getFechacrea());
			solicitudRequerimientoBean.setStrfechacrea(sdf.format(sr.getFechacrea()));
			solicitudRequerimientoBean.setPresupuestoMinimo(sr.getPresupuestoMinimo());
			solicitudRequerimientoBean.setPresupuestoMaximo(sr.getPresupuestoMaximo());
			solicitudRequerimientoBean.setResponsableRRHH(sr.getResponsableRRHH());
			solicitudRequerimientoBean.setStrresponsableRRHH(UserLocalServiceUtil.getUser(sr.getResponsableRRHH()).getFullName());
			solicitudRequerimientoBean.setPrioridad(sr.getPrioridad());
			solicitudRequerimientoBean.setTiempoContrato(sr.getTiempoContrato());
			solicitudRequerimientoBean.setTipoNegocio(sr.getTipoNegocio());
			solicitudRequerimientoBean.setCliente(sr.getCliente());
			solicitudRequerimientoBean.setEstado(sr.getEstado());

			return solicitudRequerimientoBean;

		} catch (PortalException | SystemException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}

		return null;
	}

	@Override
	public List<ComboBean> getListarEtiquetas(String filtro) {
		return liferayContentService.getListarEtiquetas(filtro);
	}

	@Override
	public List<ComboBean> getListarPuestosCategorias(long groupId, String filtroCategoria) {
		return liferayContentService.getListarCategorias(groupId, Constantes.VOCABULARIO_PUESTO, filtroCategoria);
	}

	@Override
	public List<ParametroBean> getListaNiveles() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_NIVEL);
		return listaTiempoContrato;
	}

	@Override
	public List<ParametroBean> getListaTipoRequisito() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIPO_REQUISITO);
		return listaTiempoContrato;
	}

}