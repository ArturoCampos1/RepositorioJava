package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej10 {
	//juego entre el 1 y el 100
	
	 public static void main(String[] args) {
	 int a, intentos = 0;
	 int b = (int)(Math.random() * 100) + 1;
	 Scanner entrada = new Scanner(System.in);
	 for (int i = 0; i < 10; i++) {
		 System.out.println("Introduce un número");
		 a = entrada.nextInt();
		 
		 if (a < b) {
			 System.out.println("El número es mayor");
		 } 
		 if (a > b){
			 System.out.println("El número es menor");
		 }
		 if (a != b) {
			 intentos++;
		 }
		 if (a == b) {
			 System.out.println("Ese era el número correcto");
			 System.out.println("Intentos: " + intentos);
			 break;
		 }
		 i--;
	 }
	 entrada.close();
	 }
}
