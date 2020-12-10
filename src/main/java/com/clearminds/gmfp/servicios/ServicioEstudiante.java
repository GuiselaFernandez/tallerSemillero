package com.clearminds.gmfp.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("insertando estudiante " + estudiante);
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
	
	public void actualizarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("Actualizando estudiante " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "' where id="+estudiante.getId()+"";
			System.out.println("Script: " + sql);
			stmt.execute(sql);
			cerrarConexion();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
		
		
	}

}
