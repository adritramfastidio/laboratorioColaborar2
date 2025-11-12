import java.util.Scanner;

public class Programacion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Práctica git 4 Adrián y Dylan.");
        int opc = 0;
        do {
            menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> restarNumeros();
                case 2 -> System.out.println("Placeholder");
                case 3 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opc != 3);
    }

    public static void menu(){
        System.out.println("1. Place holder");
        System.out.println("2. Place holder");
        System.out.println("3. Salir.");
        System.out.println("Que quieres hacer?");
    }

    public static void restarNumeros() {
        System.out.print("Introduce un número");
        double n1 = sc.nextDouble();
        System.out.print("Introduce otro número");
        double n2 = sc.nextDouble();

        double resta = n1 - n2;
        System.out.println("Su resta es " + resta);
    }
}