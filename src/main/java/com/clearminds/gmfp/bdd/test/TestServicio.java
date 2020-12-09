package com.clearminds.gmfp.bdd.test;

import java.sql.SQLException;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) throws SQLException {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		servicioEstudiante.insertarEstudiante(new Estudiante("Mayra", "Lopez"));
	}

}
