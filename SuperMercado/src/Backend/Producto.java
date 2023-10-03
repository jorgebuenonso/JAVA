package Backend;

public class Producto {
	
	protected String fechaCaducidad;
	protected String fechaDeEnvasado,codigoBarra;
	protected String paisDeOrigen;

	
	public Producto(String fechaCaducidad,String fechaDeEnvasado, String codigoBarra,
			String paisDeOrigen) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.codigoBarra = codigoBarra;
		this.paisDeOrigen = paisDeOrigen;
	}

	

	public Producto() {
		// TODO Apéndice de constructor generado automáticamente
	}



	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	

	public String getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}

	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
	
	

	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}



	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad +  "fechaDeEnvasado="
				+ fechaDeEnvasado + ", paisDeOrigen=" + paisDeOrigen + "]";
	}
	
	
	
	

}
