package Frontend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import Backend.Empleado;

import Backend.Medico;
import Backend.Paciente;
import Backend.Persona;
import Backend.SalarioTemporal;
import Backend.EmpleadoFijo;
import Backend.EmpleadoTemporal;

public class Aplicacion {
	
	private static final char MEDICO = 'M';
	private static final char PACIENTE = 'P';
	private static final char EMPLEADO = 'E';
	String nombreArchivo="hospital,dat";
	
	File file = new File(nombreArchivo);
	
	/*
	 * Medico listaMedicos[] = new Medico[0]; Paciente listaPaciente[] = new
	 * Paciente[0]; Empleado listaEmpleado[] = new Empleado[0];
	 */
	
	Set<Persona> listaMedicos = new TreeSet<Persona>();
	Set<Persona> listaPacientes = new TreeSet<Persona>();
	Set<Persona> listaEmpleados = new TreeSet<Persona>();
	
	
	
	
	public void inicio() {
		
		
		int opcionMenu;
		char exit = ' ';
		
		if (file.length()!=0) {
			
		
		
		try {
			FileInputStream fis = new FileInputStream(nombreArchivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Set<Persona> p = (Set<Persona>) ois.readObject();
			
			listaEmpleados.addAll(p);
			listaMedicos.addAll(p);
			listaPacientes.addAll(p);
		} catch (FileNotFoundException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		}
		System.out.println("Datos  cargados");
		
	}else {
		
		System.out.println("Datos no cargados");
	}
		
		
		do {
			
			opcionMenu = menu(); 
			
			switch (opcionMenu) {
		
		
			case 1: System.out.println("Registrando un Empleado...");
			registrar(EMPLEADO);
			
			break;
		case 2:System.out.println("Registrando un Paciente...");
			registrar(PACIENTE);
			
			break;
		case 3: System.out.println("Registrando un Médico...");
			registrar(MEDICO);

			break;
		case 4: System.out.println("Registrando Cita Médica...");
		
			int consultorioMedico = Integer.parseInt(MiScanner.leer("Introduzca el número del consultorio"));
			
		
				
				String fecha = MiScanner.leer("Introduzca una fecha para la cita");
				String paciente = MiScanner.leer("Introduzca un Paciente");
				
				Medico medicoC = new Medico();
				
				for (Persona persona : listaMedicos) {
					if(medicoC.getNroConsultorio()== consultorioMedico) {
						medicoC.agregarCita(fecha, paciente);
						
					}
				}
				
				
				System.out.println("Cita confirmada con el Médico "+medicoC.toString()+" con el Paciente "+paciente+" para la fecha "+fecha);
			

			break;
		case 5:  if (this.listaEmpleados.size()==0) {
			System.err.println("Listado vacio");
		}else {
			System.out.println("Listar Empleados del Hospital...");
		
			for (Persona empleado : listaEmpleados) {
				
				System.out.println(empleado);
				
			}
		}
			break;
		case 6:  if (this.listaMedicos.size()==0) {
			System.err.println("Listado vacio");
		}else {
			System.out.println("Listar Médicos del Hospital...");
		
			for (Persona medico : listaMedicos) {
				
				System.out.println(medico);
				
			}
		}
			break;
		case 7: if (this.listaPacientes.size()==0) {
			System.err.println("Listado vacio");
		}else {
			System.out.println("Listar Pacientes del Hospital...");
		
			for (Persona pacientee : listaPacientes) {
				
				System.out.println(pacientee);
				
			}
		}
			break;
			
		case 8:
			
			Set<Persona> lp = new TreeSet<Persona>(new Persona());
			
			lp.addAll(listaEmpleados);
			
			for (Persona persona : lp) {
				System.out.println(persona);
			}
			break;
			
		case 9: System.out.println("Proceso para elimina un Paciente...");
			
			int numero;
			boolean info = false;
				if (this.listaPacientes.size() ==0) {
					
					System.err.println("Lista de pacientes vacia");
					break;
					
				}else {

				String dni = MiScanner.leer("Introduzca su número de historial clínica");
				
				info = listaPacientes.remove(new Persona(dni));	
				
				}
				
				if (info==true) {
					System.out.println("Eliminano");
				}else {
					
					System.out.println("No se encontro persona");
				}
					

			break;
			
		case 10: System.out.println("Obteniendo Pacientes Atendidos por un Médico");
			 
		int consultorio = Integer.parseInt(MiScanner.leer("Introduzca el número del consultorio"));
		
		Set<Medico> m = new TreeSet<Medico>();
		
		Medico med = new Medico();
		
		for (Persona persona : listaPacientes) {
			
			if(med.getNroConsultorio()== consultorio) {
				
				System.out.println(persona);
			}
			
		}
			
			break;
			
		case 11: 
		
		do {
			
			 exit = Character.valueOf(MiScanner.leer("Esta usted seguro de salir, marque SI para confimar o marque NO, para volver al menú").toUpperCase().charAt(0));
			
			 
		} while (exit !='S' && exit !='N');
		
		if(exit=='S') {
			System.out.println("!Hasta Pronto¡");
		}
		
				try {
					FileOutputStream fos = new FileOutputStream(nombreArchivo);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					
					oos.writeObject(listaEmpleados);
					oos.writeObject(listaMedicos);
					oos.writeObject(listaPacientes);
					
					oos.close();
				} catch (FileNotFoundException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				}
		
		
		break;

		default: System.err.println("Introduzca una opciçon correcta");
			break;
		}
		
		
			} while (exit!='S');	
	}
	
	public static int menu() {
		
	
		
		System.out.println("============= MI MENU ====================\n");
		System.out.println("\n1.Registras Empleado"
				+ "\n2.Registrar Paciente"
				+ "\n3.Registrar Médico"
				+ "\n4.Registrar Cita Médica"
				+ "\n5.Listar Empleados del Hospital"
				+ "\n6.Listar Médicos que trabajan en el Hospital"
				+ "\n7.Listar Pacientes del Hospital"
			
				+ "\n8.Listar  por Antiguedad"
				+ "\n9.Eliminar Paciente del Hospital"
				+ "\n10.Obtener Pacientes Atendidos por un Médico"
				+ "\n11.Salir del Programa");
		
		
		return Integer.parseInt(MiScanner.leer("Introduce una opción"));
	}


	private void registrar(char tipoRegistro) {
	
		
		String dni = MiScanner.leer("Introduzca un DNI");
		String nombre = MiScanner.leer("Introduzca un nombre");
		String apellido = MiScanner.leer("Introduzca un apellido");
		String fechaNac = MiScanner.leer("Introduzca la fecha de nacimiento");
		String direccion = MiScanner.leer("Introduzca una dirección");
		String nacionalidad = MiScanner.leer("Introduzca una nacionalidad");
		
		switch (tipoRegistro) {
		
		
		case EMPLEADO:
			
			char tipoContrato;
			String codigoEmpleado = MiScanner.leer("Introduce un código de empleado");	
			float horasExtra = Float.parseFloat(MiScanner.leer("Introduzca las horas extra del empleado"));			
			String fechaDeIngreso = MiScanner.leer("Introduzca fecha de inicio de contrato del empleado");
			String area = MiScanner.leer("Introduzca el area al que pertenece el empleado");
			String cargoEjerceEm = MiScanner.leer("Introduzca cargo que tiene el nuevo empleado");
			String fecha = MiScanner.leer("Introduzca una fecha");
			
			do {
				
				 tipoContrato = Character.toUpperCase((MiScanner.leer("Introduzca tipo de empleado siendo ('T' Temporal, 'F' Fijo)")).charAt(0));
			
				
			} while (tipoContrato != 'T' && tipoContrato != 'F');
			
			boolean temporal = (tipoContrato=='T'?true:false);
			
			if (temporal) {
				
				
				float pagoHora = Float.parseFloat(MiScanner.leer("Introduzca euros por hora"));
				float horasNormales = Float.parseFloat(MiScanner.leer("Introduzca las horas trabajadas por contrato"));
				String fechaFinContrato = MiScanner.leer("Introduzca fecha fin de contrato");
				
				
				
				this.listaEmpleados.add(new EmpleadoTemporal(dni, nombre, apellido, fechaNac, nacionalidad, fecha, codigoEmpleado, fechaDeIngreso, area, cargoEjerceEm, horasExtra,
						pagoHora, horasNormales, pagoHora, horasNormales, fechaFinContrato));
				
			}else {
				
				float pAdicional = Float.parseFloat(MiScanner.leer("Introduzca porcentaje adicional"));
				
				this.listaEmpleados.add(new EmpleadoFijo(dni, nombre, apellido, fechaNac, nacionalidad, fecha, codigoEmpleado, fechaDeIngreso, area, cargoEjerceEm, horasExtra, horasExtra, pAdicional));
			}
			
			break;
			
		case PACIENTE:
			
			char sexo;
			
			int historiaClinica = Integer.parseInt(MiScanner.leer("Introduzca un número de historia clínica"));
			
			do {
				
				sexo= Character.toUpperCase((MiScanner.leer("Introduzca un sexo siendo ('H' para hombre, 'M' para mujer")).charAt(0));
				
			} while (sexo != 'H' && sexo != 'M');
			
			String grupoSanguineo= MiScanner.leer("Introduzca un grupo sanguineo");
			
			System.out.println("Datos sobre los medicamentos a los que es alergico");
			
			int cantidad = Integer.parseInt(MiScanner.leer("Introduzca cantidad de medicamentos"));
			
			String [] medicamentos = new String[cantidad];
			
			for (int i = 0; i < medicamentos.length; i++) {
				 medicamentos[i] = MiScanner.leer("Introduzca Medicamento  "+ (i+1) );
				
			}
			
			this.listaPacientes.add(new Paciente(dni, nombre, apellido, fechaNac, nacionalidad, "01/10/2020", cantidad, grupoSanguineo, sexo, medicamentos));
			
				break;
			
			
		case MEDICO:
			
			String especialidad = MiScanner.leer("Introduzca especialidad");
			String servicio = MiScanner.leer("Introduzca servicio");
			int numConsultorio = Integer.parseInt(MiScanner.leer("Introduzca número de consultorio"));
			
			this.listaMedicos.add(new Medico(dni, nombre, apellido, fechaNac, nacionalidad, "01/10/2019", especialidad, servicio, numConsultorio, null));
	
				break;
				
			}
	
	}
		
}
			
		
		
			
	
	

	
	
	
	
	


