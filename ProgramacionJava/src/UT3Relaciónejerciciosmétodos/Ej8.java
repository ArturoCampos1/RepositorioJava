package UT3Relaciónejerciciosmétodos;

import java.util.Scanner;

public class Ej8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   String a;
			   System.out.println("--Comprobador de cadenas palíndromas--");
			   System.out.println("Ingresa lo que quieras");
			   Scanner entrada = new Scanner(System.in);
			   a = entrada.next();
			   entrada.close();
			   
			   esPalindromo(a);
		   }
	
	static void esPalindromo(String a) {
		boolean validar;
		String reversa = "";
		   for(int i = a.length()-1; i >= 0 ;i--) {
			   reversa = reversa + a.charAt(i);
			   
		   }
		   
		   String aMinus = a.toLowerCase();
		   String reversaMinus = reversa.toLowerCase();
		   
		   if (aMinus.equals(reversaMinus)) {
			   validar = true;
		   } else {
			   validar = false;
		   }
		   System.out.println("Cadena: " + aMinus + "||" +  "Reversa: "+ reversaMinus);
		   System.out.println(validar);
	}
}
