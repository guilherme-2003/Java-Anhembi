import java.util.Scanner;

public class exemplo04Sex {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Você tem " + idade + " anos");

        entrada.close();
    }
}
