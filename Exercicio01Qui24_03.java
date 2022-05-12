import java.util.Scanner;

public class Exercicio01Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número:\n> ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número:\n> ");
        int num2 = entrada.nextInt();
        maior_menor(num1, num2);

        entrada.close();
    }

    public static void maior_menor(int numero1, int numero2) {
        if(numero1 > numero2){
            System.out.println("O maior é " + numero1);
        }else{
            System.out.println("O maior é " + numero2);
        }
    }
}
