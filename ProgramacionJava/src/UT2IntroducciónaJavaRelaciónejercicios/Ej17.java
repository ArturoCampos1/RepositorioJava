package UT2IntroducciónaJavaRelaciónejercicios;
import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baliza, numeros, numero = 0, contador = 1, resultadoMayor = 0, contadorMayorBaliza = 0, contadorMenorBaliza = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número de la baliza: ");
		baliza = entrada.nextInt();
		System.out.println("Introduce la cantidad de números a comparar con baliza");
		numeros = entrada.nextInt();
		
		//Bucle para pedir numeros 
		System.out.println("Introduce " + numeros + " numeros");
		for (int i = 0; i < numeros; i++) {
			numero = entrada.nextInt();
			System.out.println("Número " + contador + ": " + numero);
			contador++;
			
			//Estructuras para determinar valores
			
			if (numero > baliza) {
				contadorMayorBaliza++;
				resultadoMayor = resultadoMayor + numero;
			}
			
			if (numero < baliza) {
				contadorMenorBaliza++;
			}
		}
		entrada.close();
		//IMprimimos resultados
		System.out.println(" ");
		System.out.println("Números mayores que la baliza: " + contadorMayorBaliza);
		System.out.println("Números menores que la baliza: " + contadorMenorBaliza);
		System.out.println("La suma de los mayores es: " + resultadoMayor);
	}

}
