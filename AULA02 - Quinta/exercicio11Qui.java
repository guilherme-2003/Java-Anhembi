import java.util.Scanner;

public class exercicio11Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if(idade < 5){
            System.out.println("O nadador não tem idade para competir em nenhuma das categorias!");
        }else if(idade <= 7){
            System.out.println("O nadador faz parte da Categoria Infantil A");
        }else if(idade <= 10){
            System.out.println("O nadador faz parte da Categoria Infantil B");
        }else if(idade <= 13){
            System.out.println("O nadador faz parte da Categoria Juvenil A");
        }else if(idade <= 17){
            System.out.println("O nadador faz parte da Categoria Juvenil B");
        }else{
            System.out.println("O nadador faz parte da Categoria Sênior");
        }
        entrada.close();
    }
}
