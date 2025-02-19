package hola_mundo;

public class pasarVoid {
		static int num = 5;
		static void cubo(double num){
			double x = Math.pow(num, 3);
			System.out.println(x);
		}
		
		static int suma(int a, int b) {
			int resultado = a + b;
			return resultado;
		}

	   public static void main(String[] args) {
		   cubo(num-1);
		   //System.out.println(num);
		   
		   int valor1 = 1;
		   int valor2 = 2;
		   
		   double c = suma(valor1, valor2);
		   System.out.println(c);
	   }
	
}
