 // Programa que lea dos números por teclado y los muestre por pantalla

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal MostrarNumeros
public class MostrarNumeros {
    
    // Se declara el comienzo de la clase principal
    public static void main(String[] args){

        // Se declaran las variables 'n1' y 'n2' de tipo numero entero
        int n1, n2;

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se muestra en pantalla la solicitud de introducir el primer numero 
        System.out.println("Introduce un número entero: ");

        // Se lee el numero introducido y se le asigna a la variable 'n1'
        n1 = sc.nextInt();      

        // Se muestra en pantalla la solicitud de introducir el segundo numero 
        System.out.println("Introduce otro número entero: ");

        // Se lee el numero introducido y se le asigna a la variable 'n2'
        n2 = sc.nextInt();     
       
        // Se muestra el resultado en pantalla
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
}