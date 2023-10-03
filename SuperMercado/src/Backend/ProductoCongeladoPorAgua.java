package Backend;

public class ProductoCongeladoPorAgua extends ProductoCongelado implements ProductosQuimicos {
	
	
	private float salinidadAgua;
	


	public ProductoCongeladoPorAgua(String fechaCaducidad, String fechaDeEnvasado, String codigoBarra,
			String paisDeOrigen, float tempCongelacionRecomentada,float salinidadAgua) {
		super(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen, tempCongelacionRecomentada);
		this.salinidadAgua = salinidadAgua;
		
	}
	
	public ProductoCongeladoPorAgua() {
		
	}


	public float getSalinidadAgua() {
		return salinidadAgua;
	}


	public float setSalinidadAgua(float masaAguaSalada) {
		this.salinidadAgua = (masaAguaSalada/MASA_SAL)*100;
		
		return this.salinidadAgua;
		
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}


	@Override
	public String toString() {
		return super.toString()+"ProductoCongeladoPorAgua [salinidadAgua=" + salinidadAgua + "]";
	}
	
	
	
	

}
