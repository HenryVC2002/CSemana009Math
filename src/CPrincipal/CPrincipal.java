package CPrincipal;

import CLeer.CLeer;
import CMatematicas.CMatematicas;
import java.util.Scanner;

public class CPrincipal {

    static CMatematicas obj = new CMatematicas();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ejercicio dimensiones del rectángulo");
            System.out.println("2. Ejercicio base y altura para el área del triángulo");
            System.out.println("3. Ejercicio división de dos números");
            System.out.println("4. Ejercicio radio de la esfera");
            System.out.println("5. Ejercicio lados del triángulo");
            System.out.println("6. Salir");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> ejercicioRectangulo();
                case 2 -> ejercicioAreaTriangulo();
                case 3 -> ejercicioDivision();
                case 4 -> ejercicioEsfera();
                case 5 -> ejercicioTriangulo();
                case 6 -> exit = true;
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    public static void ejercicioRectangulo() {
        int num1 = CLeer.LeerNumero1();
        int num2 = CLeer.LeerNumero2();
        obj.setNum1(num1);
        obj.setNum2(num2);
        System.out.println("Área del rectángulo: " + obj.AreaRectangulo());
    }

    public static void ejercicioAreaTriangulo() {
        int x = (int) CLeer.LeerNum1();
        int y = (int) CLeer.LeerNum2();
        obj.setx(x);
        obj.sety(y);
        System.out.println("Área del triángulo es: " + obj.AreaTriangulo());
    }

    public static void ejercicioDivision() {
        int a = CLeer.LeerDiv1();
        int b = CLeer.LeerDiv2();
        obj.setA(a);
        obj.setB(b);
        System.out.println("La división de los números es: " + obj.Division());
    }

    public static void ejercicioEsfera() {
        double radius = CLeer.LeerRadius();
        obj.setRadius(radius);
        System.out.println("Volumen de la esfera: " + obj.VolumenEsfera());
    }

    public static void ejercicioTriangulo() {
        int a = CLeer.LeerLado1();
        int b = CLeer.LeerLado2();
        obj.setA(a);
        obj.setB(b);
        System.out.println("Hipotenusa del triángulo: " + obj.Hipotenusa());
    }
}
