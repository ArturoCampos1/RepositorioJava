package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej6 {
	//Ejercicio 6: Verificación de triángulo
	
	public static void main(String args[]) {
		int long1, long2, long3;
		System.out.println("Introduce 3 longitudes");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Longitud 1: ");
		long1 = entrada.nextInt();
		System.out.println("Longitud 2: ");
		long2 = entrada.nextInt();
		System.out.println("Longitud 3: ");
		long3 = entrada.nextInt();

		entrada.close();
		
		if(long1 == long2 && long1 == long3) {
			System.out.println("El triángulo es equilátero");
		}else if(long1 == long2 || long2 == long3 || long3 == long1) {
			System.out.println("El triángulo es isósceles");
		}else if(long1 != long2 || long2 != long3 || long3 != long1) {
			System.out.println("El triángulo es escaleno");
		}
	} 
}
