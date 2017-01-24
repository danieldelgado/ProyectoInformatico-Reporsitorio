package com.hitss.rev.dools;

import java.util.List;

import com.hitss.layer.model.Postulacion;
import com.hitss.rev.bean.PostulacionBean;

public interface ExpertoRevApi {

//	void test();

	List<PostulacionBean> analsisExperto(Long solicitudRequerimientoId, List<Postulacion> lst);
	
}
