package aula06_quinta;

import java.util.Scanner;

public class Exercicio13Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento\n> ");
        int ano_nasc = entrada.nextInt();
        System.out.print("Digite o ano atual\n> ");
        int ano_atual = entrada.nextInt();

        System.out.println("Sua idade é " + (ano_atual - ano_nasc) + " anos");
        System.out.println("Em 2030 você terá " + (2030 - ano_nasc) + " anos");

        entrada.close();
    }
    
}
