package aula05_quinta;

import java.util.Scanner;

public class Exercicio07Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro:\n> ");
        int num = entrada.nextInt();

        boolean mostra_intervalo = intervalo(num);
        System.out.println(mostra_intervalo);

        entrada.close();
    }
    public static boolean intervalo(int numero) {
        if(numero >= 0 && numero <= 10){
            return true;
        }else{
            return false;
        }
    }
}
