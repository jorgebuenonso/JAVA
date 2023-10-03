package Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Socio implements Comparable<Socio>,Serializable, Comparator<Socio> {

	private static final long serialVersionUID = 1L;
	
	private String dni;
	private String nombre;
	private LocalDate fechaAlta;
	private String telefono;
	
	

	public Socio(String dni, String nombre,String telefono,String fechaAlta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAlta = LocalDate.parse(fechaAlta,dtf);
	}
	
	public Socio() {
		
	}
	
	public Socio(String dni) {
		this.dni = dni;
	}
	
	public int antiguedad() {
		
		return  (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
	
	}


	@Override
	public int compareTo(Socio o) {
		
		
		return  (this.dni).compareTo(o.dni);
	}
	
	
	
	  public boolean equals(Object o) { // revisar si hace algo
	  
	  return dni.equals(((Socio) o).dni);
	  
	  }
	 
	

	/*
	 * public boolean equals(String o) {
	 * 
	 * return dni.equals(o);
	 * 
	 * }
	 */
	 
	
	@Override
	public int compare(Socio o1, Socio o2) {
		
		return o2.antiguedad() - o1.antiguedad();// de mayor a menor
	}
	
	@Override
	public String toString() {
		return "Socio [dni = " + dni + ", nombre = " + nombre + " Telefono "+ telefono +", Antigüedad "+ antiguedad()+"]\n";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	

}
