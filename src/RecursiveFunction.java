/**
 * Clase con todas las funciones Recursivas para Ejercios de Recursividad
 * Programacion II
 */

public class RecursiveFunction {


    private static final int constNumber = 10;


    private RecursiveFunction() {
    }

    /**
     * Ejercion 1- Realizar un procedimiento que imprima de manera recursiva los números del 1 al 10.
     */

    public static int UnoALDiez(int n) {

        if (n > 0) {

            UnoALDiez(n - 1);

            System.out.println("Number: " + n);

        }

        return n;


    }


    /**
     * Ejercicio 2 - Realizar un procedimiento que imprima de manera recursiva la tabla del 9.
     *
     * @param n longitud de la tabla requerida de 1 a n
     */

    public static int TablaDelNueve(int n) {

        int number = n;


        if (n > 0) {

            TablaDelNueve(number - 1);


            while (number != 9) {
                number++;
            }


            System.out.println(n + " X " + number + " = " + n * number);
        }


        return 0;
    }


    /**
     * Ejerc 3 - Realizar un procedimiento que encuentre el número mayor de un vector de n números enteros de manera recursiva.
     *
     * @param array         recibe el array en el cual se va a realizar la busqueda
     * @param arrayLongitud recibe la longitud del array
     * @param mayor         recibe cualquier numero, campo obligatorio
     */

    public static int numeroMayor(int[] array, int arrayLongitud, int mayor) {


        if (arrayLongitud != -1) {

            if (array[arrayLongitud] > mayor) {

                mayor = array[arrayLongitud];

            }

            mayor = numeroMayor(array, arrayLongitud - 1, mayor);
        }

        return mayor;


    }


    /**
     * funcion fibonacci retorna un numero ubicado en determinada posicion de la seleccion ej termino 10 = 55
     */
    public static int fibbonacci(int n) {


        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibbonacci(n - 1) + fibbonacci(n - 2));
        }

    }

    /**
     * Ejercicio 4:
     * La secuencia fibonacci es una parte famosa de la matemática. La misma posee una definición recursiva
     * en donde los dos primeros valores de la secuencia son 0 y 1 (esencialmente 2 casos base) y cada valor
     * posterior es la suma de los dos valores anteriores, por lo que toda la secuencia es: 0, 1, 1, 2, 3, 5, 8, 13,
     * 21 y así sucesivamente.
     * Se solicita definir un método de fibonacci recursivo (n) que devuelve el número fibonacci n-ésimo, con n
     * = 0 representando el inicio de la secuencia. Ej:
     * fibonacci(0) → 0
     * fibonacci(1) → 1
     * fibonacci(2) → 1
     * <p>
     * Llama de manera recursiva al metodo fibbonacci,  una X cantidad de terminos
     *
     * @param n recibe la cantidad de terminos a mostrar de la seleccion
     * @see #fibbonacci(int)
     */

    public static int recursiveFibonacci(int n) {

        if (n == 0) {
            return 0;
        } else {

            recursiveFibonacci(n - 1);

            System.out.println("fibonacci(" + (n - 1) + ")" + " → " + fibbonacci(n - 1));
        }

        return 0;
    }


    /**
     * Llama de manera recursiva al metodo fibbonaci, hasta determinado termino
     *
     * @param n recibe el termino hasta el cual se desea mostrar
     */
    public static int recursiveFibonacciNum(int n) {

        int num = 0;
        int cont = 0;

        while (n > num) {

            num = fibbonacci(cont);

            if (n > num) {
                System.out.println("fibonacci(" + (cont) + ")" + " → " + num);
            }

            cont++;
        }

        return 0;


    }
}
