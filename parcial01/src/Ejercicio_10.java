public class Ejercicio_10 {
int[][] matriz;


  public Ejercicio_10(){
    matriz = new int[][];
  }
  public void ejecutar() {
    for (int i = 0; i < matriz.lenght; i++) {
      for (int j = 0; j < matriz[i].lenght; j++) {
        int ale = (int)(Math.random()*9 + 1);  
        matriz[i][j] = ale;
      }
    }
    for (int i = 0; i < matriz.lenght; i++) {
      for (int j = 0; j < matriz[i].lenght; j++) {
        System.out.print(matriz[i][j]+ " ");
      }
      System.out.println();
    }

    
    for (int i = 0; i < matriz.lenght; i++) {
      int suma = 0;
      for (int j = 0; j < matriz[i].lenght; j++) {
        suma += matriz[i][j];
      }
      
      System.out.printf("suma fila %d: %d",i,suma);
    }

    for (int i = 0; i < matriz.lenght; i++) {
      int suma = 0;
      for (int j = 0; j < matriz[i].lenght; j++) {
        suma += matriz[j][i];
      }
      
      System.out.printf("suma columna %d: %d",j,suma);
    }
  }
  

}
