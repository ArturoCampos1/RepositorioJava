package UT2Práctica1IntroducciónaJava;

public class Ej1 {
    // Ejercicio 1: Declaración y Asignación de Variables
	
	//Primero inicializamos las variables con su respectiva denominacion
    int edad = 1;
    double estatura = 1.85;
    boolean c = false;
    char genero = 'H';
    String nombre = "Arturo";

    public static void main(String[] args) {
    	//Creamos un objeto con el nombre de la clase (se tiene que llamar igual "Ej1")
        Ej1 ejemplo = new Ej1();
        
        //Imprimimos con sysout y llamamos al objeto ejemplo.(variable a imprimir)
        System.out.println("Edad: " + ejemplo.edad);
        System.out.println("Estatura: " + ejemplo.estatura);
        System.out.println("c = " + ejemplo.c);
        System.out.println("Genero: " + ejemplo.genero);
        System.out.println("Nombre: " + ejemplo.nombre);
    }
   
}
