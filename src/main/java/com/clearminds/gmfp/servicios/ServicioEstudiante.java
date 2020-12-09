package com.clearminds.gmfp.servicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("insertando estudiante " + estudiante.toString());
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "INSERT INTO estudiantes (nombre,apellido) " + "VALUES ('" + estudiante.getNombre() + "', '"
					+ estudiante.getApellido() + "')";
			System.out.println("Script: " + sql);
			stmt.execute(sql);
			cerrarConexion();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al ingresar estudiante");
		}

	}

}
