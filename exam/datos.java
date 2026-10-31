import java.util.Scanner;
public class datos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.print("¿Usted es un estudiante activo? (true/false): ");
        boolean esActivo = sc.nextBoolean();
        if (esActivo) {
            System.out.println("Usted es un estudiante activo");
        } else {
            System.out.println("Usted no es un estudiante activo");
        }
        System.out.println("Datos guardados: edad: " + edad + ", altura: " + altura);
        sc.close();
    }
}