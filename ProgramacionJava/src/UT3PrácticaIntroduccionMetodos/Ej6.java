package UT3PrácticaIntroduccionMetodos;

import java.util.Scanner;

public class Ej6 {
    //Crea un menú
    
    static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    static int resta(int a, int b) {
        int resultado = a - b;
        return resultado;
    }
    static int division(int a, int b) {
        int resultado = a / b;
        return resultado;
    }
    static int multiplicacion(int a, int b) {
        int resultado = a * b;
        return resultado;
    }
    static double elevar(int a, int b) {
        double resultado = Math.pow(a, b);
        return resultado;
    }
    
    public static void main(String args[]) {
        int a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        a = entrada.nextInt();
        System.out.println("Introduce un número: ");
        b = entrada.nextInt();
        
        System.out.println("¿Qué quieres hacer?");
        System.out.println("SUMAR = 1 || RESTAR = 2 || DIVIDIR = 3 || MULTIPLICAR = 4 || ELEVAR = 5 || SALIR = 0");
        c = entrada.nextInt();
        
        entrada.close();
        
        switch (c) {
            case 1:
                double resultadoSuma = suma(a,b);
                System.out.println(resultadoSuma);
                break;
            case 2:
                double resultadoResta = resta(a,b);
                System.out.println(resultadoResta);
                break;
            case 3:
                double resultadoDivision = division(a,b);
                System.out.println(resultadoDivision);
                break;
            case 4:
                double resultadoMultiplicacion = multiplicacion(a,b);
                System.out.println(resultadoMultiplicacion);
                break;
            case 5:            
                double resultadoElevacion = elevar(a,b);
                System.out.println(resultadoElevacion);
                break;
            case 0:
            	break;
        }

    }
}