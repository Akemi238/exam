import java.util.Scanner;
public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nota: ");
        double nota = sc.nextDouble();
        if (nota >= 90) {
            System.out.println("Aprobado con honores.");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        sc.close();
    }
}