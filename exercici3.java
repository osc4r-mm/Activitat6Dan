package excepcions;

public class exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {  
			  throw new Exception("La meva excepció");  
			} catch (Exception e) {  
			  System.err.println("Capturar excepció");  
			  System.err.println("getMessage(): "+ e.getMessage());  // De la classe Throwable, retorna el missatge associat a la excepció.
			  System.err.println("getLocalizedMessage(): "+ e.getLocalizedMessage()); // Retorna una versió localitzada/detallada del missatge de l'excepció, pot ser útil en entorns amb més d'un llenguatge de programació 
			  System.err.println("toString(): "+e);  
			  System.err.println("printStackTrace():");  
			  e.printStackTrace(); // Mostra detalls sobre com, on es va produir una excepció i la crida de mètodes que va conduir a l'excepció,
			}  
		
	}

}
