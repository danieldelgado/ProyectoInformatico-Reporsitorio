package com.hitss.reclutamiento.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonObject;
import com.hitss.reclutamiento.bean.ParametroBean;
import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.bean.UsuarioBean;
import com.liferay.portal.model.User;

public interface ActualizarSolicitudReclutamientoService {

	List<PuestoBean> getListaPuestos();

	Map<String, Object> guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user);

	List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId);

	List<ParametroBean> getTiempoContrato();

	Map<String, Object>  listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas,
			int pagina, String orden, String campoOrden);

	List<ParametroBean> getTipoNegocio();

	List<ParametroBean> getClientes();

	List<ParametroBean> getAreas();

	SolicitudRequerimientoBean getSolicitudRequerimiento(Long solicitudRequerimientoId);

}
