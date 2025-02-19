package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej6 {
	//Pide un intervalo a < b; Mostrar suma de los numeros de dentro del intervalo, mostrar numeros de fuera y numeros iguales que los limites
	
	 public static void main(String[] args) {
		 int a, b, c;
		 int suma = 0;
		 int contFuera = 0;
		 int contIgual = 0;
		 int num = 1000;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresa un intervalo");
		 a = entrada.nextInt();
		 b = entrada.nextInt();
		 
		 //Bucle de 100 intentos para que se repita hasta que el intervalo sea válido
		 for(int j = 0; j < 100; j++) {
			 if (a > b) {
				 System.out.println("Intervalo no válido, introduce otro: ");
				 a = entrada.nextInt();
				 b = entrada.nextInt();
				 }
		 }
		 
		 System.out.println("Introduce números, cuando quieras parar ingresa 0");
		 for(int i = 0; i < num; i++) {
			 c = entrada.nextInt();
			 
			 //Estructura para si es 0 imprima los resultados y acabe el programa
			 if (c == 0) {
				 System.out.println("El intervalo es desde " + a + " hasta " + b);
				 System.out.println("Suma de los números dentro del intervalo: " + suma);
				 System.out.println("Hay " + contFuera + " números fuera del intervalo");
				 System.out.println(contIgual + " números coinciden con los límites");
				 break;
			 }
			 
			 //Estructura para numeros dentro del intervalo
			 if (c > a && c < b) {
				 suma = suma + c;
			 }
			 
			 //Estructura para fuera del intervalo
			 if (c < a || c > b) {
				 contFuera++;
			 }
			 
			 //Estructura por si un digito es igual que el intervalo
			 if (c == a || c == b) {
				 contIgual++;
			 }

		 }

	 }
}
