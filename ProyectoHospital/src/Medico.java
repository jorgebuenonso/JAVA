
public class Medico extends PersonalSanitario {

	private final double sueldoMedico = 1900;
	
	public Medico(String nombre, String apellido,int edad) {
		super(nombre, apellido, edad);
		
	}

	@Override
	public boolean curarPaciente(Paciente paciente) {
		
		return super.curarPaciente(paciente);
	}

	public double getSueldoMedico() {
		return sueldoMedico;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Sueldo médico = " + sueldoMedico + "]";
	}

	
	
	
	
	
	
	

}
