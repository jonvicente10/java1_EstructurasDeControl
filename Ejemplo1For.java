// Programa que muestra una tabla de equivalencias entre grados Fahrenheit y grados celsius

// Se crea la clase principal Ejemplo1For
public class Ejemplo1For {

    // Se declara el comienzo de la clase principal
    public static void main(String[] args) {

        // Se declaran las variables con valores fijos y que no se pueden cambiar (simpre se mantiene igual)
        final int VALOR_INICIAL = 10; // Limite minimo de la tabla
        final int VALOR_FINAL = 100; // Limite maximo de la tabla
        final int PASO = 10 ; // Incremento de los grados fahrenheit en cada paso

        // Se declara la variable 'fahrenheit' de tipo numero entero
        int fahrenheit;

        // Se declara la variable 'celsius' de tipo double
        double celsius;

        // A la variable fahrenheit toma el valor de la variable 'VALOR_INICIAL' para que el primer numero que muestre sea '10'
        fahrenheit = VALOR_INICIAL;

        // Se muestra en pantalla la primera linea de la tabla (el titulo de la tabla)
        System.out.printf("Fahrenheit \t Celsius \n");

        // Se crea un for que se ejecutara mientras que el valor de fahrenheit este entre VALOR_INICIAL (10) y VALOR_FINAL (100)
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;

            // En cada paso que de el programa por el for, el valor de fahrenheit se incrementara en el valor de PASO (10)
            fahrenheit+= PASO) {

            // Se calcula mediante la formula los grados celsius teniendo el valor de los grados fahrenheit y se guarda el valor en la variable 'celsius'
            celsius = 5*(fahrenheit - 32)/9.0;

            // Se muestra en pantalla los valores de fahrenheit y celsius en una "tabla" usando tabulaciones
            System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}