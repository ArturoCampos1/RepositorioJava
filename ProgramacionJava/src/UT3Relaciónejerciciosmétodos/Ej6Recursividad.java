package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej6Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String cadena = teclado.next();
		String cadenaResultado = cadena.toLowerCase();
		System.out.println(ordenar(cadenaResultado));
		teclado.close();
	}
	static String ordenar(String a) {
		int tamaño = a.length();
		if (tamaño <= 1) {
			return "Ordenado";
		} else if (a.charAt(0) > a.charAt(1)){
			return "Sin ordenar";
		}
		else {
			return ordenar(a.substring(1));
		}
	}
}
