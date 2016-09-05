package com.hitss.rev.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hitss.layer.model.Funcion;
import com.hitss.layer.model.SolicitudEvaluacionDesempenno;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.impl.SolicitudEvaluacionDesempennoImpl;
import com.hitss.layer.service.FuncionLocalServiceUtil;
import com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.bean.FuncionEtiquetaBean;
import com.hitss.rev.bean.ObservacionBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudEvaluacionBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.ObservacionService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public abstract class RevServiceImpl {

	private static Log _log = LogFactoryUtil.getLog(RevServiceImpl.class);

	@Autowired
	protected SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;
	
	@Autowired
	protected ParametroService parametroService;

	@Autowired
	protected LiferayApiService liferayContentService;
	
	@Autowired
	protected ObservacionService observacionService;

	public List<ParametroBean> getTiempoContrato() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIEMPO_CONTRATO);
		return listaTiempoContrato;
	}

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

	public Map<String, Object> listarSolicitudesEvaluacion(String descripcion,
			Date fechaEvaluacionInicio, Date fechaEvaluacionFin, long estado,
			int filas, int pagina, String orden, String campoOrden) {
		Map<String, Object> result = new HashMap<String, Object>();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<SolicitudEvaluacionBean> lista = null;
		SolicitudEvaluacionDesempenno solicitudEvaluacionDesempenno = new SolicitudEvaluacionDesempennoImpl();
		solicitudEvaluacionDesempenno.setDescripcion(descripcion);
		solicitudEvaluacionDesempenno.setEstado(estado);
		int total = 0;
		int records = 0;
		Long count = null;
		try {
			count = SolicitudEvaluacionDesempennoLocalServiceUtil.listaSolicitudEvaluacionCount(solicitudEvaluacionDesempenno, fechaEvaluacionInicio, fechaEvaluacionFin);
			if (count != null && count > 0) {
				int c = count.intValue();
				if (c > 0) {
					total = (c / filas);
				}
				int init = (filas * pagina - filas);
				int fin = init + filas;
				_log.debug("records :" + records + " init:" + init + " fin:" + fin);
				List<SolicitudEvaluacionDesempenno> listaSolicitudRequerimientos = SolicitudEvaluacionDesempennoLocalServiceUtil.listaSolicitudEvaluacion(solicitudEvaluacionDesempenno, fechaEvaluacionInicio, fechaEvaluacionFin, init, fin, orden, campoOrden);
				SolicitudEvaluacionBean solicitudEvaluacionBean = null;
				lista = new ArrayList<SolicitudEvaluacionBean>();
				
				for (SolicitudEvaluacionDesempenno sr : listaSolicitudRequerimientos) {
					solicitudEvaluacionBean = new SolicitudEvaluacionBean();
					solicitudEvaluacionBean.setSolicitudEvaluacionId(sr.getSolicitudEvaluacionDesempennoId());
					solicitudEvaluacionBean.setDescripcion(sr.getDescripcion());
					solicitudEvaluacionBean.setFechaInicioEvaluacion(sr.getFechaInicio());
					solicitudEvaluacionBean.setEstado(sr.getEstado());
					solicitudEvaluacionBean.setStrestado(parametroService.getParametro(sr.getEstado()).getValor());
					lista.add(solicitudEvaluacionBean);
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
				ParametroBean p = null;
				for (SolicitudRequerimiento sr : listaSolicitudRequerimientos) {
					solicitudRequerimientoBean = new SolicitudRequerimientoBean();
					solicitudRequerimientoBean.setSolicitudRequerimientoId(sr.getSolicitudRequerimientoId());
					solicitudRequerimientoBean.setPuestoId(sr.getCategoriaPuestoId());
					solicitudRequerimientoBean.setStrpuesto(liferayContentService.getCategoria(sr.getCategoriaPuestoId()).getValue());
					solicitudRequerimientoBean.setCantidadRecursos(sr.getCantidadRecursos());
					solicitudRequerimientoBean.setAreaSolicitante(sr.getAreaSolicitante());
					if (Validator.isNotNull(sr.getAreaSolicitante())) {
						p = parametroService.getParametro(sr
								.getAreaSolicitante());
						solicitudRequerimientoBean
								.setStrareaSolicitante(p
										.getValor());
					}	else{
						solicitudRequerimientoBean.setStrareaSolicitante("Sin definir");
					}
					solicitudRequerimientoBean.setFechaLimite(sr.getFechaLimite());
					solicitudRequerimientoBean.setStrfechaLimite(sdf.format(sr.getFechaLimite()));
					solicitudRequerimientoBean.setFechacrea(sr.getFechacrea());
					solicitudRequerimientoBean.setStrfechacrea(sdf.format(sr.getFechacrea()));
					solicitudRequerimientoBean.setResponsableRRHH(sr.getResponsableRRHH());
					solicitudRequerimientoBean.setEspecialidad(sr.getEspecialidad());
					solicitudRequerimientoBean.setProyecto(sr.getProyecto());
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


	public List<ParametroBean> getTipoNegocio() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIPO_NEGOCIO);
		return listaTiempoContrato;
	}

	public List<ParametroBean> getClientes() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_CLIENTES);
		return listaTiempoContrato;
	}

	public List<ParametroBean> getAreas() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_AREA);
		return listaTiempoContrato;
	}

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
			solicitudRequerimientoBean.setResponsableRRHH(sr.getResponsableRRHH());
			solicitudRequerimientoBean.setPresupuestoMaximo(solicitudRequerimientoBean.getPresupuestoMaximo());
			solicitudRequerimientoBean.setPresupuestoMinimo(solicitudRequerimientoBean.getPresupuestoMinimo());
			solicitudRequerimientoBean.setStrresponsableRRHH(UserLocalServiceUtil.getUser(sr.getResponsableRRHH()).getFullName());
			solicitudRequerimientoBean.setPrioridad(sr.getPrioridad());
			solicitudRequerimientoBean.setTiempoContrato(sr.getTiempoContrato());
			solicitudRequerimientoBean.setStrtiempoContrato(parametroService.getParametro(sr.getTiempoContrato()).getValor());
			solicitudRequerimientoBean.setTipoNegocio(sr.getTipoNegocio());
			solicitudRequerimientoBean.setStrtipoNegocio(parametroService.getParametro(sr.getTipoNegocio()).getValor());
			solicitudRequerimientoBean.setCliente(sr.getCliente());
			solicitudRequerimientoBean.setEspecialidad(sr.getEspecialidad());
			solicitudRequerimientoBean.setProyecto(sr.getProyecto());
			solicitudRequerimientoBean.setEstado(sr.getEstado());

			List<RequisitoEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = getRequisitos(solicitudRequerimientoBean);			
			_log.info("listaSolicitudRequerimientoRequisitosExitentes");
			_log.info(listaSolicitudRequerimientoRequisitosExitentes);

			List<FuncionEtiquetaBean> listaSolicitudRequerimientoFuncionsExitentes = getFuncions(solicitudRequerimientoBean);			
			_log.info("listaSolicitudRequerimientoFuncionsExitentes");
			_log.info(listaSolicitudRequerimientoFuncionsExitentes);

			solicitudRequerimientoBean.setRequisitoEtiquetaBeans(listaSolicitudRequerimientoRequisitosExitentes);
			solicitudRequerimientoBean.setFuncionEtiquetaBeans(listaSolicitudRequerimientoFuncionsExitentes);
			
			if(sr.getEstado() == Constantes.PARAMETRO_OBSERVADO){
				ObservacionBean observacionBean = observacionService.getObservacion(solicitudRequerimientoId, SolicitudRequerimiento.class.getName());
				solicitudRequerimientoBean.setObservacionBean(observacionBean);
			}
			
			return solicitudRequerimientoBean;

		} catch (PortalException | SystemException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}

		return null;
	}
	
	public List<FuncionEtiquetaBean> getFuncions(
			SolicitudRequerimientoBean solicitudRequerimientoBean) {
		List<FuncionEtiquetaBean> listaSolicitudRequerimientoFuncionsExitentes = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoFuncionActivo(solicitudRequerimientoBean);			
		return listaSolicitudRequerimientoFuncionsExitentes;
	}

	public List<RequisitoEtiquetaBean> getRequisitos(SolicitudRequerimientoBean solicitudRequerimientoBean){
		List<RequisitoEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoRequisitoActivo(solicitudRequerimientoBean);			
		return listaSolicitudRequerimientoRequisitosExitentes;
	}

	public List<ComboBean> getListarEtiquetas(String filtro) {
		return liferayContentService.getListarEtiquetas(filtro);
	}

	public List<ComboBean> getListarPuestosCategorias(long groupId, String filtroCategoria) {
		return liferayContentService.getListarCategorias(groupId, Constantes.VOCABULARIO_PUESTO, filtroCategoria);
	}

	public List<ParametroBean> getListaNiveles() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_NIVEL);
		return listaTiempoContrato;
	}

	public List<ParametroBean> getListaTipoRequisito() {
		List<ParametroBean> listaTiempoContrato = parametroService.getListaParametroGrupo(Constantes.PARAMETRO_PADRE_TIPO_REQUISITO);
		return listaTiempoContrato;
	}

	public String[] getRequistosToTags(List<RequisitoEtiquetaBean> listaRequisitoEtiquetaBeans) {
		String[] t = new String[listaRequisitoEtiquetaBeans.size()];
		RequisitoEtiquetaBean r = null;
		for (int i = 0; i < listaRequisitoEtiquetaBeans.size(); i++) {
			r = listaRequisitoEtiquetaBeans.get(i);			
			t[i] = liferayContentService.getEtiqueta(r.getTagId()).getValue();					
		}		
		return t;
	}

	public List<ComboBean> getFuncionsByDescripcion(String funcion) {
		ComboBean c = null;
		try {
			List<ComboBean> l =  new ArrayList<ComboBean>();
			List<Funcion> lista = FuncionLocalServiceUtil.findByDescripcion(funcion);
			for (Funcion f : lista) {
				c =  new ComboBean();
				c.setId(f.getFuncionId());
				c.setValue(f.getDescripcion());
				c.setDatos(f.getDescripcion());
				l.add(c);
			}
			return l;
		} catch (SystemException e) {
			_log.error("Error al getFuncionsByDescripcion " + e.getMessage(), e);
		}
		return null;
	}

	public List<ComboBean> getEstados() {
		List<ComboBean> listaComboBeans = new ArrayList<ComboBean>();
		ComboBean s1 =  new ComboBean();
		s1.setId(Constantes.PARAMETRO_REGISTRADO);
		s1.setValue(parametroService.getParametro(Constantes.PARAMETRO_REGISTRADO).getValor());
		listaComboBeans.add(s1);
		ComboBean s2 =  new ComboBean();
		s2.setId(Constantes.PARAMETRO_EN_PROCESO);
		s2.setValue(parametroService.getParametro(Constantes.PARAMETRO_EN_PROCESO).getValor());
		listaComboBeans.add(s2);
		ComboBean s3 =  new ComboBean();
		s3.setId(Constantes.PARAMETRO_EVALUACION);
		s3.setValue(parametroService.getParametro(Constantes.PARAMETRO_EVALUACION).getValor());
		listaComboBeans.add(s3);
		ComboBean s4 =  new ComboBean();
		s4.setId(Constantes.PARAMETRO_PLAN_ACCION);
		s4.setValue(parametroService.getParametro(Constantes.PARAMETRO_PLAN_ACCION).getValor());
		listaComboBeans.add(s4);		
		return listaComboBeans;
	}

	
}
