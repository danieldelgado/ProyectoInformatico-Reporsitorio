package com.hitss.rev.bean;

import java.util.Collection;
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
		System.out.println("--------------Obteniendo resultados----------------");
		ObjectFilter filter = new ClassObjectFilter(Postulacion.class);
		Collection<FactHandle> factHandles = session.getFactHandles(filter );
		lpst.clear();
		Postulacion pc = null;
		for (FactHandle factHandle : factHandles) { 
			pc = (Postulacion) ((DefaultFactHandle) factHandle).getObject();
			lpst.add(pc);
		}		
		session.dispose();
		
		OrdenPostulantes.ordenPostulantes(lpst);
		
	}

	public static void main(String[] args) {
		new TestDrools();
	}

}
