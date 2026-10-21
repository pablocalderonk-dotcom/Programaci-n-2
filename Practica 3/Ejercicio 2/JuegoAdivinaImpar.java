public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Error: el numero debe ser impar");
            return false;
        }
        return super.validaNumero(numero);
    }

    @Override
    public int generaNumero() {
        return ((int) (Math.random() * 5)) * 2 + 1;
    }
}