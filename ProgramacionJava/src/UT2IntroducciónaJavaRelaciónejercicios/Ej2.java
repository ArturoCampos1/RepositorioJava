package UT2IntroducciónaJavaRelaciónejercicios;
import java.util.Scanner;

public class Ej2 {
     public static void main(String args[]) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingresa un número");
         int num = entrada.nextInt();
         //Aqui lo cambiamos a string para despues usar la propiedad .length
         String numTexto = Integer.toString(num);
         int contador = 1;
         
         //Bucle para recorrer el numero y sacar cada cifra
         for (int i = 0; i < numTexto.length(); i++) {
        	 numTexto.charAt(i);
             System.out.println("La cifra "+ contador +" es "+ numTexto.charAt(i));
             contador ++;
         }
        
         entrada.close();
        
     }

}