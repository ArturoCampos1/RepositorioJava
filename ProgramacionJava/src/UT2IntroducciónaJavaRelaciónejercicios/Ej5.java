package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej5 {
	//Leer 10 numeros: media positivos & media negativos & contador 0
	
	 public static void main(String[] args) {
	 double numero = 0;
	 int contPositivos = 0;
	 double cantidadPositivos = 0;
	 double cantidadNegativos = 0;
	 int contNegativos = 0;
	 int contCeros = 0;

	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Programa que calcula media de positivos, negativos y contador de 0");
	 for(int i = 1; i < 11; i++) {
		 System.out.println("Ingresa el número " + i);
		 numero = entrada.nextDouble();
		 
		 //Estructura para negativos
		 if (numero < 0) {
			 contNegativos++;
			 cantidadNegativos = cantidadNegativos + numero;
		 }
		 
		 //Estructura para positivos
		 if (numero > 0) {
			 contPositivos++;
			 cantidadPositivos = cantidadPositivos + numero;
		 }
		 
		 //Estructura para el 0
		 if (numero == 0) {
			 contCeros++;
		 }
	 }
	 	 entrada.close(); 	 
	 	 
	 	 System.out.println("Números positivos: " + contPositivos);
	 	 System.out.println("Números negativos: " + contNegativos);
		 System.out.println("Contador de ceros: " + contCeros);
		 System.out.println("  ");
		 
		 
	//Esto es por si no hay ningun numero positivo o negativo que no se haga una division entre 0
	 if (contPositivos != 0) {
		 double resultadoPositivos = cantidadPositivos / contPositivos;
		 System.out.println("Media positivos: " + resultadoPositivos);
	 } else {
		 System.out.println("No hay ningún número positivo.");
	 }
	
	 if (contNegativos != 0) {
		 double resultadoNegativos = cantidadNegativos / contNegativos;
		 System.out.println("Media negativos: " + resultadoNegativos);
	 } else {
		 System.out.println("No hay ningún número negativo.");
	 }

	 }
}
