package com.hitss.reclutamiento.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.reclutamiento.bean.PuestoBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;
import com.hitss.reclutamiento.service.ActualizarSolicitudReclutamientoService;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.rec.hitss.layer.model.Puesto;
import com.rec.hitss.layer.model.SolicitudRequerimiento;
import com.rec.hitss.layer.service.PuestoLocalServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;

@Service("ActualizarSolicitudReclutamientoService")
public class ActualizarSolicitudReclutamientoServiceImp implements ActualizarSolicitudReclutamientoService {

	private static Log _log = LogFactoryUtil.getLog(ActualizarSolicitudReclutamientoServiceImp.class);

	@Override
	public List<PuestoBean> getListaPuestos(PuestoBean pst) {
		List<PuestoBean> puestoBeans = new ArrayList<PuestoBean>();
		try {
			PuestoBean puestoBean = null;
			List<Puesto> listaPuesto = PuestoLocalServiceUtil.findByfiltroDescripcion(pst.getDescripcion());
			_log.debug("listaPuesto:" + listaPuesto);
			for (Puesto p : listaPuesto) {
				puestoBean = new PuestoBean();
				puestoBean.setPuestoId(p.getPuestoId());
				puestoBean.setDescripcion(p.getDescripcion());
				puestoBeans.add(puestoBean);
			}

		} catch (SystemException e) {
			_log.error("listarPuesto:" + e.getMessage(), e);
		}
		return puestoBeans;
	}

	@Override
	public int guardarSolicitudReclutamiento(SolicitudRequerimientoBean solicitudRequerimiento, User user) {

		_log.debug("guardarSolicitudReclutamiento:");
		
		try {
						
			SolicitudRequerimiento sRequerimiento = null;
			
			if(Validator.isNotNull(solicitudRequerimiento.getSolicitudRequerimientoId())){
				_log.debug("actualizar:");
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.getSolicitudRequerimiento(solicitudRequerimiento.getSolicitudRequerimientoId());
				sRequerimiento.setNew(false);
				sRequerimiento.setPuestoId(solicitudRequerimiento.getPuestoId());
				sRequerimiento.setCantidadRecursos(solicitudRequerimiento.getCantidadRecursos());
				sRequerimiento.setAreaSolicitante(solicitudRequerimiento.getAreaSolicitante());
				sRequerimiento.setPuestoId(solicitudRequerimiento.getPuestoId());
				sRequerimiento.setFechaLimite(solicitudRequerimiento.getFechaLimite());
				sRequerimiento.setPresupuestoMinimo(solicitudRequerimiento.getPresupuestoMinimo());
				sRequerimiento.setPresupuestoMaximo(solicitudRequerimiento.getPresupuestoMaximo());				
				sRequerimiento.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
				sRequerimiento.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
				sRequerimiento.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
				sRequerimiento.setCliente(solicitudRequerimiento.getCliente());
				sRequerimiento.setEstado(2);
				
				sRequerimiento.setActivo(true);
				sRequerimiento.setUsuariomodifica(user.getUserId());
				sRequerimiento.setFechacreamodifica(new Date());
				
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.updateSolicitudRequerimiento(sRequerimiento);
				
			}else{
				_log.debug("nuevo:");
				Long id = CounterLocalServiceUtil.increment(SolicitudRequerimiento.class.getName());
				_log.debug("id:"+id);
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.createSolicitudRequerimiento(id);
				sRequerimiento.setNew(true);
				sRequerimiento.setPuestoId(solicitudRequerimiento.getPuestoId());
				sRequerimiento.setCantidadRecursos(solicitudRequerimiento.getCantidadRecursos());
				sRequerimiento.setAreaSolicitante(solicitudRequerimiento.getAreaSolicitante());
				sRequerimiento.setPuestoId(solicitudRequerimiento.getPuestoId());
				sRequerimiento.setFechaLimite(solicitudRequerimiento.getFechaLimite());
				sRequerimiento.setPresupuestoMinimo(solicitudRequerimiento.getPresupuestoMinimo());
				sRequerimiento.setPresupuestoMaximo(solicitudRequerimiento.getPresupuestoMaximo());				
				sRequerimiento.setResponsableRRHH(solicitudRequerimiento.getResponsableRRHH());
				sRequerimiento.setTiempoContrato(solicitudRequerimiento.getTiempoContrato());
				sRequerimiento.setTipoNegocio(solicitudRequerimiento.getTipoNegocio());
				sRequerimiento.setCliente(solicitudRequerimiento.getCliente());
				sRequerimiento.setEstado(2);
				
				sRequerimiento.setActivo(true);
				sRequerimiento.setUsuariocrea(user.getUserId());
				sRequerimiento.setFechacrea(new Date());
				sRequerimiento.setUsuariomodifica(user.getUserId());
				sRequerimiento.setFechacreamodifica(new Date());
				
				_log.debug("antes d");
				sRequerimiento = SolicitudRequerimientoLocalServiceUtil.addSolicitudRequerimiento(sRequerimiento);

				_log.debug("despues d");
				_log.debug(sRequerimiento.getSolicitudRequerimientoId());
				
			}
						
		} catch (SystemException | PortalException e) {
			_log.error("Error al guardar "+ e.getMessage(),e);
		}
		
		return 0;
	}

}
