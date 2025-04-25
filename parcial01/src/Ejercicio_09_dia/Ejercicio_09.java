import java.util.Scanner;
  public class Ejercicio_09 {
  Dia[] dias;
  Scanner sc;

    public Ejercicio_09() {
      dias = new Dia[5];
      sc = new Scanner(System.in);
    }

    public void ejecutar() {
    System.out.println("almacenar temp min y max de 5 días:");
      for (int i = 0; i < dias.length; i++) {
        System.out.printf("tempMin[%d]: ",i);
        double tMin = sc.nexDouble();

        System.out.printf("tempMax[%d]: ",i);
        double tMax = sc.nexDouble();

        double med = (tMax+tMin)/2;
        dias[i] = new Dia(tMin, tMax, med);
      }

      System.out.println("temperaturas medias de 5 días:");
      for (int i = 0; i < dias.length; i++) {
        System.out.printf("tempMedia[%d]: %f ",i, dias[i].getTMedia());
      }
      system.out.println();

      System.out.println("ordenar dias por temperaturas minimas:");
      for (int i = 0; i < dias.length; i++) {
        for (int j = 0; i < dias.length - 1 -i; j++) {
          if(dias[j].getTMin() > dias[j+1].getTMin()) {
            Dia aux = dias[j];
            dias[j] = dias[j+1];
            dias[j+1] = aux;
        }}
        
        //System.out.printf("tempMedia[%d]: %f ",i, dias[i].getTMedia());
      }
      system.out.println();
System.out.println("días ordenados:");
      for (int i = 0; i < dias.length; i++) {
        System.out.println(dias[i]);
      }
    }
}
