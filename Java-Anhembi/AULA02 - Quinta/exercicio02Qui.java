import java.util.Scanner;

public class exercicio02Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = entrada.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade!");
        }else{
            System.out.println("É menor de idade!");
        }
        entrada.close();
    }
}
