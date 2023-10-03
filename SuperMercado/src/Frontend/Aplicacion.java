package Frontend;

import java.util.Arrays;


import Backend.ProductoCongelado;
import Backend.ProductoCongeladoPorAgua;
import Backend.ProductoCongeladoPorAire;
import Backend.ProductoCongeladorPorNitrogeno;
import Backend.ProductoFresco;
import Backend.ProductoRefrigerado;

public class Aplicacion {
	
	private static final char PRODUCTOFRES = 'F';
	private static final char PRODUCTOREFRI = 'R';
	private static final char PRODUCTOCONG = 'C';
	
	ProductoFresco[] productoF = new ProductoFresco[0];
	ProductoRefrigerado [] productoR = new ProductoRefrigerado[0];
	ProductoCongelado productoC [] = new ProductoCongelado[0];
	
	
	
	public int menu() {
		
		System.out.println("Mi Menú");
		System.out.println("\n1.Registrar Producto Fresco"
				+ "\n2.Registrar Producto Refrigerado"
				+ "\n3.Registrar Producto Congelado"
				+ "\n4.Buscaer Producto"
				+ "\n5.Listar Producto Congelado"
				+ "\n6.Eliminar un Producto Refrierado"
				+ "\n7.Salir del Programa");
		
		return Integer.parseInt(Lector.leer("Introduzca una opción del Menú"));
	}
	
	
	public void inicia(){
		
		int opcion;
		
		do {
			
			opcion = menu();
			
			switch (opcion) {
			
			case 1:
				registro(PRODUCTOFRES);
				
				break;
				

			case 2:
				registro(PRODUCTOREFRI);
				
				
				break;

			case 3:
				registro(PRODUCTOCONG);
				
				break;

			case 4:
				
				String lote = Lector.leer("Introduzca un codigo de barras");
				
				int loteP = buscaProducto(lote);
				
				if (loteP==-1) {
					
					System.err.println("El producto no existe");
					
				}else{
					
					for (int i = 0; i < productoC.length; i++) {
						
						if(this.productoC[i].equals(loteP)) {
							
							System.out.println(this.productoC[loteP].toString());
							
						}
					}
					

					for (int t = 0; t < productoR.length; t++) {
						
						if(this.productoR[t].equals(loteP)) {
							
							System.out.println(this.productoR[loteP].toString());
							
						}
					}
						
						for (int o = 0; o < productoF.length; o++) {
							
							if(this.productoF[o].equals(loteP)) {
								
								System.out.println(this.productoF[loteP].toString());
								
							}
						}
				}

							
					
					
				break;

			case 5:System.out.println("Listado de productos congelados");
				
				for (ProductoCongelado productoCongelado : productoC) {
					
					System.out.println(productoCongelado);
					
				}
				
				break;

			case 6:
				
				break;

			case 7:System.out.println("Saliendo del programa...!Hasta pronto¡");
				
				break;
				

			default:System.err.println("Introduzca una opción correcta del menú");
				break;
			}
			
		} while (opcion!=7);
		
		
	}
	
	private void registro(char tipoR) {
		
		 String fechaCaducidad = Lector.leer("Introduzca una fecha de caducidad");
		 String numeroLote = Lector.leer("Introduzca un número de lote");
		 String fechaDeEnvasado = Lector.leer("Introduzca una fecha de envasadp");
		 String paisDeOrigen = Lector.leer("Introduzca un pais de origen");
		 String codigoBarra = Lector.leer("Introduzca un código de barras");
		 
		 switch (tipoR) {
		 
		case PRODUCTOFRES:
			
			this.productoF = añadirProductoF(new ProductoFresco(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen));
			
			
			break;
		case PRODUCTOREFRI:
			
			String codigoSuperVisionAlimentaria = Lector.leer("Introduzca un codigo de vision alimenticia");
			float temperaturaDeMAntenimientoRecomendada = Float.parseFloat(Lector.leer("Introduzca una temperatrura de mantenimiento"));
			
			this.productoR = añadirProductoR(new ProductoRefrigerado(fechaCaducidad, fechaDeEnvasado, codigoBarra,
					paisDeOrigen));
			
			break;
		case PRODUCTOCONG:
			
			int tipo= 0;
			
			 float tempCongelacionRecomentada = Float.parseFloat(Lector.leer("Introduzca la temperatura de congelación"));
			 
			 
			 
			 do {
				 
				 tipo = Integer.parseInt(Lector.leer("Introduzca el tipo de produzco congelado a registrar\n1.Congelado por Aire\n2. Congelado por Agua\n3. Congelado por nitrogeno.")); 
				 
			} while (tipo != 1 && tipo !=2 && tipo !=3);
			 
			 
				switch (tipo) {
				case 1: 

					float nitrogeno = Float.parseFloat(Lector.leer("Introduzca la temperatura de nitrogeno"));
					float oxigeno = Float.parseFloat(Lector.leer("Introduzca la temperatura de oxigeno"));
					float carbono = Float.parseFloat(Lector.leer("Introduzca la temperatura de carbono"));
					float vaporAgua = Float.parseFloat(Lector.leer("Introduzca la temperatura de vapor de agua"));
					
					
					ProductoCongeladoPorAire aire= new ProductoCongeladoPorAire();
					
					float calculoAire= aire.calculoComposicion(nitrogeno, oxigeno, carbono, vaporAgua) ;
					
					this.productoC = añadirProductoC(new ProductoCongeladoPorAire(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen, tempCongelacionRecomentada, calculoAire));
					
				break;
				
				case 2:
					
					ProductoCongeladoPorAgua agua = new ProductoCongeladoPorAgua();
					
					float salada = Float.parseFloat(Lector.leer("Introduzca masa de agua salada"));
					
					float c =agua.setSalinidadAgua(salada);
					
					this.productoC = añadirProductoC(new ProductoCongeladoPorAgua(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen, tempCongelacionRecomentada,c));
					
					break;
					
				case 3:
					
					String metodDeCongelacion = Lector.leer("Introduzxa el método de congelación");
					float tiempoDeExposicion = Float.parseFloat(Lector.leer("Introduzca el tiempo de exposición"));
			
					
					this.productoC = añadirProductoC(new ProductoCongeladorPorNitrogeno(fechaCaducidad, fechaDeEnvasado, codigoBarra, paisDeOrigen, tempCongelacionRecomentada, metodDeCongelacion, tiempoDeExposicion));
					
					break;
				default:System.out.println("Inentelo de nuevo");
					
				
				} 
				
				
				
			
			 


			 
	break;

		
		}
		
		
	}
	
	private ProductoFresco[] añadirProductoF(ProductoFresco producto) {
		
		int newFresco = this.productoF.length;
		
		this.productoF = Arrays.copyOf(productoF, newFresco+1);
		
		this.productoF[newFresco] = producto;
		
		return this.productoF;
	}
	
	private ProductoCongelado[] añadirProductoC(ProductoCongelado producto) {
		
		int newCong = this.productoC.length;
		
		this.productoC= Arrays.copyOf(productoC, newCong+1);
		
		this.productoC[newCong] = producto;
		
		return this.productoC;
	}

	private ProductoRefrigerado[] añadirProductoR(ProductoRefrigerado producto) {
		
	int newRef = this.productoR.length;
	
	this.productoR =Arrays.copyOf(productoR, newRef+1);
		
	this.productoR[newRef] = producto;
	
		return this.productoR;
}
	
	private int buscaProducto(String nBarra) {
		
		int num = -1;
		
		for (int i = 0; i < productoC.length; i++) {
			
			if(this.productoC[i].getCodigoBarra()==nBarra){
					num = i;
					
				}else if (this.productoR[i].getCodigoBarra()==nBarra) {
					
					num =i;
				}else if (productoF[i].getCodigoBarra()==nBarra) {
					
					num=i;
					
				}
			
		}
		
		return num;
	}
	
	private ProductoRefrigerado[] eliminarProductoR(int posicion) {
		
		ProductoRefrigerado[] newProductoR = new ProductoRefrigerado[productoR.length-1];
		
		System.arraycopy(productoR, 0, newProductoR, 0, newProductoR.length);
		System.arraycopy(productoR, posicion+1, newProductoR, posicion, newProductoR.length-posicion);
		
		this.productoR = newProductoR;
		
		return this.productoR;
	}
		
	
	
}
