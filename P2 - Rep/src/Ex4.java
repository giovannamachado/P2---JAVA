import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        int numero1 = sc.nextInt();
        System.out.println("Insira o valor de B: ");
        int numero2 = sc.nextInt();


        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0){
                System.out.println("É impar:" + i);
            }
        }


        sc.close();

    }
}