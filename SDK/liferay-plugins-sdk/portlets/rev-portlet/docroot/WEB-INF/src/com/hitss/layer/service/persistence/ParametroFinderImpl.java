package com.hitss.layer.service.persistence;

import java.util.List;

import com.hitss.layer.model.Parametro;
import com.hitss.layer.model.impl.ParametroImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class ParametroFinderImpl extends BasePersistenceImpl<Parametro> implements ParametroFinder
	 {

	private String FIND_PARAMETRO = ParametroFinderImpl.class.getName()
			+ ".findParametro";

	public List<Parametro> getParametros() {
		Session session = openSession();
		System.out.println("sql FIND_PARAMETRO:"+FIND_PARAMETRO);
		String sql = CustomSQLUtil.get(FIND_PARAMETRO);
		System.out.println("sql findParametro:"+sql);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("Parametro", ParametroImpl.class);
		QueryPos qPos = QueryPos.getInstance(query);
		return (List<Parametro>) query.list();
	}

}