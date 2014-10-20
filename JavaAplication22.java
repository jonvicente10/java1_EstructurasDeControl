// Programa que muestra una tabla con las potencias de x (x x2 x3 x4) para valores de x desde 1 hasta XMAX

// Se crea la clase principal JavaAplication22
public class JavaApplication22 {

    // Se declara el comienzo de la clase principal
    public static void main(String[] args) {

        // Se declara la variable 'XMAX' con valor fijo y que no puede cambiar (simpre se mantiene igual)
        final int XMAX = 10;

        // Se declaran las variables 'x' y 'n' de tipo numero entero
        int x, n;

        // Se muestra en pantalla la primera linea de la tabla (el titulo de la tabla)
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");

        // Se crea un for que se ejecutara tantas veces como el valor de la variable 'XMAX'
        for (x = 1; x <= XMAX; x++){   // Cada vez que se ejecute esta linea el programa añadira una linea

            // Se creea otro for el cual se ejecutara mientras que el valor de n sea menor o igual a 4
            for (n = 1; n <= 4; n++){   // Cadad vez que se ejecute esta linea el programa añadira una columna

                // Se muestra en pantalla el valor del resultado de las potencias
                System.out.printf("%10.0f", Math.pow(x,n));
            }

            // Se muestra en pantalla un salto de linea
            System.out.println();
        }
    }
}