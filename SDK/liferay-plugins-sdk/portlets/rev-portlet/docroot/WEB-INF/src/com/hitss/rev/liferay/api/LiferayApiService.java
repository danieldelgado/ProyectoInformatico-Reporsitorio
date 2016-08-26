package com.hitss.rev.liferay.api;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hitss.rev.bean.ComboBean;
import com.liferay.portal.model.User;
import com.liferay.portlet.asset.model.AssetTag;

public interface LiferayApiService {

	List<ComboBean> getListarEtiquetas(String filtro);
	List<ComboBean> getListarCategorias(long groupId ,String vocabulario ,String filtroCategoria);
	ComboBean getEtiqueta(long idtag);
	ComboBean getCategoria(long idcategoria);
	AssetTag getTagByName(String name);
	AssetTag nuevaEtiqueta(String requisito, User user);
	String registrarPublicacionContenido(long userId, long groupId,long solicitudRequerimientoId,String[] tagsEtiquetas,  String proyecto , long categoriaPuestoId, String especialidad, long tiempoContrato, long tipoNegocio, long prioridad,
			Date fechaLimite, long presupuestoMaximo, long presupuestoMinimo, long cliente, String descripcion, HttpServletRequest request);

//	List<User> listarPostu
	
	
}
