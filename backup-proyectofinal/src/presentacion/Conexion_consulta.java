package presentacion;

import java.beans.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Conexion_consulta {
	static Statement sentencia;
	static ResultSet resultado;

	public static ArrayList<String> Llenar_combo(){
		ArrayList<String> lista = new ArrayList<String>();
		String q = "SELECT * FROM Usuarios";
		return lista;
		try {
			resultado = ((Object) sentencia).executeQuery(q);
				System.out.println("Correcto");
			} catch (Exception e) {
				System.out.println("no correcto");
			}
		try {
			while(resultado.next()) {
				lista.add(resultado.getString("Nombre"));
				
			}
		catch {
			
			(Exception e);
			}
		}
		}
	} 

}
