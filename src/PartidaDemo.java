public class PartidaDemo extends Partida implements ITableroVisual{
    JugadorMaquina jug1;
    JugadorMaquina jug2;
    Tablero tablero;
    Validar validar;


    public PartidaDemo(JugadorMaquina jug1,JugadorMaquina jug2,Tablero tablero) {
        this.jug1 = jug1;
        this.jug2 = jug2;
        this.tablero = tablero;
        this.validar = new Validar(tablero);

    }

    @Override
    public void InicioPartida() {
        tablero.InicializaTablero();
        ITableroVisual.ImprimeTablero(tablero);
    }
    @Override
    public boolean FinPartida() {
        if(jug1.getFichas()==0 && jug2.getFichas() == 0){
            return true;
        }else
            return false;
    }

    @Override
    public boolean Turno() {
        boolean ganado = false;
        if (!ganado){
            jug1.anadeFicha(jug1.generaFicha(tablero), jug1.Sigla, tablero);
            jug1.setFichas(jug1.getFichas() - 1);
            ITableroVisual.ImprimeTablero(tablero);
            ganado = validar.CompruebaTablero(jug1.Sigla, jug1.Nombre);
        }
        if (!ganado) {
            jug2.anadeFicha(jug2.generaFicha(tablero), jug2.Sigla, tablero);
            jug2.setFichas(jug2.getFichas() - 1);
            ITableroVisual.ImprimeTablero(tablero);
            ganado = validar.CompruebaTablero(jug2.Sigla, jug2.Nombre);
        }
        return ganado;
    }
}
