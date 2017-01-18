package com.hitss.rev.dools;

import java.util.List;

import com.hitss.layer.model.Postulacion;
import com.hitss.layer.model.Usuario;

public interface ExpertoRevApi {

//	void test();

	List<Usuario> analsisExperto(Long solicitudRequerimientoId, List<Postulacion> lst, List<Usuario> lstUsuariosPostulantes);
	
}
