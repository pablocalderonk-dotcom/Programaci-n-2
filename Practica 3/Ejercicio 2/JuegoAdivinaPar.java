public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 != 0) {
            System.out.println("Error: el numero debe ser par");
            return false;
        }
        return super.validaNumero(numero);
    }

    @Override
    public int generaNumero() {
        return ((int) (Math.random() * 6)) * 2;
    }
}