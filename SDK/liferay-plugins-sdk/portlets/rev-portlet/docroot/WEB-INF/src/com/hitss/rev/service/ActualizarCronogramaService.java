package com.hitss.rev.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hitss.rev.bean.ActividadCronogramaBean;
import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.bean.PrioridadGrupoUsuariosBean;
import com.hitss.rev.bean.UsuarioBean;
import com.liferay.portal.model.User;

public interface ActualizarCronogramaService {

	List<ComboBean> getEstados();

	List<PrioridadGrupoUsuariosBean> getListaPrioridadGrupoUsuariosBySolicitud(
			Long solicitudEvaluacionId);

	ActividadCronogramaBean getActividadCronograma(Long solicitudEvaluacionId,
			Long prioridadGrupoUsuariosId, Long cronograma,
			Long actividadCronogramaId, Long grupoUsuario);

	List<UsuarioBean> getListaGerentes(long companyId, long companyGroupId);

	List<UsuarioBean> getListaLideres(long companyId, long companyGroupId);

	Map<String, Object> guardarPlanificar(Long solicitudEvaluacionId, Long cronograma, Long actividadCronogramaId, Long grupoUsuarioId, Long gerenteArea, Long lider,
			String actividad, Date fechaInicioEvalacion, Date fechaFinEvalacion, Date fechaInicioPlanAccion, Date fechaFinPlanAccion, Long prioridadGrupoUsuariosId , User user, long scopeGroupId);

}
