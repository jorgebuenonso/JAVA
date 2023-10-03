package Backend;

public class ProductoFresco extends Producto {



	public ProductoFresco(String fechaCaducidad, String fechaDeEnvasado, String codigoBarra, String paisDeOrigen) {
		super(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public String toString() {
		return super.toString()+ "ProductoFresco [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + ", fechaDeEnvasado="
				+ fechaDeEnvasado + ", paisDeOrigen=" + paisDeOrigen + "]";
	}
	
	public String getCodigoBarra() {
		return codigoBarra;
	}



	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	

	
	
	
	

}
