package logica;

public class Profesor extends Usuario{

	private Orientacion orient;
	
<<<<<<< HEAD
	public Profesor(int id, int CI, String nombre, String apellido, String mail, String password,Orientacion orient, TipoUsuario tipoUsuario) {
		super(id, CI, nombre, apellido, mail, password, tipoUsuario);
=======
	public Profesor(int CI, String nombre, String apellido, String mail, String password, Orientacion orient, TipoUsuario tipoUsuario) {
		super(CI, nombre, apellido, mail, password, tipoUsuario);
>>>>>>> presentacion
		this.orient = orient;
	}

	public Orientacion getOrient() {
		return orient;
	}

	public void setOrient(Orientacion orient) {
		this.orient = orient;
	}
	
}
