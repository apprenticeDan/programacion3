public class Ejercicio2 {
    int[] vector;

    public Ejercicio2() {
        vector = new int[6];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()* 100 + 1) ;
        }

    }

    public void ejecutar() {
        int[] vector_invertido = new int[vector.length];
        int indice = 0;
        while (indice < vector.length){
            vector_invertido[vector.length-1 - indice] = vector[indice];
            indice++;
        }

        System.out.print("vector original: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%5d", vector[i]);
        }
        System.out.println();
        System.out.print("vector invertido:");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%5d", vector_invertido[i]);
        }
        System.out.println();
    }

}
