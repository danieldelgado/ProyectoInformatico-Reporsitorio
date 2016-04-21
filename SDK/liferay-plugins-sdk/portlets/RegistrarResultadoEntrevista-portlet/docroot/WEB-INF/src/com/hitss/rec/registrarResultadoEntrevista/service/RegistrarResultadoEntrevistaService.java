package com.hitss.rec.registrarResultadoEntrevista.service;

import java.util.List;

import com.hitss.rec.registrarResultadoEntrevista.bean.SolicitudRequerimientoBean;
import com.hitss.rec.registrarResultadoEntrevista.bean.UsuarioEntrevistaBean;


public interface RegistrarResultadoEntrevistaService {

	List<SolicitudRequerimientoBean> getListaSolicitudesEntrevista(String puesto, String fechaEmisionInicio, String fechaEmisionFin, String responsable, String tiempoContrato);

	List<UsuarioEntrevistaBean> getListaUusariosEntrevistas(String requerimeintoId);

	
	

	

}
