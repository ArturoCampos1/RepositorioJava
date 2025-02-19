package UT2Práctica1IntroducciónaJava;
import java.util.Scanner;


public class Ej3 {
	//Ejercicio 3: Calcular el Área de un Círculo
	
    public static void main(String[] args) {
    double radio; //Inicializamos radio como double
    System.out.println("Ingresa el radio: ");
    Scanner entrada = new Scanner(System.in); //Creamos el scanner
    radio = entrada.nextDouble(); //Leemos el valor radio
    double area =  Math.PI * Math.pow(radio, 2); //Hacemos la formula de la area
    System.out.println("Con el radio " + radio + " el área del círculo es " + area); //Imprimimos
    }
}
