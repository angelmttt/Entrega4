package dominio;

public class Algoritmos {

// Ejercicio 34: Un algoritmo es una secuencia de instrucciones que se ejecutan para completar una tarea.
   
//Ejercicio 35: Este método suma los números desde 1 hasta n
    public static int suma(int n) {
        for(int i = 0; i < n; i++) {
            n += i;
       
        }
        return n;
    }

    public static int sumaCuadrados(int n) {
       if (n == 0) {
           return 0;
       } else {
           return n * n + sumaCuadrados(n - 1);
        
       }
    }

// Ejercicio 37; En este caso, la complejidad del tiempo depende de t, que es el tiempo, por lo que sería una complejidad constante O(1).


//Ejercicio 38: Para estos dos métodos, la complejidad no depende del tamaño de la entrada. Por lo tanto, siempre tiene el mismo tiempo, que es O(1).

//Ejercicio 39: Estos métodos generados utilizan bucles, por lo que la complejidad del tiempo es constante a medida que aumenta con la entrada dada. la complejidad temporal sería O(n).

// Ejercicio 40: La complejidad temporal de este método también es O(n). Depende de la cantidad de entrada.
// Este metodo calcula la potencia de dos numeros
    public static int potencia(int base, int exponente) {
       for(int i = 0; i < exponente; i++) {
           base *= base;
       }
       return base;
    }
 
//Ejercicio 41: La complejidad temporal de este ejercicio también sería O(n), en algunos casos la complejidad puede variar si el bucle es recursivo o iterativo, pero en este caso lo es. no cambia si continúa dependiendo de n.
//Este método calcula el factorial de un número
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

//Ejercicio 42: En este caso, la cardinalidad del bucle indica el número de elementos del array, por lo que la complejidad sería O(n^2) porque por cada n hay Se realizan dos operaciones, suma y resta, si preguntas por el producto cartesiano. .

//Ejercicio 43: En este ejercicio hay un cambio con respecto a los anteriores, porque se hacen dos bucles, uno de los cuales se encapsula dentro del otro. Por lo tanto su complejidad temporal sería O(n*m), esta complejidad se usa cuando se usan matrices porque depende de las filas y columnas de la matriz.

//Ejercicio 44: 
    public static boolean buscar(int e, int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == e){
                return true;
            }
        }
        return false;
    }

// Ejercicio 45: En este método la complejidad del código anterior se realiza de forma recursiva como se explica en el anterior. Lo peor es O(n), depende del número de llamadas recursivas
    public static boolean buscar(int e, int[] array, int index) {
        if (index == array.length) {
            return false;
        } else if (array[index] == e) {
            return true;
        } else {
            return buscar(e, array, index + 1);
        }
    }

//Ejercicio 46: La complejidad de Fibonacci recursivo sería O(n^2), porque para n llamadas hay n llamadas más.
    public static int fibonacci(int n){
        if (n<=1){
        return n;
        }else{ 
        return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
    
}

//Ejercicio 47: Los resultados no muestran que cuanto mayor sea n el método, más tiempo se ejecutará el código, porque la complejidad del método es O(n). En este caso, se utilizan 10 pasos, por lo que para cada paso que sumamos a n, el tiempo de ejecución es un factor de diez

//Ejercicio 48: En este caso, vemos que esta es una complejidad de tiempo O(n^2). , porque a debe ejecutarse dos veces, que sería i, primero una vez y luego otra vez. El problema es que como la complejidad es tal los tiempos no lo permiten, por qué multiplicarlos por 100 y no daría los tiempos

//Ejercicio 49: La verdad es que no lo entendí, pero estaba buscando la expresión definición iso o tempa.

//Ejercicio 50: No lo entiendo la verdad

//Ejercicio 51:
    //1) f(x)=1: Esta es una función constante, independiente del valor de x
    //2) f(x)=x: Esta función es una función lineal, a medida que x crece, f(x) crece también
    //3) f(x)=x^2: Esta función es una función cuadrática, a medida que x crece, f(x) aumenta de forma cuadrática
    //4) f(x)=log2(x): Es una curva que se acerca al eje x a medida que x crece, lo hace de manera más lenta que las funciones lineales o cuadráticas.
    //5) f(x)= 2^x: Esta función es una función exponencial, aumentado exponencialmente cada vez que x crece

//Ejercicio 52: La complejidad temporal de este código es O((log n)^2)

//Ejercicio 53: En este caso Sí, la complejidad puede variar, como expliqué antes, el peor caso debería ser O(n), pero si tenemos una lista ordenada, podemos usar búsqueda binaria y la complejidad sería O(log n).

//Ejercicio 54: 1.20ns 2.1000ns 3.2000ns 4.1000000ns 5.10 ^7 6.10000ns 1.50ns 2.1ms 3.5ms 4.100ns 1.000.0 0.0 0.0 0.0 .0 . 000s 5.10^37s 6.1000

//Ejercicio 55: El problema de no poder programar un juego perfecto es la gran cantidad de combinaciones posibles en un juego de ajedrez, que es incluso mayor que la cantidad de electrones que hay en el universo. Por lo que procesar esa cantidad de datos para crear un juego completo sería prácticamente imposible..