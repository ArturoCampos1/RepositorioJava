package hola_mundo;

import java.util.Random;
import java.util.Arrays;

public class basura {
	
	public static void comparacionEdades(int[] a) {
		
		int i = 0;
		int edadAlta = 0;
		int edadBaja = 100;
		
		for (i = 0; i < a.length; i++) {
			
			if (edadAlta < a[i]) edadAlta = a[i];
			if (edadBaja > a[i]) edadBaja = a[i];

		}
		
		System.out.println("Edad más alta: " + edadAlta);
		System.out.println("Edad más baja: " + edadBaja);
	}
	
	public static void main(String[] args) {
			
			Random edad = new Random();

			int[] edades = new int[15];
			
			for (int i = 0; i < edades.length; i++) {
				int a = edad.nextInt(18, 60);

				edades[i] = a;
			}
			
			System.out.println("Lista original: ");
			for (int i = 0; i < edades.length; i++) {
				System.out.print(edades[i] + " ");
			}
			
	
			System.out.println(" ");
			
			System.out.println("Lista ordenada ascendentemente");
			Arrays.sort(edades);
			System.out.println("Lista original: ");
			for (int i = 0; i < edades.length; i++) {
				System.out.print(edades[i] + " ");
			}
			
			System.out.println(" ");
			System.out.println("--------------------------");
			System.out.println(" ");

			comparacionEdades(edades);
			
	}
}
