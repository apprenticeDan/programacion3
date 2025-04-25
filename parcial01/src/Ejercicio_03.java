import java.util.Scanner;

public class Ejercicio_03 {
    int[] notas;
    Scanner scanner;

    public Ejercicio_03() {
        notas = new int[5];
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        for(int i = 0; i < notas.length; i++) {
            System.out.printf("notas[%d]: ", i);
            notas[i] = scanner.nextInt();
        }

        int max = notas[0];
        int min = notas[0];
        int suma = 0;
        float promedio;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
            suma =  suma + notas[i];
        }
        System.out.printf("mínimo: %d%nmáximo: %d%npromedio: %.2f%n",min, max, (0f+suma)/ notas.length);
    }
}
