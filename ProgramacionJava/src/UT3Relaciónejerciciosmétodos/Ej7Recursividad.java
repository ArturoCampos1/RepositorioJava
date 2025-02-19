package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej7Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Suma de naturales de 1 hasta n--");
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		teclado.close();
		System.out.println(sumaNaturales(num));
	}
	static int sumaNaturales(int a) {
		
		if (a <= 1) {
			return a;
		} else {
			for (int i = 1; i <= a;) {
				return a += sumaNaturales(a - 1);
			}
		}
		return a;
	}
}
 