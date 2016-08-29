package com.hitss.rev.liferay.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetTag;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetEntryServiceUtil;
import com.liferay.portlet.asset.service.AssetTagLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;
import com.liferay.portlet.asset.service.persistence.AssetEntryQuery;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;
import com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleResource;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portlet.journal.service.JournalArticleResourceLocalServiceUtil;

@SuppressWarnings("unchecked")
@Service("LiferayApiService")
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
			if (!etiquetas.isEmpty()) {
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
	public AssetTag nuevaEtiqueta(String requisito, User user,long scopeGroupId) {
		AssetTag t = null;
		try {
			Long id = CounterLocalServiceUtil.increment(AssetTag.class.getName());
			t = AssetTagLocalServiceUtil.createAssetTag(id);
			t.setNew(true);
			t.setUserName(user.getFullName());
			t.setName(requisito);
			t.setGroupId(scopeGroupId);
			t.setCompanyId(user.getCompanyId());
			t.setCreateDate(new Date());
			t.setModifiedDate(new Date());
			t.setUserId(user.getUserId());
			t.setUserUuid(user.getUuid());
			t = AssetTagLocalServiceUtil.addAssetTag(t);
			return t;
		} catch (SystemException  e) {
			_log.error("nuevaEtiqueta:" + e.getMessage(), e);
		}
		return null;
	}

	@Override
	public String registrarPublicacionContenido(long userId, long groupId, long solicitudRequerimientoId, String[] tagsEtiquetas, String proyecto, long categoriaPuestoId, String especialidad,
			long tiempoContrato, long tipoNegocio, long prioridad, Date fechaLimite, long presupuestoMaximo, long presupuestoMinimo, long cliente, String descripcion,
			HttpServletRequest request) {
		JournalArticle journalArticle = null;
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(request);
			AssetCategory tag = AssetCategoryLocalServiceUtil.getAssetCategory(categoriaPuestoId);			
			String title = tag.getName() + " " + proyecto;
			Locale locale = LocaleUtil.getDefault();
			Map<Locale, String> titleMap = new HashMap<Locale, String>();
			titleMap.put(locale, title);			
			descripcion = getContent(descripcion);
			journalArticle = JournalArticleLocalServiceUtil.addArticle(userId, groupId, 0, titleMap, null, descripcion, StringPool.BLANK,
					StringPool.BLANK, 
					serviceContext);			
			long[] assetCategoryIds = {categoriaPuestoId};
			JournalArticleLocalServiceUtil.updateAsset(userId, journalArticle, assetCategoryIds, tagsEtiquetas, null);						
			return journalArticle.getArticleId();
		} catch (PortalException e) {
			System.err.println("Failed to add aticle.1");
			_log.error(e.getMessage(), e);
		} catch (Exception e) {
			System.err.println("Failed to add aticle.2");
			_log.error(e.getMessage(), e);
		}

		return null;

	}

	public String getContent(String content){
		return "<?xml version=\"1.0\"?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><static-content language-id=\"es_ES\"><![CDATA["+content+"]]></static-content></root>";
	}

	
	public static List<JournalArticle> getSelectedWebContents(List<AssetEntry> assetEntries) {
		List<JournalArticle> journalArticles = new ArrayList<JournalArticle>();
		JournalArticleResource journalArticleResource = null;
		JournalArticle journalArticle = null;
		for (AssetEntry entry : assetEntries) {
			try {
				journalArticleResource = JournalArticleResourceLocalServiceUtil.getJournalArticleResource(entry.getClassPK());
				journalArticle = JournalArticleLocalServiceUtil.getLatestArticle(journalArticleResource.getResourcePrimKey());
			} catch (Exception e) {
				e.printStackTrace();
			}
			journalArticles.add(journalArticle);
		}
		return journalArticles;
	}

	public static List<AssetEntry> getSelectedAssetEntry(List<String> categoryName) {
		List<AssetEntry> assetEntry = new ArrayList<AssetEntry>();
		try {
			AssetEntryQuery assetEntryQuery = new AssetEntryQuery();
			// assetEntryQuery.setAnyCategoryIds(getCategoryIdByName(categoryName));//
			// Represent Any ie OR
			assetEntryQuery.setAllCategoryIds(getCategoryIdByName(categoryName)); // Represent
																					// Both
																					// ie
																					// AND
			assetEntryQuery.setClassName(JournalArticle.class.getName());
			List<String> structureNames = new ArrayList<String>();
			structureNames.add("MOBILE_STRUCTURE");
			long[] structureIds = getStructureIdByName(structureNames);
			assetEntryQuery.setClassTypeIds(structureIds);
			assetEntry = AssetEntryServiceUtil.getEntries(assetEntryQuery);

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return assetEntry;
	}

	public static long[] getCategoryIdByName(List<String> categoryName) {
		long[] allCategoryIds = null;
		List<Long> allCategoriesList = new ArrayList<Long>();
		try {

			List<AssetCategory> assetCategory = AssetCategoryLocalServiceUtil.getAssetCategories(0, AssetCategoryLocalServiceUtil.getAssetCategoriesCount());
			for (AssetCategory asset : assetCategory) {
				for (String name : categoryName) {
					if (asset.getName().equalsIgnoreCase(name)) {
						allCategoriesList.add(asset.getCategoryId());
						continue;
					}
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		if ((allCategoriesList != null) && (allCategoriesList.size() > 0)) {
			allCategoryIds = new long[allCategoriesList.size()];
			for (int i = 0; i < allCategoriesList.size(); i++) {
				allCategoryIds[i] = allCategoriesList.get(i);
			}
		}
		return allCategoryIds;
	}

	public static long[] getStructureIdByName(List<String> structureNames) {
		long[] allStructureIds = new long[structureNames.size()];
		Locale locale = LocaleUtil.getDefault();
		try {
			List<DDMStructure> ddmStructures = DDMStructureLocalServiceUtil.getDDMStructures(0, DDMStructureLocalServiceUtil.getDDMStructuresCount());
			int counter = 0;
			for (DDMStructure structure : ddmStructures) {
				for (String name : structureNames) {					
					System.out.println(structure.getStructureKey());				
					if (structure.getName(locale).equalsIgnoreCase(name)) {		
						allStructureIds[counter] = structure.getStructureId();
						counter++;
						continue;
					}
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return allStructureIds;
	}

	public static long[] getTemplateIdByName(List<String> structureNames) {
		long[] allStructureIds = new long[structureNames.size()];
		Locale locale = LocaleUtil.getDefault();
		try {
			List<DDMTemplate> ddmsTemplates = DDMTemplateLocalServiceUtil.getDDMTemplates(0, DDMStructureLocalServiceUtil.getDDMStructuresCount());
			int counter = 0;
			for (DDMTemplate structure : ddmsTemplates) {
				for (String name : structureNames) {			
					System.out.println(structure.getTemplateKey());
					if (structure.getName(locale).equalsIgnoreCase(name)) {	
						allStructureIds[counter] = structure.getTemplateId();
						counter++;
						continue;
					}
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return allStructureIds;
	}

}
