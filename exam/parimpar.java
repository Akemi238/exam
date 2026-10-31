import java.util.Scanner;
public class parimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("El numero es par");
        } else {
            System.out.print("El numero es impar");
        }
        sc.close();
    }
}