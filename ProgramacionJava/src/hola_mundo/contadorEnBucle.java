package hola_mundo;

public class contadorEnBucle {
	
	public static void metodo() {
		int[] array = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 0};
		int contador = 0;
		int entero = 5;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == entero) {
				contador++;
			}
		}
		System.out.println("El entero se repite " + contador + " veces.");
	}

	public static void main(String[] args) {
	
		metodo();
	
}
}