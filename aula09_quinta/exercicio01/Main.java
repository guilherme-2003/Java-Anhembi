package aula09_quinta.exercicio01;

public class Main {
    public static void main(String[] args) {
        Data nascimento = new Data(10, 05, 2000);
        Data contratacao = new Data(19, 07, 2021);
        Funcionario func = new Funcionario("Gui", "Engenheiro de dados", nascimento, contratacao);

        System.out.println(func);
    }
}
