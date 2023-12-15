import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int numero = sc.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        sc.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true; // É primo
    }
}