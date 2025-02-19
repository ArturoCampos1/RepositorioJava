package UT2Práctica1IntroducciónaJava;
import java.util.Scanner;

public class Ej2 {
	//Ejercicio 2: Conversión de Temperaturas
	
    public static void main(String[] args) {
    	double celsius; //Inicializamos la variable sin darle valor
    	System.out.println("Introduzca la temperatura en Celsius: ");
		Scanner entrada = new Scanner(System.in); //Creamos el scanner
		celsius = entrada.nextDouble(); //Leemos hasta llegar a un espacio en blanco
		double fahrenheit = (celsius * 9/5) + 32; //Inicializamos Fahrenheit y el valor es la formula de ejecucion
		System.out.println("Has introducido " + celsius + " grados celsius y son " + fahrenheit + " grados fahrenheit");
    }
	
}
