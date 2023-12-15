import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int somador = 0;

        while (true) {
            System.out.println("Insira um numero: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                somador += 1;
            }
        }

        System.out.println("Quantidade de positivos " + somador);

        sc.close();
    }
}