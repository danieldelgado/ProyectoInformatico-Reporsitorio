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

import com.rec.hitss.layer.service.ClpSerializer;
import com.rec.hitss.layer.service.ContratoLocalServiceUtil;
import com.rec.hitss.layer.service.ContratoServiceUtil;
import com.rec.hitss.layer.service.EstudioLocalServiceUtil;
import com.rec.hitss.layer.service.EstudioServiceUtil;
import com.rec.hitss.layer.service.EtiquetaRelacionadaLocalServiceUtil;
import com.rec.hitss.layer.service.EtiquetaRelacionadaServiceUtil;
import com.rec.hitss.layer.service.EvaluacionLocalServiceUtil;
import com.rec.hitss.layer.service.EvaluacionPreguntaLocalServiceUtil;
import com.rec.hitss.layer.service.EvaluacionPreguntaServiceUtil;
import com.rec.hitss.layer.service.EvaluacionServiceUtil;
import com.rec.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.rec.hitss.layer.service.ExperienciaServiceUtil;
import com.rec.hitss.layer.service.FasePostulacionLocalServiceUtil;
import com.rec.hitss.layer.service.FasePostulacionServiceUtil;
import com.rec.hitss.layer.service.FuncionLocalServiceUtil;
import com.rec.hitss.layer.service.FuncionServiceUtil;
import com.rec.hitss.layer.service.PostulacionLocalServiceUtil;
import com.rec.hitss.layer.service.PostulacionServiceUtil;
import com.rec.hitss.layer.service.PreguntaLocalServiceUtil;
import com.rec.hitss.layer.service.PreguntaServiceUtil;
import com.rec.hitss.layer.service.PuestoLocalServiceUtil;
import com.rec.hitss.layer.service.PuestoServiceUtil;
import com.rec.hitss.layer.service.ReferenciaLocalServiceUtil;
import com.rec.hitss.layer.service.ReferenciaServiceUtil;
import com.rec.hitss.layer.service.RequisitoLocalServiceUtil;
import com.rec.hitss.layer.service.RequisitoServiceUtil;
import com.rec.hitss.layer.service.RespuestaLocalServiceUtil;
import com.rec.hitss.layer.service.RespuestaServiceUtil;
import com.rec.hitss.layer.service.ResultadoEvaluacionLocalServiceUtil;
import com.rec.hitss.layer.service.ResultadoEvaluacionServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoLocalServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoRequisitoLocalServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoRequisitoServiceUtil;
import com.rec.hitss.layer.service.SolicitudRequerimientoServiceUtil;
import com.rec.hitss.layer.service.UsuarioLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioRequisitoLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioRequisitoServiceUtil;
import com.rec.hitss.layer.service.UsuarioServiceUtil;

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
			ContratoLocalServiceUtil.clearService();

			ContratoServiceUtil.clearService();
			EstudioLocalServiceUtil.clearService();

			EstudioServiceUtil.clearService();
			EtiquetaRelacionadaLocalServiceUtil.clearService();

			EtiquetaRelacionadaServiceUtil.clearService();
			EvaluacionLocalServiceUtil.clearService();

			EvaluacionServiceUtil.clearService();
			EvaluacionPreguntaLocalServiceUtil.clearService();

			EvaluacionPreguntaServiceUtil.clearService();
			ExperienciaLocalServiceUtil.clearService();

			ExperienciaServiceUtil.clearService();
			FasePostulacionLocalServiceUtil.clearService();

			FasePostulacionServiceUtil.clearService();
			FuncionLocalServiceUtil.clearService();

			FuncionServiceUtil.clearService();
			PostulacionLocalServiceUtil.clearService();

			PostulacionServiceUtil.clearService();
			PreguntaLocalServiceUtil.clearService();

			PreguntaServiceUtil.clearService();
			PuestoLocalServiceUtil.clearService();

			PuestoServiceUtil.clearService();
			ReferenciaLocalServiceUtil.clearService();

			ReferenciaServiceUtil.clearService();
			RequisitoLocalServiceUtil.clearService();

			RequisitoServiceUtil.clearService();
			RespuestaLocalServiceUtil.clearService();

			RespuestaServiceUtil.clearService();
			ResultadoEvaluacionLocalServiceUtil.clearService();

			ResultadoEvaluacionServiceUtil.clearService();
			SolicitudRequerimientoLocalServiceUtil.clearService();

			SolicitudRequerimientoServiceUtil.clearService();
			SolicitudRequerimientoRequisitoLocalServiceUtil.clearService();

			SolicitudRequerimientoRequisitoServiceUtil.clearService();
			UsuarioLocalServiceUtil.clearService();

			UsuarioServiceUtil.clearService();
			UsuarioRequisitoLocalServiceUtil.clearService();

			UsuarioRequisitoServiceUtil.clearService();
		}
	}
}