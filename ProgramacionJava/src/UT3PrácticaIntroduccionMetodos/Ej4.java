package UT3PrácticaIntroduccionMetodos;

import java.util.Scanner;

public class Ej4 {
	//Calcula la tabla de multiplicar de un numero
	
			static void tabla(int a) {
				for(int i = 0; i <= 10; i++) {
					int resultado = a * i;
					System.out.println(resultado);
				}
			}
			
		    public static void main(String[] args) {
				int digito;
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introduce un número: ");
				digito = entrada.nextInt();

				entrada.close();
				
				tabla(digito);

		    }
}
