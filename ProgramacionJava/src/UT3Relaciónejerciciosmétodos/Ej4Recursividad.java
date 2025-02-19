package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej4Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("--Comprobador de binarios--");
		System.out.println("Introduce tu númerio binario");
		int num = teclado.nextInt();
		teclado.close();
		
		System.out.println(comprobadorBinario(num));
		System.out.println("True: Binario || False: Decimal");
	}
	static boolean comprobadorBinario(int num) {
		
		if (num < 10) {
			if (num == 1 || num == 0) {
				return true;
			}
		}
		
		int prueba = num % 10;
		if (prueba == 1 || prueba == 0) {
			return comprobadorBinario(num / 10);
		} else {
			return false;
		}
		
		
	}
}
