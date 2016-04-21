package com.hitss.rev.test.controller;

import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.DuplicateUserEmailAddressException;
import com.liferay.portal.DuplicateUserScreenNameException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoTableConstants;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil;
import com.rec.hitss.layer.model.Certificado;
import com.rec.hitss.layer.model.Conocimiento;
import com.rec.hitss.layer.model.Estudio;
import com.rec.hitss.layer.model.Experiencia;
import com.rec.hitss.layer.model.Referencia;
import com.rec.hitss.layer.model.UsuarioHitss;
import com.rec.hitss.layer.service.CertificadoLocalServiceUtil;
import com.rec.hitss.layer.service.ConocimientoLocalServiceUtil;
import com.rec.hitss.layer.service.EstudioLocalServiceUtil;
import com.rec.hitss.layer.service.ExperienciaLocalServiceUtil;
import com.rec.hitss.layer.service.ReferenciaLocalServiceUtil;
import com.rec.hitss.layer.service.UsuarioHitssLocalServiceUtil;

@Component
public class Ejecutor {

	private static Log LOG = LogFactoryUtil.getLog(Ejecutor.class);

	private long[] strvaloresnivel = { 36, 37, 38, 39, 40 };
	private String[] strvaloresestudio = { "UPC", "Catolica", "Uni", "San marcos", "Cientifica del Sur" };
	private String[] strvalorescertificado = { "PMI", "SCRUM", ".NET", "JAVA" };
	private String[] strvaloresexperiencia = { "BBVA","CLARO","INDRA","MINEDU" };
	private String[] strvaloresconocimiento = { "Gestion de proyectos", "Analisis", "Desarrollo", "Trabajo en equipo" };
	private String[] strvaloresherramienta = { "Eclipse", "Visual Studio", "StartUML", "Rational", "Project" };
	private String[] strvalorestag = { "23039", "23040", "23041", "23042", "23043" };

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

	public void insertarusuarios(long creatorUserId, long companyId, boolean autoPassword, String password1, String password2, boolean autoScreenName, String screenName,
			String emailAddress, long facebookId, String openId, Locale locale, String firstName, String middleName, String lastName, int prefixId, int suffixId, boolean male,
			int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			String strdocumento, ServiceContext serviceContext) {

		try {

			Random rnd = ThreadLocalRandom.current();

			User user = registrarUsuarioPostulante(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, screenName, emailAddress, facebookId, openId,
					locale, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds,
					userGroupIds, sendEmail, strdocumento, serviceContext);

			long usuarioHitssId = CounterLocalServiceUtil.increment(UsuarioHitss.class.getName());
			UsuarioHitss usuarioHitss = UsuarioHitssLocalServiceUtil.createUsuarioHitss(usuarioHitssId);
			usuarioHitss.setNew(true);
			usuarioHitss.setUserId(user.getUserId() + "");
			usuarioHitss.setUserUuId(user.getUuid());
			UsuarioHitssLocalServiceUtil.updateUsuarioHitss(usuarioHitss);
			{
				for (int i = 0; i < rnd.nextInt(5); i++) {

					long estudioId = CounterLocalServiceUtil.increment(Estudio.class.getName());
					Estudio estudio = EstudioLocalServiceUtil.createEstudio(estudioId);
					estudio.setNew(true);
					estudio.setNombre(strvaloresestudio[rnd.nextInt(strvaloresestudio.length-1)]);
					estudio.setNivel(Long.valueOf(strvaloresnivel[rnd.nextInt(strvaloresnivel.length-1)]));
					estudio.setUsuarioHitssId(usuarioHitss.getUsuarioHitssId());
					estudio.setActivo(true);
					estudio.setFechacrea(new Date());
					estudio.setUsuariocrea(user.getUserId());
					estudio.setFechacreamodifica(new Date());
					estudio.setUsuariomodifica(user.getUserId());
					EstudioLocalServiceUtil.updateEstudio(estudio);

				}

			}
			{
				for (int i = 0; i < rnd.nextInt(5); i++) {
					long certificadoid = CounterLocalServiceUtil.increment(Certificado.class.getName());
					Certificado certificado = CertificadoLocalServiceUtil.createCertificado(certificadoid);
					certificado.setNew(true);

					certificado.setDescripcion(strvalorescertificado[rnd.nextInt(strvalorescertificado.length-1)]);
					certificado.setCargo(strvalorespuesto[rnd.nextInt(strvalorespuesto.length-1)]);
					certificado.setEmpresa(strvaloresexperiencia[rnd.nextInt(strvaloresexperiencia.length-1)]);
					certificado.setUsuarioHitssId(usuarioHitss.getUsuarioHitssId());

					certificado.setActivo(true);
					certificado.setFechacrea(new Date());
					certificado.setUsuariocrea(user.getUserId());
					certificado.setFechacreamodifica(new Date());
					certificado.setUsuariomodifica(user.getUserId());
					CertificadoLocalServiceUtil.updateCertificado(certificado);
				}

			}
			{
				for (int i = 0; i < rnd.nextInt(5); i++) {
					long referenciaId = CounterLocalServiceUtil.increment(Referencia.class.getName());
					Referencia referencia = ReferenciaLocalServiceUtil.createReferencia(referenciaId);
					referencia.setNew(true);

					referencia.setResponsable(strvaloresnombre[rnd.nextInt(strvaloresnombre.length-1)] + " " + strvaloresapellido[rnd.nextInt(strvaloresapellido.length-1)]);
					referencia.setMotivo("Mejoras");
					referencia.setTelefono("9" + "" + rnd.nextInt(7) + "" + rnd.nextInt(9) + "" + rnd.nextInt(7) + "" + rnd.nextInt(9) + "" + rnd.nextInt(7) + "" + rnd.nextInt(9)
							+ "" + rnd.nextInt(7) + "" + rnd.nextInt(7));
					referencia.setEmpresa(strvaloresestudio[rnd.nextInt(strvaloresestudio.length-1)]);
					referencia.setUsuarioHitssId(usuarioHitss.getUsuarioHitssId());

					referencia.setActivo(true);
					referencia.setFechacrea(new Date());
					referencia.setUsuariocrea(user.getUserId());
					referencia.setFechacreamodifica(new Date());
					referencia.setUsuariomodifica(user.getUserId());
					ReferenciaLocalServiceUtil.updateReferencia(referencia);
				}
			}
			{
				for (int i = 0; i < rnd.nextInt(5); i++) {
					long conocimientoId = CounterLocalServiceUtil.increment(Conocimiento.class.getName());
					Conocimiento conocimiento = ConocimientoLocalServiceUtil.createConocimiento(conocimientoId);
					conocimiento.setNew(true);

					conocimiento.setEtiquetaId(Long.valueOf(strvalorestag[rnd.nextInt(strvalorestag.length-1)]));
					conocimiento.setDescripcion(strvaloresconocimiento[rnd.nextInt(strvaloresconocimiento.length-1)]);
					conocimiento.setHerramiento(strvaloresconocimiento[rnd.nextInt(strvaloresconocimiento.length-1)]);
					conocimiento.setImplementacion(strvaloresherramienta[rnd.nextInt(strvaloresherramienta.length-1)]);
					conocimiento.setUsuarioHitssId(usuarioHitss.getUsuarioHitssId());

					conocimiento.setActivo(true);
					conocimiento.setFechacrea(new Date());
					conocimiento.setUsuariocrea(user.getUserId());
					conocimiento.setFechacreamodifica(new Date());
					conocimiento.setUsuariomodifica(user.getUserId());
					ConocimientoLocalServiceUtil.updateConocimiento(conocimiento);
				}
			}

			{
				for (int i = 0; i < rnd.nextInt(5); i++) {
					long experienciaId = CounterLocalServiceUtil.increment(Experiencia.class.getName());
					Experiencia experiencia = ExperienciaLocalServiceUtil.createExperiencia(experienciaId);
					experiencia.setNew(true);

					experiencia.setDescripcion(strvaloresconocimiento[rnd.nextInt(strvaloresconocimiento.length-1)]);
					experiencia.setEmpresa(strvaloresexperiencia[rnd.nextInt(strvaloresexperiencia.length-1)]);
					experiencia.setFechaInicio(new Date());
					experiencia.setFechaFin(new Date());
					experiencia.setUsuarioHitssId(usuarioHitss.getUsuarioHitssId());
					experiencia.setNivel(strvaloresnivel[rnd.nextInt(strvaloresnivel.length-1)]);

					experiencia.setFechacrea(new Date());
					experiencia.setActivo(true);
					experiencia.setUsuariocrea(user.getUserId());
					experiencia.setFechacreamodifica(new Date());
					experiencia.setUsuariomodifica(user.getUserId());
					ExperienciaLocalServiceUtil.updateExperiencia(experiencia);
				}

			}

		} catch (SystemException | PortalException | DuplicateUserDNIException e) {
			e.printStackTrace();
		}

	}

	public User registrarUsuarioPostulante(long creatorUserId, long companyId, boolean autoPassword, String password1, String password2, boolean autoScreenName, String screenName,
			String emailAddress, long facebookId, String openId, Locale locale, String firstName, String middleName, String lastName, int prefixId, int suffixId, boolean male,
			int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			String strdocumento, ServiceContext serviceContext) throws DuplicateUserEmailAddressException, SystemException, PortalException, DuplicateUserDNIException {

		LOG.debug("registrarUsuarioPostulante");
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class, PortalClassLoaderUtil.getClassLoader());
		dynamicQuery.add(PropertyFactoryUtil.forName(ConstantesUtil.EMAILADDRESS).eq(emailAddress));
		long userexists = UserLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		LOG.debug("Existe correo : " + userexists);
		if (userexists > ConstantesPortalUtil.CERO) {
			LOG.error("Email Duplicado");
			throw new DuplicateUserEmailAddressException();
		}

		ExpandoColumn column = ExpandoColumnLocalServiceUtil.getDefaultTableColumn(companyId, User.class.getName(), ConstantesUtil.DNI);
		dynamicQuery = DynamicQueryFactoryUtil.forClass(ExpandoValue.class, PortalClassLoaderUtil.getClassLoader())
				.add(PropertyFactoryUtil.forName(ConstantesUtil.COLUMNID).eq(GetterUtil.getLong(column.getColumnId())))
				.add(PropertyFactoryUtil.forName(ConstantesPortalUtil.DATA).eq(strdocumento))
				.add(PropertyFactoryUtil.forName(ConstantesUtil.CLASSNAMEID).eq(GetterUtil.getLong(ClassNameLocalServiceUtil.getClassNameId(User.class.getName()))));
		long dniExists = ExpandoValueLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		LOG.debug("Existe DNI : " + dniExists);
		if (dniExists > ConstantesPortalUtil.CERO) {
			LOG.error("DNI Duplicado");
			throw new DuplicateUserDNIException();
		}

		dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class, PortalClassLoaderUtil.getClassLoader());
		dynamicQuery.add(PropertyFactoryUtil.forName(ConstantesUtil.SCREENNAME).eq(screenName));
		userexists = UserLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		LOG.debug("Existe Screenname : " + userexists);
		if (userexists > ConstantesPortalUtil.CERO) {
			LOG.error("Screenname Duplicado");
			throw new DuplicateUserScreenNameException();
		}

		// PasswordPolicy passwordPolicy =
		// PasswordPolicyLocalServiceUtil.getDefaultPasswordPolicy(companyId);
		//
		// PwdToolkitUtil.validate(companyId, userId, password1, password2,
		// passwordPolicy);

		User nuevoPostulante = UserLocalServiceUtil.addUser(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, screenName, emailAddress, facebookId,
				openId, locale, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, null,
				userGroupIds, sendEmail, serviceContext);

		nuevoPostulante.setPasswordReset(false);

		ExpandoValueLocalServiceUtil.addValue(User.class.getName(), ExpandoTableConstants.DEFAULT_TABLE_NAME, ConstantesUtil.DNI, nuevoPostulante.getUserId(), strdocumento);

		LOG.debug("Postulante registrado al rol:" + roleIds);

		RoleLocalServiceUtil.setUserRoles(nuevoPostulante.getUserId(), roleIds);

		nuevoPostulante.setStatus(WorkflowConstants.STATUS_APPROVED);

		UserLocalServiceUtil.updateUser(nuevoPostulante);

		LOG.debug("Nuevo usuario postulante registrado");

		return nuevoPostulante;

	}

}
