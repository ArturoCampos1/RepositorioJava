package UT2IntroducciónaJavaRelaciónejercicios;
import java.util.Scanner;

public class Ej3 {

		//Cálculo de números primos
		
		 public static void main(String[] args) {
			 int limite;
			 int contador = 0;
			 Scanner entrada = new Scanner(System.in);
			 System.out.println("Introduce un valor entero: ");

			 limite = entrada.nextInt();
			 entrada.close();
			 
			 for(int i = 1; i <= limite; i++) {
				 
				 int contadorDiv = 0;
				 
				 //Este bucle incrementa el contador de dividendos
				 for(int j = 1; j <= i; j++) {
					 if(i % j == 0) {
					 contadorDiv++;
					 }
				 }
				 	if(contadorDiv == 2) { //Si el contadorDiv es igual a 2 significa que el numero es primo y aumentamos el contador de numeros primos
				 		contador++;
				 	}
			 }
			 System.out.println("Los números primos entre 0 y " + limite + " son " + contador);
		 }
}
