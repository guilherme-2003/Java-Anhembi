import java.util.Scanner;

public class Exercicio17Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número\n> ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número\n> ");
        double num2 = entrada.nextDouble();
        System.out.print("Digite sua escolha\n(M - Média, S - Diferença, P - Produto, D - Divisão)\n> ");
        char escolha = entrada.next().charAt(0);

        if(escolha == 'm' || escolha == 'M'){
            System.out.println("A média é " + (num1 + num2) / 2.0);
        }else if(escolha == 's' || escolha == 'S'){
            if(num1 > num2 || num1 == num2){
                System.out.println("A diferença é " + (num1 - num2));
            }else{
                System.out.println("A diferença é " + (num2 - num1));
            }
        }else if(escolha == 'P' || escolha == 'p'){
            System.out.println("A soma é " + (num1 + num2));
        }else{
            System.out.println("O resto da divisão é " + (num1 / num2));
        }

        entrada.close();
    }
    
}
