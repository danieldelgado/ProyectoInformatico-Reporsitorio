package com.hitss.rev.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hitss.rev.bean.FasePostulacionBean;
import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.liferay.portal.model.User;

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

	FasePostulacionBean getFasePsicologia(Long solicitudId, Long userId);

	FasePostulacionBean getFaseTecnica(Long solicitudId, Long userId);

	FasePostulacionBean getFaseEntreCoodRRHH(Long solicitudId, Long userId);

	FasePostulacionBean getFaseEntreGerenteArea(Long solicitudId, Long userId);

	Map<String, Object> guardarProgramacionEntevista(Long solicitudId,
			Long userId, User user, FasePostulacionBean fasePsicologia,
			FasePostulacionBean faseTecnica,
			FasePostulacionBean faseEntreCoordRRHH,
			FasePostulacionBean faseEntreGerenteArea);

}
