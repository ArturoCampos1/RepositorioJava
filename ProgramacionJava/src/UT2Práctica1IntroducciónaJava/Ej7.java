package UT2Práctica1IntroducciónaJava;
import java.util.Scanner;

public class Ej7 {
	//Ejercicio 7: Calcular el Módulo de un Número
	
    public static void main(String[] args) {
    	
		Scanner scan1 = new Scanner(System.in); //Se crea el scaner
		System.out.println("Ingresa el primer número: ");
        int num = scan1.nextInt();  //Tendría mas sentido si este valor fuese double para que el valor absoluto lo corte
        
        int numAbsoluto = Math.abs(num); //Formula para el num absoluto
        int numResto = num % 2; //Formula para MOD
        
        System.out.println("Tu número: " + num);
        System.out.println("Valor absoluto: " + numAbsoluto);
        System.out.println("El módulo (entre 2): " + numResto);

    	
    }

}
