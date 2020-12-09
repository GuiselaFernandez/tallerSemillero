package com.clearminds.gmfp.bdd.test;

import java.sql.SQLException;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.insertarEstudiante(new Estudiante("Guisela", "Fernandez"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
