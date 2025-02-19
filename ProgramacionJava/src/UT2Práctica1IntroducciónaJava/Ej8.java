package UT2Práctica1IntroducciónaJava;

import java.util.Scanner;

public class Ej8 {
	//Ejercicio 8: Conversión de Horas a Minutos y Segundos
	
    public static void main(String[] args) {
    	
		Scanner scan1 = new Scanner(System.in); //Se crea el scaner
		System.out.println("Ingresa un nº de horas: ");
        double horas = scan1.nextDouble();
        
        double minutos = horas * 60; //Formula para min
        double segundos = horas * 3600; //Formula para horas
        
        System.out.println("Tus horas: " + horas);
        System.out.println("Equivalen a " + minutos + " minutos");
        System.out.println("Equivales a " + segundos + " segundos");
    }
}
