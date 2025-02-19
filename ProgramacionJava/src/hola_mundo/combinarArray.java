package hola_mundo;
import java.util.Arrays;
import java.util.Scanner;

public class combinarArray {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int contadorA = 1;
	        int contadorB = 1;
	        String a = "";
	        String reinoA = "";
	        
	        String b = "";
	        String reinoB = "";
	        System.out.println("----------------------------------------------------------------------------");
	        System.out.println("Introduce el nivel de los caballeros del Reino A. Escribe 'fin' para terminar.");

	        while (true) {
	        	System.out.println("Nivel del caballero " + contadorA);
	           a = scanner.nextLine();
	           
	           if (a.equalsIgnoreCase("fin")) {
	        	   break;
	           }
	           
	           reinoA += a;
	           contadorA++; 
	        }
	        System.out.println("----------------------------------------------------------------------------");

	        System.out.println("Introduce el nivel de los caballeros del Reino B. Escribe 'fin' para terminar.");

	        while (true) {
	        	System.out.println("Nivel del caballero " + contadorB);
	           b = scanner.nextLine();
	           
	           if (b.equalsIgnoreCase("fin")) {
	        	   break;
	           }
	           
	           reinoB += b;
	           contadorB++; 
	        }
	        System.out.println("----------------------------------------------------------------------------");
	        
	        String[] arrayA = reinoA.split("");
	        String[] arrayB = reinoB.split("");
	        
	        int[] intArrayA = new int[arrayA.length];
	        int[] intArrayB = new int[arrayB.length];
	        
	        for (int i = 0; i < arrayA.length; i++) {
	        	intArrayA[i] = Integer.parseInt(arrayA[i]);
	        	intArrayB[i] = Integer.parseInt(arrayB[i]);
	        }
	       	        
	        int[] combinado = new int[intArrayA.length + intArrayB.length];
	        
	        System.arraycopy(intArrayA, 0, combinado, 0, intArrayA.length);
	        System.arraycopy(intArrayB, 0, combinado, intArrayA.length, intArrayB.length);

	        Arrays.sort(combinado);
	        
	        System.out.print("Conjunto de reinos: ");
	        for (int num : combinado) {
	            System.out.print(num + " ");
	        
	        scanner.close();
	    }
	 }
}