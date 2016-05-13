package com.hitss.reclutamiento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.reclutamiento.bean.ComboBean;
import com.hitss.reclutamiento.service.LiferayContentService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetTag;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetTagLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

@Service("LiferayContentService")
public class LiferayContentServiceImpl implements LiferayContentService {

	private static Log _log = LogFactoryUtil.getLog(LiferayContentServiceImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<ComboBean> getListarEtiquetas(String filtro) {
		_log.debug("getListarRequisitosTags");
		_log.debug("filtro:" + filtro);
		List<ComboBean> listaComboBeans = new ArrayList<ComboBean>();
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetTag.class, PortalClassLoaderUtil.getClassLoader());
			query.add(PropertyFactoryUtil.forName("name").eq(StringPool.PERCENT + filtro + StringPool.PERCENT));
			List<AssetTag> etiquetas = AssetTagLocalServiceUtil.dynamicQuery(query);
			_log.debug(etiquetas);
			ComboBean c = null;
			for (AssetTag assetTag : etiquetas) {
				c = new ComboBean();
				c.setId(assetTag.getTagId());
				c.setValue(assetTag.getName());
				listaComboBeans.add(c);
			}
		} catch (SystemException e) {
			_log.error("listarPuesto:" + e.getMessage(), e);
		}
		return listaComboBeans;
	}

	@Override
	public ComboBean getEtiqueta(long idtag) {
		_log.debug("getListarRequisitosTags");
		_log.debug("idtag:" + idtag);
		ComboBean c = new ComboBean();
		try {
			AssetTag tag = AssetTagLocalServiceUtil.getAssetTag(idtag);
			_log.debug(tag);
			c.setId(tag.getTagId());
			c.setValue(tag.getName());
		} catch (SystemException | PortalException e) {
			_log.error("listarPuesto:" + e.getMessage(), e);
		}
		return c;
	}

	@Override
	public List<ComboBean> getListarCategorias(long groupId, String vocabulario, String filtroCategoria) {
		_log.debug("getListarCategotias");
		_log.debug("vocabulario:" + vocabulario + " filtroCategoria:" + filtroCategoria);
		List<ComboBean> listaComboBeans = new ArrayList<ComboBean>();
		try {
			AssetVocabulary assetVocabulary = null;
			if (Validator.isNotNull(vocabulario)) {
				assetVocabulary = AssetVocabularyLocalServiceUtil.getGroupVocabulary(groupId, vocabulario);
			}
			
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetCategory.class, PortalClassLoaderUtil.getClassLoader());

			if (Validator.isNotNull(assetVocabulary)) {
				query.add(PropertyFactoryUtil.forName("vocabularyId").eq(assetVocabulary.getVocabularyId()));
			}
			if (Validator.isNotNull(filtroCategoria)) {
				query.add(PropertyFactoryUtil.forName("name").eq(StringPool.PERCENT + filtroCategoria + StringPool.PERCENT));
			}

			List<AssetCategory> categorias = AssetCategoryLocalServiceUtil.dynamicQuery(query);
			_log.debug(categorias);
			ComboBean c = null;
			for (AssetCategory assetCategory : categorias) {
				c = new ComboBean();
				c.setId(assetCategory.getCategoryId());
				c.setValue(assetCategory.getName());
				listaComboBeans.add(c);
			}
		} catch (SystemException | PortalException e) {
			_log.error("listarPuesto:" + e.getMessage(), e);
		}
		return listaComboBeans;
	}

	@Override
	public ComboBean getCategoria(long idcategoria) {
		_log.debug("getListarRequisitosTags");
		_log.debug("idcategoria:" + idcategoria);
		ComboBean c = new ComboBean();
		try {
			AssetCategory tag = AssetCategoryLocalServiceUtil.getAssetCategory(idcategoria);
			_log.debug(tag);
			c.setId(tag.getCategoryId());
			c.setValue(tag.getName());
		} catch (SystemException | PortalException e) {
			_log.error("listarPuesto:" + e.getMessage(), e);
		}
		return c;
	}

	// try {
	//
	// List<User> users = UserLocalServiceUtil.getUsers(0,
	// UserLocalServiceUtil.getUsersCount());
	// ServiceContext serviceContext =
	// ServiceContextFactory.getInstance(request);
	// String notificationText = "test notificacion";
	// for (User user : users) {
	// JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
	// payloadJSON.put("userId", user.getUserId());
	// // payloadJSON.put("customEntityId",user.getUserId());
	// payloadJSON.put("notificationText", notificationText);
	// UserNotificationEventLocalServiceUtil.addUserNotificationEvent(user.getUserId(),
	// BarraUsuarioNotificacionHandler.PORTLET_ID, (new Date()).getTime(),
	// user.getUserId(), payloadJSON.toString(), false, serviceContext);
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	//
	// }

}
