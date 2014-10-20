// Programa que obliga al usuario a introducir un número menor que 100

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo1While
public class Ejemplo1DoWhile {

	// Se declara el comienzo de la clase principal
    public static void main(String[] args) {

    	// Se declara la variable 'valor' de tipo numero entero
        int valor;

        // Se crea el objeto 'in' de tipo scanner
        Scanner in = new Scanner( System.in );

        // El programa ejecuta lo siguiente, y mientras la condicion posterior sea cierta, se seguira ejecutando (minimo se ejecutara una vez)
        do 
        {
        	// Se muestra en pantalla la solicitud de introducir un numero
            System.out.print("Escribe un entero < 100: ");
            // Se lee el valor introducido y se le asigna a la variable 'valor'
            valor = in.nextInt();
        }

        // La condicion es que valor ha de ser mayor o igual que 100
        while (valor >= 100);

        // Se muestra en pantalla un mensaje que dice el valor de la variable 'valor'
        System.out.println("Ha introducido: " + valor);
    }
}