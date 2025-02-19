package hola_mundo;

import java.util.Scanner;

public class contarEspacios {
	//Cuenta las palabras de una frase
	   public static void main(String[] args) {
		   String a;
		   System.out.println("Ingresa una frase");
		   Scanner entrada = new Scanner(System.in);
		   a = entrada.nextLine();
		   entrada.close();
		   char espacio = ' ';
		   String aCorregida = a.trim();
		   int contadorEspacio = 0;
		   boolean fraseValida = true;

		   for(int i = aCorregida.length()-1; i > 0; i--) {
			   if (aCorregida.charAt(i) == espacio) {
				   contadorEspacio++;
			   } 
			   //else if(aCorregida.charAt(i) == espacio && aCorregida.charAt(i-1) == espacio) {
			   // System.out.println("Frase no válida");
			   //}
		   }
		   System.out.println("La frase tiene " + (contadorEspacio + 1) + " palabras");
	   }
}
