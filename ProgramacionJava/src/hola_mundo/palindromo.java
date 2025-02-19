package hola_mundo;

import java.util.Scanner;

public class palindromo {
	//Número Palíndromo
	
	   public static void main(String[] args) {
		   String a;
		   System.out.println("Ingresa un número entero");
		   Scanner entrada = new Scanner(System.in);
		   a = entrada.next();
		   entrada.close();
		   String reversa = "";
		   
		   for(int i = a.length()-1; i >= 0 ;i--) {
			   reversa = reversa + a.charAt(i);
		   }
		   System.out.println(a + "||" + reversa);
		   String operadorTernario = (a.equals(reversa)) ? "Palíndromo": "No Palíndromo";
		   
		   System.out.println(operadorTernario);
	   }
}
