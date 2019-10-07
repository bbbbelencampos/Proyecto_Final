package logica;

import persistencia.*;
import presentacion.*;

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
	
	public void altaUsuario(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario tipo, Orientacion orient){
		
		switch(tipo) {
		case ESTUDIANTE:
			Estudiante estudiante = new Estudiante(id, CI, nombre, apellido, mail, password, orient, tipo);
			break;
		case PROFESOR:
			Profesor profesor = new Profesor();
			break;
		case BIBLIOTECARIO:
			
			break;
		}
	}
	
}
