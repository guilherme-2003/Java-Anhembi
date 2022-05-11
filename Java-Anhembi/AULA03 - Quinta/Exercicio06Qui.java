import java.util.Scanner;

public class Exercicio06Qui {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int total_alunos = 6;
        double media_geral = 0;
        int reprovado = 0;
        int exame = 0;
        int aprovado = 0;
        
        for(int num=1; num <= total_alunos; num++){
            do{
                System.out.print("Digite a primeira nota do aluno " + num + "\n> ");
                n1 = entrada1.nextInt();
            }while(n1 < 0 || n1 > 10);
            do{
                System.out.print("Digite a segunda nota do aluno " + num + "\n> ");
                n2 = entrada2.nextInt();
            }while(n2 < 0 || n2 > 10);
            double media = (n1+n2) / 2.0;
            System.out.print(media);
            media_geral += media;
            if(media <= 3){
                System.out.print(" - REPROVADO\n");
                reprovado++;
            }else if(media < 7){
                System.out.println(" - EXAME\n");
                exame++;
            }else if(media <= 10){
                System.out.println(" - APROVADO\n");
                aprovado++;
            }
        }

        System.out.printf("A média da turma é " + "%.2f" + "\n", (media_geral / total_alunos));
        System.out.println(aprovado + " alunos aprovados!");
        System.out.println(exame + " alunos precisam fazer o exame!");
        System.out.println(reprovado + " alunos reprovados!");

        entrada1.close();
        entrada2.close();
    }
}