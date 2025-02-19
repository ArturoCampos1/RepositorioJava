package UT2Práctica1IntroducciónaJava;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
    	
		Scanner scan1 = new Scanner(System.in); //Se crea el scaner 1
		System.out.println("Ingresa el primer número: ");
        double num1 = scan1.nextDouble();  

		Scanner scan2 = new Scanner(System.in); //Se crea el scaner 2
		System.out.println("Ingresa el segundo número: ");
        double num2 = scan2.nextDouble();  
		
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("La multiplicación es: " + (num1 * num2));
		System.out.println("La división es: " + (num1 / num2));
		
    }
    
}
