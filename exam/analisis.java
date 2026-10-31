import java.util.Scanner;
public class analisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 2;
        switch(opcion) {
            case 1:
                System.out.println("Rojo");
                break;
            case 2:
                System.out.println("Verde");
                break;
            default:
                System.out.println("Azul");
                break;
        }
        sc.close();
    }
}