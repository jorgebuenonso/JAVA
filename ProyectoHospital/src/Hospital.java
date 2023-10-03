import java.util.Iterator;

public class Hospital {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		int opcionMenu;
		
		do {
			
			opcionMenu = menu(); 
			
		switch (opcionMenu) {
		
		
		case 1: System.out.println("Agregando un médico...\n" +hospital.agregarMedico());
		hospital.personalSanitario.toString();
		break;
		case 2: System.out.println("Agregando un enfermero...\n1 "+ hospital.agregarEnfermero());
			
			break;
		
		case 3: System.out.println("Agregando un paciente...\n "+hospital.agregarPaciente());
		
		
		break;	
		
		case 4 : System.out.println("Atendiendo a paciente...\n " + hospital.atenderPaciente());
		break;	
		
		case 5 : System.out.println("Agregando capacidad...\n");
			hospital.cambiarCapacidad();
				System.out.println("La nueva capacidad es de: " +hospital.personalSanitario.length);
		break;	
		
		case 6 : System.out.println("\nSaliendo del sistema");
		break;
			
		default : System.out.println("Introduzca una opción correcta");			
		}
		
		} while (opcionMenu!=6);	
					
	}
	
	public Hospital() {
		
		personalSanitario = new PersonalSanitario [10];
		pacientes = new Paciente [20];
		
	}
	
	public static int menu() {
		
	
		
		System.out.println("============= MI MENU ====================\n");
		System.out.println("1. Agregar Médico");
		System.out.println("2. Agregar Enfermero");
		System.out.println("3. Agregar paciente");
		System.out.println("4. Atender paciente");
		System.out.println("5. Agregar capacidad");
		System.out.println("6. Salir\n");
		
		
		return Integer.parseInt(MiScanner.leer("Introduce una opción"));
	}

	PersonalSanitario personalSanitario [];
	Paciente pacientes [];
	int numMedicos =0;
	
	public  Medico agregarMedico() {
			
		
		for (int i = numMedicos; i < personalSanitario.length; i++) {
			
			String nombre,apellido;
			int edad;
		
			   if(personalSanitario[i]==null) {
				   
				    nombre =(MiScanner.leer("Introduzca Nombre del médico"));
				    apellido=(MiScanner.leer("Introduzca apellido del médico"));
				    edad=Integer.parseInt((MiScanner.leer("Introduzca edad del médico")));
				    
				    Medico medico = new Medico(nombre, apellido, edad);
				   
				   personalSanitario[i] = medico;
				   numMedicos ++;
				   
				 return medico;
		
				   
			   }	  
			
		}
		return null;
		 		 
		
		
	}
	
		public Enfermero agregarEnfermero() {
		
		 String nombre,apellido;
		 
		  int edad;
		  
		  Enfermero enfermero;
		
		for (int i = 0; i < personalSanitario.length; i++) {
			   
			   if(personalSanitario[i]==null) {
				   
				   nombre = (MiScanner.leer("Introduzca Nombre del enfermero"));
				   apellido =(MiScanner.leer("Introduzca apellido del enfermero"));
				   edad=Integer.parseInt(MiScanner.leer("Introduzca edad del enfermero"));
				   
				   enfermero =new Enfermero(nombre, apellido, edad);
				   
				   personalSanitario[i] = enfermero;
				   
				   return enfermero;
			   
			   }	
			  
		
		}
		 		
		return null;
		
	}
		
		public Paciente agregarPaciente() {
			
			 String nombre,apellido;
			  int edad;
			 Paciente paciente;
			
			for (int i = 0; i < pacientes.length; i++) {
				
				if (pacientes[i]== null) {
					
					nombre = MiScanner.leer("Introduzca nombre del paciente");
					apellido = MiScanner.leer("Introduzca apellido del paciente");
				    edad=Integer.parseInt(MiScanner.leer("Introduzca edad del paciente"));
				    
				     paciente = new Paciente(nombre, apellido, edad);
					
				    pacientes[i]=  paciente;
				  
				    return paciente;
					
				}
				
			}
			return null;
		}
		
		
		
		
	
	public boolean atenderPaciente() {
		
		for (int i = 0; i < personalSanitario.length; i++) {
			
			if(personalSanitario[i] != null)  {
				
				for (int j = 0; j < pacientes.length; j++) {
					
					if(pacientes[j] != null) {
						
						return  personalSanitario[i].curarPaciente(pacientes[j]); 
					
					}
					
				}
		
			}
				
		}
		
		return false;
				
	}
	
	
	public void cambiarCapacidad() {
		
		
		
		
		int capacidad =Integer.parseInt(MiScanner.leer("introduzca capacidad")) ;
		
		       PersonalSanitario[] personalsanitario = new PersonalSanitario [capacidad] ;
		       
		       System.arraycopy(personalSanitario, 0, personalsanitario, 0, Math.min(personalSanitario.length,personalsanitario.length));
		       
		       
		       personalSanitario=personalsanitario;
		
		
	}

	
	
}
