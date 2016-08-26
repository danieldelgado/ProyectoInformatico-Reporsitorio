package com.hitss.rev.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.layer.model.FasePostulacion;
import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.Usuario;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.rev.bean.UsuarioBean;
import com.hitss.rev.service.ProgramarEntrevistaService;
import com.hitss.rev.util.Constantes;
import com.hitss.rev.util.RevServiceImpl;
import com.hitss.rev.util.Util;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@Service("ProgramarEntrevistaService")
public class ProgramarEntrevistaServiceImpl extends RevServiceImpl implements ProgramarEntrevistaService {

	private static Log _log = LogFactoryUtil.getLog(EvaluarSolicitudRequerimientoServiceImpl.class);

	

	@Override
	public List<UsuarioBean> getListaPostulantes(long companyId, long companyGroupId, Long solicitudRequerimientoId) {
		_log.info("solicitudRequerimientoId:"+solicitudRequerimientoId);
		List<UsuarioBean> lstReturn = new ArrayList<UsuarioBean>();
		try {

			List<Postulacion> lst = PostulacionLocalServiceUtil.listaPostulacionedsSolicitud(solicitudRequerimientoId);
			_log.info("lst:"+lst);
			if (!lst.isEmpty()) {
				long[] userIds = new long[lst.size()];
				for (int i = 0; i < lst.size(); i++) {
					userIds[i] = lst.get(i).getUsuarioId();
				}

				if (userIds != null) {
					List<Usuario> lstUsuariosPostulantes = UsuarioLocalServiceUtil.findByUsuariosSeleccionados(userIds);
					if (!lstUsuariosPostulantes.isEmpty()) {
						
						User user = null;
						UsuarioBean usuarioBean = null;
						Postulacion post = null;
						FasePostulacion fase = null;
						for (Usuario usuario : lstUsuariosPostulantes) {
							user = UserLocalServiceUtil.getUser(usuario.getUserId());
							for (Postulacion postulacion : lst) {
								if (postulacion.getUsuarioId() == usuario.getUserId()) {
									post = postulacion;
								}
							}
							_log.info("post:"+post);
							_log.info("post.getSolicitudRequerimientoId():"+post.getSolicitudRequerimientoId());
							_log.info("usuario.getUserId():"+usuario.getUserId());
							fase = FasePostulacionLocalServiceUtil.getLastPostulacion(post.getSolicitudRequerimientoId(), usuario.getUserId());
							usuarioBean = new UsuarioBean();
							usuarioBean.setUserId(usuario.getUserId());
							usuarioBean.setFullname(user.getFullName());
							usuarioBean.setDisponibilidad("");

							if (Validator.isNotNull(fase)) {
								usuarioBean.setFasePostulacion(fase.getDescripcion());
								usuarioBean.setFechaPostulacion(Util.getStrFecha(fase.getFechaFase()));
								usuarioBean.setEstado(parametroService.getParametro(fase.getEstado()).getValor());
							} else {
								usuarioBean.setFasePostulacion(StringPool.BLANK);
								usuarioBean.setFechaPostulacion(StringPool.BLANK);
								usuarioBean.setEstado(parametroService.getParametro(Constantes.PARAMETRO_FASE_POSTULADO).getValor());
							}
							lstReturn.add(usuarioBean);
						}
					}

				}

			}

		} catch (SystemException | PortalException e) {
			_log.error("Error al listarSolicitudesRequermiento " + e.getMessage(), e);
		}
		return lstReturn;
	}
}
