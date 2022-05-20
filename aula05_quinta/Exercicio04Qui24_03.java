package aula05_quinta;

import java.util.Scanner;

public class Exercicio04Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for(int num = 1; num <= 3; num++){
            System.out.println("Digite o " + num + "° número");
            soma = soma += entrada.nextInt();
        }
        
        double mostra_media = media(soma);
        System.out.println(mostra_media);

        entrada.close();
    }
    public static double media(int numero) {
        return(numero / 3.0);
    }
}
