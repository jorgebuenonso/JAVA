package Backend;

public class Empleado extends Persona {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoEmpledo,fechaDeIngreso,area,cargoEjerceEm;
	private float horasExtra;

	
	
	

	public Empleado(String numeroDni, String nombre, String apellido, String fechaNacimiento, String nacionalidad,
			String fecha, String codigoEmpledo, String fechaDeIngreso, String area, String cargoEjerceEm,
			float horasExtra) {
		super(numeroDni, nombre, apellido, fechaNacimiento, nacionalidad, fecha);
		this.codigoEmpledo = codigoEmpledo;
		this.fechaDeIngreso = fechaDeIngreso;
		this.area = area;
		this.cargoEjerceEm = cargoEjerceEm;
		this.horasExtra = horasExtra;
	}

	public String getCodigoEmpledo() {
		return codigoEmpledo;
	}

	public void setCodigoEmpledo(String codigoEmpledo) {
		this.codigoEmpledo = codigoEmpledo;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCargoEjerceEm() {
		return cargoEjerceEm;
	}

	public void setCargoEjerceEm(String cargoEjerceEm) {
		this.cargoEjerceEm = cargoEjerceEm;
	}

	public float getNumeroHorasExtra() {
		return horasExtra;
	}

	

	public float getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(float horasExtra) {
		this.horasExtra = horasExtra;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nCÛdigo de Empleado = " + codigoEmpledo + "\nFecha de ingreso = " + fechaDeIngreso + "\n¡rea = " + area
				+ "\nCargo que ejerce el Empleado = " + cargoEjerceEm + "\nHoras extra = " + horasExtra;
	}
	
	

	

}
