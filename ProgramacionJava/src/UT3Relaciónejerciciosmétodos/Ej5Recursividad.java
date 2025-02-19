package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej5Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("--Comprobador de binarios--");
		System.out.println("Introduce tu número decimal");
		int num = teclado.nextInt();
		teclado.close();
		
		System.out.println(calculadoraBinario(num));
	}

	static String calculadoraBinario(int num) {
		
		if (num == 0) {
			return "0";
		}
		if (num == 1) {
			return "1";
		}
				
		return calculadoraBinario(num / 2) + (num % 2);
	}
}

