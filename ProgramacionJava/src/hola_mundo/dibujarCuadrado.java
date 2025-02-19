package hola_mundo;
import java.util.Scanner;

public class dibujarCuadrado {

	   public static void main(String[] args) {
	   int largo, ancho;
	   Scanner entrada = new Scanner(System.in);
	   System.out.println("Ingresa el tamaño de largo");
	   largo = entrada.nextInt();
	   System.out.println("Ingresa el tamaño de ancho");
	   ancho = entrada.nextInt();
	   entrada.close();
	   
		   for (int fila = 1; fila <= largo; fila++) {
				for (int i = 0; i <= ancho; i++)
					System.out.print("*");
				
				System.out.println(); //Salto de línea para pasar a la siguiente FILA
			}	   
	   }
}