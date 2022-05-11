import java.util.Scanner;

public class exercicio04Sex {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double num = entrada.nextDouble();

        System.out.println(num >=0 ?"Positivo":"Negativo");

        entrada.close();
    }
}
