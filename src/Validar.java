

public class Validar implements IValidarVisual{

    public Tablero Tablero;

    public Validar(Tablero Tablero) {
        this.Tablero = Tablero;
    }

    public boolean CompruebaTablero(String sigla, String jugador) {

        int i, j;
        boolean ganado = false;

        //verificacion ganador (horizontal)
        for (i = 0; i < Tablero.fil; i++) {
            for (j = 0; j < Tablero.col - 3; j++) {
                if (Tablero.mat[i][j].equals(sigla) && Tablero.mat[i][j + 1].equals(sigla) && Tablero.mat[i][j + 2].equals(sigla) && Tablero.mat[i][j + 3].equals(sigla)) {
                    ganado = true;
                    IValidarVisual.GanadoHorizontal(jugador);
                }
            }
        }


        if (!ganado) {
            //verificacion ganador (diagonal)
            for (i = Tablero.fil - 1; i > 2; i--) {
                for (j = 0; j < 4; j++) {

                    if (Tablero.mat[i][j].equals(sigla) && Tablero.mat[i - 1][j + 1].equals(sigla) && Tablero.mat[i - 2][j + 2].equals(sigla) && Tablero.mat[i - 3][j + 3].equals(sigla)) {
                        ganado = true;
                        IValidarVisual.GanadoDiagonal(jugador);
                    }
                }
            }

        }
        if (!ganado) {
            for (i = Tablero.fil - 1; i > 2; i--) {
                for (j = Tablero.col - 1; j > 3; j--) {

                    if (Tablero.mat[i][j].equals(sigla) && Tablero.mat[i - 1][j - 1].equals(sigla) && Tablero.mat[i - 2][j - 2].equals(sigla) && Tablero.mat[i - 3][j - 3].equals(sigla)) {
                        ganado = true;
                        IValidarVisual.GanadoDiagonal(jugador);
                    }
                }
            }
        }
        if (!ganado) {
            //verificacion ganador (vertical)
            for (i = Tablero.fil - 1; i > 2; i--) {
                for (j = 0; j < Tablero.col; j++) {
                    if (Tablero.mat[i][j].equals(sigla) && Tablero.mat[i - 1][j].equals(sigla) && Tablero.mat[i - 2][j].equals(sigla) && Tablero.mat[i - 3][j].equals(sigla)) {
                        ganado = true;
                        IValidarVisual.GanadoVertical(jugador);
                    }
                }
            }
        }

        return ganado;
    }
}
