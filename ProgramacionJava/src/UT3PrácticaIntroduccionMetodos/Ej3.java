package UT3PrácticaIntroduccionMetodos;

import java.util.Scanner;

public class Ej3 {
	//Multiplica dos numeros
	
		static double multiplicacion(double a, double b) {
			double resultado = a * b;
			return resultado;
		}
		
	    public static void main(String[] args) {
			int mult1, mult2;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			mult1 = entrada.nextInt();
			System.out.println("Introduce otro número: ");
			mult2 = entrada.nextInt();

			entrada.close();
			
			double resultadoMult = multiplicacion(mult1, mult2);
			System.out.println(mult1 + " * " + mult2 + " = " + resultadoMult);

	    }
}
