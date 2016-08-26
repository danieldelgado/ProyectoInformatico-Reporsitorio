package com.hitss.rev.util;

import java.text.MessageFormat;

public class PropiedadMensaje {

	public static String getMessage(String message, String... values){
		return MessageFormat.format(message, values);
	}
		
	private PropiedadMensaje(){}	
}
