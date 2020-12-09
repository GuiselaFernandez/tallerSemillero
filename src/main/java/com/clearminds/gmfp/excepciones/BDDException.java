package com.clearminds.gmfp.excepciones;

public class BDDException extends RuntimeException {
	public BDDException(String mensaje)
	{
		super(mensaje);
		System.out.println("no se puedo conectar a la base de datos");
	}
}
