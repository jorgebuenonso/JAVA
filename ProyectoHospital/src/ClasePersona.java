
public class ClasePersona {
	
	 private String nombre,apellido,DNI;
	 private int edad;
	
	
	public ClasePersona(String nombre,String apellido,int edad) {
		
		this.edad =edad;
		this.nombre =nombre;
		this.apellido = apellido;
		generarDni();
		
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getDNI() {
		return DNI;
	}
	
	private  void generarDni() {
		
		DNI =String.valueOf((int)Math.floor(Math.random()*(99999999)));
		
	}
	
	


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Nueva persona con [nombre = " + nombre + ", apellido = " + apellido + ", DNI = " + DNI + ", edad = " + edad ;
	}
	
	
	
	
	
	

}
