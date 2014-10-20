 // Programa que pide un número por teclado y calcula si es par o impar

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo0OperadorCondicional
public class Ejemplo1OperadorCondicional {

	// Se declara el comienzo de la clase principal
    public static void main(String[] args) {

    	// Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se declara la variable 'num' de tipo numero entero
        int num;      

        // Se muestra en pantalla la solicitud de introducir el primer numero
        System.out.println("Introduzca numero: ");

        // Se lee el valor introducido y se le asigna a la variable 'num'
        num = sc.nextInt();

        /* Si el resto de la division entre el numero introducido y 2 es 0, el valor que se mostrara en pantalla sera "PAR". 
        Y si expresión es falsa, el valor que se mostrara en pantalla sera "IMPAR". */
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
