package com.clearminds.gmfp.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	@SuppressWarnings("finally")
	public static String leerPropiedad(String nombrePropiedad) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("properties"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			if ("propiedad1".equals(nombrePropiedad)) {
				return p.getProperty("propiedad1");
			} else if ("propiedad2".equals(nombrePropiedad)) {
				return p.getProperty("propiedad2");
			} else {
				return null;
			}

		}
	}

}
