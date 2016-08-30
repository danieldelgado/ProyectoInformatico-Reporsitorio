package com.hitss.rev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitss.rev.dools.ExpertoRevApi;
import com.hitss.rev.service.SeleccionarPersonalService;
import com.hitss.rev.util.RevServiceImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Service("SeleccionarPersonalService")
public class SeleccionarPersonalServiceImpl extends RevServiceImpl implements SeleccionarPersonalService {

	private static Log _log = LogFactoryUtil.getLog(SeleccionarPersonalServiceImpl.class);

	@Autowired
	private ExpertoRevApi expertoRevApi;
	
	@Override
	public void selectPersonal() {
		expertoRevApi.test();
		
	}

	
	
	
}
