package com.clearminds.gmfp.bdd.test;

import java.awt.image.DataBufferUShort;
import java.sql.SQLException;
import java.util.Date;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.excepciones.BDDException;
import com.clearminds.gmfp.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) throws SQLException {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.insertarEstudiante(new Estudiante("Manuel", "Luz",15,"fechaa"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
