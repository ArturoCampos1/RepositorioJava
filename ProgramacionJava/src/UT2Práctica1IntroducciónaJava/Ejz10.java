package UT2Práctica1IntroducciónaJava;

import java.util.Scanner;

public class Ejz10 {
	//Ejercicio 10: Calculadora de Edad
	
    public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in); //Se crea el scaner 1
		System.out.println("Ingresa tu año de nacimiento: ");
        int anoNam = scan1.nextInt();  

		Scanner scan2 = new Scanner(System.in); //Se crea el scaner 2
		System.out.println("Ingresa el año actual: ");
        int anoAct = scan2.nextInt();  
        
        int edad = anoAct - anoNam;
        
        System.out.println("Tienes " + edad + " años");
    }
}
