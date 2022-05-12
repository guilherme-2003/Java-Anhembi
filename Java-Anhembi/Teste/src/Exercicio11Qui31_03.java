import java.util.Scanner;

public class Exercicio11Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notas[] = new double[11];

        for(int i = 1; i <= 10; i++){
            System.out.print("Digite a " + i + " º nota\n> ");
            notas[i] = entrada.nextDouble();
        }
        for(int i = 1; i <= 10; i++){
            System.out.print(notas[i] + ", ");
        }

        System.out.println();

        for(int i = 1; i <= 10; i++){
            System.out.print(notas[i] * 2 + ", ");
        }

        System.out.println();

        for(int i = 1; i <= 10; i++){
            double dividir = notas[i] / 3.0;
            System.out.printf("%.2f ", dividir);
        }

        entrada.close();
    }
    
}
