import java.util.Scanner;

public class exercicio01Sex {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário:");
        double salario = teclado.nextDouble();

        if(salario <= 600){
            System.out.println("Isento");
        }else if(salario <= 1200){
            System.out.println("20%");
        }else if(salario <= 2000){
            System.out.println("25%");
        }else{
            System.out.println("30%");
        }

        teclado.close();
    }
}
