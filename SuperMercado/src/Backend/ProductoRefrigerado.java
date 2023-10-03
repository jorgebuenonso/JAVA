package Backend;

public class ProductoRefrigerado extends Producto {
	
	private String codigoSuperVisionAlimentaria;
	private float temperaturaDeMAntenimientoRecomendada;
	
	



	public ProductoRefrigerado(String fechaCaducidad, String fechaDeEnvasado, String codigoBarra, String paisDeOrigen) {
		super(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen);
		// TODO Esbozo de constructor generado automáticamente
	}

	public String getCodigoSuperVisionAlimentaria() {
		return codigoSuperVisionAlimentaria;
	}

	public void setCodigoSuperVisionAlimentaria(String codigoSuperVisionAlimentaria) {
		this.codigoSuperVisionAlimentaria = codigoSuperVisionAlimentaria;
	}

	public float getTemperaturaDeMAntenimientoRecomendada() {
		return temperaturaDeMAntenimientoRecomendada;
	}

	public void setTemperaturaDeMAntenimientoRecomendada(float temperaturaDeMAntenimientoRecomendada) {
		this.temperaturaDeMAntenimientoRecomendada = temperaturaDeMAntenimientoRecomendada;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoRefrigerado [codigoSuperVisionAlimentaria=" + codigoSuperVisionAlimentaria
				+ ", temperaturaDeMAntenimientoRecomendada=" + temperaturaDeMAntenimientoRecomendada + "]";
	}
	
	
	
	

}
