// Programa que dibuja un rectángulo sólido de asteriscos. El número de filas y columnas se pide por teclado

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo1BuclesAnidados
public class Ejemplo1BuclesAnidados {

    // Se declara el comienzo de la clase principal
    public static void main(String[] args) {

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se declaran las variables 'filas' y 'columnas' de tipo numero entero
        int filas, columnas;

        // El programa ejecuta lo siguiente, y mientras la condicion posterior sea cierta, se seguira ejecutando (minimo se ejecutara una vez)
        do
        {
            // Se muestra en pantalla la solicitud de introducir el numero de filas deseado
            System.out.print("Introduce número de filas: ");
            // Se lee el valor introducido y se le asigna a la variable 'filas'
            filas = sc.nextInt();
        }
        // La condicion es que valor de 'filas' ha de ser mayor que 0, y mientras no lo sea, seguira pidiendo el valor de 'filas'
        while(filas<1);


        // El programa ejecuta lo siguiente, y mientras la condicion posterior sea cierta, se seguira ejecutando (minimo se ejecutara una vez)
        do
        {
            // Se muestra en pantalla la solicitud de introducir el numero de columnas deseado
            System.out.print("Introduce número de columnas: ");
            // Se lee el valor introducido y se le asigna a la variable 'columnas'
            columnas = sc.nextInt();
        }
        // La condicion es que valor de 'columnas' ha de ser mayor que 0, y mientras no lo sea, seguira pidiendo el valor de 'columnas'
        while(columnas<1);

        // Se crea un for que se ejecutara tantas veces como el numero de filas que hayamos introducido
        for(int i = 1; i<=filas; i++){    //filas

            // Mientras el valor de filas vaya aumentando, con cada valor que coja la variable 'i' el programa ejecutara otro for
            // Que se ejecutara tantas veces como columnas se hayan introducido
            for(int j = 1; j<=columnas; j++){   //columnas

                // Por cada paso, mostrara en pantalla un asterisco
                System.out.print(" * ");
            }
            
            // Se muestra en pantalla un salto de linea para pasar de una fila a otra
            System.out.println();
        }
       
    }
}