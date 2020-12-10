package com.clearminds.gmfp.bdd.test;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.excepciones.BDDException;
import com.clearminds.gmfp.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.actualizarEstudiante(new Estudiante("Manuel", "Luz", 10, 23));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}

	}

}
