import java.util.Scanner;

public class Exercicio05Qui31_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número\n> ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número\n> ");
        double n2 = entrada.nextDouble();

        if(n2 > n1){
            System.out.println(n2 + " > " + n1);
        }else{
            System.out.println(n1 + " > " + n2);
        }


        entrada.close();
    }
    
}
