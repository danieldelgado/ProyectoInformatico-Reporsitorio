package com.hitss.rev.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.liferay.portal.model.User;

public interface ActualizarSolicitudReclutamientoService {

	List<PuestoBean> getListaPuestos(long groupId, String filtroCategoria);

	Map<String, Object> guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user, long scopeGroupId);

	List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId);

	List<ParametroBean> getTiempoContrato();

	Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden);

	List<ParametroBean> getTipoNegocio();

	List<ParametroBean> getClientes();

	List<ParametroBean> getAreas();

	SolicitudRequerimientoBean getSolicitudRequerimiento(Long solicitudRequerimientoId);

	Map<String, Object> anularSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user);

	List<ComboBean> getListarEtiquetas(String filtro);
	
	List<ComboBean> getListarPuestosCategorias(long groupId, String filtroCategoria);

	List<ParametroBean> getListaAnnos();

	List<ParametroBean> getListaTipoRequisito();

	
}
