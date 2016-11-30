package com.hitss.rev.bean;

import java.util.Collection;
import java.util.List;

import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

@SuppressWarnings("deprecation")
public class TestDrools {

	InicializarData i = new InicializarData();

	public TestDrools() {
		System.out.println("TestDrools");
		List<Postulacion> lpst = i.getPostulacionesPuestoProgramadorJavaJunior();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("filtrarPostulantes.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("conocimientos.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("evaluacionesPsicologicas.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("evaluacionesTecnicas.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("entrevistas.drl", TestDrools.class), ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("seleccion.drl", TestDrools.class), ResourceType.DRL);
		System.out.println("TestDrools2");
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		final KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(pkgs);
		StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession();
		for (Postulacion postulacion : lpst) {
			session.insert(postulacion);
		}
		System.out.println("fireAllRules");
		session.fireAllRules();
		System.out.println(kbuilder.getErrors());
		// $usuario.salario >= $solicitud.presupuestoMinimo,
		// Postulacion p = null;
		// for (Object o : session.getObjects()) {
		// System.out.println(o);
		// p = (Postulacion) o;
		// System.out.println("pasa primer filtro:"+p.isFiltroPostulacion());
		// }

		session.dispose();
	}

	public static void main(String[] args) {
		new TestDrools();
	}

}
