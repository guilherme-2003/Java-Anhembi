import java.util.Scanner;

public class Exercicio03Qui24_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        double base = entrada.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double altura = entrada.nextDouble();

        double area = area_triangulo(base, altura);
        System.out.println("A área do triângulo é " + area);
        entrada.close();
    }

    public static double area_triangulo(double num1, double num2) {
        return((num1 * num2) / 2.0);
    }
}
