package logica;

import persistencia.*;
import presentacion.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		Conn connect = new Conn();
		Connection con = connect.conectarMySQL();
		Statement s;
		
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
		
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("INSERT INTO usuarios(ci, nombre, apellido, mail, pass, tipo) VALUES (" +CI +","+ nombre +","+ apellido +"," +mail +","+ password + ","+ tipo +")");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
