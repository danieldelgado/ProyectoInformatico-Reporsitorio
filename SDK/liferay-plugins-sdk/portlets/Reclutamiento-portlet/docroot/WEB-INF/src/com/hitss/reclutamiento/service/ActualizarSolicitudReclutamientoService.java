package com.hitss.reclutamiento.service;

import java.util.List;

import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.liferay.portal.model.User;

public interface ActualizarSolicitudReclutamientoService {

	List<PuestoBean> getListaPuestos(PuestoBean pst);

	int guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user);

}
