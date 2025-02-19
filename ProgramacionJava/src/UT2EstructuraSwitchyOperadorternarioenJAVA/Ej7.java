package UT2EstructuraSwitchyOperadorternarioenJAVA;

import java.util.Scanner;

public class Ej7 {
	//Ejercicio 7: Cálculo de Impuestos según Categoría
	
    public static void main(String[] args) {
       	int categoria;
    	System.out.println("Ingresa tu categoría (1 - 4): ");
		Scanner entrada = new Scanner(System.in); 
		categoria = entrada.nextInt();
    	entrada.close();    	
    	
    	String operadorTernario = (categoria == 1) ? "Impuestos bajos" : (categoria == 2) ? "Impuestos medios": "Impuestos altos";
    	
    	switch (categoria) {
    	case 1:
    		System.out.println("Te corresponde unos impuestos del 5%");
    		break;
    	case 2:
    		System.out.println("Te corresponde unos impuestos del 10%");
    		break;
    	case 3:
    		System.out.println("Te corresponde unos impuestos del 15%");
    		break;
    	case 4:
    		System.out.println("Te corresponde unos impuestos del 20%");
    		break;
    	}
    	System.out.println(operadorTernario);
    }
}
