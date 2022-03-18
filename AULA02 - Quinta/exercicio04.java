import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número decimal:");
        float num1 = entrada.nextFloat();
        System.out.println("Digite o segundo número decimal:");
        float num2 = entrada.nextFloat();

        if(num1 > num2){
            System.out.println("\n" + num1 + ", " + num2);
        }else{
            System.out.println("\n" + num2 + ", " + num1);
        }
        entrada.close();
    }
}
