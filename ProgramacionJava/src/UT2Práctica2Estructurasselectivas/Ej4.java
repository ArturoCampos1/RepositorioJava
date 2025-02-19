package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej4 {
	//Ejercicio 4: Mayor de tres números
	
	public static void main(String args[]) {
		int num1, num2, num3;
		System.out.println("Introduce 3 números");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número 1: ");
		num1 = entrada.nextInt();
		System.out.println("Número 2: ");
		num2 = entrada.nextInt();
		System.out.println("Número 3: ");
		num3 = entrada.nextInt();

		entrada.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("El número mas grande es " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("El número mas grande es " + num2);
		} else if(num3 > num1 && num3 > num1) {
			System.out.println("El número mas grande es " + num3);
		}
	}
}

