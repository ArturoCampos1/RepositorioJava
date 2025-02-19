package U2_introduccionJava;

import java.util.Scanner;

public class ejemploMetodos {
	//
	
	static double suma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	static double resta(double a, double b) {
		double resultado = a - b;
		return resultado;
	}
	static double division(double a, double b) {
		double resultado = a / b;
		return resultado;
	}
	static double multiplicacion(double a, double b) {
		double resultado = a * b;
		return resultado;
	}
	static double elevar(double a, double b) {
		double resultado = Math.pow(a, b);
		return resultado;
	}
	static double modular(double a, double b) {
		double resultado = a % b;
		return resultado;
	}
	
	public static void main(String args[]) {
		double a, b;
		int c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		a = entrada.nextDouble();
		System.out.println("Introduce otro número: ");
		b = entrada.nextDouble();
		
		System.out.println("¿Qué quieres calcular?");
		System.out.println("SUMAR = 1");				
		System.out.println("RESTAR = 2");
		System.out.println("DIVIDIR = 3");
		System.out.println("MULTIPLICAR = 4");
		System.out.println("ELEVAR = 5");
		System.out.println("MÓDULO = 6");
		c = entrada.nextInt();
		
		entrada.close();
		
		switch (c) {
			case 1:
				double resultadoSuma = suma(a,b);
				System.out.println(resultadoSuma);
				break;
			case 2:
				double resultadoResta = resta(a,b);
				System.out.println(resultadoResta);
				break;
			case 3:
				double resultadoDivision = division(a,b);
				System.out.println(resultadoDivision);
				break;
			case 4:
				double resultadoMultiplicacion = multiplicacion(a,b);
				System.out.println(resultadoMultiplicacion);
				break;
			case 5:			
				double resultadoElevacion = elevar(a,b);
				System.out.println(resultadoElevacion);
				break;
			case 6:
				double resultadoModulo = modular(a,b);
				System.out.println(resultadoModulo);
				break;		
		}
	}
}
