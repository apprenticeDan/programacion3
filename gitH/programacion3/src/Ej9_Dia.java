public class Ej9_Dia {
  double tempMin;
  double tempMax;
  double tempMedia;

  public Ej9_Dia(double min, double max, double media) {
    tempMin = min;
    tempMax = max;
    tempMedia = media;
  }

  public String toString() {
    return "temp Min:"+ tempMin" temp Max:"+ tempMax" temp Med: "+ tempMedia; 
  }
  
  public double getTMedia() { return this.tempMedia;}
  public double getTMin() { return this.tempMin;}

}
