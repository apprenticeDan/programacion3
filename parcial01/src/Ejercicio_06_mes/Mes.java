public class Mes {
  int numero;
  String nombre;
  int cantidadDias;
public Mes(int num, String nom, int dias) {
  this.numero = num;
  this.nombre = nom;
  this.cantidadDias dias;
}
  public int getNum() { return this.numero;}
  public String getNom() {return this.nombre;}
  public int getDias() {return this.cantidadDias;}

  public String toString() {
    return "Mes: " + nombre + "; cantidad de Días: " cantidadDias; 
  }
}
