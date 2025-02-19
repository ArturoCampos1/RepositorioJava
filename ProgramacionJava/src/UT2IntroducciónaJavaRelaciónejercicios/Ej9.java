package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej9 {
	//Calculadora 
	
	 public static void main(String[] args) {
		 double a, b;
		 int c;
		 
		 Scanner entrada = new Scanner(System.in);
	 
		 
		 //Bucle infinito hasta que c = 5
		 for (int i = 0; i < 100; i++) {
			 System.out.println("Ingresa dos números");
			 a = entrada.nextDouble();
			 b = entrada.nextDouble();
			 
			 System.out.println("¿Qué quieres hacer?");
			 System.out.println("1.- Sumar los números.");
			 System.out.println("2.- Restar los números.");
			 System.out.println("3.- Multiplicar los números.");
			 System.out.println("4.- Dividir los números.");
			 System.out.println("5.- Salir del programa.");
			 
			 c = entrada.nextInt();
				 if (c == 1) {
					 double resultadoSuma = a + b;
					 System.out.println(resultadoSuma);
				 }
				 if (c == 2) {
					 double resultadoResta = a - b;
					 System.out.println(resultadoResta);
				 }
				 if (c == 3) {
					 double resultadoMult = a * b;
					 System.out.println(resultadoMult);
				 }
				 if (c == 4) {
					 if (b == 0) {
						 System.out.println("No se puede dividir entre 0");
					 } else {
					 double resultadoDivision = a / b;
					 System.out.println(resultadoDivision);
					 }
				 }
				 if (c == 5) {
					 System.out.println("Saliendo del programa...");
					 break;
				 }
			 }
		 }
	 }
