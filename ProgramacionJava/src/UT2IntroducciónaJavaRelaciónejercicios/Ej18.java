package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hecho con chaty
		int a;
		System.out.println("Ingresa un número");
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextInt();
		
		System.out.println("Centro numérico entre 1 y " + a); 
		
		for (int i = 1; i <= a; i++) {
			int suma = 0;
			
			for (int j = 0; j < i; j++) {
				suma = suma + j;
			}
			
			int sumaSegunda = 0;
			int numSegundo = i + 1;
			
			while (sumaSegunda < suma) {
				sumaSegunda = sumaSegunda + numSegundo;
				numSegundo++;
			}
			
			if (suma == sumaSegunda) {
				System.out.println(i + " es un centro numerico");
			}
		}
		entrada.close();
	}
}
