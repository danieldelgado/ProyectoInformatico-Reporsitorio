package com.hitss.rev.test.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.struts.PortletActionInvoker;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;

@Controller("test2ViewController")
@RequestMapping(value = "VIEW")
public class Test2ViewController {

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User objUser = themeDisplay.getUser();
		Long groupId = themeDisplay.getLayout().getGroupId();
		Long scopegroupId = themeDisplay.getScopeGroupId();

		JournalArticle journalArticleObj = null;
		String contentArticule = null, keyContent = null, valueContent = null;
		Document document = null;
		Node node = null;

		try {
		
			journalArticleObj = JournalArticleLocalServiceUtil.getArticles(groupId).get(0);

			System.out.println("journalArticleclassName");
			System.out.println("JournalArticle.class.getName()");
			model.addAttribute("journalArticleclassName", JournalArticle.class.getName());
			System.out.println(groupId);
			model.addAttribute("groupId", groupId);
			System.out.println(journalArticleObj.getContent());
			model.addAttribute("content", journalArticleObj.getContent());
			System.out.println(journalArticleObj.getClassName());
			model.addAttribute("className", journalArticleObj.getClassName());
			System.out.println(journalArticleObj.getArticleId());
			model.addAttribute("articleId", journalArticleObj.getArticleId());
			System.out.println(journalArticleObj.getPrimaryKey());
			model.addAttribute("primaryKey", journalArticleObj.getPrimaryKey());
			System.out.println(journalArticleObj.getResourcePrimKey());
			model.addAttribute("resourcePrimKey", journalArticleObj.getResourcePrimKey());
			
			System.out.println(objUser.getUserId());
			model.addAttribute("userId", objUser.getUserId());
			
			
		} catch (SystemException e) {
			
		}

		return "view";

	}
	
	
	@ActionMapping(value = "invokeTaglibDiscussion")  // render phase
	public void invokeTaglibDiscussion(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		

//		 PortalClassInvoker.invoke(true, null, null);
		 PortletActionInvoker.processAction("com.liferay.portlet.messageboards.action.EditDiscussionAction", null,
		actionRequest, actionResponse);
	}
	

}
