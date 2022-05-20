package aula06_quinta;

import java.util.Scanner;

public class Exercicio10Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notas[] = new double[11];
        double media = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Digite a " + i + " º nota\n> ");
            notas[i] = entrada.nextDouble();
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(notas[i]);
            media = media + notas[i];
        }

        System.out.println("A média é " + media / 10.0);

        entrada.close();
    }
    
}
