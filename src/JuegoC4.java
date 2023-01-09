import java.util.Scanner;
public class JuegoC4 implements IJuegoC4Visual {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int opcion;
        boolean ganado = false;


         do{
             IJuegoC4Visual.ModoJuego();
             opcion = scan.nextInt();
         }while(opcion < 1 || opcion > 3);


         switch(opcion){
             case 1 :
                 JugadorReal jug1normal = new JugadorReal("RED",21,"R");
                 JugadorReal jug2normal = new JugadorReal("YELLOW",21,"Y");
                 Tablero TableroNormal = new Tablero(6,7);

                 PartidaNormal partidaNormal= new PartidaNormal(jug1normal,jug2normal,TableroNormal);
                 partidaNormal.InicioPartida();
                 while(!partidaNormal.FinPartida() && !ganado){
                     ganado = partidaNormal.Turno();
                 }
                break;
             case 2 :
                 JugadorReal jug1ent = new JugadorReal("RED",21,"R");
                 JugadorMaquina jug2ent = new JugadorMaquina("YELLOW",21,"Y");
                 Tablero tableroEnt = new Tablero(6,7);


                 PartidaEntrenamiento partidaEnt= new PartidaEntrenamiento(jug1ent,jug2ent,tableroEnt);
                 partidaEnt.InicioPartida();
                 while(!partidaEnt.FinPartida() && !ganado){
                     ganado = partidaEnt.Turno();
                 }
                 break;

             case 3:
                 JugadorMaquina jug1demo = new JugadorMaquina("RED",21,"R");
                 JugadorMaquina jug2demo = new JugadorMaquina("YELLOW",21,"Y");
                 Tablero tableroDemo = new Tablero(6,7);

                 PartidaDemo partidaDemo= new PartidaDemo(jug1demo,jug2demo,tableroDemo);
                 partidaDemo.InicioPartida();
                 while(!partidaDemo.FinPartida() && !ganado){
                     ganado = partidaDemo.Turno();
                 }
                 break;
         }
    }
}
