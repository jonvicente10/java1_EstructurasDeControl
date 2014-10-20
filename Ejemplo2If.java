 // Programa que muestra un saludo distinto según la hora introducida

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo2If
public class Ejemplo2If {

        // Se declara el comienzo de la clase principal
        public static void main(String[] args) {

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se declara la variable 'hora' de tipo numero entero
        int hora;

        // Se muestra en pantalla la solicitud de introducir la hora 
        System.out.println("Introduzca una hora (un valor entero): ");

        // Se lee el valor introducido y se le asigna a la variable 'num'
        hora = sc.nextInt();

        /* Se crea una condicion; si la hora introducida esta entre las 00:00 (incluida) 
        y las 12:00 (no incluida), se mostrara el siguiente mensaje en la pantalla */
        if (hora >= 0 && hora < 12)
            System.out.println("Buenos días");
        
        /* Se crea otra condicion; si la hora introducida esta entre las 12:00 (incluida)
        y las 21:00 (no incluida), se mostrara el siguiente mensaje en la pantalla */
        else if (hora >= 12 && hora < 21)
            System.out.println("Buenas tardes");
        
        /* Se crea otra condicion; si la hora introducida esta entre las 21:00 (incluida)
        y las 24:00 (no incluida), se mostrara el siguiente mensaje en la pantalla */
        else if (hora >= 21 && hora < 24)
            System.out.println("Buenas noches");

        // Sino, el programa mostrara este mensaje
        else
        System.out.println("Hora no válida");
    }
}