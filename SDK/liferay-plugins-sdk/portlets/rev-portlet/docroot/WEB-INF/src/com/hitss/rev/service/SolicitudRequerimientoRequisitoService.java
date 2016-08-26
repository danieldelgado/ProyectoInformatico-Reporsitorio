package com.hitss.rev.service;

import java.util.List;

import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.rev.bean.RequisitoEtiquetaBean;
import com.hitss.rev.bean.SolicitudRequerimientoBean;

public interface SolicitudRequerimientoRequisitoService {

	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitosExitentesBeans(SolicitudRequerimientoBean solicitudRequerimiento);
	public List<SolicitudRequerimientoRequisito>  getListaSolicitudRequerimientoRequisitosExitentes(SolicitudRequerimientoBean solicitudRequerimiento);
	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitoActivo(SolicitudRequerimientoBean solicitudRequerimiento);
	public SolicitudRequerimientoRequisito getListaSolicitudRequerimientoRequisitoByIds(long solicitudRequerimientoId, long tagId);

}