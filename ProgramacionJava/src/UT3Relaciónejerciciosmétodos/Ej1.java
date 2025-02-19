package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		 double a, b, c;
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("--Calculadora de medias--");
		 System.out.print("Ingresa la 1ª nota: ");
		 a = teclado.nextDouble();
		 System.out.print("Ingresa la 2ª nota: ");
		 b = teclado.nextDouble();
		 System.out.print("Ingresa la 3ª nota: ");
		 c = teclado.nextDouble();
		 
		 System.out.println(calcularPromedio(a, b, c));
		 
		 teclado.close();
	 }	
	 static double calcularPromedio(double num1, double num2, double num3) {
		 return (num1 + num2 + num3) / 3;
	 }	
}
