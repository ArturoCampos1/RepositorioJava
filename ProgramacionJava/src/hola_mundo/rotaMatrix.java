package hola_mundo;

public class rotaMatrix {
	
	public static int[][] rotaMatrix(int[][] matriz) {
		int n = matriz.length;
		int[][] rotada = new int[n][n];
		
		for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						rotada[j][n - 1 - i] = matriz[i][j];
					}
				}
		
		return rotada;
	}
	
	public static void main(String[] args) {
			
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println("Matriz original: ");
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] RESULTADO = rotaMatrix(matriz);
		System.out.println("Matriz rotada: ");
		for (int i = 0; i < RESULTADO.length; i++) {
			
			for (int j = 0; j < RESULTADO[i].length; j++) {
				System.out.print(RESULTADO[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
