package logica;

public class Usuario {
	
	private int CI;
	private String nombre;
	private String apellido;
	private String mail;
	private String password;
	
	public Usuario(int CI, String nombre, String apellido, String mail, String password) {
		this.CI = CI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.password = password;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int CI) {
		this.CI = CI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
