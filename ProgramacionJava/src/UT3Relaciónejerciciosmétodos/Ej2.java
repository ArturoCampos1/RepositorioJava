package UT3Relaciónejerciciosmétodos;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Concatenador de cadenas--");
		System.out.println("Ingresa la primera cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Ingresa la segunda cadena");
		cadena2 = teclado.nextLine();
		
		System.out.println("Cadena concatenada: " + concatenar(cadena1, cadena2));
		teclado.close();
	}
	static String concatenar(String a, String b) {
		return a + b;
	}
}
