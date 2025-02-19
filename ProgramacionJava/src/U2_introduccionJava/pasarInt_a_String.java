package U2_introduccionJava;

public class pasarInt_a_String {
	public static void main(String args[]) {
		String edad = "12";
		
		int edadInt = Integer.parseInt(edad);
		
		System.out.println(edad);
		System.out.println(edadInt);
		
		char espacio = 'a';
		int numChar = (int)espacio;
		String frase = Character.toString(espacio);
		
		System.out.println(frase);
		System.out.println(numChar);


	}
}	