import java.util.Scanner;

public class exercicio03Sex {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número:");
        double num1 = entrada.nextDouble();
        System.out.println("\nDigite a operação desejada:\nSoma (+)\nSubtração (-)\nMultiplicação (*)\nDivisão (/)");
        String operador = entrada.next();
        System.out.println("\nDigite o segundo número:");
        double num2 = entrada.nextDouble();

        switch(operador){
            case "+":
            double soma = num1 + num2;
            System.out.println("\n" + num1 + " + " + num2 + " = " + soma);
            break;

            case "-":
            double subtracao = num1 - num2;
            System.out.println("\n" + num1 + " - " + num2 + " = " + subtracao);
            break;

            case "/":
            double divisao = num1 / num2;
            System.out.println("\n" + num1 + " / " + num2 + " = " + divisao);
            break;

            case "*":
            double multiplicacao = num1 * num2;
            System.out.println("\n" + num1 + " x " + num2 + " = " + multiplicacao);
            break;
        }
        entrada.close();
    }
}
