package U2_introduccionJava;

import java.util.Scanner;

class Miscanner {
	public static void main(String args[]) {
		String nombre; // Se declara la var como Cadena de texto, tambien se podria declarar en la linea 11 poniendo string nombre = entrada...
		System.out.println("Introduzca su nombre (una palabra): ");
		Scanner entrada = new Scanner(System.in); //Creamos el scanner
		entrada.close(); //Cerramos scanner
		nombre = entrada.next(); //Leemos hasta llegar a un espacio en blanco
		System.out.println("Hola, " + nombre);
	}
}
