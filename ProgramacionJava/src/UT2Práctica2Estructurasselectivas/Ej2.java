package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej2 {
	//Ejercicio 2: Clasificación por edad
	
	public static void main(String args[]) {
		int edad;
		System.out.println("Introduce tu edad");
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextInt();
		entrada.close();
		
		if(edad > 65) {
			System.out.println("Adulto Mayor");
		} else if(edad > 18 && edad < 64) {
				System.out.println("Adulto");
			} else if(edad > 13 && edad < 17) {
					System.out.println("Adolescente");
				}else if(edad < 12) {
						System.out.println("Niño");
					}
				}
}
