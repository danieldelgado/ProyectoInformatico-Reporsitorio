package com.hitss.rev.service;

import java.util.List;

import com.hitss.rev.bean.OfertalLaboral;
import com.liferay.portal.model.User;


public interface PostularOfertaLaboralService {
	
	public List<OfertalLaboral> getListaOfertaLaboral(long company, long groupId, long userId);

	public void postularOferta(Long articulo, User user);
	
	
}
