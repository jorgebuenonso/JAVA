package Backend;

public class ProductoCongelado extends Producto {
	
	private float tempCongelacionRecomentada;


	public ProductoCongelado(String fechaCaducidad, String fechaDeEnvasado, String codigoBarra, String paisDeOrigen,
			float tempCongelacionRecomentada) {
		super(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen);
		this.tempCongelacionRecomentada = tempCongelacionRecomentada;
	}
	
	public ProductoCongelado() {
		super();
	}

	

	public float getTempCongelacionRecomentada() {
		return tempCongelacionRecomentada;
	}

	public void setTempCongelacionRecomentada(float tempCongelacionRecomentada) {
		this.tempCongelacionRecomentada = tempCongelacionRecomentada;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoCongelado [tempCongelacionRecomentada=" + tempCongelacionRecomentada + "]";
	}
	
	
	

}
