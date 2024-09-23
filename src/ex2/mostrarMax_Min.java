package ex2;

//    Constants i Màxims/Mínims: Utilitza les constants de la classe Math per obtenir el valor màxim i mínim d'un int i d'un double. Mostra aquests valors al teu programa.

public class mostrarMax_Min {
    public static void main(String[] args) {

        int n1= Integer.MAX_VALUE;
        int n2= Integer.MIN_VALUE;

        double n3= Double.MAX_VALUE;
        double n4= Double.MIN_VALUE;

        System.out.println("El numero maximo del int es: "+n1+ "\nEl numero minimo del int es: "+n2+ "\nEl numero maximo del double es: "+n3+ "\nEl numero minimo del double es: "+n4);

    }
}
