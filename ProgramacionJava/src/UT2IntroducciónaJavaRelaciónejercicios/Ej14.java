package UT2IntroducciónaJavaRelaciónejercicios;
import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldo, ventas, km, dias;
		System.out.println("Programa para calcular el sueldo líquido");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu sueldo: ");
		sueldo = entrada.nextInt();
		System.out.println("Ingresa el número de ventas");
		ventas = entrada.nextInt();
		System.out.println("Ingresa los km realizados");
		km = entrada.nextInt();
		System.out.println("Cuantos días de desplazamiento has realizado: ");
		dias = entrada.nextInt();
		entrada.close();
		
		double descuentos = (sueldo * 0.18) + 150;
		
		double sueldoBruto = (sueldo + (ventas * 0.05) + (km * 1) + (dias * 60));
		double sueldoLiquido = (sueldo + (ventas * 0.05) + (km * 1) + (dias * 60)) - descuentos;
		
		System.out.println("Tu sueldo líquido es de " + sueldoLiquido + "€");
		System.out.println("Tu sueldo bruto es de " + sueldoBruto + "€");
	}

}
