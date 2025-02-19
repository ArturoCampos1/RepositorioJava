package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej7 {
	//Muestra los multiplos de 3 desde 1 hasta n && si n < 1 imprimir error y pedir de nuevo n
	
	 public static void main(String[] args) {
		 int n, contador = 0;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Calculo de numeros desde 1 hasta n");
		 System.out.println("Introduce un número mayor que 1");
		 n = entrada.nextInt();	
		 
		 //Bucle para introduir un numero hasta que sea mayor que 1, tiene un limite de 100 intentos
		 for(int j = 0; j < 100; j++) {
			 if (n < 1) {
				 System.out.println("Número no válido, introduce otro: ");
				 n = entrada.nextInt();	
			 }
		 }
		 
		 //Cuando la el resto de i / 3 sea 0 significaria que i es multiplo de 3, por eso lo imprimimos
		 System.out.println("Números primos: ");
		 for (int i = 1; i <= n; i++) {
			 if (i % 3 == 0) {
				 System.out.println(i);
				 contador++;
			 }
		 }
		 entrada.close();
		 System.out.println(" ");
		 System.out.println("Resultado; ");
		 System.out.println("En total entre 1 y " + n + " hay " + contador + " múltiplos de 3");
	 }
}
