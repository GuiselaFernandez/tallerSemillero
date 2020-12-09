package com.clearminds.gmfp.bdd.test;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		servicioEstudiante.actualizarEstudiante(new Estudiante("Mayraaa", "Lopez", 2));

	}

}
