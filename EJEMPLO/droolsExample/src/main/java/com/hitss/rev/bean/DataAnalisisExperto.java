package com.hitss.rev.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.drools.core.common.DefaultFactHandle;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.ClassObjectFilter;
import org.kie.api.runtime.ObjectFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

@SuppressWarnings("deprecation")
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
		if(lpst.isEmpty()){
			return new ArrayList<Postulacion>();
		}
			
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("filtrarPostulantes.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("conocimientos.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("evaluacionesPsicologicas.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("evaluacionesTecnicas.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("entrevistas.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("distancias.drl", TestDrools.class), ResourceType.DRL);
		
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
			if (pc.getDistanciaEuclidianaEntrevista() > 0 && pc.getDistanciaHammingEntrevista() > 0 && pc.getDistanciaEuclidianaPsicologico() > 0 && pc.getDistanciaHammingPsicologico() > 0
					&& pc.getDistanciaEuclidianaTecnico() > 0 && pc.getDistanciaHammingTecnico() > 0) {
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
		kbuilder.add(ResourceFactory.newClassPathResource("ordenMascercano.drl", TestDrools.class), ResourceType.DRL);
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
