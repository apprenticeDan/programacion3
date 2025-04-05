import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Ej4_Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>(List.of(
                new Estudiante(
                        new Persona("Marcelo Malone",
                                LocalDate.of(1962, Month.JULY, 12),
                                Color.naranja),
                        124,
                        76),
                new Estudiante(
                        new Persona("Roberto Querejazu",
                                LocalDate.of(1959, Month.AUGUST, 30),
                                Color.naranja),
                        124,
                        76),
                new Estudiante(
                        new Persona("Jürgen Klopp",
                                LocalDate.of(1965, Month.OCTOBER, 16),
                                Color.azul),
                        125,
                        83),
                new Estudiante(
                        new Persona("Marcelo Bielsa",
                                LocalDate.of(1956, Month.JULY, 23),
                                Color.azul),
                        123,
                        56)
                ));

        System.out.println(estudiantes);
        ordenarListaEstudiantesEdad(estudiantes);
        System.out.println(estudiantes);
    }


    public static void ordenarListaEstudiantesEdad(ArrayList<Estudiante> estudiantes) {
        burbuja(estudiantes);
    }

    public static void burbuja(ArrayList<Estudiante> estudiantes) {
        for (int i = 0; i < estudiantes.size(); i++) {
            for (int j = 0; j < estudiantes.size() - i - 1; j++) {
                if (Persona.compararPorEdad(estudiantes.get(j).datosPersonales, estudiantes.get(j + 1).datosPersonales)) {
                    Estudiante auxi = estudiantes.get(j);
                    estudiantes.set(j, estudiantes.get(j+1));
                    estudiantes.set(j+1, auxi);
                }

            }
        }
    }
}
