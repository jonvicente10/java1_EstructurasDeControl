 // Programa que pide un número por teclado y calcula si es par o impar

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal EjemploIf
public class EjemploIf {

        // Se declara el comienzo de la clase principal
        public static void main(String[] args) {

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se declara la variable 'num' de tipo numero entero
        int num;

        // Se muestra en pantalla la solicitud de introducir el numero 
         System.out.println("Introduzca numero: ");
        
        // Se lee el valor introducido y se le asigna a la variable 'num'
        num = sc.nextInt();

        /* Se crea una condicion; si el resto de la division entre el 
        numero introducido y 2 es 0, entonces mostrara que el numero es par */
        if ((num%2)==0)
           System.out.println("PAR");

       // Sino, mostrara que el numero es impar
        else
            System.out.println("IMPAR");
    }
}