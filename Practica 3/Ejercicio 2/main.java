public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("=== Juego 1: adivina un numero ===");
        juego1.juega();
        System.out.println();

        System.out.println("=== Juego 2: adivina un numero PAR ===");
        juego2.juega();
        System.out.println();

        System.out.println("=== Juego 3: adivina un numero IMPAR ===");
        juego3.juega();
    }
}