 // Programa que lee un número entre 1 y 10 ambos incluidos

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo2While
public class Ejemplo2DoWhile {

	// Se declara el comienzo de la clase principal
    public static void main(String[] args) {

    	// Se declara la variable 'n' de tipo numero entero
        int n;

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner( System.in );

        // El programa ejecuta lo siguiente, y mientras la condicion posterior sea cierta, se seguira ejecutando (minimo se ejecutara una vez)
        do 
        {
        	// Se muestra en pantalla la solicitud de introducir un numero del 1 al 10
            System.out.print("Escribe un número entre 1 y 10: ");
            // Se lee el valor introducido y se le asigna a la variable 'n'
            n = sc.nextInt();
        }

        // La condicion es que valor de 'n' ha de ser mayor que 1 o menor que 10
        while (n<1 || n>10);
        
        // Se muestra en pantalla un mensaje que dice el valor de la variable 'n'
        System.out.println("Ha introducido: " + n);
    }
}