package UT3PrácticaIntroduccionMetodos;

import java.util.Scanner;

public class Ej5 {
	//Indica si es par o impar
	
	static void parOimpar(int a) {
		if (a % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
	}
	
    public static void main(String[] args) {
		int digito;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		digito = entrada.nextInt();

		entrada.close();
		
		parOimpar(digito);

    }
}
