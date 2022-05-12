import java.util.Scanner;

public class Exercicio14Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        while(i != 1){
            System.out.print("Digite a senha\n> ");
            String senha = entrada.nextLine();
            if(senha.equals("R10p5")){
                System.out.println("Acesso concedido!");
                i = 1;
            }
        }
        entrada.close();
    }
    
}
