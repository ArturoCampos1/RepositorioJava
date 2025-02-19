package hola_mundo;

import java.io.*;
import java.util.*;

public class GestionDeTareas {

    // Clase Tarea debe ser estática para ser usada en métodos estáticos.
    static class Tarea implements Serializable {
        private String nombre;
        private String descripcion;
        private String estado; // Puede ser "Pendiente", "En Progreso" o "Completada"
        private Date fechaVencimiento;

        public Tarea(String nombre, String descripcion, Date fechaVencimiento) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.estado = "Pendiente";
            this.fechaVencimiento = fechaVencimiento;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getEstado() {
            return estado;
        }

        public Date getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        @Override
        public String toString() {
            return "[" + estado + "] " + nombre + " - " + descripcion + " (Vence: " + fechaVencimiento + ")";
        }
    }

    public static List<Tarea> listaDeTareas = new ArrayList<>();
    private static final String ARCHIVO_DATOS = "tareas.dat";

    public static void main(String[] args) {
        cargarTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> agregarTarea(scanner);
                case 2 -> verTareas();
                case 3 -> actualizarEstado(scanner);
                case 4 -> eliminarTarea(scanner);
                case 5 -> buscarPorEstado(scanner);
                case 6 -> buscarPorPalabraClave(scanner);
                case 7 -> guardarTareas();
                case 8 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (opcion != 8);

        guardarTareas();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Ver Tareas");
        System.out.println("3. Actualizar Estado");
        System.out.println("4. Eliminar Tarea");
        System.out.println("5. Buscar por Estado");
        System.out.println("6. Buscar por Palabra Clave");
        System.out.println("7. Guardar Tareas");
        System.out.println("8. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void agregarTarea(Scanner scanner) {
        System.out.print("Nombre de la tarea: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripción de la tarea: ");
        String descripcion = scanner.nextLine();
        System.out.print("Fecha de vencimiento (YYYY-MM-DD): ");
        String fechaStr = scanner.nextLine();

        try {
            Date fechaVencimiento = new GregorianCalendar(
                    Integer.parseInt(fechaStr.split("-")[0]),
                    Integer.parseInt(fechaStr.split("-")[1]) - 1,
                    Integer.parseInt(fechaStr.split("-")[2])
            ).getTime();

            Tarea nuevaTarea = new Tarea(nombre, descripcion, fechaVencimiento);
            listaDeTareas.add(nuevaTarea);
            System.out.println("¡Tarea agregada con éxito!");
        } catch (Exception e) {
            System.out.println("Fecha inválida. Asegúrate de usar el formato YYYY-MM-DD.");
        }
    }

    public static void verTareas() {
        if (listaDeTareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            System.out.println("\n--- Lista de Tareas ---");
            for (int i = 0; i < listaDeTareas.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeTareas.get(i));
            }
        }
    }

    public static void actualizarEstado(Scanner scanner) {
        verTareas();
        if (listaDeTareas.isEmpty()) return;

        System.out.print("Selecciona el número de la tarea a actualizar: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar buffer

        if (indice >= 0 && indice < listaDeTareas.size()) {
            System.out.println("1. Pendiente\n2. En Progreso\n3. Completada");
            System.out.print("Selecciona el nuevo estado: ");
            int estado = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (estado) {
                case 1 -> listaDeTareas.get(indice).setEstado("Pendiente");
                case 2 -> listaDeTareas.get(indice).setEstado("En Progreso");
                case 3 -> listaDeTareas.get(indice).setEstado("Completada");
                default -> System.out.println("Estado no válido.");
            }

            System.out.println("¡Estado actualizado con éxito!");
        } else {
            System.out.println("Número de tarea no válido.");
        }
    }

    public static void eliminarTarea(Scanner scanner) {
        verTareas();
        if (listaDeTareas.isEmpty()) return;

        System.out.print("Selecciona el número de la tarea a eliminar: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar buffer

        if (indice >= 0 && indice < listaDeTareas.size()) {
            listaDeTareas.remove(indice);
            System.out.println("¡Tarea eliminada con éxito!");
        } else {
            System.out.println("Número de tarea no válido.");
        }
    }

    public static void buscarPorEstado(Scanner scanner) {
        System.out.print("Estado a buscar (Pendiente, En Progreso, Completada): ");
        String estado = scanner.nextLine();

        System.out.println("\n--- Tareas con estado: " + estado + " ---");
        listaDeTareas.stream()
                .filter(t -> t.getEstado().equalsIgnoreCase(estado))
                .forEach(System.out::println);
    }

    public static void buscarPorPalabraClave(Scanner scanner) {
        System.out.print("Palabra clave para buscar en el nombre o descripción: ");
        String palabraClave = scanner.nextLine().toLowerCase();

        System.out.println("\n--- Tareas que contienen: " + palabraClave + " ---");
        listaDeTareas.stream()
                .filter(t -> t.getNombre().toLowerCase().contains(palabraClave) ||
                        t.getDescripcion().toLowerCase().contains(palabraClave))
                .forEach(System.out::println);
    }

    public static void guardarTareas() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO_DATOS))) {
            out.writeObject(listaDeTareas);
            System.out.println("Tareas guardadas correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar las tareas: " + e.getMessage());
        }
    }

    public static void cargarTareas() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO_DATOS))) {
            listaDeTareas = (List<Tarea>) in.readObject();
            System.out.println("Tareas cargadas correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las tareas: " + e.getMessage());
        }
    }
}
