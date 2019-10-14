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

    /**
     * Ejercicio 5:
     * Tenemos un número de conejitos y cada conejito tiene dos grandes orejas. Se quiere calcular el número
     * total de orejas en todos los conejos recursivamente (sin bucles o multiplicación). Escriba una función
     * recursiva para obtener dicho total. Ej:
     * bunnyEars(0) → 0
     * bunnyEars(1) → 2
     * bunnyEars(2) → 4
     *
     * @param n recibe cantidad de conejos
     */

    public static int bunnyEars(int n) {


        if (n == 0) {
            System.out.println("bunnyEars(" + n + ")" + "→ " + 0);
        } else {

            bunnyEars(n - 1);

            int a = n;
            int b = a;
            a += b;

            System.out.println("bunnyEars(" + n + ")" + "→ " + a);
        }


        return 0;

    }


    /**
     * Ejercicio 6:
     * Tenemos conejitos de pie en una línea, numerados 1, 2, ... Los conejitos en posiciones impares (1, 3, ..)
     * tienen las 2 orejas normales. Los conejos en las posiciones pares (2, 4, ..) diremos que tienen 3 orejas,
     * porque cada uno tiene un pie levantado. Escriba una función que devuelva recursivamente el número de
     * "orejas" en la línea de conejos 1, 2, ... n (sin bucles o multiplicación).
     * bunnyEars2(0) → 0
     * bunnyEars2(1) → 2
     * bunnyEars2(2) → 5
     *
     * @param n recibe cantidad de conejos
     * @param a tiene que ser 0 por default se utiliza para contar las catidad de orejas
     * @param b tiene que ser 0 por default  se utiliza para representar la cantidad de conejos.
     */

    //Se puede hacer una mayor abstraccion, tratar encapsular aun mas.

    public static int bunnyEarsTres(int n, int a,int b) {


        if (n == 0) {


            System.out.println("bunnyEars(" + b + ")" + "→ " + a);
            return 0;

        } else if (n % 2 != 0) {



            System.out.println("bunnyEars(" + b + ")" + "→ " + a);

            bunnyEarsTres(n-1, a + 3,b+1);

        } else {



            System.out.println("bunnyEars(" + b + ")" + "→ " + a);

            bunnyEarsTres(n-1, a + 2,b+1);
        }


        return 0;


    }


}
