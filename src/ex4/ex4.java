package ex4;

public class ex4 {
    public static void main(String[] args) {
        if ( args.length > 0){
            for (int i =0; i < args.length; i++){
                System.out.printf("Argument %d: %s%n",i, args[i]);
            }
        }else {
            System.out.println("No se ha pasado ningun argumento");
        }

    }
}
