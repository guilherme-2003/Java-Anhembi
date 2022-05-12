import java.util.Scanner;

public class Exercicio20Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[11];
        double maior = 0;
        double menor = 999999999;
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Digite o " + i + " º número\n> ");
            vetor[i] = entrada.nextDouble();
            if(vetor[i] > maior){
                maior = vetor[i];
            }if(vetor[i] < menor){
                menor = vetor[i];
            }  
        }

        System.out.println("O maior número do vetor é " + maior);
        System.out.println("O menor número do vetor é " + menor);
        System.out.println("A diferença entre os dois é " + (maior - menor));
        
        entrada.close();
    }
    
}
