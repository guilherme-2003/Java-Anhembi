import java.util.Scanner;

public class Exercício01Sex {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;

        System.out.print("Informe o limite: ");
        int num = entrada.nextInt();

        while (cont < num){
            cont++;
            System.out.print(cont + " ");
        }
    
        entrada.close();
    }
}
