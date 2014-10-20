// Programa que muestra los números del 10 al 1

// Se crea la clase principal Ejemplo2For
public class Ejemplo2For {

	// Se declara el comienzo de la clase principal
    public static void main(String[] args) {

    	// Se declara la variable 'i' de tipo numero entero
        int i;

        // Se crea un for, el cual ejecutara lo que este dentro de este mientras el valor de 'i' este entre 1 y 10.
        // Comienza teniendo el valor 10 y finaliza teniendo el valor 0, y en cada paso, se le decrementa el valor en 1
        for(i=10; i>0;i--)

        	// Se muestra en pantalla el valor de la variable 'i'
            System.out.println(i + " ");
    }
}