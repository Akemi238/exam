import java.util.Scanner;
public class dia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Number 1");
        System.out.println("Number 2");
        System.out.println("Number 3");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        sc.close();
    }
}