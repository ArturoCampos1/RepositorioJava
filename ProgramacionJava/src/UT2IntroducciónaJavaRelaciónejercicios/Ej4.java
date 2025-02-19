package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej4 {
	//Dar el contrario de un número de dados
	
	 public static void main(String[] args) {
		 System.out.println("Introduce el número que te ha tocado en el dado: ");
		 Scanner entrada = new Scanner(System.in);
		 int numero = entrada.nextInt();
		 entrada.close();
		 
		 //Esto es un switch que te imprime el numero contrario al numero que pongas y si no es ninguno de ellos sale error
		 switch(numero) {
		 case 1: 
			 System.out.println("El contrario es 6");
			 break;
		 case 2:
			 System.out.println("El contrario es 5");
			 break;
		 case 3:
			 System.out.println("El contrario es 4");
			 break;
		 case 4:
			 System.out.println("El contrario es 3");
			 break;
		 case 5:
			 System.out.println("El contrario es 2");
			 break;
		 case 6:
			 System.out.println("El contrario es 1");
			 break;
		 default:
			 System.out.println("Número no válido");
			 break;
		 }
	 }
}
