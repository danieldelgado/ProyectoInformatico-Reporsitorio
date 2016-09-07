package com.hitss.rev.service;

import java.util.List;

import com.hitss.rev.bean.ActividadCronogramaBean;
import com.hitss.rev.bean.ComboBean;
import com.hitss.rev.bean.PrioridadGrupoUsuariosBean;

public interface ActualizarCronogramaService {

	List<ComboBean> getEstados();

	List<PrioridadGrupoUsuariosBean> getListaPrioridadGrupoUsuariosBySolicitud(
			Long solicitudEvaluacionId);

	ActividadCronogramaBean getActividadCronograma(Long solicitudEvaluacionId,
			Long prioridadGrupoUsuariosId, Long cronograma,
			Long actividadCronogramaId, Long grupoUsuario);

}
