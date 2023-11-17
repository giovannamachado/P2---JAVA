import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para somar;\n" +
                "Digite 2 para subtrair;\n" +
                "Digite 3 para multiplicar;\n" +
                "Digite 4 para dividir;");
        int  digito = sc.nextInt();
        System.out.println("insira o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo valor: ");
        int num2 = sc.nextInt();

        if (digito == 1){
            int soma = num1 + num2;
            System.out.println("Soma: " + soma);
        }else if (digito == 2){
            int sub = num1 - num2;
            System.out.println("Subtração: " + sub );
        }else if (digito == 3){
        int mult = num1 * num2;
        System.out.println("Multiplicação: " + mult );
        }else if (digito == 4){
            if(num2 == 0){
                System.out.println("Divisão por 0");
            }else {
                int div = num1 / num2;
                System.out.println("Divisão: " + div);
            }
    }



        sc.close();
    }
}
