package hola_mundo;

public class sumarDigitosMetodo {
	static int suma;
	static boolean calcularSumaDigitos(int n){
		suma = 0;
		String prueba = Integer.toString(n);
		for(int i = prueba.length()-1; i >= 0; i--) {
			int hola = prueba.charAt(i);
			suma += hola;
		}
		if (suma % 2 == 0) {
			return true;
		} else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 25;
		int contador = 0;
		for (int i = 1; i <= m; i++) {
			if (m % i == 0) {
				contador++;
			}
		}
		if (contador == 3) {
			System.out.println("SI");;
		} else System.out.println("NO");;
		System.out.println(contador);
	}

}
