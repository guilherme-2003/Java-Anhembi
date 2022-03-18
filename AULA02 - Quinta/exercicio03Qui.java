import java.util.Scanner;

public class exercicio03Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();

        if(num1 == num2){
            System.out.println("Números iguais!");
        }else if (num1 > num2){
            int sub = num1 - num2;
            System.out.println("A subtração é igual a " + sub);
        }else{
            int sub = num2 - num1;
            System.out.println("A subtração é igual a " + sub);
        }
        entrada.close();
    }
}
