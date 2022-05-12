import java.util.Scanner;

public class Exercicio04Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.println("O produto da soma é " + (n1 + n2));

        entrada.close();
    }
    
}
