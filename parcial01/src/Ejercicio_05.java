public class Ejercicio_05 {
  int[] vector;

  public Ejercicio_05() {
    vector = new int[10];  
  }

  public void ejecutar() {
    for (int i = 0; i < vector.length; i++) {
      int aleatorio = (int)(Math.random() * 10 + 1);
      vector[i] = aleatorio;
    }

    for (int i = 0; i < vector.length; i++) {
      System.out.print(vector[i]+" ");
    }
    System.out.println();
    
    for (int i = 0; i < vector.length - 1; i++) {
      for (int j = 0; j < vector.length - i -1; j++) {
        if (vector[j] > vector[i+1]) {
          int aux = vector[j];
          vector[j] = vector[j+1];
          vector[j+1] = aux;
        }
      }
    }
      for (int i = 0; i < vector.length; i++) {
      System.out.print(vector[i]+" ");
    }
    System.out.println();
  }
}
