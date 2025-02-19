package UT3Relaciónejerciciosmétodos;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Calculadora de raizes--");
		System.out.println("Ingresa el 1er número");
		int num1 = teclado.nextInt();
		System.out.println("Ingresa el 2ndo número");
		int num2 = teclado.nextInt();
		
		teclado.close();
		calcularRaizSuma(num1, num2);
	}
	static void calcularRaizSuma(int a, int b) {
		double raizCuadrada = Math.sqrt((a + b));
		System.out.println("La raíz de " + (a + b) + " es: " + raizCuadrada);
	}
}
