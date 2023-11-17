import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Condição satisfeita");
        } else{
            System.out.println("Erro");
        }
        sc.close();
    }
}
