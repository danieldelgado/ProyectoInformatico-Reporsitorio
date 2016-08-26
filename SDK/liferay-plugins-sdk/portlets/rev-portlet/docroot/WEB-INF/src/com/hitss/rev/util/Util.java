package com.hitss.rev.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	private static final SimpleDateFormat  SIMPLE_DATE_FORMAT =  new SimpleDateFormat("dd/MM/yyyy");
	
	public static final String getStrFecha(final Date date){
		return SIMPLE_DATE_FORMAT.format(date);
	}
	public static final Date getFecha(final String strDate) throws ParseException{
		return SIMPLE_DATE_FORMAT.parse(strDate);
	}
	
	
}
