package com.hitss.reclutamiento.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.reclutamiento.bean.ComboBean;
import com.hitss.reclutamiento.bean.ParametroBean;
import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.RequisitoEtiquetaBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.bean.UsuarioBean;
import com.hitss.reclutamiento.service.LiferayContentService;
import com.hitss.reclutamiento.service.ParametroService;
import com.hitss.reclutamiento.service.ProgramarEntrevistaService;
import com.hitss.reclutamiento.service.SolicitudRequerimientoRequisitoService;
import com.hitss.reclutamiento.util.Constantes;
import com.hitss.reclutamiento.util.Util;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@Service("ProgramarEntrevistaService")
public class ProgramarEntrevistaServiceImpl implements ProgramarEntrevistaService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);

	@Autowired
	private ParametroService parametroService;

	@Autowired
	private LiferayContentService liferayContentService;

	@Autowired
	private SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;

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
	public Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden) {
		Map<String, Object> result = new HashMap<String, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<SolicitudRequerimientoBean> lista = null;
		SolicitudRequerimiento solicitudRequerimiento = SolicitudRequerimientoLocalServiceUtil.newInstance();
		solicitudRequerimiento.setCategoriaPuestoId(puestoId);
		solicitudRequerimiento.setResponsableRRHH(responsable);
		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
		solicitudRequerimiento.setEstado(Constantes.PARAMETRO_FECHA_LIMITE_POSTULACION);// creo
																						// q
																						// no
																						// debe
																						// ir
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
			solicitudRequerimientoBean.setResponsableRRHH(sr.getResponsableRRHH());
			solicitudRequerimientoBean.setStrresponsableRRHH(UserLocalServiceUtil.getUser(sr.getResponsableRRHH()).getFullName());
			solicitudRequerimientoBean.setPrioridad(sr.getPrioridad());
			solicitudRequerimientoBean.setTiempoContrato(sr.getTiempoContrato());
			solicitudRequerimientoBean.setTipoNegocio(sr.getTipoNegocio());
			solicitudRequerimientoBean.setCliente(sr.getCliente());
			solicitudRequerimientoBean.setEspecialidad(sr.getEspecialidad());
			solicitudRequerimientoBean.setProyecto(sr.getProyecto());
			solicitudRequerimientoBean.setEstado(sr.getEstado());

			List<RequisitoEtiquetaBean> listaSolicitudRequerimientoRequisitosExitentes = solicitudRequerimientoRequisitoService.getListaSolicitudRequerimientoRequisitoActivo(solicitudRequerimientoBean);
			solicitudRequerimientoBean.setRequisitoEtiquetaBeans(listaSolicitudRequerimientoRequisitosExitentes);

			return solicitudRequerimientoBean;

		} catch (PortalException | SystemException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}

		return null;
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

	@Override
	public List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId) {

		 List<UsuarioBean> lstReturn = null;
		try {	
			
			List<Postulacion> lst =  PostulacionLocalServiceUtil.listaPostulacionedsSolicitud(solicitudRequerimientoId);
			long[] userIds = new long[lst.size()];
			for (int i = 0; i < lst.size(); i++) {
				userIds[i] = lst.get(i).getUsuarioId();
			}
			
			if(userIds!=null){
				List<Usuario> lstUsuariosPostulantes = UsuarioLocalServiceUtil.findByUsuariosSeleccionados(userIds);
				if(!lstUsuariosPostulantes.isEmpty()){
					lstReturn =  new ArrayList<UsuarioBean>();
					User user = null;
					UsuarioBean usuarioBean = null;
					Postulacion post = null;
					FasePostulacion fase = null;
					for (Usuario usuario : lstUsuariosPostulantes) {
						user = UserLocalServiceUtil.getUser(usuario.getUserId());	
						for (Postulacion postulacion : lst) {							
							if(postulacion.getUsuarioId() == usuario.getUserId()){
								post = postulacion;
							}
						}				
						fase = FasePostulacionLocalServiceUtil.getLastPostulacion(post.getSolicitudRequerimientoId(), usuario.getUserId());		
						usuarioBean =  new UsuarioBean();
						usuarioBean.setUserId(usuario.getUserId());
						usuarioBean.setFullname(user.getFullName());
						usuarioBean.setDisponibilidad("");
						
						if (Validator.isNotNull(fase)) {
							usuarioBean.setFasePostulacion(fase.getDescripcion());	
							usuarioBean.setFechaPostulacion(Util.getStrFecha(fase.getFechaFase()));
							usuarioBean.setEstado(parametroService.getParametro(fase.getEstado()).getValor());							
						}else{
							usuarioBean.setFasePostulacion(StringPool.BLANK);
							usuarioBean.setFechaPostulacion(StringPool.BLANK);
							usuarioBean.setEstado(parametroService.getParametro(Constantes.PARAMETRO_FASE_POSTULADO).getValor());	
						}
						lstReturn.add(usuarioBean);
					}	
				}
				
			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		} 
		return lstReturn;
	}
}
