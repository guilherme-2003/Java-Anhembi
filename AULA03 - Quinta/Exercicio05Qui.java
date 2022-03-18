import java.util.Scanner;

public class Exercicio05Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 1;

        while(idade != 0){
            System.out.print("\nQual a idade do candidato?\n> ");
            idade = entrada.nextInt();
            if(idade == 0){
                break;
            }
            System.out.println("Candidato tem " + idade + " anos");
            System.out.print("\nQual o sexo do candidato (M ou F)?\n> ");
            String sexo = entrada.next();
            if(sexo.equals("F")){
                System.out.println("Candidato é do sexo Feminino");
            }else if(sexo.equals("M")){
                System.out.println("Candidato é do sexo Masculino");
            }
            System.out.print("\nTem experiência no serviço (S ou N)?\n> ");
            String experiencia = entrada.next();
            if(experiencia.equals("S")){
                System.out.println("Candidato tem experiência!");
            }else if(experiencia.equals("N")){
                System.out.println("Candidato não tem experiência!");
            }
        }

        entrada.close();
    }
}
