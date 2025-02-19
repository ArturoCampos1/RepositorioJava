package U2_introduccionJava;

import java.util.Scanner;

public class ejemploSwitch {

	public static void main(String args[]) {
		int num;
		System.out.println("Introduzca un número: ");
		Scanner entrada = new Scanner(System.in); 
		num = entrada.nextInt(); 
		entrada.close();

		
		switch (num % 2) {
		case 0:
		System.out.println("número par");
		break;
		default:
			System.out.println("número impar");
		}
	}
	
}
