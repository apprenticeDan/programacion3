public class Ej8_Main {
    public static void main(String[] args) {
        
        Integer[][] arr = new Integer[5][5];
        Ejercicio_08 juego = new Ejercicio_08(9,9,5);
        juego.generarMinas();
        juego.contarMinasCercanas();
        juego.mostrarTablero();
    }
}
