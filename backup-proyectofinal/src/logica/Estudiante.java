package logica;

public class Estudiante extends Usuario{
	
	private Orientacion orient;
	private int prestamos;
	
	public Estudiante(int CI, String nombre, String apellido, String mail, String password, Orientacion orient, int prestamos) {
		super(CI, nombre, apellido, mail, password);
		this.orient = orient;
		this.prestamos = prestamos;
	}

	public Orientacion getOrient() {
		return orient;
	}

	public void setOrient(Orientacion orient) {
		this.orient = orient;
	}

	public int getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(int prestamos) {
		this.prestamos = prestamos;
	}
		
}
