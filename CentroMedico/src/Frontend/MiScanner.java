package Frontend;

import java.util.Scanner;

public class MiScanner {

	private static Scanner sc = new Scanner (System.in);
	
	
	public static String leer(String mnsj) {
		
		System.out.println(mnsj +":");
		
		return sc.nextLine();
	}
			
			
}
