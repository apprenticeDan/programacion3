public class Ejercicio6_Mes {
  Ej6_Mes[] meses;
  Scanner scanner;
 
public Ejercicio6_Mes() {
  Ej6_Mes[] meses = new Ej6_Mes(){
    new Mes(1,"Enero",31),new Mes(2,"Febrero",28), 
    new Mes(3,"Marzo",31),new Mes(4,"Abril",30),
    new Mes(5,"Mayo",31),new Mes(6,"Junio",30),
    new Mes(7,"Julio",31),new Mes(8,"Agosto",31),
    new Mes(9,"Septiembre",30),new Mes(10,"Octubre",31),
    new Mes(11,"Noviembre",30),new Mes(12,"Diciembre",31)};
    scanner = new Scanner(System.in);
}

  public void ejecutar() {
    System.out.println("Introduzca el num de mes": );
    int numero = scanner.nextInt();
    Ej6_Mes mes = meses[numero - 1];
    /*System.out.println(mes.getNom());
    System.out.println(mes.getDias());*/
    System.out.println(mes);  // método toString
  }

