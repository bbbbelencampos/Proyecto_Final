package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logica.Orientacion;
import logica.TipoUsuario;

public class Manejador {
	
	public void sentenciaAltaUsuario(int id, int CI, String nombre, String apellido, String mail, String password, Orientacion orient, TipoUsuario tipo) {
		
		Conn connect = new Conn();
		Connection con = connect.conectarMySQL();
		Statement s;
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("SELECT * FROM biblAnima");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
