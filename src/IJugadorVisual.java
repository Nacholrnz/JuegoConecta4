public interface IJugadorVisual {


    public static void PideFicha(){

        System.out.println("Introduzca un número para colocar su ficha:");
    }
    public static void ErrorNoValido(){

        System.out.println("Error, introduzca otro valor [1-7]:");
    }
    public static void ErrorLleno(){

        System.out.println("Error, introduzca otro valor, columna llena:");
    }
}
