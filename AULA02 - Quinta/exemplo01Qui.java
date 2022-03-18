import java.util.Scanner;

public class exemplo01Qui {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = entrada.nextInt();

        if ((numero % 2) == 0){
            System.out.println("Número é par!");
        }else{
            System.out.println("Número é ímpar!");
        }
        entrada.close();
    }
}
