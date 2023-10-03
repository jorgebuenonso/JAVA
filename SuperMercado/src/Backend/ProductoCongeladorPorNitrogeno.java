package Backend;

public class ProductoCongeladorPorNitrogeno extends ProductoCongelado {
	
	private String metodDeCongelacion;
	private float tiempoDeExposicion;
	
	
	
	public ProductoCongeladorPorNitrogeno(String fechaCaducidad, String fechaDeEnvasado, String codigoBarra,
			String paisDeOrigen, float tempCongelacionRecomentada, String metodDeCongelacion,
			float tiempoDeExposicion) {
		super(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen, tempCongelacionRecomentada);
		
		this.metodDeCongelacion = metodDeCongelacion;
		this.tiempoDeExposicion = tiempoDeExposicion;
		
	}
	
	public ProductoCongeladorPorNitrogeno() {
		super();
	}

	public String getMetodDeCongelacion() {
		return metodDeCongelacion;
	}

	public void setMetodDeCongelacion(String metodDeCongelacion) {
		this.metodDeCongelacion = metodDeCongelacion;
	}

	public float getTiempoDeExposicion() {
		return tiempoDeExposicion;
	}

	public void setTiempoDeExposicion(float tiempoDeExposicion) {
		this.tiempoDeExposicion = tiempoDeExposicion;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	@Override
	public String toString() {
		return super.toString()+ "CongeladorPorNitrogeno [metodDeCongelacion=" + metodDeCongelacion + ", tiempoDeExposicion="
				+ tiempoDeExposicion + "]";
	}
	
	
	
	

}
