package Backend;

public class EmpleadoFijo extends Empleado implements SalarioFijo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float salarioMensual,pAdicional;
	
	
		public EmpleadoFijo(String numeroDni, String nombre, String apellido, String fechaNacimiento, String nacionalidad,
			String fecha, String codigoEmpledo, String fechaDeIngreso, String area, String cargoEjerceEm,
			float horasExtra, float salarioMensual, float pAdicional) {
		super(numeroDni, nombre, apellido, fechaNacimiento, nacionalidad, fecha, codigoEmpledo, fechaDeIngreso, area,
				cargoEjerceEm, horasExtra);
		this.salarioMensual = salarioMensual;
		this.pAdicional = pAdicional;
		calcularSalario();
		
	}

		



	@Override
		public void calcularSalario() {
		
		this.salarioMensual =  (1+pAdicional/100)*SALARIO_BASE;
		
	}

	@Override
		public float getSalario() {
		
		return salarioMensual;
	}
	
	

	public float getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(float salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public float getpAdicional() {
		return pAdicional;
	}

	public void setpAdicional(float pAdicional) {
		this.pAdicional = pAdicional;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nSalario Mensual = " + salarioMensual + "\nPorcentaje adicional = " + pAdicional;
	}
	
}