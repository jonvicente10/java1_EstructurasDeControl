// Programa que muestra el valor de a, b y su suma mientras que la suma de ambas es menor de 10. En cada iteración el valor de a se incrementa en 1 unidad y el de b en 2

// Se crea la clase principal Ejemplo3For
public class Ejemplo3For {

	// Se declara el comienzo de la clase principal
    public static void main(String[] args) {

    	// Se declaran las variables 'a' y 'b' de tipo numero entero
        int a, b;

        // Se crea un for que se ejecutara mientras que el valor de la suma entre 'a' y 'b' no sea mayor que 10
        // 'a' y 'b' comienzan con el valor 1 (las dos), y en cada paso, 'a' se incrementa en 1 y 'b' se incrementa en 2
        for(a = 1, b = 1; a + b < 10; a++, b+=2){

        	// Se muestra en pantalla los valores de 'a' y 'b' y el resultado de la suma entre ambas
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}