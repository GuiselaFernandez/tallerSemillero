package com.clearminds.gmfp.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.gmfp.excepciones.BDDException;

public class ConexionBDD {
	@SuppressWarnings("finally")
	public static String leerPropiedad(String nombrePropiedad) {
		Properties p = new Properties();
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());

		try {
			p.load(new FileReader(f.getAbsoluteFile()));
			if ("usuario".equals(nombrePropiedad)) {
				return p.getProperty("usuario");
			} else if ("password".equals(nombrePropiedad)) {
				return p.getProperty("password");
			} else if ("urlConexion".equals(nombrePropiedad)) {
				return p.getProperty("urlConexion");
			}
			return null;
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
			
		
	}
	
	public static Connection obtenerConexion() throws BDDException {
		String usuario = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		String urlConexion = leerPropiedad("urlConexion");
		
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			conn= DriverManager.getConnection(urlConexion, usuario, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
