package hola_mundo;
import java.util.Scanner;
import java.util.Random;

public class BuckshotRoulette {
    
    public static void main(String[] args) {
        // Inicialización del juego
        System.out.println("------------------------------------------------------");
        System.out.println("¡Bienvenido a Buckshot Roulette!");
        System.out.println("------------------------------------------------------");
        
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        //
        // Definir variables del juego
        String jugador1, jugador2;
        int vidaJugador1 = 3;
        int vidaJugador2 = 3;
        int turno = 1;  // Para alternar entre jugadores
        String[] ventajas = {"escudo", "descarte", "cura", "bala"};
        
        // Pedir nombres de los jugadores
        System.out.print("Ingresa el nombre del jugador 1: ");
        jugador1 = teclado.nextLine();
        System.out.print("Ingresa el nombre del jugador 2: ");
        jugador2 = teclado.nextLine();
        
        // Iniciar el juego
        while (vidaJugador1 > 0 && vidaJugador2 > 0) {
            // Crear el tambor con 6 cámaras, una con una bala real
            boolean[] tambor = new boolean[6]; 
            int cargadas = random.nextInt(1, 7);  // Generar el número de cámaras cargadas con balas
            for (int i = 0; i < cargadas; i++) {
                tambor[random.nextInt(6)] = true;  // Distribuir aleatoriamente las balas
            }
            
            // Mostrar la información de la ronda y turno
            System.out.println("\nRonda " + turno);
            System.out.println("Hay " + cargadas + " balas reales y " + (6 - cargadas) + " balas de fogueo en el cargador.");
            
            // Determinar el turno actual
            String jugadorActual = (turno % 2 == 1) ? jugador1 : jugador2;  // Alternar entre jugadores
            String jugadorRival = (turno % 2 == 1) ? jugador2 : jugador1;
            
            System.out.println("Turno de " + jugadorActual);
            System.out.println("1. Disparar \n2. Autodispararse");
            
            // Pedir acción al jugador
            int accion = teclado.nextInt();
            int disparo = random.nextInt(6);  // Elegir una cámara aleatoria para el disparo
            
            switch (accion) {
                case 1: // Disparar al rival
                    if (tambor[disparo]) {
                        if (jugadorActual.equals(jugador1)) {
                            vidaJugador2--;
                        } else {
                            vidaJugador1--;
                        }
                        System.out.println("¡PUM! La bala era real. " + jugadorRival + " pierde una vida.");
                    } else {
                        System.out.println("¡Click! La bala era de fogueo. Ninguna vida perdida.");
                    }
                    break;
                
                case 2: // Autodispararse
                    if (tambor[disparo]) {
                        if (jugadorActual.equals(jugador1)) {
                            vidaJugador1--;
                        } else {
                            vidaJugador2--;
                        }
                        System.out.println("¡PUM! " + jugadorActual + " se disparó con una bala real. Pierde una vida.");
                    } else {
                        System.out.println("¡Click! " + jugadorActual + " se disparó con una bala de fogueo.");
                    }
                    break;
                
                default:
                    System.out.println("Número no válido.");
                    continue; // Volver a pedir la acción si es inválida
            }
            
            // Mostrar las vidas
            System.out.println("--Vidas restantes--");
            System.out.println(jugador1 + ": " + vidaJugador1 + " vidas.");
            System.out.println(jugador2 + ": " + vidaJugador2 + " vidas.");
            
            // Verificar si alguno de los jugadores ha perdido
            if (vidaJugador1 <= 0) {
                System.out.println(jugador1 + " ha perdido todas sus vidas. ¡" + jugador2 + " gana!");
                break;
            } else if (vidaJugador2 <= 0) {
                System.out.println(jugador2 + " ha perdido todas sus vidas. ¡" + jugador1 + " gana!");
                break;
            }
            
            turno++; // Pasar al siguiente turno
        }
        
        teclado.close();  // Cerrar scanner al final del juego
    }
}
