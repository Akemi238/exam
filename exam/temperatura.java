import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura (0-30):");
        double temperatura = sc.nextDouble();
        System.out.println("\nResultado");
        if (temperatura > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("El clima esta normal.");
        }
        sc.close();
    }
}