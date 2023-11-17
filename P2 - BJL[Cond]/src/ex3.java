import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println( numero+" é par");
        }else{
            System.out.println(numero+" é impar");
        }



        sc.close();
    }
}
