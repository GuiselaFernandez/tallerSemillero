package com.clearminds.gmfp.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.gmfp.bdd.ConexionBDD;

public class ServicioBase {
	public Connection conexion;
	
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() {
		new ConexionBDD();
		conexion= ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion() {
		try {
			if(conexion!=null){
			conexion.close();
			System.out.println("Conexión cerrada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}
		
	}

}
