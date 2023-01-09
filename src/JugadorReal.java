import java.util.Scanner;

public class JugadorReal implements IJugador,IJugadorVisual{
    public String Nombre;
    public int fichas;
    public String Sigla;

    public JugadorReal(String Nombre, int fichas , String Sigla) {
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

                while (tablero.mat[i][columna - 1] != "0") {
                    i--;
                }
                tablero.mat[i][columna - 1] = sigla;
            }

    @Override
    public int generaFicha(Tablero tablero) {
        int columna;
        Scanner scan = new Scanner(System.in);

        IJugadorVisual.PideFicha();
        columna = scan.nextInt();;

           while (!tablero.ColumnaValida(columna) || !tablero.ColumnaLLena(columna)) {

               while(!tablero.ColumnaValida(columna)){
                IJugadorVisual.ErrorNoValido();
                columna = scan.nextInt();

               }

               if(!tablero.ColumnaLLena(columna)) {
                IJugadorVisual.ErrorLleno();
                columna = scan.nextInt();
               }
           }
           return columna;
    }

}

