package com.hitss.rev.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.SolicitudPostulacionBean;
import com.hitss.rev.bean.UsuarioBean;

public interface RegistrarResultadoPostulanteService {
	
	List<PuestoBean> getListaPuestos(long groupId, String object);

	List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId);

	List<ParametroBean> getTiempoContrato();

	Map<String, Object> listarSolicitudesRequermientoPostulacion(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden);

	SolicitudPostulacionBean getSolicitudPostulacion(Long solicitudId, Long userId);

}