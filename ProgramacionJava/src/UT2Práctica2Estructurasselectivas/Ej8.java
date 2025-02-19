package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ej8 {
	//Ejercicio 8: Descuento por membresía
	
	public static void main(String args[]) {
		String membresia;
		double precioMembresia = 30;
		System.out.println("Ingrese el tipo de membresía: ");
		System.out.println("**Recuerda que las letras tienen que ser en mayúscula");
		Scanner entrada = new Scanner(System.in);
		membresia = entrada.next();
		entrada.close();
		
		switch (membresia) {
		case "A":
            System.out.println("30% de descuento");
            double descuento1 = precioMembresia * 0.3;
            System.out.println("Tu precio es: " + (precioMembresia - descuento1));
	        break;
		case "B":
            System.out.println("20% de descuento");
            double descuento2 = precioMembresia * 0.2;
            System.out.println("Tu precio es: " + (precioMembresia - descuento2));
	        break;
	    case "C":
            System.out.println("10% de descuento");
            double descuento3 = precioMembresia * 0.1;
            System.out.println("Tu precio es: " + (precioMembresia - descuento3));
	    	break;
	    default:
            System.out.println("Membresía no válida");		
	    	break;
		}

	}
}
