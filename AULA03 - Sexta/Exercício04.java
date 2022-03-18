import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        for(int cont=1; cont <= 5; cont++){
            System.out.print("Digite o " + cont + "° número:" + "\n" + "> ");
            int valor = entrada.nextInt();
            if((valor % 2) == 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("O total de pares é: " + pares + '\n' + "O total de impares é: " + impares);
            
        
        entrada.close();
    }
    
}
