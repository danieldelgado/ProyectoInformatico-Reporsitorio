package com.hitss.reclutamiento.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class JsonUtil {

	private static final Gson GSON = new Gson();

	public static final String getJsonString(Object obj){
		return GSON.toJson(obj);
	}

	public static final void sendJsonReturn(HttpServletResponse response, Object obj) throws IOException{		
		PrintWriter out = response.getWriter();
		out.println(getJsonString(obj));
	}
	
	
	
	private JsonUtil() {	}

}
