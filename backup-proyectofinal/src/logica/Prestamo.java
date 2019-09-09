package logica;

import java.util.Date;

public class Prestamo {
	
	private int id;
	private Date fechaSolicitado;
	private Date fechaDevolucion;
	private Boolean devuelto;
	
	public Prestamo(int id, Date fechaSolicitado, Date fechaDevolucion, Boolean devuelto) {
		this.id = id;
		this.fechaSolicitado = fechaSolicitado;
		this.fechaDevolucion = fechaDevolucion;
		this.devuelto = devuelto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaSolicitado() {
		return fechaSolicitado;
	}

	public void setFechaSolicitado(Date fechaSolicitado) {
		this.fechaSolicitado = fechaSolicitado;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Boolean getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(Boolean devuelto) {
		this.devuelto = devuelto;
	}
		
}
