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

package com.rec.hitss.layer.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.rec.hitss.layer.service.ActividadPlanLocalServiceUtil;
import com.rec.hitss.layer.service.ActividadPlanServiceUtil;
import com.rec.hitss.layer.service.ActividadesLocalServiceUtil;
import com.rec.hitss.layer.service.ActividadesServiceUtil;
import com.rec.hitss.layer.service.CertificadoLocalServiceUtil;
import com.rec.hitss.layer.service.CertificadoServiceUtil;
import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.ConocimientoLocalServiceUtil;
import com.rec.hitss.layer.service.ConocimientoServiceUtil;
import com.rec.hitss.layer.service.ContratoLocalServiceUtil;
import com.rec.hitss.layer.service.ContratoServiceUtil;
import com.rec.hitss.layer.service.CriteriosEvaluacionLocalServiceUtil;
import com.rec.hitss.layer.service.CriteriosEvaluacionServiceUtil;
import com.rec.hitss.layer.service.CronogramaEvaluacionPersonalLocalServiceUtil;
import com.rec.hitss.layer.service.CronogramaEvaluacionPersonalServiceUtil;
import com.rec.hitss.layer.service.EntrevistaLocalServiceUtil;
import com.rec.hitss.layer.service.EntrevistaServiceUtil;
import com.rec.hitss.layer.service.EstudioLocalServiceUtil;
import com.rec.hitss.layer.service.EstudioServiceUtil;
import com.rec.hitss.layer.service.EtiquetaLocalServiceUtil;
import com.rec.hitss.layer.service.EtiquetaServiceUtil;
import com.rec.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.rec.hitss.layer.service.EvaluacionPreguntaLocalServiceUtil;
import com.rec.hitss.layer.service.EvaluacionPreguntaServiceUtil;
import com.rec.hitss.layer.service.EvaluacionServiceUtil;
import com.rec.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.rec.hitss.layer.service.ExperienciaServiceUtil;
import com.rec.hitss.layer.service.FuncionLocalServiceUtil;
import com.rec.hitss.layer.service.FuncionRequerimientoLocalServiceUtil;
import com.rec.hitss.layer.service.FuncionRequerimientoServiceUtil;
import com.rec.hitss.layer.service.FuncionServiceUtil;
import com.rec.hitss.layer.service.FuncionUsuarioLocalServiceUtil;
import com.rec.hitss.layer.service.FuncionUsuarioServiceUtil;
import com.rec.hitss.layer.service.InformeRetroalimentacionLocalServiceUtil;
import com.rec.hitss.layer.service.InformeRetroalimentacionServiceUtil;
import com.rec.hitss.layer.service.ParametroLocalServiceUtil;
import com.rec.hitss.layer.service.ParametroServiceUtil;
import com.rec.hitss.layer.service.PlanAccionLocalServiceUtil;
import com.rec.hitss.layer.service.PlanAccionServiceUtil;
import com.rec.hitss.layer.service.PreguntaLocalServiceUtil;
import com.rec.hitss.layer.service.PreguntaServiceUtil;
import com.rec.hitss.layer.service.PrioridadEquiposLocalServiceUtil;
import com.rec.hitss.layer.service.PrioridadEquiposServiceUtil;
import com.rec.hitss.layer.service.PuestoLocalServiceUtil;
import com.rec.hitss.layer.service.PuestoServiceUtil;
import com.rec.hitss.layer.service.ReferenciaLocalServiceUtil;
import com.rec.hitss.layer.service.ReferenciaServiceUtil;
import com.rec.hitss.layer.service.RequerimientoRecursoLocalServiceUtil;
import com.rec.hitss.layer.service.RequisitoLocalServiceUtil;
import com.rec.hitss.layer.service.RespuestaLocalServiceUtil;
import com.rec.hitss.layer.service.RespuestaServiceUtil;
import com.rec.hitss.layer.service.ResultadoEvaluacionLocalServiceUtil;
import com.rec.hitss.layer.service.ResultadoEvaluacionServiceUtil;
import com.rec.hitss.layer.service.SolicitudEvaluacionDesempenoLocalServiceUtil;
import com.rec.hitss.layer.service.SolicitudEvaluacionDesempenoServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoPersonalLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioGrupoLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioGrupoServiceUtil;
import com.rec.hitss.layer.service.UsuarioHitssLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioHitssServiceUtil;

/**
 * @author Crossfire
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
			ActividadesLocalServiceUtil.clearService();

			ActividadesServiceUtil.clearService();
			ActividadPlanLocalServiceUtil.clearService();

			ActividadPlanServiceUtil.clearService();
			CertificadoLocalServiceUtil.clearService();

			CertificadoServiceUtil.clearService();
			ConocimientoLocalServiceUtil.clearService();

			ConocimientoServiceUtil.clearService();
			ContratoLocalServiceUtil.clearService();

			ContratoServiceUtil.clearService();
			CriteriosEvaluacionLocalServiceUtil.clearService();

			CriteriosEvaluacionServiceUtil.clearService();
			CronogramaEvaluacionPersonalLocalServiceUtil.clearService();

			CronogramaEvaluacionPersonalServiceUtil.clearService();
			EntrevistaLocalServiceUtil.clearService();

			EntrevistaServiceUtil.clearService();
			EstudioLocalServiceUtil.clearService();

			EstudioServiceUtil.clearService();
			EtiquetaLocalServiceUtil.clearService();

			EtiquetaServiceUtil.clearService();
			EvaluacionLocalServiceUtil.clearService();

			EvaluacionServiceUtil.clearService();
			EvaluacionPreguntaLocalServiceUtil.clearService();

			EvaluacionPreguntaServiceUtil.clearService();
			ExperienciaLocalServiceUtil.clearService();

			ExperienciaServiceUtil.clearService();
			FuncionLocalServiceUtil.clearService();

			FuncionServiceUtil.clearService();
			FuncionRequerimientoLocalServiceUtil.clearService();

			FuncionRequerimientoServiceUtil.clearService();
			FuncionUsuarioLocalServiceUtil.clearService();

			FuncionUsuarioServiceUtil.clearService();
			InformeRetroalimentacionLocalServiceUtil.clearService();

			InformeRetroalimentacionServiceUtil.clearService();
			ParametroLocalServiceUtil.clearService();

			ParametroServiceUtil.clearService();
			PlanAccionLocalServiceUtil.clearService();

			PlanAccionServiceUtil.clearService();
			PreguntaLocalServiceUtil.clearService();

			PreguntaServiceUtil.clearService();
			PrioridadEquiposLocalServiceUtil.clearService();

			PrioridadEquiposServiceUtil.clearService();
			PuestoLocalServiceUtil.clearService();

			PuestoServiceUtil.clearService();
			ReferenciaLocalServiceUtil.clearService();

			ReferenciaServiceUtil.clearService();
			RequerimientoRecursoLocalServiceUtil.clearService();

			RequisitoLocalServiceUtil.clearService();

			RespuestaLocalServiceUtil.clearService();

			RespuestaServiceUtil.clearService();
			ResultadoEvaluacionLocalServiceUtil.clearService();

			ResultadoEvaluacionServiceUtil.clearService();
			SolicitudEvaluacionDesempenoLocalServiceUtil.clearService();

			SolicitudEvaluacionDesempenoServiceUtil.clearService();
			SolicitudRequerimientoPersonalLocalServiceUtil.clearService();

			UsuarioGrupoLocalServiceUtil.clearService();

			UsuarioGrupoServiceUtil.clearService();
			UsuarioHitssLocalServiceUtil.clearService();

			UsuarioHitssServiceUtil.clearService();
		}
	}
}