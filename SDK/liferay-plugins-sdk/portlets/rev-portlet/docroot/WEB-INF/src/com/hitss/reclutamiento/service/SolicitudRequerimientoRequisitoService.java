package com.hitss.reclutamiento.service;

import java.util.List;

import com.hitss.layer.model.SolicitudRequerimientoRequisito;
import com.hitss.reclutamiento.bean.RequisitoEtiquetaBean;
import com.hitss.reclutamiento.bean.SolicitudRequerimientoBean;

public interface SolicitudRequerimientoRequisitoService {

	public List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitosExitentesBeans(SolicitudRequerimientoBean solicitudRequerimiento);
	public List<SolicitudRequerimientoRequisito>  getListaSolicitudRequerimientoRequisitosExitentes(SolicitudRequerimientoBean solicitudRequerimiento);
	List<RequisitoEtiquetaBean> getListaSolicitudRequerimientoRequisitoActivo(SolicitudRequerimientoBean solicitudRequerimiento);
	public SolicitudRequerimientoRequisito getListaSolicitudRequerimientoRequisitoByIds(long solicitudRequerimientoId, long tagId);

}
