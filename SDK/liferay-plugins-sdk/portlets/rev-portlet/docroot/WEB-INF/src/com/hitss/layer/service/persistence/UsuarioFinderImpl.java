package com.hitss.layer.service.persistence;

import java.util.List;

import com.hitss.layer.model.Usuario;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UsuarioFinderImpl extends BasePersistenceImpl<Usuario> implements UsuarioFinder {

	private String COUNT_USUARIOS_POSTULANTES = UsuarioFinderImpl.class.getName() + ".countUsuariosPostulados";

	public int getUsuarioPostulantesCount(long solicitudRequerimiento) {
		Session session = openSession();
		try {

			System.out.println("sql COUNT_USUARIOS_POSTULANTES:" + COUNT_USUARIOS_POSTULANTES);

			String sql = CustomSQLUtil.get(COUNT_USUARIOS_POSTULANTES);

			System.out.println("sql getUusuarioPostulantesCount:" + sql);

			SQLQuery query = session.createSQLQuery(sql);

			query.addScalar("postulanteCount", Type.INTEGER);

			QueryPos qPos = QueryPos.getInstance(query);

			qPos.add(solicitudRequerimiento);

			List l = query.list();
			return (int) l.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return 0;

	}

}