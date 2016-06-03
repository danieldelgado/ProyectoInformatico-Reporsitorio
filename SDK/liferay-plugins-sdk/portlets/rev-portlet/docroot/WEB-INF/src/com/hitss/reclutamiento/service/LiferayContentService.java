package com.hitss.reclutamiento.service;

import java.util.List;

import com.hitss.reclutamiento.bean.ComboBean;
import com.liferay.portal.model.User;
import com.liferay.portlet.asset.model.AssetTag;

public interface LiferayContentService {

	List<ComboBean> getListarEtiquetas(String filtro);
	List<ComboBean> getListarCategorias(long groupId ,String vocabulario ,String filtroCategoria);
	ComboBean getEtiqueta(long idtag);
	ComboBean getCategoria(long idcategoria);
	AssetTag getTagByName(String name);
	AssetTag nuevaEtiqueta(String requisito, User user);

}
