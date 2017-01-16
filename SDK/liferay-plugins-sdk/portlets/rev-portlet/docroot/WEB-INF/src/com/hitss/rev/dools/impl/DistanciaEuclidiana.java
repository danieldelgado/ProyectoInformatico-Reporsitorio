package com.hitss.rev.dools.impl;

import java.util.ArrayList;
import java.util.List;

public class DistanciaEuclidiana {

	public static double calcularDistancia(List<Euclistica> vals){	
		List<Double> v = new ArrayList<Double>();		
		double val = 0;
		for (Euclistica euclistica : vals) {			
			val = elevarAlCuadrado( resta(euclistica.getValorDefinido(), euclistica.getValor()) ) ;
			v.add(val);
		}		
		val = sumaValores(v);		
		val= val/vals.size();		
		return raizCuadrada(val);
	}
	
	
	private static double raizCuadrada(double a){
		return Math.sqrt(a);
	}
	
	private static double sumaValores(List<Double> listaValores) {
		double suma = 0;
		for (Double as : listaValores) {
			suma += as;
		}
		return suma;
	}

	private static double resta(double a,double b){
		return a-b;
	}
	
	
	private static double elevarAlCuadrado(double val){
		return Math.pow(val, 2);
	}
	
	public static void main(String[] args) {
		{
			List<Euclistica> lista  = new ArrayList<Euclistica>();
			Euclistica a = new Euclistica(1.0, 1.0);
			lista.add(a);
			Euclistica a2 = new Euclistica(1.0, 0.7);
			lista.add(a2);
			Euclistica a3 = new Euclistica(0.6, 0.6);
			lista.add(a3);
			Euclistica a4 = new Euclistica(0.7, 0.6);
			lista.add(a4);
			Euclistica a5 = new Euclistica(0.7, 1.0);
			lista.add(a5);
			Euclistica a6 = new Euclistica(1.0, 0.8);
			lista.add(a6);
			Euclistica a7 = new Euclistica(1.0, 1.0);
			lista.add(a7);
			Euclistica a8 = new Euclistica(0.8, 0.2);
			lista.add(a8);		
			System.out.println(DistanciaEuclidiana.calcularDistancia(lista));
		}
		{
			List<Euclistica> lista  = new ArrayList<Euclistica>();
			Euclistica a = new Euclistica(1.0, 0.7);
			lista.add(a);
			Euclistica a2 = new Euclistica(1.0, 0.9);
			lista.add(a2);
			Euclistica a3 = new Euclistica(0.6, 0.9);
			lista.add(a3);
			Euclistica a4 = new Euclistica(0.7, 0.8);
			lista.add(a4);
			Euclistica a5 = new Euclistica(0.7, 0.8);
			lista.add(a5);
			Euclistica a6 = new Euclistica(1.0, 0.7);
			lista.add(a6);
			Euclistica a7 = new Euclistica(1.0, 0.7);
			lista.add(a7);
			Euclistica a8 = new Euclistica(0.8, 0.6);
			lista.add(a8);		
			System.out.println(calcularDistancia(lista));
		}
		{
			List<Euclistica> lista  = new ArrayList<Euclistica>();
			Euclistica a = new Euclistica(1.0, 0.6);
			lista.add(a);
			Euclistica a2 = new Euclistica(1.0, 0.8);
			lista.add(a2);
			Euclistica a3 = new Euclistica(0.6, 1.0);
			lista.add(a3);
			Euclistica a4 = new Euclistica(0.7, 0.8);
			lista.add(a4);
			Euclistica a5 = new Euclistica(0.7, 0.8);
			lista.add(a5);
			Euclistica a6 = new Euclistica(1.0, 1.0);
			lista.add(a6);
			Euclistica a7 = new Euclistica(1.0, 0.6);
			lista.add(a7);
			Euclistica a8 = new Euclistica(0.8, 1.0);
			lista.add(a8);		
			System.out.println(calcularDistancia(lista));
		}
	}


	
}

