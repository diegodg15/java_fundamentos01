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
            }
        }
        //---------------------------------------------------------------------------------//
    }
}
