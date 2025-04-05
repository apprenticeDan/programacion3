import java.util.Objects;

public class Ej5_BuscaMinas {
    int columnas;
    int filas;
    int numMinas;
    Integer[][] tablero;

    public Ej5_BuscaMinas(int col, int fil, int minas) {
        if (col > 1 && fil > 1) {
            columnas = col;
            filas = fil;
        } else {
            throw new IllegalArgumentException("cantidades de filas y columnas deben ser mayor a 1");
        }

        if (minas < col * fil) {
            numMinas = minas;
        } else {
            throw new IllegalArgumentException("El número de minas debe ser menor al número de posiciones en el tablero");
        }
        tablero = new Integer[filas][columnas];
    }

    public void generarMinas() {
        int cantidadMinas = numMinas;
        for (int i = 0; i < cantidadMinas; i++) {
            int colR = (int) (Math.random() * columnas);
            int filR = (int) (Math.random() * filas);
            if (Objects.isNull(tablero[filR][colR])) {
                tablero[filR][colR] = 0;
            } else {
                i--;
            }
        }
    }
    public void contarMinasCercanas() {
        int posiciones[] = {-1, 0, 1};
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (!Objects.isNull(tablero[j][i]) && tablero[j][i] == 0) {
                    continue;
                }
                for (int posx : posiciones) {
                    for (int posy : posiciones) {
                        if (posx == 0 && posy == 0) {
                            continue;
                        }
                        if ((j + posy) < 0 || (j + posy) > (tablero.length - 1)) {
                            continue;
                        }
                        if ((i + posx) > (tablero[0].length - 1) || (i + posx) < 0) {
                            continue;
                        }
                        if (!Objects.isNull(tablero[j + posy][i + posx]) && tablero[j + posy][i + posx] == 0) {
                            if (Objects.isNull(tablero[j][i])) {
                                tablero[j][i] = 0;
                            }
                            tablero[j][i]++;
                        }
                    }
                }
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.printf("%7s", Objects.isNull(tablero[i][j]) ? "." : tablero[i][j]);
            }
            System.out.printf("%n%n");
        }
    }

    // alternativa sumar 1 a todas las casillas al rededor de una mina
    public void contarMinas() {
        int posiciones[] = {-1, 0, 1};
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (!Objects.isNull(tablero[j][i]) && tablero[j][i] == 0) {
                    for (int posx : posiciones) {
                        for (int posy : posiciones) {
                            if (posx == 0 && posy == 0) {
                                continue;
                            }
                            if ((j + posy) < 0 || (j + posy) > (tablero.length - 1)) {
                                continue;
                            }
                            if ((i + posx) > (tablero[0].length - 1) || (i + posx) < 0) {
                                continue;
                            }
                            if (Objects.isNull(tablero[j + posy][i + posx])) {
                                tablero[j + posy][i + posx] = 0;
                                tablero[j + posy][i + posx]++;
                            }
                        }
                    }
                }
            }
        }
    }


}
