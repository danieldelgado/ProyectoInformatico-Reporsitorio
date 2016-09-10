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

package com.hitss.layer.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Danielle Delgado
 */
public class UsuarioFinderUtil {
	public static int getUsuarioPostulantesCount(long solicitudRequerimiento) {
		return getFinder().getUsuarioPostulantesCount(solicitudRequerimiento);
	}

	public static UsuarioFinder getFinder() {
		if (_finder == null) {
			_finder = (UsuarioFinder)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					UsuarioFinder.class.getName());

			ReferenceRegistry.registerReference(UsuarioFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(UsuarioFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(UsuarioFinderUtil.class, "_finder");
	}

	private static UsuarioFinder _finder;
}