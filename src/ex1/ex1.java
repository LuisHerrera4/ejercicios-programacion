package ex1;

/*
Activitat 1: Variables de Tipus Primitiva en Java

Instruccions:

    Definicions: Llegeix la documentació sobre els tipus primitius en Java (byte, short, int, long, float, double, char
    Declaració de Variables: Escriu un programa Java que declari una variable de cada tipus primitiu i les inicialitzi amb un valor apropiat.
    Conversió de Tipus: Escriu un fragment de codi que mostri com convertir una variable de tipus int a double i viceversa. Explica els resultats obtinguts.

 */
public class ex1 {
    int num1= 2;
    byte num2= 0x3f;
    long num3= 2_333_221_332L;
    float num4= 5.99f;
    double num5= 3948.445d;
    short num6= 23747;
    char num7OrLetter= 'a';


    public static double convertirInt(int i){
        //Convertir de int a double
        return (double) i;
    }

    public static int convertirDouble(double i){
        //convertir de double a int
        return (int)i;
    }
}

