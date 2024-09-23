package ex2;

import java.util.Scanner;

/*
Activitat 2: Operacions amb Números en Java

Instruccions:

    Operacions Bàsiques: Escriu un programa que realitzi i mostri el resultat de les operacions següents amb dos números enters (suma, resta, multiplicació, divisió, mòdul).
    Operacions amb números en punt flotant: Escriu un fragment de codi que realitzi operacions amb números de tipus float i double. Comenta sobre qualsevol diferència observada.


 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige que tipo de operación quieres hacer: +, -, *, /, %");

        String operador= sc.nextLine();

        System.out.println("elige el primer numero para operar: ");

        double num= sc.nextDouble();

        System.out.println("elige el segundo numero para operar: ");


        double num2= sc.nextDouble();

        System.out.printf("El resultado de la siguiente operqacion es: " + calculador(operador, num, num2));
    }
    public static double calculador(String operador, double i, double x){

        switch (operador){
            case "+":
                return i+x;
            case "-":
                return i-x;
            case "*":
                return i*x;
            case "/":
                return i/x;
            case "%":
                return i % x;
            default:
                System.out.println("La opción que has elegido es incorrecta.");

        }

        return 0;

    }
}
