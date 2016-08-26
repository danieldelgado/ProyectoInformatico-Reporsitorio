package com.hitss.rev.service.impl;

import org.springframework.stereotype.Service;

import com.hitss.layer.NoSuchObservacionesException;
import com.hitss.layer.model.Observaciones;
import com.hitss.layer.service.ObservacionesLocalServiceUtil;
import com.hitss.rev.bean.ObservacionBean;
import com.hitss.rev.service.ObservacionService;
import com.liferay.portal.kernel.exception.SystemException;

@Service("ObservacionService")
public class ObservacionServiceImpl implements ObservacionService {

	@Override
	public ObservacionBean getObservacion(long registroId, String tabla) {		
		Observaciones o = null;
		try {
			o = ObservacionesLocalServiceUtil.getObservacion(registroId, tabla);
		} catch (NoSuchObservacionesException | SystemException e) {
			e.printStackTrace();
		}
		if(o!=null){
			ObservacionBean ob = new ObservacionBean();
			ob.setDescripcion(o.getDescripcion());
			return ob;			
		}		
		return null;
	}
	
	

}
