import java.util.Scanner;

public class exercicio01Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if(numero > 20){
            double metade = numero / 2;
            System.out.println("A metade do número é " + metade);
        }   

        entrada.close();

    }
}