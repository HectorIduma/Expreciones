package expreciones;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Expreciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena para validar:");
        String Scn = scanner.nextLine();

        
        String regex1 = "\\bHola mundo\\b"; 
        String regex2 = "(?i)\\bHola mundo\\b"; 
        String regex3 = "\\b(Java|Python|Go|Pascal|Perl)\\b"; 
        String regex4 = "^[a-zA-Z0-9._%+-]+@(unison\\.mx)$"; 
        String regex5 = "^ISI\\d{4}-[12]\\.(txt|csv)$"; 
        
        boolean validacion1 = Pattern.matches(regex1, Scn);
        boolean validacion2 = Pattern.matches(regex2, Scn);
        boolean validacion3 = Pattern.matches(regex3, Scn);
        boolean validacion4 = Pattern.matches(regex4, Scn);
        boolean validacion5 = Pattern.matches(regex5, Scn);

        if (validacion1) {
            System.out.println("La cadena coincide con la frase exacta 'Hola mundo'.");
        } else if (validacion2) {
            System.out.println("La cadena coincide con 'Hola mundo' sin importar las minusculas o mayusculas.");
        } else if (validacion3) {
            System.out.println("La cadena contiene una de las palabras: Java, Python, Go, Pascal, Perl.");
        } else if (validacion4) {
            System.out.println("La cadena es un correo valido de la Universidad de Sonora.");
        } else if (validacion5) {
            System.out.println("La cadena es un nombre de archivo valido con prefijo ISI.");
        } else {
            System.out.println("La cadena no es válida según las expresiones regulares definidas.");
        }

    }
    
}