package excepcions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercici1 {

	
//--------------------------------- Exercici 1.1 i 1.2---------------------------------    

//    public static int getNumero() {
//        Scanner scanner = new Scanner(System.in);
//        
//        int nombre_enter = 0;
//        
//        try {
//            System.out.println("Introdueix el nombre:");
//            nombre_enter = scanner.nextInt();
//            
//        } catch (InputMismatchException e) {
//            System.out.println("ERROR: No és un nombre enter.");
//        } finally {
//        }
//        return nombre_enter;
//    }
//
//    public static int entrada() {
//
//    	int num1 = getNumero();
//    	int num2 = getNumero();
//    	
//    	int resultat = 0;
//    			
//    	try {
//    		resultat = num1 / num2;
//    	} catch (ArithmeticException e) {
//            System.out.println("ERROR: Divisió entre zero.");
//        } finally {
//        }
//    	return resultat;
//    }
//-------------------------------------------------------------------------------------    

   
//--------------------------------- Exercici 1.3---------------------------------------    

	public static int getNumeroThrows(Scanner scanner) {
        System.out.print("Introdueix el nombre enter: ");
        return scanner.nextInt();
    }
    
    public static float entradaThrows(Scanner scanner) throws entradaMevaExcepcio {

    	int num1 = getNumeroThrows(scanner);
    	int num2 = getNumeroThrows(scanner);
    			
    	if (num2 == 0) {
            throw new entradaMevaExcepcio();
        }
    	
    	return (float) num1 / num2;
    } 
//-------------------------------------------------------------------------------------    


//--------------------------------- Exercici 1.4---------------------------------------    
    
    public static void list(String[] a) {
        System.out.println(a[3]);
    }
    
//-------------------------------------------------------------------------------------    

    
//--------------------------------- Exercici 1.5---------------------------------------    

    public static class entradaMevaExcepcio extends Exception {
        public entradaMevaExcepcio() {
            super("ERROR: Divisió entre 0.");
        }
    }
    
//-------------------------------------------------------------------------------------    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
        	float resultat = entradaThrows(scanner);
        	System.out.println("El resultat és: " + resultat);
        } catch (InputMismatchException e) {
        	System.out.println("ERROR: No és un nombre enter.");
        } catch (entradaMevaExcepcio e) {
            System.out.println(e.getMessage());
        }
        
        String[] a = new String[2];
        try {
            list(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: L'index es troba fora de rang.");
        }
        
        scanner.close();
    }
}
Este codigo ahora no ira 😈
