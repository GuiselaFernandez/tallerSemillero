package com.clearminds.gmfp.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String FORMATO_COMPLETO="yyyy-MM-dd MM:mm:ss";
	public static String obtenerFecha(Date date) {
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd MM:mm:ss");
		String texto = formateador.format(date);
		
		return texto;
		
	}

}
