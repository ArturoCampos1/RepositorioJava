package hola_mundo;

public class matrizMayor {

	public static void main(String[] args) {
		int[][] matriz = { { 5, 3, 8 }, { 1, 6, 4 }, { 3, 2, 7 } };

		int[][] matrizMayor = { { 9, 1, 4 }, { 6, 7, 3 }, { 4, 9, 6 } }; 

		int[][] resultado = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > matrizMayor[i][j]) {
					resultado[i][j] = matriz[i][j];
				} else {
					resultado[i][j] = matrizMayor[i][j];
				}
			}
				
		}
		for (int a = 0; a < resultado.length; a++) {
			for (int b = 0; b < resultado[a].length; b++) {
				System.out.print(resultado[a][b] + " ");
			}
			System.out.println();
			}
	}
}

