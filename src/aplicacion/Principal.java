package aplicacion;

import java.lang.management.OperatingSystemMXBean;
import dominio.Algoritmos;

public class Principal {
    public static void main(String[] args){

        System.out.println("34) La suma de los 10 primeros numeros es: " + Algoritmos.suma(10));
        System.out.println("34.2) La suma de los 5 primeros numeros es: " + Algoritmos.sumaCuadrados(10));
        System.out.println("40) El facotial de 5 es: " + Algoritmos.factorial(5));
    }

}