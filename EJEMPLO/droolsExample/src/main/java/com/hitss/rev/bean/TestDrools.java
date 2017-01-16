package com.hitss.rev.bean;

import java.util.List;


public class TestDrools {

	InicializarData i = new InicializarData();

	public TestDrools() {
		System.out.println("--------PostulacionesPuestoProgramadorJavaJunior---------");
		List<Postulacion> lpst = i.getPostulacionesPuestoProgramadorJavaJunior();		
		lpst = DataAnalisisExperto.analisisDatos(lpst);
		for (Postulacion postulacion : lpst) {
			System.out.println(postulacion.getUsuarioBean().getIdUsuario());
			System.out.println("getIdUsuario--" + postulacion.getUsuarioBean().getIdUsuario());
			System.out.println("DistanciaEuclidianaEntrevista--" + postulacion.getDistanciaEuclidianaEntrevista());
			System.out.println("DistanciaHammingEntrevista--" + postulacion.getDistanciaHammingEntrevista());
			System.out.println("DistanciaEuclidianaPsicologico--" + postulacion.getDistanciaEuclidianaPsicologico());
			System.out.println("DistanciaHammingPsicologico--" + postulacion.getDistanciaHammingPsicologico());
			System.out.println("DistanciaEuclidianaTecnico--" + postulacion.getDistanciaEuclidianaTecnico());
			System.out.println("DistanciaHammingTecnico--" + postulacion.getDistanciaHammingTecnico());
			System.out.println("RecomendableReqCum--" + postulacion.isRecomendableReqCum() + " al " +  postulacion.getPorcentajeReqCum() );
			System.out.println("RecomendableRequisitosCumplidoPorUsuario--" + postulacion.isRecomendableRequisitosCumplidoPorUsuario() + " al " +  postulacion.getPorcentajeRequisitosCumplidoPorUsuario() );
			if(postulacion.getPorcentajeReqCertiCum()>0){
				System.out.println("RecomendableReqCertiCum--" + postulacion.isRecomendableReqCertiCum() + " al " +  postulacion.getPorcentajeReqCertiCum() );
				System.out.println("RecomendableCertificadoCumplidoPorUsuario--" + postulacion.isRecomendableCertificadoCumplidoPorUsuario() + " al " +  postulacion.getPorcentajeCertificadoCumplidoPorUsuario() );				
			}
			System.out.println("-----------------");
		}
		System.out.println("--------PostulacionesPuestogetPuestoProgramadorJavaSemiSenior---------");
		lpst = i.getPostulacionesPuestogetPuestoProgramadorJavaSemiSenior();
		lpst = DataAnalisisExperto.analisisDatos(lpst);
		for (Postulacion postulacion : lpst) {
			System.out.println(postulacion.getUsuarioBean().getIdUsuario());
			System.out.println("getIdUsuario--" + postulacion.getUsuarioBean().getIdUsuario());
			System.out.println("DistanciaEuclidianaEntrevista--" + postulacion.getDistanciaEuclidianaEntrevista());
			System.out.println("DistanciaHammingEntrevista--" + postulacion.getDistanciaHammingEntrevista());
			System.out.println("DistanciaEuclidianaPsicologico--" + postulacion.getDistanciaEuclidianaPsicologico());
			System.out.println("DistanciaHammingPsicologico--" + postulacion.getDistanciaHammingPsicologico());
			System.out.println("DistanciaEuclidianaTecnico--" + postulacion.getDistanciaEuclidianaTecnico());
			System.out.println("DistanciaHammingTecnico--" + postulacion.getDistanciaHammingTecnico());
			System.out.println("RecomendableReqCum--" + postulacion.isRecomendableReqCum() + " al " +  postulacion.getPorcentajeReqCum() );
			System.out.println("RecomendableRequisitosCumplidoPorUsuario--" + postulacion.isRecomendableRequisitosCumplidoPorUsuario() + " al " +  postulacion.getPorcentajeRequisitosCumplidoPorUsuario() );
			if(postulacion.getPorcentajeReqCertiCum()>0){
				System.out.println("RecomendableReqCertiCum--" + postulacion.isRecomendableReqCertiCum() + " al " +  postulacion.getPorcentajeReqCertiCum() );
				System.out.println("RecomendableCertificadoCumplidoPorUsuario--" + postulacion.isRecomendableCertificadoCumplidoPorUsuario() + " al " +  postulacion.getPorcentajeCertificadoCumplidoPorUsuario() );				
			}
			System.out.println("-----------------");
		}
		
	}

	public static void main(String[] args) {
		new TestDrools();
	}

}
