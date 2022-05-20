package aula06_quinta;

import java.util.Scanner;

public class Exercicio06Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro\n> ");
        int num = entrada.nextInt();

        if(num >= 50 && num <= 100){
            System.out.println("Pertence ao intervalo!");
        }else{
            System.out.println("Não pertence ao intervalo!");
        }

        entrada.close();
    }
    
}
