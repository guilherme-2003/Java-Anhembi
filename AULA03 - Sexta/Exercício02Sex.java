import java.util.Scanner;

public class Exercício02Sex {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;

        System.out.print("Escolha o número que deseja saber a tabuada: ");
        int valor = entrada.nextInt();

        
        while (cont <= 10){
            int operacao = valor * cont;
            System.out.println(valor + " x " + cont + " = " + operacao);
            cont++;
        }

        entrada.close();
    }
}
