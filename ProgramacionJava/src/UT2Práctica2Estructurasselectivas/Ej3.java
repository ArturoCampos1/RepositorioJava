package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej3 {
	//Ejercicio 3: Calificación final
	
	public static void main(String args[]) {
		int nota;
		System.out.println("Introduce la nota");
		Scanner entrada = new Scanner(System.in);
		nota = entrada.nextInt();
		entrada.close();
		
		if(nota < 0 || nota > 100) {
			System.out.println("Número no válido");
		}else if(nota >= 90 && nota <= 100) {
			System.out.println("A");
		} else if(nota >= 80 && nota <= 89) {
				System.out.println("B");
			} else if(nota >= 70 && nota <= 79) {
					System.out.println("C");
				}else if(nota >= 60 && nota <= 69) {
						System.out.println("D");
					} else if(nota < 60){
						System.out.println("F");
					}
				}
}
