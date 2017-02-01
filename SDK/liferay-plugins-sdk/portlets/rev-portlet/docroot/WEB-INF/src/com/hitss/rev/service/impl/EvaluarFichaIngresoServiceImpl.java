package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.persistence.PostulacionPK;
import com.hitss.rev.bean.PostulacionBean;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.dools.impl.LogTraza;
import com.hitss.rev.liferay.api.LiferayApiService;
import com.hitss.rev.service.EvaluarFichaIngresoService;
import com.hitss.rev.service.ParametroService;
import com.hitss.rev.service.SolicitudRequerimientoRequisitoService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@Service("EvaluarFichaIngresoService")
public class EvaluarFichaIngresoServiceImpl  extends RevServiceImpl  implements EvaluarFichaIngresoService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);

	@Autowired
	private ParametroService parametroService;

	@Autowired
	private LiferayApiService liferayContentService;

	@Autowired
	private SolicitudRequerimientoRequisitoService solicitudRequerimientoRequisitoService;
	
	@Override
	public List<UsuarioBean> getListaSeleccionados(long companyId, long companyGroupId, Long solicitudRequerimientoId) {
		_log.info("getListaPostulantes");

		List<UsuarioBean> lstReturn = new ArrayList<UsuarioBean>();
		try {
			List<Postulacion> lst = PostulacionLocalServiceUtil.listaPostulacionedsSolicitud(solicitudRequerimientoId);
			Postulacion ppppp = null;
			System.out.println(lst);
			if (!lst.isEmpty()) {

				if (lst != null) {
					if (!lst.isEmpty()) {
						User user = null;
						UsuarioBean usuarioBean = null;
						Postulacion post = null;
						FasePostulacion fase = null;
						PostulacionPK postulacionPK  = null;
						for (Postulacion p : lst) {
							user = UserLocalServiceUtil.getUser(p.getUsuarioId());
							for (Postulacion postulacion : lst) {
								if (postulacion.getUsuarioId() == p.getUsuarioId()) {
									post = postulacion;
								}
							}
							usuarioBean = new UsuarioBean();
							usuarioBean.setUserId(p.getUsuarioId());
							if (Validator.isNotNull(user.getFullName()) && !user.getFullName().equals("")) {
								usuarioBean.setFullname(user.getFullName());
							} else {
								usuarioBean.setFullname(user.getFirstName() + " " + user.getLastName());
							}

							postulacionPK = new PostulacionPK(solicitudRequerimientoId, p.getUsuarioId());
							ppppp = PostulacionLocalServiceUtil.getPostulacion(postulacionPK );
							
							Boolean colaborador = (Boolean) user.getExpandoBridge().getAttribute("Colaborador");
							usuarioBean.setInterno(colaborador ? "Si" : "No");
							Date disponibildad = (Date) user.getExpandoBridge().getAttribute("Disponibilidad");
							usuarioBean.setDisponibilidad(Util.getStrFecha(disponibildad));
							usuarioBean.setFechaPostulacion(Util.getStrFecha(post.getFechaPostulacion()));
							
							usuarioBean.setSeleccionado(ppppp.getSeleccionado());
													
							lstReturn.add(usuarioBean);
						}
					}
				}
			}
		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		_log.info("lstReturn:" + lstReturn);
		return lstReturn;
	}
	

//	@Override
//	public Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		List<SolicitudRequerimientoBean> lista = null;
//		SolicitudRequerimiento solicitudRequerimiento = SolicitudRequerimientoLocalServiceUtil.newInstance();
//		solicitudRequerimiento.setCategoriaPuestoId(puestoId);
//		solicitudRequerimiento.setResponsableRRHH(responsable);
//		solicitudRequerimiento.setTiempoContrato(tiempoContrato);
////		solicitudRequerimiento.setEstado(Constantes.PARAMETRO_REGISTRADO);//creo q no debe ir
//		int total = 0;
//		int records = 0;
//		Long count = null;
//		try {
//			count = SolicitudRequerimientoLocalServiceUtil.listaSolicitudRequerimientoCount(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin);
//			if (count != null && count > 0) {
//				int c = count.intValue();
//				if (c > 0) {
//					total = (c / filas);
//				}
//				int init = (filas * pagina - filas);
//				int fin = init + filas;
//				_log.debug("records :" + records + " init:" + init + " fin:" + fin);
//				List<SolicitudRequerimiento> listaSolicitudRequerimientos = SolicitudRequerimientoLocalServiceUtil.listaSolicitudRequerimiento(solicitudRequerimiento, fechaRegistroInicio, fechaRegistrFin, init, fin, orden, campoOrden);
//				SolicitudRequerimientoBean solicitudRequerimientoBean = null;
//				lista = new ArrayList<SolicitudRequerimientoBean>();
//				for (SolicitudRequerimiento sr : listaSolicitudRequerimientos) {
//					solicitudRequerimientoBean = new SolicitudRequerimientoBean();
//					solicitudRequerimientoBean.setSolicitudRequerimientoId(sr.getSolicitudRequerimientoId());
//					solicitudRequerimientoBean.setPuestoId(sr.getCategoriaPuestoId());
//					solicitudRequerimientoBean.setStrpuesto(liferayContentService.getCategoria(sr.getCategoriaPuestoId()).getValue());
//					solicitudRequerimientoBean.setCantidadRecursos(sr.getCantidadRecursos());
//					solicitudRequerimientoBean.setAreaSolicitante(sr.getAreaSolicitante());
//					solicitudRequerimientoBean.setStrareaSolicitante(parametroService.getParametro(sr.getAreaSolicitante()).getValor());
//					solicitudRequerimientoBean.setFechaLimite(sr.getFechaLimite());
//					solicitudRequerimientoBean.setStrfechaLimite(sdf.format(sr.getFechaLimite()));
//					solicitudRequerimientoBean.setFechacrea(sr.getFechacrea());
//					solicitudRequerimientoBean.setStrfechacrea(sdf.format(sr.getFechacrea()));
//					solicitudRequerimientoBean.setResponsableRRHH(sr.getResponsableRRHH());
//					solicitudRequerimientoBean.setEspecialidad(sr.getEspecialidad());
//					solicitudRequerimientoBean.setProyecto(sr.getProyecto());
//					solicitudRequerimientoBean.setStrresponsableRRHH(UserLocalServiceUtil.getUser(sr.getResponsableRRHH()).getFullName());
//					if (Validator.isNotNull(sr.getPrioridad())) {
//						solicitudRequerimientoBean.setPrioridad(sr.getPrioridad());
//						solicitudRequerimientoBean.setStrprioridad(parametroService.getParametro(sr.getPrioridad()).getValor());
//					} else {
//						solicitudRequerimientoBean.setStrprioridad("Sin definir");
//					}
//					solicitudRequerimientoBean.setTiempoContrato(sr.getTiempoContrato());
//					solicitudRequerimientoBean.setStrtiempoContrato(parametroService.getParametro(sr.getTiempoContrato()).getValor());
//					solicitudRequerimientoBean.setTipoNegocio(sr.getTipoNegocio());
//					solicitudRequerimientoBean.setStrtipoNegocio(parametroService.getParametro(sr.getTipoNegocio()).getValor());
//					solicitudRequerimientoBean.setCliente(sr.getCliente());
//					solicitudRequerimientoBean.setStrcliente(parametroService.getParametro(sr.getCliente()).getValor());
//					solicitudRequerimientoBean.setEstado(sr.getEstado());
//					solicitudRequerimientoBean.setStrestado(parametroService.getParametro(sr.getEstado()).getValor());
//					lista.add(solicitudRequerimientoBean);
//				}
//			}
//		} catch (SystemException | PortalException e) {
//			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
//		}
//		result.put("pagina", pagina);
//		result.put("total", total);
//		if (lista != null) {
//			records = lista.size();
//		}
//		result.put("count", count);
//		result.put("records", records);
//		result.put("lista", lista);
//		return result;
//	}


	

}
