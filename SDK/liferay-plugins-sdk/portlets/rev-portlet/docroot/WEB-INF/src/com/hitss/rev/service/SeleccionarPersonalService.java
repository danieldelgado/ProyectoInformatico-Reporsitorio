package com.hitss.rev.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hitss.rev.bean.ParametroBean;
import com.hitss.rev.bean.PuestoBean;
import com.hitss.rev.bean.UsuarioBean;
import com.liferay.portal.model.User;

public interface SeleccionarPersonalService {
	List<PuestoBean> getListaPuestos(long groupId, String object);
	List<UsuarioBean> getListaResponsable(long companyId, long companyGroupId);
	List<ParametroBean> getTiempoContrato();
	Map<String, Object> listarSolicitudesRequermiento(Long puestoId, Date fechaRegistroInicio, Date fechaRegistrFin, int responsable, int tiempoContrato, int filas, int pagina, String orden, String campoOrden);

	void selectPersonal();
	List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId);
	Map<String, Object> seleccionarPostulaste(Long solicitudId, Long userId, User user);
	UsuarioBean getPostulanteDetalle(Long solicitudId, Long userId);
	Map<String, Object> extenderFechaLimite(Long solicitudId, Date fechaLimite2Val, User user, long scopeGroupId);

}
