package hola_mundo;

import java.util.Random;

public class MatrizIrregular {
	
	public static void promedio(int[][] a) {
		
		int total = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += a[i][j];
			}
			double promedio = (double)total/a[i].length;
			System.out.println("Promedio de la materia " + (i + 1) + ": " + promedio);
			total = 0;
		}
				
	}
	
	public static void calificacionAlta(int[][] a) {
		
		int notaAlta = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (notaAlta < a[i][j]) notaAlta = a[i][j];
			}
		}
		System.out.println("Nota más alta: " + notaAlta);
	}
	
	public static void calificacionBaja(int[][] a) {
		
		int notaBaja = 10;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (notaBaja > a[i][j]) notaBaja = a[i][j];
			}
		}
		System.out.println("Nota más alta: " + notaBaja);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random nota = new Random();
		int a = nota.nextInt(1, 6);
		int b = nota.nextInt(1, 6);
		int c = nota.nextInt(1, 6);
		
		int[][] materias = {
			new int[a],
			new int[b],
			new int[c]
		};
		
		
		//Darle valor a matriz
		for (int i = 0; i < materias.length; i++) {
			
			for (int j = 0; j < materias[i].length; j++) {
				int notaGenerada = nota.nextInt(1, 11);
				materias[i][j] = notaGenerada;
			}
		}
		
		//Recorrer matriz
		for (int i = 0; i < materias.length; i++) {
			System.out.print("Nota de la materia " + (i + 1) + ": ");
			for (int j = 0; j < materias[i].length; j++) {
				System.out.print(+ materias[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		promedio(materias);
		System.out.println("-----------------------------------------");
		calificacionAlta(materias);
		System.out.println("-----------------------------------------");
		calificacionBaja(materias);

		
	}

}
