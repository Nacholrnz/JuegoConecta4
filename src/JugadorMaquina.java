public class JugadorMaquina implements IJugador{

    public String Nombre;
    public int fichas;
    public String Sigla;

    public JugadorMaquina(String Nombre, int fichas , String Sigla) {
        this.Nombre = Nombre;
        this.fichas = fichas;
        this.Sigla = Sigla;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }
    @Override
    public void anadeFicha(int columna, String sigla, Tablero tablero) {
        int i= tablero.fil-1;

        while(tablero.mat[i][columna] != "0"){
            i--;
        }
        tablero.mat[i][columna] = sigla;
    }

    @Override
    public int generaFicha(Tablero Tablero) {
        boolean tapado = false;
        int columna=0;
        int i,j;

        if(!tapado) {
            for (i = Tablero.fil-1; i > 0; i--) {
                for (j = 0; j < Tablero.col - 2; j++) {
                    if (!Tablero.mat[i][j].equals(this.Sigla) && !Tablero.mat[i][j + 1].equals(this.Sigla) && !Tablero.mat[i][j + 2].equals(this.Sigla) && !Tablero.mat[i][j].equals("0") && !Tablero.mat[i][j + 1].equals("0") && !Tablero.mat[i][j + 2].equals("0")) {
                        if (j == 0) {
                            if (Tablero.mat[i][j + 3].equals("0")){
                                columna = j + 3;
                                tapado = true;
                            }
                        }else
                        if (j == 4) {
                            if (Tablero.mat[i][j - 1].equals("0")){
                                columna = j - 1;
                                tapado = true;
                            }
                        }else
                            if (Tablero.mat[i][j - 1].equals("0") || Tablero.mat[i][j + 3].equals("0")) {
                                   if (Tablero.mat[i][j - 1].equals("0")) {
                                       columna = j - 1;
                                       tapado = true;
                                   }else
                                       columna = j + 3;
                                       tapado = true;
                        }

                    }
                }
            }
        }
            if (!tapado) {
                for (i = Tablero.fil - 1; i > 2; i--) {
                  for (j = 0; j < Tablero.col; j++) {
                    if (!Tablero.mat[i][j].equals(this.Sigla) && !Tablero.mat[i - 1][j].equals(this.Sigla) && !Tablero.mat[i - 2][j].equals(this.Sigla) && !Tablero.mat[i][j].equals("0") && !Tablero.mat[i - 1][j].equals("0") && !Tablero.mat[i - 2][j].equals("0")) {
                        if (Tablero.mat[i - 3][j].equals("0")) {
                            columna = j;
                            tapado = true;
                        }
                    }
                }
            }
        }
        if (!tapado) {
            for (i = Tablero.fil - 1; i > 2; i--) {
                for (j = 0; j < 4; j++) {
                    if (!Tablero.mat[i][j].equals(this.Sigla) && !Tablero.mat[i - 1][j + 1].equals(this.Sigla) && Tablero.mat[i - 2][j + 2].equals(this.Sigla) && !Tablero.mat[i][j].equals("0") && !Tablero.mat[i - 1][j + 1].equals("0") && Tablero.mat[i - 2][j + 2].equals("0")) {
                        if (!Tablero.mat[i - 2][j + 3].equals("0")) {
                            columna = j + 3;
                            tapado = true;
                        }
                    }
                }
            }

            for (i = Tablero.fil - 1; i > 2; i--) {
                for (j = Tablero.col - 1; j > 3; j--) {
                    if (!Tablero.mat[i][j].equals(this.Sigla) && !Tablero.mat[i - 1][j - 1].equals(this.Sigla) && Tablero.mat[i - 2][j - 2].equals(this.Sigla) && !Tablero.mat[i][j].equals("0") && !Tablero.mat[i - 1][j - 1].equals("0") && Tablero.mat[i - 2][j - 2].equals("0")) {
                        if (!Tablero.mat[i - 2][j - 3].equals("0")) {
                            columna = j - 3;
                            tapado = true;
                        }
                    }
                }
            }
        }
        if(!tapado)
            columna = (int)(Math.random() * 6 + 1);


        while(!Tablero.ColumnaLLena(columna + 1)){
                columna = (int)(Math.random() * 6 + 1);
            }
        return columna;
    }
}




