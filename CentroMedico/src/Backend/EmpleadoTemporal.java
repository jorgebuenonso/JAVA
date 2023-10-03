package Backend;

public class EmpleadoTemporal extends Empleado implements SalarioTemporal {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float pagoHoras, horasNormales,salarioTotal,horasTotales;
	private String fechaFinContrato;



	public EmpleadoTemporal(String numeroDni, String nombre, String apellido, String fechaNacimiento,
			String nacionalidad, String fecha, String codigoEmpledo, String fechaDeIngreso, String area,
			String cargoEjerceEm, float horasExtra, float pagoHoras, float horasNormales, float salarioTotal,
			float horasTotales, String fechaFinContrato) {
		super(numeroDni, nombre, apellido, fechaNacimiento, nacionalidad, fecha, codigoEmpledo, fechaDeIngreso, area,
				cargoEjerceEm, horasExtra);
		this.pagoHoras = pagoHoras;
		this.horasNormales = horasNormales;
		this.salarioTotal = salarioTotal;
		this.horasTotales = horasTotales;
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public void calcularSalario() {
		
		this.salarioTotal= this.pagoHoras*this.horasTotales;
		
	}

	@Override
	public float getSalario() {
	
		return salarioTotal;
	}

	@Override
	public void calcularHorasTotales() {
	 
		this.horasTotales = horasNormales+getHorasExtra();
		
	}
	

	public float getPagoHoras() {
		return pagoHoras;
	}

	public void setPagoHoras(float pagoHoras) {
		this.pagoHoras = pagoHoras;
	}

	public float getHorasTotales() {
		return horasTotales;
	}

	public void setHorasTotales(float horasTotales) {
		this.horasTotales = horasTotales;
	}

	public float getHorasNormales() {
		return horasNormales;
	}

	public void setHorasNormales(float horasNormales) {
		this.horasNormales = horasNormales;
	}

	public float getSalarioTotal() {
		return salarioTotal;
		
	}

	public void setSalarioTotal(float salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	public String getFechaFinContrato() {
		return fechaFinContrato;
	}

	public void setFechaFinContrato(String fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nPago por horas = " + pagoHoras + "\nHoras totales = " + horasTotales + "\nHoras normales = "
				+ horasNormales + "\nSalario total = " + salarioTotal + "\nFecha de fin de contrato = " + fechaFinContrato;
	}
	

}
