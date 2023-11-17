import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O maior numero é: " + num1);
        } else if (num2 > num1){
            System.out.println("O maior numero é: " + num2);
        } else{
            System.out.println("Os numeros são iguais");
        }
        sc.close();
      }
    }
