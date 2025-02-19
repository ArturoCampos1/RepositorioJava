package U2_introduccionJava;

public class ejemploMetodos2 {
	static double areaCuadrado(double lado)
	{
	return lado*lado;
	}
	static double perimetroCuadrado(double lado)
	{
	return lado*4;
	}
	static void mostrarMenu()
	{
	System.out.println("Esto es un método que muestra un menú");
	System.out.println("1 - Obtener área");
	System.out.println("2 - Obtener perímetro");
	}
	
	public static void main (String args[])
	{
	int a = 10;
	double r = areaCuadrado(a);
	System.out.println("El área de un cuadrado de lado "+a+" es "+r);
	System.out.println("El área de un cuadrado de lado 5 es "+areaCuadrado(5));
	}
}
