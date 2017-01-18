package com.hitss.rev.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hitss.rev.bean.EvaluacionBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.PuestoEvaluacionBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.liferay.portal.model.User;

public interface PublicarOfertaService {
	List<PuestoBean> getListaPuestos(long groupId, String object);

	List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId);

	List<ParametroBean> getTiempoContrato();

	Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden);

	SolicitudRequerimientoBean getSolicitudRequerimiento(Long solicitudRequerimientoId);

	List<ParametroBean> getTipoNegocio();

	List<ParametroBean> getClientes();

	List<ParametroBean> getListaTipoRequisito();

	List<ParametroBean> getListaAnnos();

	List<ParametroBean> getAreas();

	Map<String, Object>  publicarOfertaLaboral(Long solicitudRequerimientoId, Long scopeGroupId, List<PuestoEvaluacionBean> lista  , String descripcion,int cantidadAnnosRubro, User user, boolean publicar , HttpServletRequest request);

	List<EvaluacionBean>  getEvaluaciones();


}
