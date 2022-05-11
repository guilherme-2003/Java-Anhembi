import java.util.Scanner;

public class fases {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fases_completadas, total_fases;

        System.out.print("Digite a quantidade de fases completadas no jogo:\n> ");
        fases_completadas = entrada.nextInt();
        System.out.print("Digite a quantidade total de fases no jogo:\n> ");
        total_fases = entrada.nextInt();
        double percentual = (fases_completadas * 100.0) / total_fases; 
        System.err.printf("Você completou %.2f%% das fases do jogo!\n", percentual);

        entrada.close();
    }
}
