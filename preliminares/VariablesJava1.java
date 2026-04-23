public class VariablesJava1 {
    public static void main(String args[]) {
        //------------------------------------------------------------------------
        //TIPOS DE VARIABLES:

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

        Integer numeroDos = 12;
        System.out.println((Object) numeroDos instanceof String);//se coloca object porque el compilador sin esto,
        // manda error ya que, sabe que no es un string antes de que haga la comprobación con instanceOf.
        Object numeroTres = 12;
        System.out.println(numeroTres instanceof String);
        //------------------------------------------------------------------------

        //IMPRESIONES POR CONSOLA:
        //CONCATENACIONES, INTERPOLACIÓN:
        {
            String msj = "JAVA";
            System.out.println("Lenguaje de programación" + " " + msj);
            String msj2 = "Lenguaje de programación";
            System.out.println("Lenguaje de programación"+ " ".concat(msj));
            System.out.println("Lenguaje de programación".concat(" " + msj));
            System.out.println(msj2.concat(" ").concat(msj));
        }

    }
}
