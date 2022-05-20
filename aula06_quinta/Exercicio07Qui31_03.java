package aula06_quinta;

import java.util.Scanner;

public class Exercicio07Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o período do aluno\n(M - Matutino, V - Vespertino, N - Noturno)");
        String periodo = entrada.nextLine();

        if(periodo.equals("M") || periodo.equals("m")){
            System.out.println("Bom dia!");
        }else if(periodo.equals("V") || periodo.equals("v")){
            System.out.println("Boa tarde!");
        }else if(periodo.equals("N") || periodo.equals("n")){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Período inválido!");
        }

        entrada.close();
    }
    
}
