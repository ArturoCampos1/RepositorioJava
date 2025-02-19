package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		int divisoresN1 = 0;
		int divisoresN2 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el primer número");
		n1 = entrada.nextInt();
		System.out.println("Ingresa el segundo número");
		n2 = entrada.nextInt();
		entrada.close();
		
		for(int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				divisoresN1 = divisoresN1 + i;
			}
		}
		for(int j = 1; j <= n2; j++) {
			if (n2 % j == 0) {
				divisoresN2 = divisoresN2 + j;
			}
		}
		
		if (divisoresN1 == divisoresN2) {
			System.out.println("Los números son amigos!");
		} else {
			System.out.println("Números no amigos");
		}
	}
}
