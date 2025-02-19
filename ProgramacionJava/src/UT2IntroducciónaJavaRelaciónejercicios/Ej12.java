package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// Declaracion de variables y contadores
		int n, contador = 1, tirada;
		int contadorUno = 0, contadorDos = 0, contadorTres = 0, contadorCuatro = 0 ,contadorCinco = 0, contadorSeis = 0;
		double resultadoUno = 0, resultadoDos = 0, resultadoTres = 0, resultadoCuatro = 0, resultadoCinco = 0, resultadoSeis = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas veces quieres que se tire el dado?");
		n = entrada.nextInt();
		entrada.close();
		
		for(int i = 0; i < n; i++) {
			tirada = (int) (Math.random() * 6) + 1;
			System.out.println(contador + " tirada: " + tirada);
			contador++;
			switch (tirada) {
			case 1: 
				contadorUno++;
				resultadoUno = (contadorUno * 100) / n;
				break;
			case 2: 
				contadorDos++;
				resultadoDos = (contadorDos * 100) / n;
				break;
			case 3: 
				contadorTres++;
				resultadoTres = (contadorTres * 100) / n;
				break;
			case 4: 
				contadorCuatro++;
				resultadoCuatro = (contadorCuatro * 100) / n;
				break;
			case 5: 
				contadorCinco++;
				resultadoCinco = (contadorCinco * 100) / n;
				break;
			case 6: 
				contadorSeis++;
				resultadoSeis = (contadorSeis * 100) / n;
				break;
			}
		}
		System.out.println("Porcentaje de 1: " + resultadoUno + "%");
		System.out.println("Porcentaje de 2: "+ resultadoDos + "%");
		System.out.println("Porcentaje de 3: "+ resultadoTres + "%");
		System.out.println("Porcentaje de 4: "+ resultadoCuatro + "%");
		System.out.println("Porcentaje de 5: "+ resultadoCinco + "%");
		System.out.println("Porcentaje de 6: "+ resultadoSeis + "%");
	}

}
