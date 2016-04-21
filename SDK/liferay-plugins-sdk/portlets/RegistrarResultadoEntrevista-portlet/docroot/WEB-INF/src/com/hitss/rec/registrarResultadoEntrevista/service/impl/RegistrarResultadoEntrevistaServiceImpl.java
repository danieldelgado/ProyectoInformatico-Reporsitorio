package com.hitss.rec.registrarResultadoEntrevista.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.rec.registrarResultadoEntrevista.bean.SolicitudRequerimientoBean;
import com.hitss.rec.registrarResultadoEntrevista.bean.UsuarioEntrevistaBean;
import com.hitss.rec.registrarResultadoEntrevista.service.RegistrarResultadoEntrevistaService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.rec.hitss.layer.model.Puesto;
import com.rec.hitss.layer.model.RequerimientoRecurso;
import com.rec.hitss.layer.model.SolicitudRequerimientoPersonal;
import com.rec.hitss.layer.model.UsuarioHitss;
import com.rec.hitss.layer.service.FuncionLocalService;
import com.rec.hitss.layer.service.FuncionLocalServiceUtil;
import com.rec.hitss.layer.service.ParametroLocalService;
import com.rec.hitss.layer.service.ParametroLocalServiceUtil;
import com.rec.hitss.layer.service.PuestoLocalService;
import com.rec.hitss.layer.service.PuestoLocalServiceUtil;
import com.rec.hitss.layer.service.RequerimientoRecursoLocalService;
import com.rec.hitss.layer.service.RequerimientoRecursoLocalServiceUtil;
import com.rec.hitss.layer.service.RequisitoLocalService;
import com.rec.hitss.layer.service.RequisitoLocalServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalService;
import com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioHitssLocalService;
import com.rec.hitss.layer.service.UsuarioHitssLocalServiceUtil;


@Service("RegistrarResultadoEntrevistaService")
public class RegistrarResultadoEntrevistaServiceImpl implements RegistrarResultadoEntrevistaService {

	
	


	private static Log log = LogFactoryUtil.getLog(RegistrarResultadoEntrevistaServiceImpl.class);

	private static SolicitudRequerimientoPersonalLocalService solicitudRequerimientoPersonalLocalService = SolicitudRequerimientoPersonalLocalServiceUtil.getService();
	private static RequerimientoRecursoLocalService requerimientoRecursoLocalService = RequerimientoRecursoLocalServiceUtil.getService();
	private static RequisitoLocalService requisitoLocalService = RequisitoLocalServiceUtil.getService();
	private static FuncionLocalService funcionLocalService = FuncionLocalServiceUtil.getService();
	private static PuestoLocalService puestoLocalService = PuestoLocalServiceUtil.getService();
	private static UsuarioHitssLocalService usuarioHitssLocalService = UsuarioHitssLocalServiceUtil.getService();
	private static UserLocalService userLocalService = UserLocalServiceUtil.getService();
	private static ParametroLocalService parametroLocalService = ParametroLocalServiceUtil.getService();

	private static Long parametroEstadoRevisado = 51L;

	public List<SolicitudRequerimientoBean> getListaSolicitudesEntrevista(String puesto, String fechaEmisionInicio, String fechaEmisionFin, String responsable,
			String tiempoContrato) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<SolicitudRequerimientoBean> listSolRequerimientoBeans = new ArrayList<SolicitudRequerimientoBean>();
		List<SolicitudRequerimientoPersonal> listSolicitudRequerimientoPersonals = null;

		try {
			Long estadoRevisado = parametroLocalService.getParametro(parametroEstadoRevisado).getParametroId();

			listSolicitudRequerimientoPersonals = solicitudRequerimientoPersonalLocalService.getListaSolicitudesEntrevista(String.valueOf(estadoRevisado), puesto,
					fechaEmisionInicio, fechaEmisionFin, responsable, tiempoContrato);

			if (!listSolicitudRequerimientoPersonals.isEmpty()) {

				SolicitudRequerimientoBean solicitudRequerimientoBean;
				listSolRequerimientoBeans = new ArrayList<SolicitudRequerimientoBean>();

				RequerimientoRecurso requerimientoRecurso = null;

				for (SolicitudRequerimientoPersonal solicitudRequerimientoPersonal : listSolicitudRequerimientoPersonals) {
					solicitudRequerimientoBean = new SolicitudRequerimientoBean();

					solicitudRequerimientoBean.setEstado(parametroLocalService.getParametro(Long.valueOf(solicitudRequerimientoPersonal.getEstado())).getValor());
					solicitudRequerimientoBean.setCargo(parametroLocalService.getParametro(Long.valueOf(solicitudRequerimientoPersonal.getCargo())).getValor());
					solicitudRequerimientoBean.setCodigo(solicitudRequerimientoPersonal.getSolicitudRequerimientoPersonalId() + "");
					solicitudRequerimientoBean.setFechaEmitida(sdf.format(solicitudRequerimientoPersonal.getFechacreamodifica()));
					solicitudRequerimientoBean.setNumero(Long.valueOf(solicitudRequerimientoPersonal.getCantidadRecursos()).intValue());
					solicitudRequerimientoBean.setArearequerida(parametroLocalService.getParametro(solicitudRequerimientoPersonal.getAreaSolicitante()).getValor());
					solicitudRequerimientoBean.setTiempoContrato(parametroLocalService.getParametro(solicitudRequerimientoPersonal.getTiempoContrato()).getValor());

					requerimientoRecurso = requerimientoRecursoLocalService.findByRequerimientoUnique(solicitudRequerimientoPersonal.getSolicitudRequerimientoPersonalId());

					solicitudRequerimientoBean.setRequerimeintoId(requerimientoRecurso.getRequerimientoRecursoId());
					solicitudRequerimientoBean.setEstadoRequerimiento(requerimientoRecurso.getEstado());
					solicitudRequerimientoBean.setFechaMetaIngreso(requerimientoRecurso.getFechaMetaIngreso());
					solicitudRequerimientoBean.setRevisado(requerimientoRecurso.getRevisado());
					solicitudRequerimientoBean.setPrioridad(requerimientoRecurso.getPrioridad());
					solicitudRequerimientoBean.setModalidad(requerimientoRecurso.getModalidad());

					listSolRequerimientoBeans.add(solicitudRequerimientoBean);
				}

			}

		} catch (ParseException | PortalException | SystemException e) {
			log.error(e.getCause(), e);
		}
		return listSolRequerimientoBeans;
	}


	@Override
	public List<UsuarioEntrevistaBean> getListaUusariosEntrevistas(String requerimeintoId) {
		
		UsuarioHitss usuarioHitss = null;
		User user = null;
		UsuarioEntrevistaBean usuarioEntrevistaBean = null;
		List<UsuarioEntrevistaBean> listaUsuarioEntrevistaBeans =  new ArrayList<UsuarioEntrevistaBean>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Role> listRoles = null;
		try {
			List<Puesto> listPuestos = puestoLocalService.findByRequerimientoRecurso(Long.valueOf(requerimeintoId));
			for (Puesto puesto : listPuestos) {
				usuarioHitss = usuarioHitssLocalService.getUsuarioHitss(puesto.getUsuarioHitssId());
				user = userLocalService.getUser(Long.valueOf(usuarioHitss.getUserId()));
				
				usuarioEntrevistaBean = new UsuarioEntrevistaBean();				
				usuarioEntrevistaBean.setUserId(user.getUserId());
				usuarioEntrevistaBean.setFullname(user.getFullName());
				usuarioEntrevistaBean.setFechaPostulancion(sdf.format(puesto.getFechaPostulacion()));
				
				int diasDisponibilidad = (Integer)user.getExpandoBridge().getAttribute("Disponibilidad");
				
				usuarioEntrevistaBean.setDisponibilidad(diasDisponibilidad);
				usuarioEntrevistaBean.setDni((String)user.getExpandoBridge().getAttribute("DNI"));
				
				listRoles = user.getRoles();
				for (Role rol : listRoles) {
					if(rol.getName().equals("ASPIRANTE")||rol.getName().equals("POSTULANTE")){
						usuarioEntrevistaBean.setInterno("No");
						if(Validator.isNotNull(puesto.getFechaEvaluacionPsicologica())){
							usuarioEntrevistaBean.setFase("Evaluación Psicológica");
						} else 
						if(Validator.isNotNull(puesto.getFechaEvalucionTecnica())){
							usuarioEntrevistaBean.setFase("Evaluación Técnica");
						} else 
						if(Validator.isNotNull(puesto.getFechaEntrevistaGerenteArea())){
							usuarioEntrevistaBean.setFase("Entrevista con gerente de área");
						} else 
						if(Validator.isNotNull(puesto.getFechaEvaluacionRRHH())){
							usuarioEntrevistaBean.setFase("Entrevista con RRHH");
						}
						
						if(Validator.isNull(puesto.getFechaEvaluacionRRHH())){
							usuarioEntrevistaBean.setFase("Por Coordinar");
						}
						
					}else{
						if(rol.getName().equals("COLABORADOR")){
							usuarioEntrevistaBean.setInterno("Si");
							if(Validator.isNotNull(puesto.getFechaEntrevistaGerenteArea())){
								usuarioEntrevistaBean.setFase("Entrevista con gerente de área");
							} 
 

							if(Validator.isNull(puesto.getFechaEvaluacionRRHH())){
								usuarioEntrevistaBean.setFase("Por Coordinar");
							}
						}

						
					}
				}
				
				listaUsuarioEntrevistaBeans.add(usuarioEntrevistaBean);
				
			}
		} catch ( PortalException | SystemException | NumberFormatException | ParseException e) {
			log.error(e.getCause(), e);
		}

		return listaUsuarioEntrevistaBeans;
	}
	
}
