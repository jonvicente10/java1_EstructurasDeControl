
// Programa que lee una nota y escribe la calificación correspondiente

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo3If
public class Ejemplo3If {

        // Se declara el comienzo de la clase principal
        public static void main(String[] args) {

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);
        
        // Se declara la variable 'nota' de tipo double
        double nota;

        // Se muestra en pantalla la solicitud de introducir la nota 
        System.out.println("Introduzca una nota entre 0 y 10: ");
        
        // Se lee el valor introducido y se le asigna a la variable 'nota'
        nota = sc.nextDouble();

        // Se muestra en pantalla el siguiente mensaje
        System.out.println("La calificación del alumno es ");

        // Se crea una condicion; si la nota es menor de 0 o mayor de 10 dara el siguiente error
        if(nota < 0 || nota > 10)
            System.out.println("Nota no válida");

        // Se crea otra condicion; si la nota es igual a 10, mostrara el siguiente mensaje
        else if(nota==10)
            System.out.println("Matrícula de Honor");

        // Se crea otra condicion; si la nota es mayor o igual que 9, mostrara el siguiente mensaje
        else if (nota >= 9)
            System.out.println("Sobresaliente");

        // Se crea otra condicion; si la nota es mayor o igual que 7, mostrara el siguiente mensaje
        else if (nota >= 7)
            System.out.println("Notable");

        // Se crea otra condicion; si la nota es mayor o igual que 6, mostrara el siguiente mensaje
        else if (nota >= 6)
            System.out.println("Bien");

        // Se crea otra condicion; si la nota es mayor o igual que 5, mostrara el siguiente mensaje
        else if (nota >= 5)
            System.out.println("Suficiente");

       // Sino, mostrara que la calificacion es de suspenso
        else
            System.out.println("Suspenso");
    }
}
