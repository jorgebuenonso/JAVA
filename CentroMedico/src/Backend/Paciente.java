package Backend;

import java.util.Arrays;

public class Paciente extends Persona {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroHistorialClinico;
	private String grupoSanguineo;
	private char sexo;
	
	private String medicamentos[];

	

	public Paciente(String numeroDni, String nombre, String apellido, String fechaNacimiento, String nacionalidad,
			String fecha, int numeroHistorialClinico, String grupoSanguineo, char sexo, String[] medicamentos) {
		super(numeroDni, nombre, apellido, fechaNacimiento, nacionalidad, fecha);
		this.numeroHistorialClinico = numeroHistorialClinico;
		this.grupoSanguineo = grupoSanguineo;
		this.sexo = sexo;
		this.medicamentos = medicamentos;
	}

	

	public int getNumeroHistorialClinico() {
		return numeroHistorialClinico;
	}

	public void setNumeroHistorialClinico(int numeroHistorialClinico) {
		this.numeroHistorialClinico = numeroHistorialClinico;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	

	public String[] getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String[] medicamentos) {
		this.medicamentos = medicamentos;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nNúmero de Historial Clínico = " + numeroHistorialClinico + "\nGrupo sanguineo = " + grupoSanguineo
				+ "\nSexo = " + sexo + "\nMedicamentos alergicos = " +  Arrays.toString(medicamentos);
	}
	
	
	

}
