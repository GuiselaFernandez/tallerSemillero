package com.clearminds.gmfp.bdd.test;

import java.sql.Connection;

import com.clearminds.gmfp.bdd.ConexionBDD;
import com.clearminds.gmfp.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexion exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		

	}

}
