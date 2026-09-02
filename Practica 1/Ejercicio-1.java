import java.util.Random;

class Cronometro {
    private long inicia;
    private long finaliza;

    public Cronometro() {
        this.inicia = System.currentTimeMillis();
        this.finaliza = 0;
    }

    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }

    public void inicia() {
        this.inicia = System.currentTimeMillis();
        this.finaliza = 0;
    }

    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        if (finaliza == 0) {
            return System.currentTimeMillis() - inicia;
        } else {
            return finaliza - inicia;
        }
    }
}

public class Main {
    public static void ordenacionSeleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    public static void main(String[] args) {
        int tamano = 100000;
        System.out.println("Generando " + tamano + " numeros aleatorios...");
        int[] datos = new int[tamano];
        Random rand = new Random();
        for (int i = 0; i < tamano; i++) {
            datos[i] = rand.nextInt(1000000);
        }
        Cronometro crono = new Cronometro();
        System.out.println("Iniciando ordenacion por seleccion...");

        crono.inicia();
        ordenacionSeleccion(datos);
        crono.detener();
        
        long tiempo = crono.lapsoDeTiempo();
        System.out.println("\nTiempo de ejecucion: " + tiempo + " milisegundos");
        System.out.println("Tiempo de ejecucion: " + (tiempo / 1000.0) + " segundos");

        System.out.print("Primeros 10 ordenados: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(datos[i] + " ");
        }
    }
}