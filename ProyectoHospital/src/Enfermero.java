
public class Enfermero extends PersonalSanitario {

	private final double sueldoEnfermero = 900;
	
	public Enfermero(String nombre, String apellido,int edad) {
		super(nombre, apellido, edad);
		
	}

	@Override
	public boolean curarPaciente(Paciente paciente) {
		
		return super.curarPaciente(paciente);
	}

	public double getSueldo() {
		return sueldoEnfermero;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+ " Sueldo enfermero = " + sueldoEnfermero + "]";
	}
	

}
