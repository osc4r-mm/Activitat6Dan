package excepcions;

import java.util.Scanner;

public class exercici2 {
	
	public static class errorEntradaIncorrecta extends Exception {
        public errorEntradaIncorrecta() {
            super("Entrada incorrecta.");
        }
    }
	
    public static void es_alfabetic(String cadena) throws errorEntradaIncorrecta {
        Scanner scanner = new Scanner(System.in);

        boolean alfabetic = false;
        

        while (!cadena.equals("0") || !alfabetic) {
            alfabetic = true;
            for (char letra : cadena.toCharArray()) {
                if (!Character.isLetter(letra)) {
                    alfabetic = false;
                    throw new errorEntradaIncorrecta();
                }
            }

            if (!alfabetic) {
                System.out.println("La cadena no es correcta. Inténtalo de nuevo.");
            } else {
                System.out.println("La cadena es correcta!");
            }

            System.out.println("Introdueix una cadena (0 per sortir): ");
            cadena = scanner.nextLine();
        }
    }

    public static void main(String[] args) throws errorEntradaIncorrecta {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix una cadena (0 per sortir): ");
        String cadena = scanner.nextLine();

        try {
            es_alfabetic(cadena);
        } catch (errorEntradaIncorrecta e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        scanner.close();
    }
}
