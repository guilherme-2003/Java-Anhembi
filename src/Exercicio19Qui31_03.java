import java.util.Scanner;

public class Exercicio19Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[6];
        double maior = 0;

        for(int i = 1; i <= 5; i++){
            System.out.print("Digite o " + i + " º número\n> ");
            vetor[i] = entrada.nextDouble();
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        System.out.println(maior);

        entrada.close();
    }
    
}
