package aula05_quinta;

import java.util.Scanner;

public class Exercicio06Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        String vogal = entrada.next();

        boolean mostra_vogal = isVogal(vogal);
        System.out.println(mostra_vogal);

        entrada.close();
    }
    public static boolean isVogal(String letra) {
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            return true;
        }else{
            return false;
        }
    }
}
