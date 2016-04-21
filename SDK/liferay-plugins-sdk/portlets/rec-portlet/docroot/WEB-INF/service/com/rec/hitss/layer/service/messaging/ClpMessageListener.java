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
import com.rec.hitss.layer.service.EvaluacionReclutamientoLocalServiceUtil;
import com.rec.hitss.layer.service.EvaluacionReclutamientoServiceUtil;
import com.rec.hitss.layer.service.FooLocalServiceUtil;
import com.rec.hitss.layer.service.FooServiceUtil;
import com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoLocalServiceUtil;
import com.rec.hitss.layer.service.avanceEstadoSolicitudReclutamientoServiceUtil;
import com.rec.hitss.layer.service.cartillaReclutamientoLocalServiceUtil;
import com.rec.hitss.layer.service.cartillaReclutamientoServiceUtil;
import com.rec.hitss.layer.service.curriculumVitaeLocalServiceUtil;
import com.rec.hitss.layer.service.curriculumVitaeServiceUtil;
import com.rec.hitss.layer.service.fichaIngresoLocalServiceUtil;
import com.rec.hitss.layer.service.fichaIngresoServiceUtil;
import com.rec.hitss.layer.service.nueveCuadrantesLocalServiceUtil;
import com.rec.hitss.layer.service.nueveCuadrantesServiceUtil;
import com.rec.hitss.layer.service.puestosLaboralesLocalServiceUtil;
import com.rec.hitss.layer.service.puestosLaboralesServiceUtil;
import com.rec.hitss.layer.service.requerimientoPersonalLocalServiceUtil;
import com.rec.hitss.layer.service.requerimientoPersonalServiceUtil;
import com.rec.hitss.layer.service.solicitudReclutamientoLocalServiceUtil;
import com.rec.hitss.layer.service.solicitudReclutamientoServiceUtil;

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
			avanceEstadoSolicitudReclutamientoLocalServiceUtil.clearService();

			avanceEstadoSolicitudReclutamientoServiceUtil.clearService();
			cartillaReclutamientoLocalServiceUtil.clearService();

			cartillaReclutamientoServiceUtil.clearService();
			ContratoLocalServiceUtil.clearService();

			ContratoServiceUtil.clearService();
			curriculumVitaeLocalServiceUtil.clearService();

			curriculumVitaeServiceUtil.clearService();
			EvaluacionReclutamientoLocalServiceUtil.clearService();

			EvaluacionReclutamientoServiceUtil.clearService();
			fichaIngresoLocalServiceUtil.clearService();

			fichaIngresoServiceUtil.clearService();
			FooLocalServiceUtil.clearService();

			FooServiceUtil.clearService();
			nueveCuadrantesLocalServiceUtil.clearService();

			nueveCuadrantesServiceUtil.clearService();
			puestosLaboralesLocalServiceUtil.clearService();

			puestosLaboralesServiceUtil.clearService();
			requerimientoPersonalLocalServiceUtil.clearService();

			requerimientoPersonalServiceUtil.clearService();
			solicitudReclutamientoLocalServiceUtil.clearService();

			solicitudReclutamientoServiceUtil.clearService();
		}
	}
}