package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej1Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a, b;
		   Scanner entrada = new Scanner(System.in);
		   System.out.println("--Elevar un número a otro--");
		   System.out.println("Ingresa dos números, recuerda que tienen que ser positivos: ");
		   do {
			   System.out.print("Número 1: ");
			   a = entrada.nextDouble();
			   System.out.print("Número 2: ");
			   b = entrada.nextDouble();
		   } while (a < 0 || b < 0);
		   
		   System.out.println(elevar(a, b));
		   entrada.close();
	}
	
	static double elevar(double a, double b) {
			if (b == 0) {
				return 1;
			} 
			double num = a * elevar(a, b - 1); 
			return num;
	}
}
