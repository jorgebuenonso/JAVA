package Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Persona implements Serializable, Comparable<Persona>,Comparator<Persona> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroDni;
	private String nombre,apellido,fechaNacimiento,nacionalidad;
	private LocalDate fecha;
	
	
	public Persona(String numeroDni, String nombre, String apellido, String fechaNacimiento, String nacionalidad,String fecha) {
		super();
		this.numeroDni = numeroDni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fecha = LocalDate.parse(fecha,dtf);
	}

	public Persona() {
		
	}

	public Persona(String dni) {
		this.numeroDni = dni;
	}


	public String getNumeroDni() {
		return numeroDni;
	}


	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
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


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int antiguedad() {
		
		return (int) this.fecha.until(LocalDate.now(), ChronoUnit.YEARS);
	}


	@Override
	public String toString() {
		return "\n===================================\nNúmero de Dni = " + numeroDni + "\nNombre = " + nombre + "\nApellido = " + apellido
				+ "\nFecha de nacimiento = " + fechaNacimiento + "\nNacionalidad = " + nacionalidad+ "\nAntiguedad: "+ antiguedad();
	}


	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o2.antiguedad() - o1.antiguedad();
	}


	@Override
	public int compareTo(Persona o) {
		
		return this.numeroDni.compareTo(o.numeroDni);
	}
	
	public boolean equals(Object o) {
		
		
		return this.numeroDni.equals(((Persona)o).numeroDni);
	}
	
	
	
	

}
