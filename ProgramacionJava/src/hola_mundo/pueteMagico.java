package hola_mundo;
import java.util.Scanner;

public class pueteMagico {
	static int suma = 0;

	static boolean calcularSumaDigitos(int n){
		suma = 0;
		String nCadena = Integer.toString(n);
		String[] arraySplit = nCadena.split(""); //Separamos la cadena en un string con separacion ""
		
		for(int i = 0; i < arraySplit.length; i++) {
			int a = Integer.valueOf(arraySplit[i]);	//Pasamos el String a cadena y almacenamos todo en suma
			suma += a;
		}
		if (suma % 2 == 0) {
			return true;
		} else return false;
	}
	
	static int calcularMCD(int a, int b){
	    if(b == 0) {
	    	return a;
	    }
	    return calcularMCD(b, a%b);	//Algoritmo de Euclides
	}
	
	static boolean esNumeroMagico(int m){
		int contador = 0;
		for (int i = 1; i <= m; i++) {
			if (m % i == 0) { //Va dividiendo y acumulando el resto, si es 0 significa que es multiplo y el contador incrementa
				contador++;
			}
		}
		if (contador == 3) {
			return true;
		} else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean esPar, tresDivisores;
		int mcd;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¡Bienvenido al Torneo de la Arena Virtual! Prepárate para superar los retos.");
		System.out.println("--- Ronda de Energía ---");
		do {
			System.out.print("Introduce un número entero positivo: ");
			int a = teclado.nextInt();
			esPar = calcularSumaDigitos(a);
			if (esPar == true) {
				System.out.println("La suma de los dígitos es: " + suma + ". Es un número par. ¡Has superado la ronda!");
			} else {
				System.out.println("La suma de los dígitos es impar. Inténtalo de nuevo.");
			}
		} while (!esPar); //La exclamacion es para el operador logico NOT, significa si es false el metodo sigue haciendo el do
		System.out.println(" ");
		System.out.println("--- El Puente del Máximo Común Divisor ---");
		do {
			System.out.println("Introduce dos números: ");
			System.out.print("Número 1: ");
			int b = teclado.nextInt();
			System.out.print("Número 2: ");
			int c = teclado.nextInt();
			mcd = calcularMCD(b, c);
			if (mcd >= 1) {
				System.out.println("El MCD de " + b + " y " + c  + " es " + mcd + ". ¡El puente se abre!");
			} else {
				System.out.println("El puente queda cerrado. Inténtalo de nuevo");
			}
		} while (mcd < 1);
		System.out.println(" ");
		System.out.println("--- El Cubo de los Factores Mágicos ---");
		do {
			System.out.println("Introduce un número entero positivo: ");
			int d = teclado.nextInt();
			tresDivisores = esNumeroMagico(d);
			if (tresDivisores == true) {
				System.out.println("¡Correcto! " + d + " es un número mágico");
			} else {
				System.out.println(d + " no tiene exactamente 3 divisores. Inténtalo de nuevo.");
			}
		} while (!tresDivisores);
		System.out.println(" ");
		System.out.println("¡Felicidades! Has ganado el Torneo de la Arena Virtual.");
		
		teclado.close();

	}
}