package UT2IntroducciónaJavaRelaciónejercicios;

public class Ej8 {
	//Suma de pares e impares entre 1 y 100
	
	 public static void main(String[] args) {
	 int resultadoPares = 0, resultadoImpares = 0;
		for(int i = 1; i <= 100; i++) {
			
			//Si se cumple este if de par se acumula en esa variable
			if (i % 2 == 0) {
				resultadoPares = resultadoPares + i;
			} 
			
			//Si se cumple este if de impar se acumula en esa variable
			if (i % 2 != 0) {
				resultadoImpares = resultadoImpares + i;
			}
		}
		System.out.println("Suma de los pares: " + resultadoPares);
		System.out.println("Suma de los impares: " + resultadoImpares);
	 }
}
