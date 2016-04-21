package com.hitss.rec.programarentrevista.service;

import java.text.ParseException;
import java.util.List;

import com.hitss.rec.programarentrevista.bean.SolicitudRequerimientoBean;
import com.hitss.rec.programarentrevista.bean.UsuarioEntrevistaBean;
import com.liferay.portal.kernel.exception.SystemException;
import com.rec.hitss.layer.NoSuchRequerimientoRecursoException;

public interface ProgramarEntrevistaService {

	List<SolicitudRequerimientoBean> getListaSolicitudesEntrevista(String puesto, String fechaEmisionInicio, String fechaEmisionFin, String responsable, String tiempoContrato);

	List<UsuarioEntrevistaBean> getListaUusariosEntrevistas(String requerimeintoId) ;

}
