package aula06_quinta;

import java.util.Scanner;

public class Exercicio15Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o salário bruto\n> ");
        double salario = entrada.nextDouble();
        System.out.print("Digite o valor da prestação\n> ");
        double prestacao = entrada.nextDouble();

        double bruto = salario * 0.3;

        if(prestacao <= bruto){
            System.out.println("Pode ser concedido!");
        }else{
            System.out.println("Não pode ser concedido!");
        }

        entrada.close();
        
    }
    
}
