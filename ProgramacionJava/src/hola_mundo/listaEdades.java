package hola_mundo;

import java.util.ArrayList;
import java.util.Random;

public class listaEdades {
    public static void main(String[] args) {
        // 1. Crear y llenar la lista con edades aleatorias entre 18 y 60
        ArrayList<Integer> edades = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            edades.add(random.nextInt(43) + 18);
        }

        // 2. Ordenar la lista en orden ascendente (usando el método de burbuja simple)
        for (int i = 0; i < edades.size(); i++) {
            for (int j = i + 1; j < edades.size(); j++) {
                if (edades.get(i) > edades.get(j)) {
                    int temp = edades.get(i);
                    edades.set(i, edades.get(j));
                    edades.set(j, temp);
                }
            }
        }

        // Mostrar las edades ordenadas
        System.out.println("Edades ordenadas: " + edades);

        // 3. Encontrar y mostrar la información requerida
        System.out.println("Edad más joven: " + edades.get(0));
        System.out.println("Edad más vieja: " + edades.get(edades.size() - 1));

        // Encontrar las tres edades más comunes (simplificado, sin manejar empates)
        System.out.print("Tres edades más comunes: ");
        for (int i = 0; i < 3 && i < edades.size(); i++) {
            System.out.print(edades.get(i) + " ");
        }
    }
}
