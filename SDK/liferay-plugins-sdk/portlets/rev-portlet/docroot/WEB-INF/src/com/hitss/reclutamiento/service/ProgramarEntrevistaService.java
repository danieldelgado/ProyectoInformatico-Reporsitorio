package com.hitss.reclutamiento.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hitss.reclutamiento.bean.ParametroBean;
import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.bean.UsuarioBean;

public interface ProgramarEntrevistaService {
	List<PuestoBean> getListaPuestos(long groupId, String object);

	List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId);

	List<ParametroBean> getTiempoContrato();

	Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden);
	
	SolicitudRequerimientoBean getSolicitudRequerimiento(Long solicitudRequerimientoId);

	List<ParametroBean> getTipoNegocio();

	List<ParametroBean> getClientes();

	List<ParametroBean> getListaTipoRequisito();

	List<ParametroBean> getListaNiveles();

	List<ParametroBean> getAreas();

	List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId);

}
