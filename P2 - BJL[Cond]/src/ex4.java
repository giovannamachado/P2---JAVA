import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            int mult = num1 * num2;
            System.out.println("Multiplicação: " + mult);
        } else if (num1 > num2){
            int sub = num1 - num2;
            System.out.println("Subtração: " + sub);
        } else {
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }
        sc.close();
    }
}
