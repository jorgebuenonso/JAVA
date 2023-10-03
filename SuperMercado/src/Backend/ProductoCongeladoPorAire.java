package Backend;

public class ProductoCongeladoPorAire extends ProductoCongelado implements ComposicionQuimica {
	
	private float composicionAire;
	
	public ProductoCongeladoPorAire(String fechaCaducidad, String fechaDeEnvasado, String codigoBarra,
			String paisDeOrigen, float tempCongelacionRecomentada, float composicionAire) {
		super(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen, tempCongelacionRecomentada);
		this.composicionAire = composicionAire;
	}
	
	public ProductoCongeladoPorAire() {
		
	}
	
	




	@Override
	public String toString() {
		return super.toString()+ "ProductoCongeladoPorAire [composicionAire=" + composicionAire + "]";
	}



	public float getComposicionAire() {
		return composicionAire;
	}



	public void setComposicionAire(float composicionAire) {
		this.composicionAire = calculoComposicion(composicionAire, composicionAire, composicionAire, composicionAire);
	}
	
	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}



	@Override
	public float calculoComposicion(float nitrogeno, float oxigeno, float carbono, float vaporAgua) {
		
		float suma = nitrogeno+oxigeno+carbono+vaporAgua;
		float resultado;
		
		if (suma>100) {
			
			resultado=0;
			
		}
			
		
		return suma;
	}

}
