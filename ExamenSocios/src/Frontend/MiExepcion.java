package Frontend;

public class MiExepcion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiExepcion(String message) {
		super("Problema: "+message);
		
	}
	
	

}
