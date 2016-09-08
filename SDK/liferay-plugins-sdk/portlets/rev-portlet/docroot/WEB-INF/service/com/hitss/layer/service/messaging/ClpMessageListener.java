/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.hitss.layer.service.messaging;

import com.hitss.layer.service.ActividadCronogramaLocalServiceUtil;
import com.hitss.layer.service.ActividadCronogramaServiceUtil;
import com.hitss.layer.service.ActividadPlanAccionUsuarioLocalServiceUtil;
import com.hitss.layer.service.ActividadPlanAccionUsuarioServiceUtil;
import com.hitss.layer.service.ActividadPlanLocalServiceUtil;
import com.hitss.layer.service.ActividadPlanServiceUtil;
import com.hitss.layer.service.ClpSerializer;
import com.hitss.layer.service.ContratoLocalServiceUtil;
import com.hitss.layer.service.ContratoServiceUtil;
import com.hitss.layer.service.CronogramaLocalServiceUtil;
import com.hitss.layer.service.CronogramaServiceUtil;
import com.hitss.layer.service.DetalleRepuestaEvaluacionLocalServiceUtil;
import com.hitss.layer.service.DetalleRepuestaEvaluacionServiceUtil;
import com.hitss.layer.service.DetalleRepuestaReclutamientoLocalServiceUtil;
import com.hitss.layer.service.DetalleRepuestaReclutamientoServiceUtil;
import com.hitss.layer.service.EstudioLocalServiceUtil;
import com.hitss.layer.service.EstudioServiceUtil;
import com.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.hitss.layer.service.EvaluacionPreguntaLocalServiceUtil;
import com.hitss.layer.service.EvaluacionPreguntaServiceUtil;
import com.hitss.layer.service.EvaluacionServiceUtil;
import com.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.hitss.layer.service.ExperienciaServiceUtil;
import com.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.hitss.layer.service.FasePostulacionServiceUtil;
import com.hitss.layer.service.FichaIngresoLocalServiceUtil;
import com.hitss.layer.service.FichaIngresoServiceUtil;
import com.hitss.layer.service.FuncionLocalServiceUtil;
import com.hitss.layer.service.FuncionServiceUtil;
import com.hitss.layer.service.InformeRetroalimentacionLocalServiceUtil;
import com.hitss.layer.service.InformeRetroalimentacionServiceUtil;
import com.hitss.layer.service.LogOperacionesLocalServiceUtil;
import com.hitss.layer.service.LogOperacionesServiceUtil;
import com.hitss.layer.service.ObservacionesLocalServiceUtil;
import com.hitss.layer.service.ObservacionesServiceUtil;
import com.hitss.layer.service.ParametroLocalServiceUtil;
import com.hitss.layer.service.ParametroServiceUtil;
import com.hitss.layer.service.PostulacionLocalServiceUtil;
import com.hitss.layer.service.PostulacionServiceUtil;
import com.hitss.layer.service.PreguntaLocalServiceUtil;
import com.hitss.layer.service.PreguntaRespuestaLocalServiceUtil;
import com.hitss.layer.service.PreguntaRespuestaServiceUtil;
import com.hitss.layer.service.PreguntaServiceUtil;
import com.hitss.layer.service.PrioridadGrupoUsuariosLocalServiceUtil;
import com.hitss.layer.service.PrioridadGrupoUsuariosServiceUtil;
import com.hitss.layer.service.ReferenciaLocalServiceUtil;
import com.hitss.layer.service.ReferenciaServiceUtil;
import com.hitss.layer.service.RespuestaLocalServiceUtil;
import com.hitss.layer.service.RespuestaServiceUtil;
import com.hitss.layer.service.SolicitudEvaluacionDesempennoLocalServiceUtil;
import com.hitss.layer.service.SolicitudEvaluacionDesempennoServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoFuncionLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoFuncionServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoRequisitoServiceUtil;
import com.hitss.layer.service.SolicitudRequerimientoServiceUtil;
import com.hitss.layer.service.UsuarioEvaluacionLocalServiceUtil;
import com.hitss.layer.service.UsuarioEvaluacionServiceUtil;
import com.hitss.layer.service.UsuarioFuncionLocalServiceUtil;
import com.hitss.layer.service.UsuarioFuncionServiceUtil;
import com.hitss.layer.service.UsuarioLocalServiceUtil;
import com.hitss.layer.service.UsuarioRequisitoLocalServiceUtil;
import com.hitss.layer.service.UsuarioRequisitoServiceUtil;
import com.hitss.layer.service.UsuarioServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Danielle Delgado
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ActividadCronogramaLocalServiceUtil.clearService();

			ActividadCronogramaServiceUtil.clearService();
			ActividadPlanLocalServiceUtil.clearService();

			ActividadPlanServiceUtil.clearService();
			ActividadPlanAccionUsuarioLocalServiceUtil.clearService();

			ActividadPlanAccionUsuarioServiceUtil.clearService();
			ContratoLocalServiceUtil.clearService();

			ContratoServiceUtil.clearService();
			CronogramaLocalServiceUtil.clearService();

			CronogramaServiceUtil.clearService();
			DetalleRepuestaEvaluacionLocalServiceUtil.clearService();

			DetalleRepuestaEvaluacionServiceUtil.clearService();
			DetalleRepuestaReclutamientoLocalServiceUtil.clearService();

			DetalleRepuestaReclutamientoServiceUtil.clearService();
			EstudioLocalServiceUtil.clearService();

			EstudioServiceUtil.clearService();
			EvaluacionLocalServiceUtil.clearService();

			EvaluacionServiceUtil.clearService();
			EvaluacionPreguntaLocalServiceUtil.clearService();

			EvaluacionPreguntaServiceUtil.clearService();
			ExperienciaLocalServiceUtil.clearService();

			ExperienciaServiceUtil.clearService();
			FasePostulacionLocalServiceUtil.clearService();

			FasePostulacionServiceUtil.clearService();
			FichaIngresoLocalServiceUtil.clearService();

			FichaIngresoServiceUtil.clearService();
			FuncionLocalServiceUtil.clearService();

			FuncionServiceUtil.clearService();
			InformeRetroalimentacionLocalServiceUtil.clearService();

			InformeRetroalimentacionServiceUtil.clearService();
			LogOperacionesLocalServiceUtil.clearService();

			LogOperacionesServiceUtil.clearService();
			ObservacionesLocalServiceUtil.clearService();

			ObservacionesServiceUtil.clearService();
			ParametroLocalServiceUtil.clearService();

			ParametroServiceUtil.clearService();
			PostulacionLocalServiceUtil.clearService();

			PostulacionServiceUtil.clearService();
			PreguntaLocalServiceUtil.clearService();

			PreguntaServiceUtil.clearService();
			PreguntaRespuestaLocalServiceUtil.clearService();

			PreguntaRespuestaServiceUtil.clearService();
			PrioridadGrupoUsuariosLocalServiceUtil.clearService();

			PrioridadGrupoUsuariosServiceUtil.clearService();
			ReferenciaLocalServiceUtil.clearService();

			ReferenciaServiceUtil.clearService();
			RespuestaLocalServiceUtil.clearService();

			RespuestaServiceUtil.clearService();
			SolicitudEvaluacionDesempennoLocalServiceUtil.clearService();

			SolicitudEvaluacionDesempennoServiceUtil.clearService();
			SolicitudRequerimientoLocalServiceUtil.clearService();

			SolicitudRequerimientoServiceUtil.clearService();
			SolicitudRequerimientoFuncionLocalServiceUtil.clearService();

			SolicitudRequerimientoFuncionServiceUtil.clearService();
			SolicitudRequerimientoRequisitoLocalServiceUtil.clearService();

			SolicitudRequerimientoRequisitoServiceUtil.clearService();
			UsuarioLocalServiceUtil.clearService();

			UsuarioServiceUtil.clearService();
			UsuarioEvaluacionLocalServiceUtil.clearService();

			UsuarioEvaluacionServiceUtil.clearService();
			UsuarioFuncionLocalServiceUtil.clearService();

			UsuarioFuncionServiceUtil.clearService();
			UsuarioRequisitoLocalServiceUtil.clearService();

			UsuarioRequisitoServiceUtil.clearService();
		}
	}
}