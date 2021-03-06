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
public class ParametroFinderUtil {
	public static java.util.List<com.hitss.layer.model.Parametro> getParametros() {
		return getFinder().getParametros();
	}

	public static ParametroFinder getFinder() {
		if (_finder == null) {
			_finder = (ParametroFinder)PortletBeanLocatorUtil.locate(com.hitss.layer.service.ClpSerializer.getServletContextName(),
					ParametroFinder.class.getName());

			ReferenceRegistry.registerReference(ParametroFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ParametroFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ParametroFinderUtil.class, "_finder");
	}

	private static ParametroFinder _finder;
}