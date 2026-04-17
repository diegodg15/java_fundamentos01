import javax.imageio.ImageTranscoder;

public class VariablesJava {
    public static void main(String args[]) {

        //Varibales: camelCase
        var email = "email@gmail.com";//->similar a js, tipado débil.
        System.out.println(email);
        System.out.println(email instanceof String);//similar a un operador ternario, devuelve T o F.

        //cadena de texto:
        String nombre = "Diego";
        System.out.println(nombre);

        nombre = "Alan";//reasignación.
        System.out.println(nombre);
        //------------------------------------------------------------------------

        //número entero (integer):
        int numeroEntero = 1;
        System.out.println(numeroEntero);
        //------------------------------------------------------------------------

        //constantes: UPPER_SNAKE_CASE
        final double NUMERO_PI = Math.PI;
        System.out.println(NUMERO_PI);


    }
}
