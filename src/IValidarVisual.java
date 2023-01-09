public interface IValidarVisual {

    public static void GanadoDiagonal(String jugador){
        System.out.println("HA GANADO " + jugador + ", CONECTO 4 DIAGONALMENTE");
    }
    public static void GanadoVertical(String jugador){
        System.out.println("HA GANADO " + jugador + ", CONECTO 4 VERTICALMENTE");
    }
    public static void GanadoHorizontal(String jugador){
        System.out.println("HA GANADO " + jugador + ", CONECTO 4 HORIZONTALMENTE");
    }
}
