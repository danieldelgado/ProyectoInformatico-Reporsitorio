package com.hitss.rev.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InicializarData {

	public static Date getFechaDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public PuestoBean getPuestoProgramadorJavaJunior() {
		PuestoBean p = new PuestoBean();
		p.setId(1L);
		p.setNombre("Programador Java Junior");
		p.setTipoNegocioRequierido(ExperienciaBean.EXPERIENCIA_NINGUNO);
		{
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, ExperienciaBean.EXPERIENCIA_BANCA, 1);
			p.setExperienciaRubro(experienciaBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 2, false);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 1, false);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 1, false);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 1, false);
			listaRequisitoBean.add(requisitoBean4);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CERTIFICADO, "Java 7");
			listaCertificados.add(requisitoBean);			
			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = new EvaluacionPuestoBean(1L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_01, "evluacion01", 0.3, 0.6);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionPuestoBean evaluacionPuestoBean2 = new EvaluacionPuestoBean(2L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_02, "evluacion02", 0.3, 0.5);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean3 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_TECNICA_01, "evluacion tecnica 01", 0.4, 0.8);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionPuestoBean evaluacionPuestoBean4 = new EvaluacionPuestoBean(4L, EvaluacionPuestoBean.EVALUAION_TECNICA_02, "evluacion tecnica 02", 0.4, 0.8);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionPuestoBean> listaEntrevista = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean5 = new EvaluacionPuestoBean(5L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, "entrevista coordinador", 0.4, 0.8);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionPuestoBean evaluacionPuestoBean6 = new EvaluacionPuestoBean(6L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_GERENTE_AREA, "entrevista gerente", 0.4, 0.8);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}
		return p;
	}

	public PuestoBean getPuestoProgramadorJavaSemiSenior() {
		PuestoBean p = new PuestoBean();
		p.setId(2L);
		p.setNombre("Programador Java Semi Senior");
		p.setTipoNegocioRequierido(ExperienciaBean.EXPERIENCIA_BANCA);
		{
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, ExperienciaBean.EXPERIENCIA_BANCA, 2);
			p.setExperienciaRubro(experienciaBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 4, true);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 3, true);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 3, true);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 3, false);
			listaRequisitoBean.add(requisitoBean4);
			RequisitoBean requisitoBean5 = new RequisitoBean(5L, RequisitoBean.REQUISITO_CONOCIMIENTO, "JSF", 4, true);
			listaRequisitoBean.add(requisitoBean5);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean6 = new RequisitoBean(6L, RequisitoBean.REQUISITO_CERTIFICADO, "Java 7", true);
			listaCertificados.add(requisitoBean6);
			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = new EvaluacionPuestoBean(1L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_01, "evluacion01", 0.4, 0.5);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionPuestoBean evaluacionPuestoBean2 = new EvaluacionPuestoBean(2L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_02, "evluacion02", 0.1, 0.6);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean3 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_TECNICA_01, "evluacion tecnica 01", 0.6, 0.8);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionPuestoBean evaluacionPuestoBean4 = new EvaluacionPuestoBean(4L, EvaluacionPuestoBean.EVALUAION_TECNICA_02, "evluacion tecnica 02", 0.6, 0.8);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionPuestoBean> listaEntrevista = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean5 = new EvaluacionPuestoBean(5L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, "entrevista coordinador", 0.4, 0.6);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionPuestoBean evaluacionPuestoBean6 = new EvaluacionPuestoBean(6L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_GERENTE_AREA, "entrevista gerente", 0.4, 0.6);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}
		return p;
	}

	public PuestoBean getPuestoProgramadorJavaSenior() {
		PuestoBean p = new PuestoBean();
		p.setId(3L);
		p.setNombre("Programador Java Senior");
		p.setTipoNegocioRequierido(ExperienciaBean.EXPERIENCIA_FINANZA);
		{
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, ExperienciaBean.EXPERIENCIA_FINANZA, 6);
			p.setExperienciaRubro(experienciaBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 5, true);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 5, true);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 5, true);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 5, true);
			listaRequisitoBean.add(requisitoBean4);
			RequisitoBean requisitoBean5 = new RequisitoBean(5L, RequisitoBean.REQUISITO_CONOCIMIENTO, "JSF", 5, true);
			listaRequisitoBean.add(requisitoBean5);
			RequisitoBean requisitoBean7 = new RequisitoBean(7L, RequisitoBean.REQUISITO_CONOCIMIENTO, "STRUS 1", 5, true);
			listaRequisitoBean.add(requisitoBean7);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Liferay", 5, true);
			listaRequisitoBean.add(requisitoBean8);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean6 = new RequisitoBean(6L, RequisitoBean.REQUISITO_CERTIFICADO, "Java 7", true);
			listaCertificados.add(requisitoBean6);
			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = new EvaluacionPuestoBean(1L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_01, "evluacion01", 0.7, 0.9);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionPuestoBean evaluacionPuestoBean2 = new EvaluacionPuestoBean(2L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_02, "evluacion02", 0.5, 0.6);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionPuestoBean evaluacionPuestoBean8 = new EvaluacionPuestoBean(8L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_04, "evluacion04", 0.3, 0.5);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean8);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean3 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_TECNICA_01, "evluacion tecnica 01", 0.7, 0.97);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionPuestoBean evaluacionPuestoBean4 = new EvaluacionPuestoBean(4L, EvaluacionPuestoBean.EVALUAION_TECNICA_02, "evluacion tecnica 02", 0.7, 0.97);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionPuestoBean evaluacionPuestoBean7 = new EvaluacionPuestoBean(7L, EvaluacionPuestoBean.EVALUAION_TECNICA_03, "evluacion tecnica 03", 0.7, 0.97);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean7);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionPuestoBean> listaEntrevista = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean5 = new EvaluacionPuestoBean(5L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, "entrevista coordinador", 0.7, 0.95);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionPuestoBean evaluacionPuestoBean6 = new EvaluacionPuestoBean(6L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_GERENTE_AREA, "entrevista gerente", 0.7, 0.95);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}
		return p;
	}

	public PuestoBean getPuestoAnalistaProgramador() {
		PuestoBean p = new PuestoBean();
		p.setId(3L);
		p.setNombre("Analista Programador");
		p.setTipoNegocioRequierido(ExperienciaBean.EXPERIENCIA_FINANZA);
		{
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, ExperienciaBean.EXPERIENCIA_FINANZA, 1);
			p.setExperienciaRubro(experienciaBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 4, true);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 3, false);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 3, false);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 3, false);
			listaRequisitoBean.add(requisitoBean4);
			RequisitoBean requisitoBean5 = new RequisitoBean(5L, RequisitoBean.REQUISITO_CONOCIMIENTO, "JSF", 2, false);
			listaRequisitoBean.add(requisitoBean5);
			RequisitoBean requisitoBean7 = new RequisitoBean(7L, RequisitoBean.REQUISITO_CONOCIMIENTO, "STRUS", 2, false);
			listaRequisitoBean.add(requisitoBean7);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "UML", 4, true);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean9 = new RequisitoBean(9L, RequisitoBean.REQUISITO_CONOCIMIENTO, "RUP", 2, true);
			listaRequisitoBean.add(requisitoBean9);
			RequisitoBean requisitoBean10 = new RequisitoBean(10L, RequisitoBean.REQUISITO_CONOCIMIENTO, "ERWIN", 3, false);
			listaRequisitoBean.add(requisitoBean10);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();

			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = new EvaluacionPuestoBean(1L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_01, "evluacion01", 0.7, 0.9);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionPuestoBean evaluacionPuestoBean2 = new EvaluacionPuestoBean(2L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_02, "evluacion02", 0.5, 0.6);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionPuestoBean evaluacionPuestoBean8 = new EvaluacionPuestoBean(8L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_04, "evluacion04", 0.3, 0.5);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean8);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean3 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_TECNICA_01, "evluacion tecnica 01", 0.6, 0.7);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionPuestoBean evaluacionPuestoBean4 = new EvaluacionPuestoBean(4L, EvaluacionPuestoBean.EVALUAION_TECNICA_02, "evluacion tecnica 02", 0.3, 0.5);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionPuestoBean evaluacionPuestoBean7 = new EvaluacionPuestoBean(7L, EvaluacionPuestoBean.EVALUAION_TECNICA_03, "evluacion tecnica 03", 0.4, 0.5);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean7);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionPuestoBean> listaEntrevista = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean5 = new EvaluacionPuestoBean(5L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, "entrevista coordinador", 0.7, 0.8);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionPuestoBean evaluacionPuestoBean6 = new EvaluacionPuestoBean(6L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_GERENTE_AREA, "entrevista gerente", 0.7, 0.8);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}
		return p;
	}

	public PuestoBean getPuestoAnalista() {
		PuestoBean p = new PuestoBean();
		p.setId(3L);
		p.setNombre("Analista");
		{
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, ExperienciaBean.EXPERIENCIA_FINANZA, 3);
			p.setExperienciaRubro(experienciaBean);
		}
		{
			p.setTipoNegocioRequierido(ExperienciaBean.EXPERIENCIA_FINANZA);
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 3, true);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "UML", 4, true);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean9 = new RequisitoBean(9L, RequisitoBean.REQUISITO_CONOCIMIENTO, "RUP", 4, true);
			listaRequisitoBean.add(requisitoBean9);
			RequisitoBean requisitoBean10 = new RequisitoBean(10L, RequisitoBean.REQUISITO_CONOCIMIENTO, "ERWIN", 4, false);
			listaRequisitoBean.add(requisitoBean10);
			RequisitoBean requisitoBean11 = new RequisitoBean(11L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias de desarrollo", 4, false);
			listaRequisitoBean.add(requisitoBean11);
			RequisitoBean requisitoBean12 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias agiles", 3, false);
			listaRequisitoBean.add(requisitoBean12);
			RequisitoBean requisitoBean13 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 4, false);
			listaRequisitoBean.add(requisitoBean13);
			RequisitoBean requisitoBean14 = new RequisitoBean(14L, RequisitoBean.REQUISITO_CONOCIMIENTO, "POO", 3, true);
			listaRequisitoBean.add(requisitoBean14);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();

			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = new EvaluacionPuestoBean(1L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_01, "evluacion01", 0.3, 0.4);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionPuestoBean evaluacionPuestoBean2 = new EvaluacionPuestoBean(2L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_02, "evluacion02", 0.2, 0.3);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionPuestoBean evaluacionPuestoBean8 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_04, "evluacion04", 0.3, 0.5);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean8);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean3 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_TECNICA_01, "evluacion tecnica 01", 0.2, 0.55);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionPuestoBean evaluacionPuestoBean4 = new EvaluacionPuestoBean(4L, EvaluacionPuestoBean.EVALUAION_TECNICA_02, "evluacion tecnica 02", 0.2, 0.3);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionPuestoBean evaluacionPuestoBean8 = new EvaluacionPuestoBean(8L, EvaluacionPuestoBean.EVALUAION_TECNICA_04, "evluacion tecnica 03", 0.6, 0.65);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean8);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionPuestoBean> listaEntrevista = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean5 = new EvaluacionPuestoBean(5L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, "entrevista coordinador", 0.7, 0.8);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionPuestoBean evaluacionPuestoBean6 = new EvaluacionPuestoBean(6L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_GERENTE_AREA, "entrevista gerente", 0.7, 0.8);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}
		return p;
	}

	public PuestoBean getPuestoGerente() {
		PuestoBean p = new PuestoBean();
		p.setId(3L);
		p.setNombre("Gerente");
		p.setTipoNegocioRequierido(ExperienciaBean.EXPERIENCIA_BOLSA);
		{
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, ExperienciaBean.EXPERIENCIA_BOLSA, 4);
			p.setExperienciaRubro(experienciaBean);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean14 = new RequisitoBean(14L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Gestion de Proyectos", 5, true);
			listaRequisitoBean.add(requisitoBean14);
			RequisitoBean requisitoBean15 = new RequisitoBean(15L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Project", 5, false);
			listaRequisitoBean.add(requisitoBean15);
			RequisitoBean requisitoBean11 = new RequisitoBean(11L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias de desarrollo", 5, true);
			listaRequisitoBean.add(requisitoBean11);
			RequisitoBean requisitoBean12 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias agiles", 5, true);
			listaRequisitoBean.add(requisitoBean12);
			RequisitoBean requisitoBean13 = new RequisitoBean(13L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 4, false);
			listaRequisitoBean.add(requisitoBean13);
			RequisitoBean requisitoBean16 = new RequisitoBean(16L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Contabilidad", 3, false);
			listaRequisitoBean.add(requisitoBean16);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean16 = new RequisitoBean(16L, RequisitoBean.REQUISITO_CERTIFICADO, "PMBOOK", true);
			listaCertificados.add(requisitoBean16);
			RequisitoBean requisitoBean17 = new RequisitoBean(16L, RequisitoBean.REQUISITO_CERTIFICADO, "PMI", true);
			listaCertificados.add(requisitoBean17);
			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean = new EvaluacionPuestoBean(1L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_01, "evluacion01", 0.7, 0.95);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionPuestoBean evaluacionPuestoBean2 = new EvaluacionPuestoBean(2L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_02, "evluacion02", 0.8, 0.95);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionPuestoBean evaluacionPuestoBean8 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_PSICOLOGICA_04, "evluacion04", 0.9, 0.95);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean8);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionPuestoBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean3 = new EvaluacionPuestoBean(3L, EvaluacionPuestoBean.EVALUAION_TECNICA_01, "evluacion tecnica 01", 0.4, 0.55);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionPuestoBean> listaEntrevista = new ArrayList<EvaluacionPuestoBean>();
			EvaluacionPuestoBean evaluacionPuestoBean5 = new EvaluacionPuestoBean(5L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, "entrevista coordinador", 0.9, 0.95);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionPuestoBean evaluacionPuestoBean6 = new EvaluacionPuestoBean(6L, EvaluacionPuestoBean.EVALUAION_ENTREVISTA_GERENTE_AREA, "entrevista gerente", 0.8, 0.95);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}
		return p;
	}

	public UsuarioBean getUsuarioPostulante01() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(1L);
		p.setNombre("Usuario 01");
		p.setSalario(1000);
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 1, false);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 1, false);
			listaRequisitoBean.add(requisitoBean3);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 16);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 14);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 14);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 14);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 15);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 17);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante02() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(2L);
		p.setNombre("Usuario 022");
		p.setSalario(2300);
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 1);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 1);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Oracle", 3);
			listaRequisitoBean.add(requisitoBean4);
			RequisitoBean requisitoBean6 = new RequisitoBean(6L, RequisitoBean.REQUISITO_CONOCIMIENTO, "SQL Server", 3);
			listaRequisitoBean.add(requisitoBean6);
			RequisitoBean requisitoBean7 = new RequisitoBean(7L, RequisitoBean.REQUISITO_CONOCIMIENTO, "PostGrest", 3);
			listaRequisitoBean.add(requisitoBean7);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			p.setListaCertificados(listaCertificados);
		}
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			p.setListaExperiencias(listaExperiencias);
		}

		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 16);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 14);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 13);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 15);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 16);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 16);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 15);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 17);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante03() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(3L);
		p.setNombre("Usuario 03");
		p.setSalario(1900);
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			p.setListaExperiencias(listaExperiencias);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 4, false);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 2, false);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 3, false);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 2, false);
			listaRequisitoBean.add(requisitoBean4);
			p.setListaConocimientos(listaRequisitoBean);

		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			p.setListaCertificados(listaCertificados);
		}

		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 15);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 16);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
//			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 13);
//			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 15);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 18);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 19);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 15);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 17);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante04() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(4L);
		p.setNombre("Usuario 04");
		p.setSalario(1000);
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			p.setListaExperiencias(listaExperiencias);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 5, false);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 5, false);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean2 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 5, false);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean13 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 4);
			listaRequisitoBean.add(requisitoBean13);
			RequisitoBean requisitoBean7 = new RequisitoBean(7L, RequisitoBean.REQUISITO_CONOCIMIENTO, "STRUS 1", 5, true);
			listaRequisitoBean.add(requisitoBean7);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Liferay", 5, true);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean222 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 5, true);
			listaRequisitoBean.add(requisitoBean222);
			RequisitoBean requisitoBean5 = new RequisitoBean(5L, RequisitoBean.REQUISITO_CONOCIMIENTO, "JSF", 5, true);
			listaRequisitoBean.add(requisitoBean5);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CERTIFICADO, "Java 7");
			listaCertificados.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CERTIFICADO, "UML");
			listaCertificados.add(requisitoBean2);
			p.setListaCertificados(listaCertificados);
		}
		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 16);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 14);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
//			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 13);
//			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 13);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 14);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 14);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 15);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 17);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante05() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(5L);
		p.setNombre("Usuario 05");
		p.setSalario(1000);
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 5);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "UML", 5);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean10 = new RequisitoBean(10L, RequisitoBean.REQUISITO_CONOCIMIENTO, "ERWIN", 2);
			listaRequisitoBean.add(requisitoBean10);
			RequisitoBean requisitoBean12 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias agiles", 3);
			listaRequisitoBean.add(requisitoBean12);
			RequisitoBean requisitoBean13 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 2);
			listaRequisitoBean.add(requisitoBean13);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Spring", 5, true);
			listaRequisitoBean.add(requisitoBean2);
			RequisitoBean requisitoBean3 = new RequisitoBean(3L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Mysql", 5, true);
			listaRequisitoBean.add(requisitoBean3);
			RequisitoBean requisitoBean4 = new RequisitoBean(4L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Jquery", 5, true);
			listaRequisitoBean.add(requisitoBean4);
			RequisitoBean requisitoBean5 = new RequisitoBean(5L, RequisitoBean.REQUISITO_CONOCIMIENTO, "JSF", 2, true);
			listaRequisitoBean.add(requisitoBean5);
			RequisitoBean requisitoBean18 = new RequisitoBean(18L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Liferay", 1, true);
			listaRequisitoBean.add(requisitoBean18);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CERTIFICADO, "Java 7");
			listaCertificados.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CERTIFICADO, "UML");
			listaCertificados.add(requisitoBean2);
			p.setListaCertificados(listaCertificados);
		}
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			ExperienciaBean experienciaBean4 = new ExperienciaBean(4L, "emp4", ExperienciaBean.EXPERIENCIA_BOLSA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean4);
			ExperienciaBean experienciaBean5 = new ExperienciaBean(5L, "emp5", ExperienciaBean.EXPERIENCIA_SEGUROS, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean5);
			experienciaBean5 = new ExperienciaBean(6L, "emp5", ExperienciaBean.EXPERIENCIA_SEGUROS, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean5);
			experienciaBean5 = new ExperienciaBean(7L, "emp5", ExperienciaBean.EXPERIENCIA_SEGUROS, "proy12", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean5);
			experienciaBean5 = new ExperienciaBean(8L, "emp5", ExperienciaBean.EXPERIENCIA_SEGUROS, "proy13", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean5);
			experienciaBean5 = new ExperienciaBean(9L, "emp5", ExperienciaBean.EXPERIENCIA_SEGUROS, "proy14", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean5);

			p.setListaExperiencias(listaExperiencias);
		}

		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 12);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 14);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 13);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 20);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 10);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 05);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 05);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 10);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante06() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(6L);
		p.setNombre("Usuario 06");
		p.setSalario(2800);
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			p.setListaExperiencias(listaExperiencias);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 5);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "UML", 2);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean9 = new RequisitoBean(9L, RequisitoBean.REQUISITO_CONOCIMIENTO, "RUP", 3);
			listaRequisitoBean.add(requisitoBean9);
			RequisitoBean requisitoBean10 = new RequisitoBean(10L, RequisitoBean.REQUISITO_CONOCIMIENTO, "ERWIN", 3);
			listaRequisitoBean.add(requisitoBean10);
			RequisitoBean requisitoBean11 = new RequisitoBean(11L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias de desarrollo", 5);
			listaRequisitoBean.add(requisitoBean11);
			RequisitoBean requisitoBean12 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias agiles", 4);
			listaRequisitoBean.add(requisitoBean12);
			RequisitoBean requisitoBean13 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 5);
			listaRequisitoBean.add(requisitoBean13);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 16);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 14);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 13);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 19);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 20);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 18);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 18);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 17);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante07() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(7L);
		p.setNombre("Usuario 07");
		p.setSalario(2500);

		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			p.setListaExperiencias(listaExperiencias);
		}
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 3, true);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "UML", 4, true);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean9 = new RequisitoBean(9L, RequisitoBean.REQUISITO_CONOCIMIENTO, "RUP", 5, true);
			listaRequisitoBean.add(requisitoBean9);
			RequisitoBean requisitoBean10 = new RequisitoBean(10L, RequisitoBean.REQUISITO_CONOCIMIENTO, "ERWIN", 4, false);
			listaRequisitoBean.add(requisitoBean10);
			RequisitoBean requisitoBean11 = new RequisitoBean(11L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias de desarrollo", 4, false);
			listaRequisitoBean.add(requisitoBean11);
			RequisitoBean requisitoBean12 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias agiles", 4, false);
			listaRequisitoBean.add(requisitoBean12);
			RequisitoBean requisitoBean13 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 4, false);
			listaRequisitoBean.add(requisitoBean13);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 16);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 19);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 15);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 19);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 16);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 20);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 16);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 18);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public UsuarioBean getUsuarioPostulante08() {
		UsuarioBean p = new UsuarioBean();
		p.setIdUsuario(8L);
		p.setNombre("Usuario 08");
		p.setSalario(3200);
		{
			List<RequisitoBean> listaRequisitoBean = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Java", 5);
			listaRequisitoBean.add(requisitoBean);
			RequisitoBean requisitoBean8 = new RequisitoBean(8L, RequisitoBean.REQUISITO_CONOCIMIENTO, "UML", 1);
			listaRequisitoBean.add(requisitoBean8);
			RequisitoBean requisitoBean9 = new RequisitoBean(9L, RequisitoBean.REQUISITO_CONOCIMIENTO, "RUP", 2);
			listaRequisitoBean.add(requisitoBean9);
			RequisitoBean requisitoBean10 = new RequisitoBean(10L, RequisitoBean.REQUISITO_CONOCIMIENTO, "ERWIN", 3);
			listaRequisitoBean.add(requisitoBean10);
			RequisitoBean requisitoBean11 = new RequisitoBean(11L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias de desarrollo", 3);
			listaRequisitoBean.add(requisitoBean11);
			RequisitoBean requisitoBean12 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Metodologias agiles", 4);
			listaRequisitoBean.add(requisitoBean12);
			RequisitoBean requisitoBean13 = new RequisitoBean(12L, RequisitoBean.REQUISITO_CONOCIMIENTO, "Scrum", 4);
			listaRequisitoBean.add(requisitoBean13);
			p.setListaConocimientos(listaRequisitoBean);
		}
		{
			List<RequisitoBean> listaCertificados = new ArrayList<RequisitoBean>();
			RequisitoBean requisitoBean = new RequisitoBean(1L, RequisitoBean.REQUISITO_CERTIFICADO, "Java 7");
			listaCertificados.add(requisitoBean);
			RequisitoBean requisitoBean2 = new RequisitoBean(2L, RequisitoBean.REQUISITO_CERTIFICADO, "UML");
			listaCertificados.add(requisitoBean2);
			p.setListaCertificados(listaCertificados);
		}
		{
			List<ExperienciaBean> listaExperiencias = new ArrayList<ExperienciaBean>();
			ExperienciaBean experienciaBean = new ExperienciaBean(1L, "emp1", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean);
			ExperienciaBean experienciaBean2 = new ExperienciaBean(2L, "emp2", ExperienciaBean.EXPERIENCIA_FINANZA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean2);
			ExperienciaBean experienciaBean3 = new ExperienciaBean(3L, "emp3", ExperienciaBean.EXPERIENCIA_BANCA, "proy1", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean3);
			ExperienciaBean experienciaBean4 = new ExperienciaBean(4L, "emp4", ExperienciaBean.EXPERIENCIA_BANCA, "proy3", getFechaDate("06/05/2014"), getFechaDate("10/10/2015"));
			listaExperiencias.add(experienciaBean4);
			p.setListaExperiencias(listaExperiencias);
		}
		{
			List<EvaluacionBean> listaEvaluacionPiscologicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean = new EvaluacionBean(1L, EvaluacionBean.EVALUAION_PSICOLOGICA_01, 17);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_02, 20);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean2);
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(2L, EvaluacionBean.EVALUAION_PSICOLOGICA_03, 19);
			listaEvaluacionPiscologicas.add(evaluacionPuestoBean3);
			p.setListaEvaluacionPiscologicas(listaEvaluacionPiscologicas);
		}
		{
			List<EvaluacionBean> listaEvaluacionTecnicas = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean3 = new EvaluacionBean(3L, EvaluacionBean.EVALUAION_TECNICA_01, 16);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean3);
			EvaluacionBean evaluacionPuestoBean4 = new EvaluacionBean(4L, EvaluacionBean.EVALUAION_TECNICA_02, 19);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean4);
			EvaluacionBean evaluacionPuestoBean2 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_TECNICA_03, 20);
			listaEvaluacionTecnicas.add(evaluacionPuestoBean2);
			p.setListaEvaluacionTecnicas(listaEvaluacionTecnicas);
		}
		{
			List<EvaluacionBean> listaEntrevista = new ArrayList<EvaluacionBean>();
			EvaluacionBean evaluacionPuestoBean5 = new EvaluacionBean(5L, EvaluacionBean.EVALUAION_ENTREVISTA_COORDINADOR_RRHH, 15);
			listaEntrevista.add(evaluacionPuestoBean5);
			EvaluacionBean evaluacionPuestoBean6 = new EvaluacionBean(6L, EvaluacionBean.EVALUAION_ENTREVISTA_GERENTE_AREA, 17);
			listaEntrevista.add(evaluacionPuestoBean6);
			p.setListaEntrevista(listaEntrevista);
		}

		return p;
	}

	public List<Postulacion> getPostulacionesPuestoProgramadorJavaJunior() {
		List<Postulacion> l = new ArrayList<Postulacion>();
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2017);
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(1L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaJunior());
			solicitudReclutamiento.setFechaLimite((c.getTime()));
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			solicitudReclutamiento.setPresupuestoMinimo(900);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante01());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(1L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaJunior());
			solicitudReclutamiento.setFechaLimite((c.getTime()));
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			solicitudReclutamiento.setPresupuestoMinimo(900);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante02());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(1L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaJunior());
			solicitudReclutamiento.setFechaLimite((c.getTime()));
			solicitudReclutamiento.setPresupuestoMinimo(900);
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante03());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(1L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaJunior());
			solicitudReclutamiento.setFechaLimite((c.getTime()));
			solicitudReclutamiento.setPresupuestoMinimo(900);
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante04());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(1L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaJunior());
			solicitudReclutamiento.setFechaLimite((c.getTime()));
			solicitudReclutamiento.setPresupuestoMinimo(900);
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante05());
			l.add(p);
		}
		return l;

	}

	public List<Postulacion> getPostulacionesPuestogetPuestoProgramadorJavaSemiSenior() {
		List<Postulacion> l = new ArrayList<Postulacion>();
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(2L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaSemiSenior());
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			solicitudReclutamiento.setPresupuestoMinimo(900);
			p.setUsuarioBean(getUsuarioPostulante07());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(2L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaSemiSenior());
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			solicitudReclutamiento.setPresupuestoMinimo(900);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante03());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(2L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaSemiSenior());
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			solicitudReclutamiento.setPresupuestoMinimo(900);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante04());
			l.add(p);
		}
		{
			Postulacion p = new Postulacion();
			SolicitudReclutamiento solicitudReclutamiento = new SolicitudReclutamiento();
			solicitudReclutamiento.setId(2L);
			solicitudReclutamiento.setPuesto(getPuestoProgramadorJavaSemiSenior());
			solicitudReclutamiento.setPresupuestoMaximo(2000);
			solicitudReclutamiento.setPresupuestoMinimo(1200);
			p.setSolicitudReclutamiento(solicitudReclutamiento);
			p.setUsuarioBean(getUsuarioPostulante05());
			l.add(p);
		}
		return l;

	}

	public static double similarity(String s1, String s2) {
		String longer = s1, shorter = s2;
		if (s1.length() < s2.length()) { // longer should always have greater
			// length
			longer = s2;
			shorter = s1;
		}
		int longerLength = longer.length();
		if (longerLength == 0) {
			return 1.0;
			/* both strings are zero length */ }
		return (longerLength - editDistance(longer, shorter)) / (double) longerLength;
	}

	public static int editDistance(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		int[] costs = new int[s2.length() + 1];
		for (int i = 0; i <= s1.length(); i++) {
			int lastValue = i;
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0)
					costs[j] = j;
				else {
					if (j > 0) {
						int newValue = costs[j - 1];
						if (s1.charAt(i - 1) != s2.charAt(j - 1))
							newValue = Math.min(Math.min(newValue, lastValue), costs[j]) + 1;
						costs[j - 1] = lastValue;
						lastValue = newValue;
					}
				}
			}
			if (i > 0)
				costs[s2.length()] = lastValue;
		}
		return costs[s2.length()];
	}

	public static void printSimilarity(String s, String t) {
		System.out.println(String.format("%.3f is the similarity between \"%s\" and \"%s\"", similarity(s.toLowerCase(), t.toLowerCase()), s.toLowerCase(), t.toLowerCase()));
	}

	public static double porcentagrIgualdad(String a, String b) {
		double v = similarity(a, b) * 1000000000;
		v = ((double) Math.round(v) / 1000000000);
		// System.out.println("a:"+a+"|b:"+b+ "|v:"+v);
		return v;
	}

	public static boolean tieneSimilitud(String a, String b) {
		boolean v = (InicializarData.porcentagrIgualdad(a, b) >= 0.8686);
		// System.out.println("a:" + a + "|b:" + b + "|v:" + v);
		return v;
	}

	public static boolean tieneSimilitud(double d) {
		boolean v = (d) >= 0.8686;
		return v;
	}

	public static void main(String[] args) {
		// printSimilarity("", "");
		// printSimilarity("Java", "java");
		System.out.println(porcentagrIgualdad("Java2222222", "java"));
		// printSimilarity("Java6", "java7");
		// printSimilarity("Java 1.6", "java ");
		// printSimilarity("1234567890", "1");
		// printSimilarity("1234567890", "123");
		// printSimilarity("1234567890", "1234567");
		// printSimilarity("1234567890", "1234567890");
		// printSimilarity("1234567890", "1234567980");
		// printSimilarity("47/2010", "472010");
		// printSimilarity("47/2010", "472011");
		// printSimilarity("47/2010", "AB.CDEF");
		// printSimilarity("47/2010", "4B.CDEFG");
		// printSimilarity("47/2010", "AB.CDEFG");
		// printSimilarity("The quick fox jumped", "The fox jumped");
		// printSimilarity("The quick fox jumped", "The fox");
		// printSimilarity("kitten", "sitting");
	}

}