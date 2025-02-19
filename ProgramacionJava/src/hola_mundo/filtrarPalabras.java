package hola_mundo;

public class filtrarPalabras {
	
	public static void main(String[] args) {
		
		String[] palabras = {"Kotlin", "Python", "C++", "Ruby", "Java", "Cobol", "PHP", "Rust", "C#", "Swift"};
		int contador = 0;

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > 4){
				contador++;
			}
		}
		
		String[] palabrasLargas = new String[contador];
		int indice = 0;
		
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > 4){
				palabrasLargas[indice] = palabras[i];
				System.out.println(palabrasLargas[indice]);

				indice++;				
			} 
			

		}
		
	}
}
