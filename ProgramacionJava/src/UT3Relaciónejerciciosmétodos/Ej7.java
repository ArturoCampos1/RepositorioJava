package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Comprobador de años bisiestos--");
		System.out.print("Ingresa el año: ");
		int año = teclado.nextInt();
		
		teclado.close();
		esBisiesto(año);
	}
	static void esBisiesto(int a) {
		boolean validar;
		
		if (a % 4 == 0 && (a % 100 != 0 || a % 400 != 0)) {
			validar = true;
		} else {
			validar = false;
		}
		System.out.println(validar);
	}

}
