package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, numMax = 0, numMax2 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa para calcular los dos numeros mayores de un intervalo");
		System.out.println("Ingresa números, cuando quieras parar introduce 0");
		
		//Bucle while
		while (a != 0) {
			a = entrada.nextInt();
			
			//Primero hará el else porque el programa empieza con los dos numeros maximos en 0, por eso numMax2 siempre tendra el 2º numero mayor 
			if (numMax < numMax2) {
				numMax = a > numMax ? a: numMax;
			} else {
				numMax2 = a > numMax2 ? a: numMax2;
			}
		}
		
		entrada.close();
		
		System.out.println("Los dos números mayores son: ");
		System.out.println(numMax);
		System.out.println(numMax2);
	}

}
