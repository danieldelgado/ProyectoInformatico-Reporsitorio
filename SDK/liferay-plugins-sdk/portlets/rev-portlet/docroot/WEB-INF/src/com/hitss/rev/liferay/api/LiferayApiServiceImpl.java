package com.hitss.rev.liferay.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hitss.rev.bean.ComboBean;
import com.liferay.counter.service.CounterLocalServiceUtil;
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
import com.liferay.portal.model.User;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetTag;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetTagLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;

@SuppressWarnings("unchecked")
@Service("LiferayContentService")
public class LiferayApiServiceImpl implements LiferayApiService {

	private static Log _log = LogFactoryUtil.getLog(LiferayApiServiceImpl.class);

	@Override
	public List<ComboBean> getListarEtiquetas(String filtro) {
		_log.debug("getListarRequisitosTags");
		_log.debug("filtro:" + filtro);
		List<ComboBean> listaComboBeans = new ArrayList<ComboBean>();
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetTag.class, PortalClassLoaderUtil.getClassLoader());
			query.add(PropertyFactoryUtil.forName("name").like(StringPool.PERCENT + filtro + StringPool.PERCENT));
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

	public AssetTag getTagByName(String name) {
		_log.debug("getTagByName");
		_log.debug("name:" + name);

		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetTag.class, PortalClassLoaderUtil.getClassLoader());
			query.add(PropertyFactoryUtil.forName("name").eq(name));
			List<AssetTag> etiquetas = AssetTagLocalServiceUtil.dynamicQuery(query);
			if(!etiquetas.isEmpty()){
				AssetTag etiqueta = etiquetas.get(0);
				return etiqueta;
			}			
		} catch (SystemException e) {
			_log.error("getTagByName:" + e.getMessage(), e);
		}
		return null;
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

	@Override
	public AssetTag nuevaEtiqueta(String requisito, User user) {
		AssetTag t = null;
		try {
			Long id = CounterLocalServiceUtil.increment(AssetTag.class.getName());
			t = AssetTagLocalServiceUtil.createAssetTag(id);
			t.setNew(true);
			t.setUserName(user.getFullName());
			t.setName(requisito);
			t.setGroupId(user.getGroupId());
			t.setCompanyId(user.getCompanyId());
			t.setCreateDate(new Date());
			t.setModifiedDate(new Date());
			t.setUserId(user.getUserId());
			t.setUserUuid(user.getUuid());			
			t = AssetTagLocalServiceUtil.addAssetTag(t);			
			return t;
		} catch (SystemException | PortalException e) {
			_log.error("nuevaEtiqueta:" + e.getMessage(), e);
		}
		return null;
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
