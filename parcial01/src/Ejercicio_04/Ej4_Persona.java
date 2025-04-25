import java.time.LocalDate;
import java.time.Period;

public class Ej4_Persona {
    String nombre;
    LocalDate fechaNac;
    Ej4_Color colorFavorito;

    public Ej4_Persona(){    }

    public Ej4_Persona(String nombre_, LocalDate nacimiento_, Ej4_Color favorito_){
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
