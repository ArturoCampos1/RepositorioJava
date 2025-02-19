package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej9 {
	//Ejercicio 9: Clasificación de notas
	
	public static void main(String args[]) {
		int nota;
		System.out.println("Introduce la nota");
		Scanner entrada = new Scanner(System.in);
		nota = entrada.nextInt();
		entrada.close();
		
		if (nota < 0 || nota > 100) {
				System.out.println("Nota no válida");
		} else if(nota >= 90) {
			System.out.println("Exelente");
		} else if(nota >= 70 && nota <= 89) {
			System.out.println("Bueno");
		} else if(nota >= 50 && nota <= 69) {
			System.out.println("Regular");
		} else if(nota < 50) {
			System.out.println("Reprobado");
		} 
	}
}
