package com.hitss.rev.test.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.rec.hitss.layer.util.ConstantesPortalUtil;

@Controller("testViewController")
@RequestMapping(value = "VIEW")
public class TestViewController {

	@Autowired
	private Ejecutor ejecutor;

	private String[] strvaloresnombre = { "Daniel", "Maria", "Michelle", "Anisella", "Jordi", "Almendra", "Luana", "Natsu", "Elena", "Carlos", "Cesar", "Elisa", "Daniel", "Sandy",
			"Ingrid", "Kevin", "Max", "Melissa", "Mena", "KLaudiita", "Linette", "Carlos", "Andres", "Leli", "Freddy", "Jonathan", "Jose", "Diego", "Juan", "Danny", "Fabiola",
			"Gerardo", "Natali", "Jorge", "Iván", "Carlos", "Ximena", "Karen", "Oscar", "Omar", "Priscilla", "Wildor", "Miguel", "Andrea", "Harol", "Helard", "Sabrina", "Natalia",
			"Katheryn", "Ruth", "Julio", "Karen", "John", "Jimena", "Damaso", "Grecia", "Barbara", "Francisco", "Antonio", "Carlos", "Diego", "Daniel", "Angy", "Ricardo", "Diego",
			"Akicita", "Iris", "Jennifer", "Anita", "Ysabel", "Lourdes", "Cesar", "Brian", "Ursula", "Paula" };
	private String[] strvaloresapellido = { "Quevedo", "Rodriguez", "Manent", "Fernández", "Cordero", "Mogollón", "Grande", "Cavassa", "Távara", "Leon", "Blades", "Feliubadalo",
			"Montañez", "Chaparro", "Castillo", "Solari", "Guerra", "Olivares", "Salazar", "Canales", "Dávila", "Izquierdo", "Nakaya", "Tello", "Trigoso", "Gutierrez", "Ayvar",
			"Ricaldi", "Emilyc", "Garcia", "Gutierrez", "Garcia", "Gastello", "Vera", "Vía", "Incháustegui", "Fernández", "Ramos", "Thompson", "Morales", "Malla", "Perez",
			"Lopez", "Espinoza", "Berrios", "Cuya" };

	private String[] strvalorespuesto = { "ADMINISTRADOR DE APLICACIONES", "ADMINISTRADOR DE BASE DE DATOS", "ADMINISTRADOR DE REDES", "ANALISTA PROGRAMADOR ",
			"ADMINISTRADOR DE SEGURIDAD", "DIRECTOR DEL SISTEMA DE INVESTIGACIÓN Y DESARROLLO ", "DISEÑADOR GRAFICO", "TECNICO EN REDES Y SERVIDORES ", "TECNICO DE HARDWARE",
			"TECNICO DE REDES Y SERVIDORES ", "TECNICO DE SERVIDORES", "TECNICO DE SOFTWARE", "WEB MASTER SENIOR" };

	@RenderMapping
	public String defaultView(RenderRequest request, RenderResponse response, Model model) throws PortalException, SystemException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = (User) request.getAttribute(WebKeys.USER);

		User nuevoPostulante = null;
		Map<String, Object> mapRepuesta = new HashMap<String, Object>();

		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);

		int prefixId = 0;
		int suffixId = 0;

		long facebookId = 0;
		String openId = StringPool.BLANK;
		boolean sendEmail = false;

		long creatorUserId = ConstantesPortalUtil.CERO;
		long companyId = themeDisplay.getCompanyId();

		Role rol = getcuealquierrol(companyId);

		long groupId = themeDisplay.getLayout().getGroupId();
		

		Locale locale = themeDisplay.getLocale();
		String strNombre = getNombre();

		String strApep = getApellido();
		boolean autoScreenName = false;

		String strUsuario = generarusuario(strNombre,strApep);

		String strEmail =  generarcorreo(strNombre,strApep);
		String puestoactual = puesto();
	
		String nroDocumento = numerodocumento();
		Random rnd = ThreadLocalRandom.current();
		
		
		GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1900, 2010);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

		
		
		int birthdayMonth = (gc.get(gc.MONTH) + 1);
		int birthdayDay = gc.get(gc.DAY_OF_MONTH);
		int birthdayYear = gc.get(gc.YEAR);
		
		boolean male =  true;
		boolean autoPassword = false;
		String strPassword = "1234";
		String strPassword2 = "1234";

		for (int i = 0; i < 4; i++) {
			
			rol = getcuealquierrol(companyId);

			groupId = themeDisplay.getLayout().getGroupId();
			long[] groupIds = { groupId };
			long[] organizationIds = null;
			long[] roleIds = { rol.getRoleId() };
			long[] userGroupIds = null;

			locale = themeDisplay.getLocale();
			strNombre = getNombre();

			strApep = getApellido();
			autoScreenName = false;

			strUsuario = generarusuario(strNombre,strApep);

			 strEmail =  generarcorreo(strNombre,strApep);
			 puestoactual = puesto();
		
			 nroDocumento = numerodocumento();
			 rnd = ThreadLocalRandom.current();
			
			
			 gc = new GregorianCalendar();

	         year = randBetween(1900, 2010);

	        gc.set(gc.YEAR, year);

	         dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

	        gc.set(gc.DAY_OF_YEAR, dayOfYear);

			
			
			 birthdayMonth = (gc.get(gc.MONTH) + 1);
			 birthdayDay = gc.get(gc.DAY_OF_MONTH);
			 birthdayYear = gc.get(gc.YEAR);
			
			 male =  true;
			 autoPassword = false;
			 strPassword = "1234";
			 strPassword2 = "1234";
			
			ejecutor.insertarusuarios(creatorUserId, companyId, autoPassword, strPassword, strPassword2, autoScreenName, strUsuario, strEmail, facebookId, openId, locale, strNombre, "", strApep, prefixId, suffixId,
					male, birthdayMonth, birthdayDay, birthdayYear, puestoactual, groupIds, organizationIds, roleIds, userGroupIds, sendEmail, nroDocumento, serviceContext);
			
		}

		return "view";

	}

	private String numerodocumento() {
		Random rnd = ThreadLocalRandom.current();
		return "" + rnd.nextInt(6) + "" + rnd.nextInt(7) + "" + rnd.nextInt(9) + "" + rnd.nextInt(7) + "" + rnd.nextInt(9) + "" + rnd.nextInt(7) + "" + rnd.nextInt(9) + ""
				+ rnd.nextInt(7);
	}

	private String puesto() {
		Random rnd = ThreadLocalRandom.current();
		return strvalorespuesto[rnd.nextInt(strvalorespuesto.length-1)];
	}

	private String generarcorreo(String strNombre, String strApep) {
		return strNombre + "." + strApep + "@gmail.com";
	}

	private String getApellido() {
		Random rnd = ThreadLocalRandom.current();
		return strvaloresapellido[rnd.nextInt(strvaloresapellido.length-1)];
	}

	private String generarusuario(String strNombre, String strApep) {
		return strNombre + "." + strApep;
	}

	private String getNombre() {
		Random rnd = ThreadLocalRandom.current();
		return strvaloresnombre[rnd.nextInt(strvaloresnombre.length-1)];
	}

	private Role getcuealquierrol(long companyId) throws PortalException, SystemException {
		Role a = RoleLocalServiceUtil.getRole(companyId, ConstantesUtil.DESCRIPCION_ROL_POSTULANTE);
		return a;
	}

	public static int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}

	@ResourceMapping(value = "myInfo")
	public void getMyInformation(ResourceRequest request, ResourceResponse response) throws IOException {

		JSONObject json = JSONFactoryUtil.createJSONObject();
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			User user = themeDisplay.getUser();
			response.setCharacterEncoding("UTF-8");
			json.put("firstName", user != null ? user.getFirstName() : "");
			json.put("lastName", user != null ? user.getLastName() : "");
			response.getWriter().write(json.toString());
		} catch (Exception e) {
		}
	}

	@ResourceMapping(value = "ajaxtagstest")
	public void ajaxtagstest(ResourceRequest request, ResourceResponse response) throws IOException {

		JSONObject json = JSONFactoryUtil.createJSONObject();
		JSONObject jsonchilder = null;
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			User user = themeDisplay.getUser();
			response.setCharacterEncoding("UTF-8");

			HttpServletRequest req = PortalUtil.getHttpServletRequest(request);

			System.out.println(req.getParameterMap());
			System.out.println(request.getParameterMap());
			String query = ParamUtil.get(request, "query", "");
			System.out.println("query");
			System.out.println(query);
			List<JSONObject> listanombres = new ArrayList<JSONObject>();

			for (int i = 0; i < 10; i++) {
				jsonchilder = JSONFactoryUtil.createJSONObject();
				jsonchilder.put("nombre", user.getLastName() + "-" + i);
				listanombres.add(jsonchilder);
			}
			System.out.println(listanombres);

			json.put("results", listanombres.toString());

			response.getWriter().write(json.toString());
		} catch (Exception e) {
		}
	}

}
