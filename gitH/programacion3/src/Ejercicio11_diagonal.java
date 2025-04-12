public class Ejercicio11_diagonal {
  int[][] diagonal;
  public Ejercicio11_diagonal() {
    diagonal = new int[5][5];
  }

  public void ejecutar() {
    for(int i=0; <digonal.length;i++) {
      for(int j=0; <digonal[i].length;j++) {
        if (i==j) {
          diagonal[i][j]=1;
        } else {
          diagonal[i][j]=0;
        }
      }
    }

      for(int i=0; <digonal.length;i++) {
        for(int j=0; <digonal[i].length;j++) {
            System.out.print(diagonal[i][j]+" ");
          }
    System.out.print();
    }
}
  }
  
  
}
