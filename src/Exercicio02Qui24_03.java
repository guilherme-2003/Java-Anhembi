import java.util.Scanner;

public class Exercicio02Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:\n> ");
        int num = entrada.nextInt();
        boolean resultado = impar_par(num);
        
        System.out.println(resultado);
        
        entrada.close();
    }

    public static boolean impar_par(int numero) {
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
