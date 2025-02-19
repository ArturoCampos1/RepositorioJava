package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej1 {
	//Ejercicio 1: Determinar si un número es par o impar
	
	public static void main(String args[]) {
		int num;
		Scanner entrada = new Scanner(System.in); //Creamos scanner
		System.out.println("Introduce un número entero"); 
		num = entrada.nextInt();
		entrada.close(); //Cerramos scanner
		
		if(num % 2 == 0) { //Si el modulo de el numero es 0 significa par
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
	}
}
