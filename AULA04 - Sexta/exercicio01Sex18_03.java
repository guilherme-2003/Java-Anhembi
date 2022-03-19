import java.util.Scanner;

public class exercicio01Sex18_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Digite um valor inteiro:\n> ");
        numero = entrada.nextInt();

        System.out.println(numero + verificaPositivo(numero));
        entrada.close();
    }

    public static String verificaPositivo(int num) {
        if(num >= 0){
            return (" é positivo");
        }else{
            return (" é negativo");
        }
    }
}
