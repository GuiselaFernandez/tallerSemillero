package com.clearminds.gmfp.servicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.gmfp.dtos.Estudiante;

public class ServicioEstudiante extends ServicioBase {

	

	public void insertarEstudiante(Estudiante estudiante) throws SQLException {
		abrirConexion();
		System.out.println("insertando estudiante " +estudiante.toString());
		
		cerrarConexion();

	}

}
