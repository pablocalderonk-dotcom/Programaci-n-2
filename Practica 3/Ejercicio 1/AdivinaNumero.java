import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        Scanner teclado = new Scanner(System.in);
        this.reiniciaPartida();
        this.numeroAAdivinar = (int) (Math.random() * 11);

        System.out.println("Adivina un numero entre 0 y 10");

        while (true) {
            int numero = teclado.nextInt();
            if (numero == this.numeroAAdivinar) {
                System.out.println("Acertaste!!");
                this.actualizaRecord();
                return;
            }

            if (this.quitaVida()) {
                if (this.numeroAAdivinar > numero) {
                    System.out.println("El numero a adivinar es mayor");
                } else {
                    System.out.println("El numero a adivinar es menor");
                }
                System.out.println("Vidas restantes: " + this.numeroDeVidas + ". Intentalo de nuevo:");
            } else {
                System.out.println("Te quedaste sin vidas. El numero era " + this.numeroAAdivinar);
                return;
            }
        }
    }
}