import java.time.LocalDate;
import java.time.Period;

public class Ej4_Persona {
    String nombre;
    LocalDate fechaNac;
    Color colorFavorito;

    public Persona(){    }

    public Persona(String nombre_, LocalDate nacimiento_, Color favorito_){
        nombre = nombre_;
        fechaNac = nacimiento_;
        colorFavorito = favorito_;
    }

    public int calcularEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public static boolean compararPorEdadMenor(Persona a, Persona b) {
        return a.calcularEdad() < b.calcularEdad();
    }


    @Override
    public String toString() {
        return //"{\n" +
                "\tnombre:'" + nombre + '\'' +"\n"+
                "\tfechaNac:" + fechaNac;// + //"\n"+
                //"\tcolorFavorito:" + colorFavorito +"\n"+
                //" }";
    }
}
