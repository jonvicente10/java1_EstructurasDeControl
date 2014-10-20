// Programa que pide dos números y un operador y muestra el resultado

// Se importa la libreria java.util y java.io
import java.util.*;
import java.io.*;

// Se crea la clase principal Ejemplo1Switch
public class Ejemplo1Switch{

    // Se declara el comienzo de la clase principal
    public static void main(String[] args) throws IOException{

        // Se declaran la variables 'A' 'B' y 'Resultado' de tipo numero entero y con valor predefinido '0'
        int A,B, Resultado = 0;

        // Se declara la variable 'operador' de tipo char
        char operador;
        
        // Se declara la variable 'calculado' de tipo boolean con valor predefinido 'true'
        boolean calculado = true;

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se muestra en pantalla la solicitud de introducir el primer numero
        System.out.print("Introduzca un numero entero:");

        // Se lee el valor introducido y se le asigna a la variable 'A'
        A = sc.nextInt();

        // Se muestra en pantalla la solicitud de introducir el segundo numero
        System.out.print("Introduzca otro numero entero:");

        // Se lee el valor introducido y se le asigna a la variable 'B'
        B = sc.nextInt();

        // Se muestra en pantalla la solicitud de introducir el operador
        System.out.print("Introduzca un operador (+,-,*,/):");

        // Se lee el valor introducido y se le asigna a la variable 'operador'
        operador = (char)System.in.read();

        // Comienza el switch, donde se compara el valor de operador con los valores expuestos (case)
        switch (operador) 
        {
            // En el caso de que el valor de 'operador' sea '-', el programa asignara a la variable 'Resultado' el valor de la resta
            case '-' : Resultado = A - B;
                // Y despues saldra del switch usando 'break'
                break;
            // En el caso de que el valor de 'operador' sea '+', el programa asignara a la variable 'Resultado' el valor de la suma
            case '+' : Resultado = A + B;
                // Y despues saldra del switch usando 'break'
                break;
            // En el caso de que el valor de 'operador' sea '*', el programa asignara a la variable 'Resultado' el valor de la multiplicacion
            case '*' : Resultado = A * B;
                // Y despues saldra del switch usando 'break'
                break;
            // En el caso de que el valor de 'operador' sea '/', el programa entrara en una condicion 'if'
            case '/' :  
                        // Si el valor de 'B' no es igual a '0'
                        if(B!=0)
                            // El programa hara la division y asignara el valor resultante en la variable 'Resultado'
                            Resultado = A / B;
                        // Si no se cumple la condicion (B!=0), el programa hara lo siguiente
                        else
                        {
                            // Mostrara en pantalla el siguiente mensaje
                            System.out.println("\nNo se puede dividir por cero");
                            // Y la variable 'calculado' pasara a obtener el valor 'false' en vez de 'true'
                            calculado = false;
                        }
                // Y despues saldra del switch usando 'break'
                break;

            // Si el valor de 'operador' no es ninguno de los anteriores, el programa mostrara el siguiente mensaje
            default : System.out.println("\nOperador no valido");
            // Y el valor de 'calculado' pasara a ser 'false' en vez de 'true'
            calculado = false;
        }

        // Si finalmente se cumple la condicion de que calculado es 'true', el programa mostrara el siguiente mensaje
        if(calculado)
        {
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
