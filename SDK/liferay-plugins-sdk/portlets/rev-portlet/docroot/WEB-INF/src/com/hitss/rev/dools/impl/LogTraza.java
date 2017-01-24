package com.hitss.rev.dools.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogTraza {

	private static List<Traza> listaList;
		
	private LogTraza() {	
		listaList = null;
	}
		
	public static List<Traza> getListaList() {
		return listaList;
	}

	public static void inicializar(){
		listaList = null;
	}
	
	public static void log(Long solicitudId,Long usuarioId, String m){
		if(listaList==null){
			listaList = new ArrayList<Traza>();
		}
		Traza t = new Traza( new Date(), solicitudId , usuarioId , m );
		listaList.add(t);
	}

}
