// Programa que lee números hasta que se lee un negativo y muestra la suma de los números leídos

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo1While
public class Ejemplo1While {

    // Se declara el comienzo de la clase principal
    public static void main(String[] args) {

        // Se declaran las variables 'num' y 'suma' de tipo numero entero, y se establece el valor de 'suma' en '0'
        int suma = 0, num;

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se muestra en pantalla la solicitud de introducir el numero
        System.out.print("Introduzca un número: ");

        // Se lee el valor introducido y se le asigna a la variable 'num'
        num = sc.nextInt();

        // Se crea un bucle while que estara en funcionamiento mientras que el valor de 'num' sea mayor o igual a '0'
        while (num >= 0)
        {
            //El valor de la variable suma, sera el resultado de la suma entre 'suma' y 'num'
            suma = suma + num;
            // Se muestra de nuevo en pantalla la solicitud de introducir un nuevo numero
            System.out.print("Introduzca un número: ");
            // Se lee el valor introducido y se le asigna a la variable 'num'
            num = sc.nextInt();
        }

        // Se muestra en pantalla el resultado de la suma
        System.out.println("La suma es: " + suma );
    }
}