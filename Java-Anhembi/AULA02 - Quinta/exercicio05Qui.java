import java.util.Scanner;

public class exercicio05Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();

        if(num >= 50 && num <= 100){
            System.out.println("\n" + num + " pertence ao intervalo!");
        }else{
            System.out.println("\n" + num + " não pertence ao intervalo!");
        }
        entrada.close();
    }
}
