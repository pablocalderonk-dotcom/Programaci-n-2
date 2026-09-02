import java.util.Scanner;

class Estadistica {
    private double[] datos;

    public Estadistica(double[] arr) {
        this.datos = arr;
    }
    public double promedio() {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (int i = 0; i < datos.length; i++) {
            sumaCuadrados += Math.pow(datos[i] - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.print("Ingrese 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(numeros);
        
        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviacion standard es %.5f\n", est.desviacion());

        sc.close();
    }
}