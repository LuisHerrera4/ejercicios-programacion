package ex3;


/*

Activitat 3: format i printf en Java

Objectiu: Avaluar la comprensió dels alumnes sobre l'ús de les funcions format i printf per a la sortida formatada en Java, especificant formats més concrets per a números.

Instruccions:

    Format String: Escriu un programa que declari variables de tipus float, int i String. Utilitza la funció format per mostrar aquestes variables en una cadena de text, especificant formats adequats amb 3 decimals amb i sense signe, amb separador de milers i zeros a l'esquerra.
    Flags i Especificadors: Escriu un programa que utilitzi diverses combinacions de flags i especificadors amb printf per mostrar les variables amb diferents formats. Comenta cada línia de codi explicant què fa cada flag i especificador.

 */
public class ex3 {
    public static void main(String[] args) {
        int n1=14;
        float n2=20.352f;
        String palabra = "euros";

        //Sin signos
        String resultado1= String.format("Tengo %d euros en la cuenta bancaria. Y debo %.3f %s", n1, n2, palabra);
        System.out.println(resultado1);

        //Con signos y ceros en ambos lados
        String resultado2= String.format("Tengo %,02d euros en la cuenta bancaria. Y debo %+08.3f %s", n1, n2, palabra);
        System.out.println(resultado2);

    }
}
