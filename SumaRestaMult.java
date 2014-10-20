 // Programa que lee dos números de tipo double por teclado y muestra su suma, resta y multiplicación

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal SumaRestaMult
public class SumaRestaMult {

    // Se declara el comienzo de la clase principal
    public static void main(String[] args){

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se declaran las variables 'numero1' y 'numero2' de tipo double
        double numero1, numero2;

        // Se muestra en pantalla la solicitud de introducir el primer numero 
        System.out.println("Introduce el primer número:");

        // Se lee el valor introducido y se le asigna a la variable 'numero1'
        numero1 = sc.nextDouble();
        
        // Se muestra en pantalla la solicitud de introducir el segundo numero 
        System.out.println("Introduce el segundo número:");
        
        // Se lee el valor introducido y se le asigna a la variable 'n1'
        numero2 = sc.nextDouble();

        // Se muestra los numeros introducidos en la pantalla 
        System.out.println("Números introducido: " + numero1 + "  " + numero2);

        // Se muestra los resultados de la suma, resta y multiplicacion en la pantalla
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}