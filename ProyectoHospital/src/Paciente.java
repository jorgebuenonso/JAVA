
public class Paciente extends ClasePersona {

	String dolencia [] = {"cancer","enfermedadRara","cuentitisAguda"};
	
	
	public Paciente(String nombre, String apellido,int edad) {
		super(nombre, apellido, edad);
		
	}
	
	
	public boolean curarEnfermedad() {
		
		
		if (dolencia.equals("cancer")) {
			
			return false;
			
		}else if (dolencia.equals("enfermedadRara")) {
			
			return false;
		}
		return true;
		
	}

}
