import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de x");
        int x = entrada.nextInt();

        System.out.println("Digite o valor de y");
        int y = entrada.nextInt();

        System.out.println("Digite o valor de z");
        int z = entrada.nextInt();

        int maior = x;
        if(y > maior){
            maior = y;
        }if(z > maior){
            maior = z;
        }
        if(y == maior && z == maior){
            System.out.println("Os números são iguais!");
        }else{
            System.out.println("maior: " + maior);
        }

        entrada.close();

    }
}
