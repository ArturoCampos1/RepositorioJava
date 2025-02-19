package hola_mundo;
import java.util.Scanner;

public class calculadoraEspecial {

	public static void magico(int a) {
			
		String prueba = Integer.toString(a);
		int suma = 0;
		
		for (int i = 0; i < prueba.length(); i++) {
			suma += (a % 10);
			
			a /= 10;
		}
		
		String operadorTern = suma % 7 == 0 ? "La suma total es: " + suma + "\nNúmero mágico!" : "La suma total es: " + suma + "\nEste número no es mágico";
		System.out.println(operadorTern);
		System.out.println("");
	}
	
	
	 public static void unico(int a) {
		
	       String num1 = String.valueOf(a); //Creamos un String con el valor del int dado por parámetro
	       int [] numeros = new int [num1.length()]; //Creamos un array con el tamaño del String creado
	       for (int i = 0; i<num1.length(); i++) {
	           numeros[i]= Character.getNumericValue(num1.charAt(i)); // Rellenamos el array con los números del String uno por uno
	       }
	       System.out.println("Los números únicos son:");
	       for (int j = 0; j<numeros.length; j++) {
	           boolean unico = true;
	           for (int z = 0;z<numeros.length; z++) {
	               if (j!=z && numeros [j] == numeros [z]) {
	                   unico = false;
	                   break;
	               }
	               
	               }
	           if (unico) {
	               System.out.println(numeros [j]);	
	           }
	       }
           System.out.println("");	
	}
	
	
	public static void espejo(int a) {
		
		String prueba = Integer.toString(a);
		String total = "";
		
		for (int i = 0; i < prueba.length(); i++) {
			total += (a % 10);
			
			a /= 10;
		}
		
		System.out.println("Tu número es " + prueba + " y el reverso es " + total);	
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int a, b;
		System.out.println("Bienvenido a la calculadora de operaciones especiales: ");
		
		do {
			System.out.println("1. Comprobar si un número es mágico");
			System.out.println("2. Verificar cuántos digitos son únicos en el número (Usando arrays)");
			System.out.println("3. Invertir un número (Número espejo)");
			System.out.println("4. Salir");
			a = teclado.nextInt();
			switch (a){
				case 1:
					System.out.println("Ingresa un número: ");
					b = teclado.nextInt();
					magico(b);
				break;
				case 2:
					System.out.println("Ingresa un número: ");
					b = teclado.nextInt();
					unico(b);
				break;
				case 3:
					System.out.println("Ingresa un número: ");
					b = teclado.nextInt();
					espejo(b);
				break;
				case 4:
					System.out.println("Finalizando programa...");
				break;
				default:
					System.out.println("Número no válido");
				break;
			}
		} while (a != 4);
			
	}
	
}
