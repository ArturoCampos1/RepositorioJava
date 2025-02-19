package UT2EstructuraSwitchyOperadorternarioenJAVA;

import java.util.Scanner;

public class Ej6 {
	//Ejercicio 6: Conversión de Unidades de Longitud
	
    public static void main(String[] args) {
    	int unidad;
    	double valor;
    	System.out.println("Ingresa la medida que quieres usar");
    	System.out.println("1 - cm || 2 - m || 3 - km");
		Scanner entrada = new Scanner(System.in); 
		unidad = entrada.nextInt();
    	System.out.println("Ingresa un valor");
    	valor = entrada.nextDouble();
    	entrada.close();
    	
    	String operadorTernario = (unidad > 0 && unidad < 4) ? "Unidad válida" : "Unidad no válida"; // OPERADOR TERNARIO: Si se cumple se imprime unidad valida, si no lo otro
    	System.out.println(operadorTernario);
    	
    	switch (unidad) {
    		case 1:
    			System.out.println("Has elegido cm"); 
    			double mCm = valor / 100;
    			double kmCm = valor / 100000;
    			System.out.println("Tu valor (" + valor + "cm" + ") es igual a " + mCm + " metros y " + kmCm + "kilómetros.");
    			break;
    		case 2:
    			System.out.println("Has elegido m");  
    			double cmM = valor * 100;
    			double kmM = valor / 1000;
    			System.out.println("Tu valor (" + valor + "m" + ") es igual a " + cmM + " centímetros y " + kmM + " kilómetros.");
    			break;
    		case 3:
    			double cmKm = valor * 100000;  
    			double mKm = valor * 1000;
    			System.out.println("Tu valor (" + valor + "km" + ") es igual a " + cmKm + " centímetros y " + mKm + " metros.");
    			break;
    	}
    }
}
