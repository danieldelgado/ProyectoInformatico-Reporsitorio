package com.hitss.rev.service;

import com.hitss.rev.bean.ObservacionBean;

public interface ObservacionService {

	ObservacionBean getObservacion(long registroId,String tabla);
	
}
