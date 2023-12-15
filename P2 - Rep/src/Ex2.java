import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        int numero1 = sc.nextInt();
        System.out.println("Insira o valor de B: ");
        int numero2 = sc.nextInt();

        System.out.print("Série numérica: ");
        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        sc.close();

    }
        }

