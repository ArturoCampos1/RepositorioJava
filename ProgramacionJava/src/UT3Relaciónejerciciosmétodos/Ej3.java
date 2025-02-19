package UT3Relaciónejerciciosmétodos;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Conversor de grados Celsius a Fahrenheit--");
		System.out.print("Ingresa los grados Celsius: ");
		num = teclado.nextDouble();
		
		System.out.println(num + " grados Celsius es igual a " + convertirACelsius(num) + " grados Fahrenheit"); 
		teclado.close();
	}
	static double convertirACelsius(double a) {
		return (a * 9 / 5) + 32;
	}
}
