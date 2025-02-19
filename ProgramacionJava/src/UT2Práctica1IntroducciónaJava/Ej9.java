package UT2Práctica1IntroducciónaJava;

import java.util.Scanner;

public class Ej9 {
	//Ejercicio 9: Redondeo de Números
	
    public static void main(String[] args) {
    	
		Scanner scan1 = new Scanner(System.in); //Se crea el scaner
		System.out.println("Ingresa un número: ");
        double num = scan1.nextDouble();
        
        double numArriba = Math.ceil(num); //Redondeo hacia arriba
        double numAbajo = Math.floor(num); //Redondeo hacia abajo
        
        System.out.println("Número redondeado hacia arriba " + numArriba);
        System.out.println("Número redondeado hacia abajo " + numAbajo);

    }
}
