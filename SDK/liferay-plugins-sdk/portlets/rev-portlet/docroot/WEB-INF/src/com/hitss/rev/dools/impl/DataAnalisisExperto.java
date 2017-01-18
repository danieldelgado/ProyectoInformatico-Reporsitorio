package com.hitss.rev.dools.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.common.DefaultFactHandle;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.drools.runtime.ClassObjectFilter;
import org.drools.runtime.ObjectFilter;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.FactHandle;

public class DataAnalisisExperto {

	public static List<Postulacion> analisisDatos(List<Postulacion> lpst) {
		List<Postulacion> a = new ArrayList<Postulacion>();
		List<Postulacion> aux = lpst;
		while (!(aux = analisisDrools(aux)).isEmpty()) {
			if (!aux.isEmpty()) {
				a.add(aux.get(0));
				aux.remove(0);
			}
		}
		return a;
	}

	private static List<Postulacion> analisisDrools(List<Postulacion> lpst) {
		if (lpst.isEmpty()) {
			return new ArrayList<Postulacion>();
		}

		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("rules/filtrarPostulantes.drl"), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("rules/conocimientos.drl"), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("rules/evaluacionesPsicologicas.drl"), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("rules/evaluacionesTecnicas.drl"), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("rules/entrevistas.drl"), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("rules/distancias.drl"), ResourceType.DRL);

		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		final KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(pkgs);
		StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession();

		for (Postulacion postulacion : lpst) {
			session.insert(postulacion);
		}

		System.out.println("Ejecutando reglas");
		session.fireAllRules();
		System.out.println(kbuilder.getErrors());
		System.out.println("--------------Obteniendo resultados----------------");
		ObjectFilter filter = new ClassObjectFilter(Postulacion.class);
		Collection<FactHandle> factHandles = session.getFactHandles(filter);
		lpst.clear();
		Postulacion pc = null;
		for (FactHandle factHandle : factHandles) {
			pc = (Postulacion) ((DefaultFactHandle) factHandle).getObject();
			if (pc.getDistanciaEuclidianaEntrevista() > 0 && pc.getDistanciaHammingEntrevista() > 0 && pc.getDistanciaEuclidianaPsicologico() > 0
					&& pc.getDistanciaHammingPsicologico() > 0 && pc.getDistanciaEuclidianaTecnico() > 0 && pc.getDistanciaHammingTecnico() > 0) {
				lpst.add(pc);
			}
		}
		lpst = ordenandoListaPostulantes(lpst);
		session.dispose();
		return lpst;

	}

	private static List<Postulacion> ordenandoListaPostulantes(List<Postulacion> lpst) {
		if (lpst.isEmpty()) {
			return new ArrayList<Postulacion>();
		}
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("rules/ordenMascercano.drl"), ResourceType.DRL);
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		final KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(pkgs);
		StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession();
		for (Postulacion postulacion : lpst) {
			session.insert(postulacion);
		}
		System.out.println("Ejecutando orden de reglas");
		session.fireAllRules();
		System.out.println(kbuilder.getErrors());
		System.out.println("--------------Obteniendo resultados de orden----------------");
		ObjectFilter filter = new ClassObjectFilter(Postulacion.class);
		Collection<FactHandle> factHandles = session.getFactHandles(filter);
		lpst.clear();
		Postulacion pc = null;
		for (FactHandle factHandle : factHandles) {
			pc = (Postulacion) ((DefaultFactHandle) factHandle).getObject();
			lpst.add(pc);
		}

		Comparator<Postulacion> order = new Comparator<Postulacion>() {
			public int compare(Postulacion e1, Postulacion e2) {
				return Integer.compare(Double.valueOf(e1.getCercania() * 1000).intValue(), Double.valueOf(e2.getCercania() * 1000).intValue());
			}
		};

		Collections.sort(lpst, order);

		return lpst;
	}

}
