public class Ejercicio7_suma {
  int[] vec1;
  int[] vec2;
  int[] vec3;

  Scanner sc;

  public Ejercicio7_suma(){
    int n = 5;
    vec1 = new int[5];
    vec2 = new int[5];
    vec3 = new int[5];
    sc = new Scanner(System.in);
  }

  public void ejecutar() {
    System.out.println("ingrese 5 numeros para vector1");
    for(int i = 0; i < vec.length; i++) {
      System.out.printf("vector1[%d]: ", i);
      int num = sc.nextInt();
      vec1[i] = num;
    }
    System.out.println("ingrese 5 numeros para vector2");
    for(int i = 0; i < vec.length; i++) {
      System.out.printf("vector2[%d]: ", i);
      int num2 = sc.nextInt();
      vec2[i] = num2; 
    }

    System.out.println("la suma de los vectores vector1 y vector2");
    for(int i = 0; i < vec.length; i++) {
      vec3[i] = vec1[i] + vec2[i]; 
      System.out.printf("vector3[%d]: %d", i, vec3[i]);
    }
  }
  
}
