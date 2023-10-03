package Frontend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Backend.Socio;


public class Aplicacion {
	
	Set<Socio> listaSocios = new TreeSet<Socio>();
	String nombreArchivo ="Socios.dat";
	
	public int menu() {
		
		System.out.println("============= MI MENU ====================");
		System.out.println("\n1.Alta"
				+ "\n2.Baja"
				+ "\n3.Modificación"
				+ "\n4.Listado por DNI"
				+ "\n5.Listado por antigüedad"
				+ "\n6.Salir");
		
		return Integer.parseInt(Lector.leer("Introduce una opción"));
	}
	
	
	public void inicio() {
		
		int opcion;
		
		File file = new File(nombreArchivo);
		
		if (file.length()!=0) {
			
		
		try {
			
			FileInputStream fios = new FileInputStream(nombreArchivo);
			ObjectInputStream ois = new ObjectInputStream(fios);
			
			Set<Socio>  s = (Set<Socio>) ois.readObject();

			listaSocios.addAll(s);
			
			ois.close();
		} catch (FileNotFoundException e) {
			
		System.err.println("Ruta no encontrada");
		} catch (ClassNotFoundException e) {
			
			System.err.println("Se intenta leer la descripción de una"
					+ " clase, y  la clase no es encontrada.");
		} catch (IOException e) {
			
			System.err.println("Se ha producido un error en la entrada/salida");
		}
		
			System.out.println("Datos cargados en sistema.");
		
	}else {
		
		System.out.println("No hay registros guardados");
	}
		
		do {
			
			opcion = menu();
			
			switch (opcion) {
			
			case 1:
				
				try {
					String dni = Lector.leer("Introduzca un DNI");
					String nombre = Lector.leer("Introduzca un nombre");
					String fechaAlta = Lector.leer("Introduzca una fecha de alta con el sigiente formato dd/MM/yyyy");
					String telefono = Lector.leer("Introduzca número de telefono");
					
					listaSocios.add(new Socio(dni, nombre, telefono,fechaAlta));
				} catch (DateTimeParseException e1) {
					// TODO Bloque catch generado automáticamente
					System.err.println("Formato  de fecha incorrecto");                            // throw new MiExepcion("mensaje");
				}
				
				for (Socio socio : listaSocios) {
					System.out.println(socio);
				}
				
				break;
			case 2:
				
				String dniR = Lector.leer("Introduzca el DNI del usuario que quiera dar de baja");
				 listaSocios.remove(new Socio(dniR));
				
				break;
				
			case 3:
				
				String dniA = Lector.leer("Introduzca DNI del Socio");
				boolean updateFla = false;
				
				Socio auxSocio = new Socio(dniA);
				
				for(Socio s : listaSocios) { 
					
					if  (s.getDni().equals(auxSocio.getDni())){
						
						String newTelefono = Lector.leer("Introduzca nuevo número");
						s.setTelefono(newTelefono);
						updateFla = true;
					}
					
				   
				}
				
				if (updateFla==false) {
					System.out.println("Socio no encontrado");
				}
				
	
				break;
			case 4:
				
				  System.out.println("Listado por DNI:n"); 
				  
				  for (Socio socio : listaSocios) {
				  System.out.println(socio); }
				 
				break;
			case 5:
				
				System.out.println("Listado por Antigüedad:\n");
				
				Set<Socio> lSocios = new TreeSet<>(new Socio());
				lSocios.addAll(listaSocios);
				
				for (Socio socio : lSocios) {
					System.out.println(socio);
				}
	
				break;
			case 6:
				
				System.out.println("Saliendo del programa... !Hasta Pronto¡");
				
				
				try {
					
					FileOutputStream fos = new FileOutputStream(nombreArchivo);					
					ObjectOutputStream ous = new ObjectOutputStream(fos);
					
					for (int i = 0; i < listaSocios.size(); i++) {
						
						ous.writeObject(listaSocios);
					}
						
						ous.close();
				} catch (FileNotFoundException e) {
					System.err.println("Ruta no encontrada");
				} catch (IOException e) {
					System.err.println("Se ha producido un error en la entrada/salida");
				}
				
				break;
				

			default: System.err.println("Introduzca una opción correcta");
				break;
			}
			
		} while (opcion!=6);
		
		
	}
	
	/*
	 * public void registrar() {
	 * 
	 * String dni = Lector.leer("Introduzca un DNI"); String nombre =
	 * Lector.leer("Introduzca un nombre"); String telefono =
	 * Lector.leer("Introduzca un teléfono"); String localidad =
	 * Lector.leer("Introduzca una localidad"); String fechaAlta =
	 * Lector.leer("Introduzca una fecha de alta");
	 * 
	 * char tip; double cuota =
	 * Double.parseDouble(Lector.leer("Introduzca una cuota"));
	 * 
	 * 
	 * do {
	 * 
	 * tip = Character.toUpperCase(Lector.
	 * leer("Introduzca el tipo de Socio, Oro o Platino").charAt(0));
	 * 
	 * } while (tip !='O' && tip != 'P');
	 * 
	 * boolean oro = tip=='O'? true:false;
	 * 
	 * if (oro) {
	 * 
	 * String invitacionNominal = Lector.leer("Introduzca el nombre del invitado");
	 * String putaCortesia =
	 * Lector.leer("Introduzca el nombre de la puta que desea");
	 * 
	 * this.listaSocios.add(new SocioOro(dni, nombre, telefono, localidad,
	 * fechaAlta, cuota, invitacionNominal, putaCortesia));
	 * 
	 * }else {
	 * 
	 * String entradamensual = Lector.leer("Introduzca nombre del evento"); String
	 * putitoCortesia = Lector.leer("Introduzca el nombre del puto");
	 * 
	 * this.listaSocios.add(new SocioPlatino(dni, nombre, telefono, localidad,
	 * fechaAlta, cuota, entradamensual, putitoCortesia)); } }
	 */

}
