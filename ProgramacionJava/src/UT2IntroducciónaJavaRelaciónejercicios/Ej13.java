package UT2IntroducciónaJavaRelaciónejercicios;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
			double hora, horaLlegada, dia, diaLlegada, contador = 0, difDias;
			double minuto, minutoLlegada, resultado;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Programa que calcula el tiempo del trayecto de un tren");
			System.out.println("Fecha de salida (1 - 31): ");
			dia = entrada.nextInt();
			System.out.println("Hora de salida (0h - 23h): ");
			hora = entrada.nextInt();
			System.out.println("Minuto de salida (0min - 59min): ");
			minuto = entrada.nextInt();
			
			System.out.println("Fecha de llegada (1 - 31): ");
			diaLlegada = entrada.nextInt();
			System.out.println("Hora de llegada (0h - 23h): ");
			horaLlegada = entrada.nextInt();
			System.out.println("Minuto de llegada (0min - 59min): ");
			minutoLlegada = entrada.nextInt();
			
			//He puesto estos condicionales para controlar que no ponga cosas que no tienen sentido, como poner un dia que sea 41
			if (dia < 1 || dia > 31) {
				System.out.println("Día no válido");
			}
			if (diaLlegada < 1 || diaLlegada > 31) {
				System.out.println("Día de llegada no válido");
			}
			if (dia > diaLlegada) {
				System.out.println("ERROR. No puedes poner una fecha de llegada anterior a la fecha de salida");
				System.out.println("Fecha inicio: " + dia + ";" + "Fecha llegada: " + diaLlegada);
			}
			if (hora < 0 || hora > 23) {
				System.out.println("Hora de inicio invalida");
			}
			if (horaLlegada < 0 || horaLlegada > 23) {
				System.out.println("Hora de llegada invalida");
			}
			if (minuto < 0 || minuto > 59) {
				System.out.println("Minuto de inicio invalido");
			}
			if (minutoLlegada < 0 || minutoLlegada > 59) {
				System.out.println("Minuto de llegada invalido");
			}
			// Fin de estructuras condicionales
			double totalInicio = hora + (minuto / 60);
			double totalLlegada = horaLlegada + (minutoLlegada / 60);
			if (totalLlegada > totalInicio) {
				resultado = totalLlegada - totalInicio;
			} else {
				resultado = totalInicio - totalLlegada;
			}

			if (dia < diaLlegada) {
				for (int i = 0; i < diaLlegada - dia; i++) {
					contador++;
				}
				difDias = contador * 24;
				double prueba;
				if (hora < horaLlegada) {
					prueba = difDias + resultado;
				} else {
					prueba = difDias - resultado;
				}
				System.out.println("Tiempo del tren: " + (prueba) + " horas (" + (prueba * 60) + " minutos)");
			} else {
				System.out.println("Tiempo del tren: " + (resultado) + " horas" + " (" + (resultado * 60)+ " minutos)" );
			}
 
			entrada.close();
		}

}
