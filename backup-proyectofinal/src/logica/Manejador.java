package logica;

import java.util.ArrayList;

public class Manejador {
	private ArrayList<Usuario>usuarios;
	private ArrayList<Libro>libros;
	private ArrayList<Prestamo>prestamos;

	private static Manejador instance;
	
	private Manejador() {
	
	}
	
	public static Manejador getInstance() {
		if(instance == null) {
			instance = new Manejador();
		}
		
		return instance;
	}
}
