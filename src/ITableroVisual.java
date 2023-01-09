public interface ITableroVisual {

    public static void ImprimeTablero(Tablero tablero) {
        int i, j;
        System.out.println("----------Conecta 4----------");
        System.out.println("-----------------------------");
        for (i = 0; i < tablero.fil; i++) {
            for (j = 0; j < tablero.col ; j++) {
                System.out.print("|");
                if(tablero.mat[i][j] == "0")
                    System.out.print("   ");
                else
                    System.out.print(" " + tablero.mat[i][j] + " ");

            }
            System.out.print("|");
            System.out.print("\n");
        }
        System.out.println("-----------------------------");

    }
}
