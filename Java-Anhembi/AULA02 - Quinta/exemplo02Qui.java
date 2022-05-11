import java.util.Scanner;

public class exemplo02Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tente acertar o número que eu estou pensando:");
        int chute = entrada.nextInt();

        if(chute == 15){
            System.out.println("Parabéns! Você acertou!");
        }else if (chute > 15){
            System.out.println("Chute acima do esperado!");
        }else{
            System.out.println("Chute abaixo do esperado!");
        }
        entrada.close();
    }
}
