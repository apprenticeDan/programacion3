public class Ej4_Estudiante {
    Ej4_Persona datosPersonales;
    int estudianteId;
    int promedio;


    public Ej4_Estudiante(Persona datos_, int id_, int promedio_) {
        datosPersonales = datos_;
        estudianteId = id_;
        promedio = promedio_;
    }

    @Override
    public String toString() {
        return "Estudiante{\n" +
                datosPersonales +"\n"+
                "\testudianteId:" + estudianteId +"\n"+
                "\tpromedio:" + promedio +//"\n"+
                " }\n";
    }
}

