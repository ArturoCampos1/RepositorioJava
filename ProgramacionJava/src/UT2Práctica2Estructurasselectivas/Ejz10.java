package UT2Práctica2Estructurasselectivas;

import java.util.Scanner;

public class Ejz10 {
	//Ejercicio 10: Calculadora de impuestos
	
	public static void main(String args[]) {
		int ingreso;
		System.out.println("Introduce tus ingresos");
		Scanner entrada = new Scanner(System.in);
		ingreso = entrada.nextInt();
		entrada.close();
		
		if (ingreso < 10000) {
				System.out.println("Con esos ingresos no hace falta pagar impuestos");
		} else if(ingreso >= 10000 && ingreso < 20000) {
			System.out.println("Tienes que pagar un 10%");
			double impuestoIngreso = ingreso * 0.1;
			System.out.println("De tus ingresos (" + ingreso +  ") tienes que dar: " + impuestoIngreso);
		} else if(ingreso >= 20000 && ingreso < 30000) {
			System.out.println("Tienes que pagar un 15%");
			double impuestoIngreso = ingreso * 0.15;
			System.out.println("De tus ingresos (" + ingreso +  ") tienes que dar: " + impuestoIngreso);
		} else if(ingreso >= 30000) {
			System.out.println("Tienes que pagar un 20%");
			double impuestoIngreso = ingreso * 0.2;
			System.out.println("De tus ingresos (" + ingreso +  ") tienes que dar: " + impuestoIngreso);		} 
	}
}



