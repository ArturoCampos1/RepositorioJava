package U2_introduccionJava;

import java.util.Scanner;

public class ejemploBucles {
	public static void main(String args[]) {
		int edad;
		System.out.println("Introduce tu edad");
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextInt();
		entrada.close();
		
		if(edad < 0 || edad > 105) {
			System.out.println("Edad no válida");
		} else {
			if(edad < 18) {
				System.out.println("Tienes " + edad + " años");
				System.out.println("Eres menor de edad");
			} else {
				System.out.println("Eres mayor de edad");
			}
		}
	}
}
