package aula05_quinta;

import java.util.Scanner;

public class Exercicio05Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for(int num = 1; num <= 5; num++){
            int cont = 1;
            int nota = 0;
            do{
                System.out.print("Digite a " + cont + " º nota do " + num + " º aluno\n> " );
                nota = nota += entrada.nextInt();
                cont++;
            }while(cont <= 3);
            
            double media_aluno = calcula_media(nota);
            System.out.println("A média do aluno é " + media_aluno + "\n");
        }

        entrada.close();
    }

    public static double calcula_media(int numero) {
        return numero / 3.0;
    }
}
