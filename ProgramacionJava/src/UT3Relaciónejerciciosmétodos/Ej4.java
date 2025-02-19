package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Impresora de asteriscos--");
		System.out.print("Ingresa el número de asteriscos que quieres: ");
		num = teclado.nextInt();
		
		generarEstrellas(num);
		
		teclado.close();
	}
	static void generarEstrellas(int a) {
		for (int i = 1; i <= a ; i++) {
			System.out.print("* ");
		}
	}
}
