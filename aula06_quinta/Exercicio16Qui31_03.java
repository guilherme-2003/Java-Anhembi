package aula06_quinta;

import java.util.Scanner;

public class Exercicio16Qui31_03{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a idade do nadador\n> ");
        int idade = entrada.nextInt();

        if(idade < 5){
            System.out.println("Idade menor que 5 anos, nenhuma categoria disponível!");
        }else if(idade <= 7){
            System.out.println("Infantil A!");
        }else if(idade <= 10){
            System.out.println("Infantil B!");
        }else if(idade <= 13){
            System.out.println("Juvenil A!");
        }else if(idade <= 17){
            System.out.println("Juvenil A!");
        }else if(idade >= 18){
            System.out.println("Sênior!");
        }

        entrada.close();
    }
    
}
