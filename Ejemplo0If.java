 // Programa que pide una nota por teclado y muestra un mensaje si la nota es mayor o igual que 5

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo0If
public class Ejemplo0If {

	// Se declara el comienzo de la clase principal
    public static void main(String[] args ){

    	// Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se muestra en pantalla la solicitud de introducir la nota
        System.out.print("Nota: ");

        // Se declaran las variables 'nota' de tipo numero entero
        int nota = sc.nextInt();

        // Se crea una condicion
        if (nota >= 5 ){ 		
        	// Si la nota es mayo o igual que 5, mostrara este mensaje en pantalla
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
        // Sino, el programa mostrara el siguiente mensaje en pantalla
        else
            System.out.println("Lo Siento, has suspendido");
    }
}