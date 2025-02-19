package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej7 {
	//Ejercicio 7: Clasificación de números
	
	public static void main(String args[]) {
		int num;
		System.out.println("Introduce un número entero: ");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		
		entrada.close();
		
		if(num < 0) {
			System.out.println("Número negativo");
		} else if(num == 0) {
			System.out.println("Tu número es 0");
		} else if(num > 0) {
			System.out.println("Tu número es positivo");
			if(num % 2 == 0) {
				System.out.println("Número par");
			}
		} 
	}
}
