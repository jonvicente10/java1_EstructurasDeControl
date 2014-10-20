
// Programa que pide un número de mes y muestra el nombre correspondiente

// Se importa la libreria java.util
import java.util.*;

// Se crea la clase principal Ejemplo0Switch
public class Ejemplo0Switch {

        // Se declara el comienzo de la clase principal
        public static void main(String[] args) {

        // Se declara la variable 'num' de tipo numero entero
        int mes;

        // Se crea el objeto 'sc' de tipo scanner
        Scanner sc = new Scanner(System.in);

        // Se muestra en pantalla la solicitud de introducir el numero de mes
        System.out.print("Introduzca un numero de mes: ");

        // Se lee el valor introducido y se le asigna a la variable 'mes'
        mes = sc.nextInt();

        // Comienza el switch, donde se compara el valor de mes con los valores expuestos (case)
        switch (mes)
        {
                // En el caso de que el valor de 'mes' sea '1', el programa mostrara "Enero"
                case 1: System.out.println("ENERO"); 
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '2', el programa mostrara "Febrero"
                case 2: System.out.println("FEBRERO");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '3', el programa mostrara "Marzo"
                case 3: System.out.println("MARZO");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '4', el programa mostrara "Abril"
                case 4: System.out.println("ABRIL");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '5', el programa mostrara "Mayo"
                case 5: System.out.println("MAYO");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '6', el programa mostrara "Junio"
                case 6: System.out.println("JUNIO");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '7', el programa mostrara "Julio"
                case 7: System.out.println("JULIO");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '8', el programa mostrara "Agosto"
                case 8: System.out.println("AGOSTO");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '9', el programa mostrara "Septiembre"
                case 9: System.out.println("SEPTIEMBRE");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '10', el programa mostrara "Octubre"
                case 10: System.out.println("OCTUBRE");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '11', el programa mostrara "Noviembre"
                case 11: System.out.println("NOVIEMBRE");
                    // Y despues saldra del switch usando 'break'
                    break;
                // En el caso de que el valor de 'mes' sea '12', el programa mostrara "Diciembre"
                case 12: System.out.println("DICIEMBRE");
                    // Y despues saldra del switch usando 'break'
                    break;
                // Si no es ninguno de los anteriores, el programa mostrara un valor por defecto; "Mes no valido"
                default : System.out.println("Mes no válido");                       
        }
    }
}
