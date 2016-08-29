package com.hitss.rev.service;

import java.util.List;

import com.hitss.layer.model.SolicitudRequerimientoFuncion;
import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.rev.bean.FuncionEtiquetaBean;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;

public interface SolicitudRequerimientoRequisitoService {

	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitosExitentesBeans(SolicitudRequerimientoBean solicitudRequerimiento);
	public List<FuncionEtiquetaBean> getListaSolicitudRequerimientoFuncionsExitentesBeans(SolicitudRequerimientoBean solicitudRequerimiento);
	
	public List<SolicitudRequerimientoRequisito>  getListaSolicitudRequerimientoRequisitosExitentes(SolicitudRequerimientoBean solicitudRequerimiento);
	public List<SolicitudRequerimientoFuncion>  getListaSolicitudRequerimientoFuncionsExitentes(SolicitudRequerimientoBean solicitudRequerimiento);

	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitoActivo(SolicitudRequerimientoBean solicitudRequerimiento);
	public List<FuncionEtiquetaBean> getListaSolicitudRequerimientoFuncionActivo(SolicitudRequerimientoBean solicitudRequerimiento);

	public SolicitudRequerimientoRequisito getListaSolicitudRequerimientoRequisitoByIds(long solicitudRequerimientoId, long tagId);
	public SolicitudRequerimientoFuncion getListaSolicitudRequerimientoFuncionByIds(long solicitudRequerimientoId, long tagId);

}
