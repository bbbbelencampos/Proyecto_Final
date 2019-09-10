package logica;

public class Estudiante extends Usuario{
	
	private Orientacion orient;
	private int cantPrestamos;

	public Estudiante(int CI, String nombre, String apellido, String mail, String password, Orientacion orient, TipoUsuario tipoUsuario) {
		super(CI, nombre, apellido, mail, password, tipoUsuario);
		this.orient = orient;
	}

	public Orientacion getOrient() {
		return orient;
	}

	public void setOrient(Orientacion orient) {
		this.orient = orient;
	}

	public int getCantPrestamos() {
		return cantPrestamos;
	}

	public void setCantPrestamos(int cantPrestamos) {
		this.cantPrestamos = cantPrestamos;
	}
	
}