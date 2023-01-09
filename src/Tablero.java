public class Tablero {
    
    public int fil = 6;
    public int col = 7;
    public String[][] mat ;


    public Tablero(int fil, int col) {
        this.fil = fil;
        this.col = col;
        this.mat = new String[fil][col];
    }

    public int getFil() {
        return fil;
    }

    public int getCol() {
        return col;
    }

    public String[][] getMat() {
        return mat;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setMat(String[][] mat) {
        this.mat = mat;
    }


    public void InicializaTablero() {
        int i, j;
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col ; j++) {
                mat[i][j] = "0";
            }
        }
    }

    public boolean ColumnaLLena(int columna){
        boolean puede = false;

        if(mat[0][columna - 1] == "0")
            puede = true;

        return puede;
    }

    public boolean ColumnaValida(int columna){

        if(columna < 0 || columna > 7)
            return false;
        else
            return true;
    }
}
