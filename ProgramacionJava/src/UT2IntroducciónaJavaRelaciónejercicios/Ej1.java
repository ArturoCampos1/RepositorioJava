package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej1 {
	//Pedir 6 notas y que te de una media
	
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	double nota1, nota2, nota3, nota4, nota5, nota6;
    System.out.println("Por favor, introduzca la nota de Programación: ");
	nota1 = entrada.nextDouble();
    System.out.println("Introduzca la nota de Lenguajes de Marcas: ");	
	nota2 = entrada.nextDouble();
    System.out.println("Introduzca la nota de Bases de Datos: ");	
	nota3 = entrada.nextDouble();
    System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
	nota4 = entrada.nextDouble();
    System.out.println("Introduzca la nota de Sistemas Informáticos: ");
	nota5 = entrada.nextDouble();
    System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral: ");
	nota6 = entrada.nextDouble();
	entrada.close();
	
	//Operacion para calcular la media
	double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;
	System.out.println("Tu media del curso es: " + media);
    }
}
