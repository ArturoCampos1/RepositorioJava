package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej2Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		   Scanner entrada = new Scanner(System.in);
		   System.out.println("--Impresora de números invertidos--");
		   System.out.println("Ingresa un número positivo");
		   do {
			   num = entrada.nextInt();
		   } while (num < 0);
		   entrada.close();
		   System.out.println("Número: " + num + " || " + "Reversa: " + impresion(num));
	}
	static String impresion(int a) {
		if (a == 0) {
			return "";
		}
		int numero = a % 10;
		return numero + impresion(a / 10);
	}
}
