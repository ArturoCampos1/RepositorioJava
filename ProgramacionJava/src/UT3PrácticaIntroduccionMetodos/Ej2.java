package UT3PrácticaIntroduccionMetodos;

import java.util.Scanner;

public class Ej2 {
	//Calcula el cubo de un numero
	
	static double cubo(int num) {
		double resultado = Math.pow(num, 2);
		return resultado;
	}
	
    public static void main(String[] args) {
		int a;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		a = entrada.nextInt();
		entrada.close();
		
		double elevarCubo = cubo(a);
		System.out.println("El cubo de " + a + " es " + elevarCubo);
    }
}
