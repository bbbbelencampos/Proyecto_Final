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
	
	public void altaUsuario(int CI, String nombre, String apellido, String mail, String password, TipoUsuario tipo, Orientacion orient){
		
		switch(tipo) {
		
			case ESTUDIANTE:
				Estudiante estudiante = new Estudiante(CI, nombre, apellido, mail, password, orient, tipo);
				this.usuarios.add(estudiante);
				
				break;
			case PROFESOR:
				Profesor profesor = new Profesor(CI, nombre, apellido, mail, password, orient, tipo);
				this.usuarios.add(profesor);
				
				break;
			case BIBLIOTECARIO:
				Bibliotecario bibliotecario = new Bibliotecario(CI, nombre, apellido, mail, password, tipo);
				this.usuarios.add(bibliotecario);
				
				break;
		}
		
	}
	
}
