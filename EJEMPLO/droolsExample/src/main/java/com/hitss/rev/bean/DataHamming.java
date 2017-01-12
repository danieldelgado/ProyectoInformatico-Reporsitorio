package com.hitss.rev.bean;

import java.util.ArrayList;
import java.util.List;

public class DataHamming {

	public static double calcularDistancia(List<Haming> lista ) {		
		List<Double> vals = new ArrayList<Double>();
		double v = 0;
		for (Haming ha : lista) {			
			v = restaAbsoluta(ha.getValorDefinido(), ha.getValor());
			vals.add(v);
			v = 0;
		}
		v = sumaValores(vals);
		return v/lista.size();
	}

	private static double sumaValores(List<Double> listaValores) {
		double suma = 0;
		for (Double as : listaValores) {
			suma += as;
		}
		return suma;
	}

	private static double restaAbsoluta(double a, double b) {
		return Math.abs(a - b);
	}

	public static void main(String[] args) {
		{
			List<Haming> lista  = new ArrayList<Haming>();
			Haming a = new Haming(1.0, 1.0);
			lista.add(a);
			Haming a2 = new Haming(1.0, 0.7);
			lista.add(a2);
			Haming a3 = new Haming(0.6, 0.6);
			lista.add(a3);
			Haming a4 = new Haming(0.7, 0.6);
			lista.add(a4);
			Haming a5 = new Haming(0.7, 1.0);
			lista.add(a5);
			Haming a6 = new Haming(1.0, 0.8);
			lista.add(a6);
			Haming a7 = new Haming(1.0, 1.0);
			lista.add(a7);
			Haming a8 = new Haming(0.8, 0.2);
			lista.add(a8);		
			System.out.println(calcularDistancia(lista));
		}
		{
			List<Haming> lista  = new ArrayList<Haming>();
			Haming a = new Haming(1.0, 0.7);
			lista.add(a);
			Haming a2 = new Haming(1.0, 0.9);
			lista.add(a2);
			Haming a3 = new Haming(0.6, 0.9);
			lista.add(a3);
			Haming a4 = new Haming(0.7, 0.8);
			lista.add(a4);
			Haming a5 = new Haming(0.7, 0.8);
			lista.add(a5);
			Haming a6 = new Haming(1.0, 0.7);
			lista.add(a6);
			Haming a7 = new Haming(1.0, 0.7);
			lista.add(a7);
			Haming a8 = new Haming(0.8, 0.6);
			lista.add(a8);		
			System.out.println(calcularDistancia(lista));
		}
		{
			List<Haming> lista  = new ArrayList<Haming>();
			Haming a = new Haming(1.0, 0.6);
			lista.add(a);
			Haming a2 = new Haming(1.0, 0.8);
			lista.add(a2);
			Haming a3 = new Haming(0.6, 1.0);
			lista.add(a3);
			Haming a4 = new Haming(0.7, 0.8);
			lista.add(a4);
			Haming a5 = new Haming(0.7, 0.8);
			lista.add(a5);
			Haming a6 = new Haming(1.0, 1.0);
			lista.add(a6);
			Haming a7 = new Haming(1.0, 0.6);
			lista.add(a7);
			Haming a8 = new Haming(0.8, 1.0);
			lista.add(a8);		
			System.out.println(calcularDistancia(lista));
		}
				
	}
	
}
