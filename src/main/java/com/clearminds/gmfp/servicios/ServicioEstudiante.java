package com.clearminds.gmfp.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.rmi.CORBA.Util;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
	
		estudiante.setFechaModificacion(DateUtil.obtenerFecha(new Date()));
		abrirConexion();
		System.out.println("insertando estudiante " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "INSERT INTO estudiantes (nombre,apellido,edad, fecha_modificacion) " + "VALUES ('" + estudiante.getNombre() + "', '"
					+ estudiante.getApellido() +"', "+ estudiante.getEdad()+ ", '"+ estudiante.getFechaModificacion()+ "')";
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
		estudiante.setFechaModificacion(DateUtil.obtenerFecha(new Date()));
		abrirConexion();
		System.out.println("Actualizando estudiante " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "', edad="+ estudiante.getEdad()+ ", fecha_modificacion= '"+ estudiante.getFechaModificacion() + "' where id="+estudiante.getId()+"";
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
