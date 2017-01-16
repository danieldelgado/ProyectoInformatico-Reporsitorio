package com.hitss.rev.dools.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.PuestoEvaluacion;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.service.PuestoEvaluacionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.rev.dools.ExpertoRevApi;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@Component("ExpertoRevApi")
public class ExpertoRevApiImpl implements ExpertoRevApi {

	@Autowired
	private OrderTest orderTest;

	@Override
	public void test() {
		orderTest.test();
	}

	@Override
	public List<Usuario> analsisExperto(Long solicitudRequerimientoId, List<Postulacion> lst, List<Usuario> lstUsuariosPostulantes) {
		List<Usuario> u = new ArrayList<Usuario>();
		try {
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimientoId);
			
			List<PuestoEvaluacion> listaPuestoEvaluacion = PuestoEvaluacionLocalServiceUtil.findByS_ALL(solicitudRequerimientoId);
			
			SolicitudReclutamiento solicitudReclutamiento = null;
			com.hitss.rev.dools.impl.Postulacion pa = null;
			for (Postulacion pst : lst) {
				pa  = new com.hitss.rev.dools.impl.Postulacion();
				pa.setSolicitudReclutamiento(solicitudReclutamiento);
				
				
			}
			
			
			
			
			
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}
		return u;
	}

}
