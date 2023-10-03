
public class PersonalSanitario extends ClasePersona  {

	
	//private double sueldo;
	
	
	
	public PersonalSanitario(String nombre, String apellido,int edad) {
		super(nombre, apellido, edad);
		

}
	

	public boolean curarPaciente(Paciente paciente){
		
		int curar =(int)Math.floor(Math.random()*(0-10+1)+10);
		
		if (curar <5) {
			
			return false;
			
		}else{
			
			return true;
			
		}
				
		
	}
	
	
	
	
	
}