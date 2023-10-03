package Backend;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Medico extends Persona {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String especialidad,servicio;
	private int numConsultorio;
	
	
	
	CitaMedica citas[] = new CitaMedica[0];
	
	//ArrayList<CitaMedica>listaCitas = new ArrayList<>(); 
	
	
		public int getCantidadCitas() {
			
			//return listaCitas.size();
			return citas.length;
		}
		
		public Medico(String numeroDni, String nombre, String apellido, String fechaNacimiento, String nacionalidad,
			String fecha, String especialidad, String servicio, int numConsultorio, CitaMedica[] citas) {
		super(numeroDni, nombre, apellido, fechaNacimiento, nacionalidad, fecha);
		this.especialidad = especialidad;
		this.servicio = servicio;
		this.numConsultorio = numConsultorio;
		this.citas = citas;
	}

		
		public Medico() {
			
		}
		
		public String getFechaCita(int pos) {
					
			return this.citas[pos].fechaCita.toString();
		}
		
		public String getPaciente(int pos) {
			
			return  this.citas[pos].nombrePaciente.toString();
			
		}
		
		
		
		public CitaMedica[] getCitas() {
			return citas;
		}





		public void setCitas(CitaMedica[] citas) {
			this.citas = citas;
		}





		public void limpiarCitas() {
			
			//listaCitas.clear();
			this.citas = new CitaMedica[0];
			
		}
		
		public void agregarCita(String f,String n) {
			
			//listaCitas.add(new CitaMedica(f, n));
			int copyArray = citas.length;
			this.citas =Arrays.copyOf(this.citas, copyArray+1);
			this.citas[copyArray] = new CitaMedica(f,n);
			
		}
		public int getNroConsultorio() {
			
			return numConsultorio;
		}
		
		public String getEspecialidad() {
			return especialidad;
		}
		
		
		
		@Override
		public String toString() {
			return super.toString() + "\nEspecialidad = " + especialidad + "\nServicio = " + servicio + "\nNúmero de Consultorio = "
					+ numConsultorio;
		}



		class CitaMedica {
			
			private  String fechaCita;
			private String nombrePaciente;
			
			public CitaMedica (String f,String p){
			
			fechaCita = "f";
			nombrePaciente = "p";
			
			}
			
			
		}
		
		
		
		
	}

	


