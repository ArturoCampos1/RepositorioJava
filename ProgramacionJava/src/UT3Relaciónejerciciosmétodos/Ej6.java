package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Conversor de texto a número--");
		System.out.println("Ingresa una cadena de texto para pasar a número");
		String cadena = teclado.nextLine();
		esNumeroValido(cadena);
		teclado.close();
	}
	static void esNumeroValido(String a) {
		
		boolean validar;
		try {											//Esta estructura funciona de manera que intenta pasar "a" a un entero, si lo pasa validar = true y lo imprime
			Integer.parseInt(a);						//el catch actua cuando salta la excepcion "NumberFormatException" que pilla si es String y pasa a 
			validar = true;								//poner validar = false y lo imprime
			System.out.println(validar);
		} catch (NumberFormatException hola){
			validar = false;
			System.out.println(validar);
		}
	}
}
