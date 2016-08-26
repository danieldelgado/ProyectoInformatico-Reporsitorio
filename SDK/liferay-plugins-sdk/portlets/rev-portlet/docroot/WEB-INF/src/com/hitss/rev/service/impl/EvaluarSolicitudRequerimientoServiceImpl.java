package com.hitss.rev.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.Observaciones;
import com.hitss.layer.model.SolicitudRequerimiento;
import com.hitss.layer.service.ObservacionesLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.rev.bean.SolicitudRequerimientoBean;
import com.hitss.rev.service.EvaluarSolicitudRequerimientoService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;

@Service("EvaluarSolicitudRequerimientoService")
public class EvaluarSolicitudRequerimientoServiceImpl extends RevServiceImpl implements EvaluarSolicitudRequerimientoService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);


	@Override
	public SolicitudRequerimientoBean evaluarSolicitudRequerimiento(boolean solicitudAprobada, Long solicitudRequerimientoId, Double presupuestoMinimo, Double presupuestoMaximo, String motivoRechazo,User user) {
		try {
			SolicitudRequerimiento sr = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimientoId);
			if(solicitudAprobada){
				sr.setPresupuestoMinimo(presupuestoMinimo.longValue());
				sr.setPresupuestoMaximo(presupuestoMaximo.longValue());
				sr.setEstado(Constantes.PARAMETRO_APROBADO);
			}else{
				Long id = CounterLocalServiceUtil.increment(Observaciones.class.getName());				
				Observaciones o = ObservacionesLocalServiceUtil.createObservaciones(id);
				o.setActivo(Constantes.ACTIVO);
				o.setDescripcion(motivoRechazo);
				o.setRegistroId(sr.getSolicitudRequerimientoId());
				o.setTabla(SolicitudRequerimiento.class.getName());
				o.setNew(true);
				o.setUsuariocrea(user.getUserId());
				o.setFechacrea(new Date());
				o.setUsuariomodifica(user.getUserId());
				o.setFechamodifica(new Date());
				ObservacionesLocalServiceUtil.addObservaciones(o);
				sr.setEstado(Constantes.PARAMETRO_OBSERVADO);
				sr.setMotivo(motivoRechazo);				
			}
			sr.setNew(false);
			sr.setUsuariomodifica(user.getUserId());
			sr.setFechamodifica(new Date());
			sr = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sr);
			return getSolicitudRequerimiento(solicitudRequerimientoId);
		} catch (PortalException | SystemException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		return null;
	}
	
	
}
