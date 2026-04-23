public class VariablesJava {
    public static void main(String args[]) {

        //TIPOS DE DATOS PRIMITIVOS Y VARIABLES:
        {
            //texto:
            String cadenaTexto;//"texto".
            char caracter;//16 bits. un solo carácter -> 't'.

            //numéricos enteros:
            byte numero;//8 bits: -128 a 128
            short numeroCorto;//16 bits: -32,768 a 32,768
            int numeroEntero;//32 bits: -2,147,483,648 a 2,147,483,647
            long numeroLArgo;//requiere sufijo "L". 64 bits: rango muy grande.
            //numéricos decimal:
            float numeroDecimalMenosPresicion;//requiere sufijo f. 32 bits.
            double numeroDecimal;//64 bits.


            //lógico:
            boolean booleano;//requiere prefijo "is". 1 bit TRUE | FALSE.

            //VARIABLE CONSTANTE (FINAL)
            {
                final int variableConstante = 12;
                System.out.println(variableConstante);
            }
        }
        //---------------------------------------------------------------------------------//
        //comentario una línea.

        /**comentario
         * en bloque.
         * */

        /**
         * Realiza el cálculo de la suma de dos sumandos/números enteros positivos.
         ** @param numero1 Primer sumando.
         ** @param numero2 Segundo sumando.
         * @return El resultado total de la operación de la suma.
         * */
        //---------------------------------------------------------------------------------//
        //IMPRESIÓN POR CONSOLA:
        {
            String msj = "Hola mundo";
            String msj2 = "desde JAVA.";
            System.out.println(msj + " " + msj2);//ln hace salto de línea.
            System.out.print(msj + " " + msj2);
            System.out.println(" ");
            System.out.println("Línea A\nLínea B\nLínea C");

            System.out.printf("Nombre: %s %nEdad: %d", "Ford", 1960);
            System.out.println(" ");
            System.out.printf("Ciudad: %S %nLetra: %C", "Santiago", "Chile".charAt(0));
        }

    }
}
