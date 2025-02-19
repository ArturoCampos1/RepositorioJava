package UT2Práctica1IntroducciónaJava;
import java.util.Scanner;

public class Ej6 {
	//Ejercicio 6: Calcular la Hipotenusa de un Triángulo Rectángulo
	
    public static void main(String[] args) {

	Scanner scan1 = new Scanner(System.in); //Se crea el scaner 1
	System.out.println("Ingresa el primer cateto: ");
    double cateto1 = scan1.nextDouble();  

	Scanner scan2 = new Scanner(System.in); //Se crea el scaner 2
	System.out.println("Ingresa el segundo cateto: ");
    double cateto2 = scan2.nextDouble();  
    
    double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)); //Formula de la hipotenusa
    
    System.out.println("Cateto 1; " + cateto1);
    System.out.println("Cateto 2; " + cateto2);
    System.out.println("La hipotenusa es: " + hipotenusa);
    
    }
}
