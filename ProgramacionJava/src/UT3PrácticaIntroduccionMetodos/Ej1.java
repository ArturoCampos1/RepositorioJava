package UT3PrácticaIntroduccionMetodos;

import java.util.Scanner;

public class Ej1 {
	//Muestra un saludo con un método
	
	static String saludo(String nombre) {
		String resultado = "Hola " + nombre;
		return resultado;
	}
	
    public static void main(String[] args) {
		String a;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		a = entrada.nextLine();
		entrada.close();
		
		String saludar = saludo(a);
		System.out.println(saludar);
    }
}
