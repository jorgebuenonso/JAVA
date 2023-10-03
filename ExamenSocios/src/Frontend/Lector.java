package Frontend;

import java.util.Scanner;

public class Lector {
	
	private static  Scanner sc = new Scanner(System.in);
	
	public static String leer(String mnsj) {
		
		System.out.println(mnsj+":");
		
		return sc.nextLine();
	}

}
