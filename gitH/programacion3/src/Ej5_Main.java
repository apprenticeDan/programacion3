public class Ej5_Main {
    public static void main(String[] args) {
        
        Integer[][] arr = new Integer[5][5];
        E5_TableroBuscaMina juego = new E5_TableroBuscaMina(9,9,5);
        juego.generarMinas();
        juego.contarMinasCercanas();
        juego.mostrarTablero();
    }
}
