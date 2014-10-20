 // Programa que lee un número n y muestra n asteriscos

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo1While
public class Ejemplo2While {

    // Se declara el comienzo de la clase principal
    public static void main(String[] args) {

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se declaran las variables 'n' y 'contador' de tipo numero entero, y se establece el valor de 'contador' en '0'
        int n, contador = 0;

        // Se muestra en pantalla la solicitud de introducir el numero
        System.out.print("Introduce un número: ");

        // Se lee el valor introducido y se le asigna a la variable 'n'
        n = sc.nextInt();

        // Se crea un bucle while que estara en funcionamiento mientras que el valor de 'contador' sea mayor que 'n'
        while (contador < n){
            // Se muestra en pantalla un asterisco
            System.out.println(" * ");
            // El valor de 'contador' se incrementa en 1
            contador++;
        }
    }
}