public class Ejercicio1 {
    int[] vector;

    public Ejercicio1() {
        vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()* 10 + 1) ;
        }
    }

    public void ejecutar(){

        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3);
            System.out.printf("vector_numeros[%d]: %d, cuadrado: %d, cubo: %d%n",i,numero,cuadrado,cubo);
        }
    }


}
