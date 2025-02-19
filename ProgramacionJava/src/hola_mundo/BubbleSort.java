package hola_mundo;

public class BubbleSort {
public static void ordenacion(int[] a) {
		
		//Recorre el array para ver el original
		System.out.print("Array desordenado: ");
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + " ");
		}
		
		int aux = 0;
		
		//Recorre el array 
		for (int i = 0; i < a.length; i++) {
			
			//Aqui lo que hace es recorrer el array con el length - 1 para que no se vaya del indice de array y de fallo y el - i es para que el ultimo
			// numero como ya va a estar ordenado no lo cuente en el array
	
			for (int j = 0; j < (a.length - 1 - i); j++) {	
				if (a[j] > a[j + 1]) {
					//Copia de variables
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
		
		//Para mostrar el array ya ordenado
        System.out.print("\nArray ordenado: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }

	}
	
	public static void main(String[] args) {
        
			int[] array = {11, 11, 4, 6};
			
			ordenacion(array);

	}
}

