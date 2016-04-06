package com.hitss.rec.publilcarOferta.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.rec.hitss.layer.model.Foo;
import com.rec.hitss.layer.service.FooLocalServiceUtil;

@Controller("publilcarOfertaController")
@RequestMapping(value = "VIEW")
public class PublilcarOfertaViewController {

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		
		try {
			int count = FooLocalServiceUtil.getFoosCount();
			System.out.println(count);
			long inc = CounterLocalServiceUtil.increment(Foo.class.getName());
			Foo foo = FooLocalServiceUtil.createFoo(inc) ;
			foo.setNew(true);
			foo.setField5("holaaa");
			FooLocalServiceUtil.addFoo(foo );
			count = FooLocalServiceUtil.getFoosCount();
			System.out.println(count);
			
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return "view";

	}
	

	

}
