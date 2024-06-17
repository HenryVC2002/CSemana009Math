package CLeer;

import java.util.Scanner;

public class CLeer {
    private static final Scanner scanner = new Scanner(System.in);

    public static int LeerNumero1() {
        System.out.print("Introduce el primer número del rectángulo: ");
        return scanner.nextInt();
    }

    public static int LeerNumero2() {
        System.out.print("Introduce el segundo número del rectángulo: ");
        return scanner.nextInt();
    }

    public static double LeerNum1() {
        System.out.print("Introduce la base del triángulo: ");
        return scanner.nextDouble();
    }

    public static double LeerNum2() {
        System.out.print("Introduce la altura del triángulo: ");
        return scanner.nextDouble();
    }

    public static int LeerDiv1() {
        System.out.print("Introduce el dividendo: ");
        return scanner.nextInt();
    }

    public static int LeerDiv2() {
        System.out.print("Introduce el divisor: ");
        return scanner.nextInt();
    }

    public static double LeerRadius() {
        System.out.print("Introduce el radio de la esfera: ");
        return scanner.nextDouble();
    }

    public static int LeerLado1() {
        System.out.print("Introduce el primer lado del triángulo: ");
        return scanner.nextInt();
    }

    public static int LeerLado2() {
        System.out.print("Introduce el segundo lado del triángulo: ");
        return scanner.nextInt();
    }
}
