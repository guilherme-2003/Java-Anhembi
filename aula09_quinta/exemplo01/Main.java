package aula09_quinta.exemplo01;

public class Main {
    public static void main(String[] args) {
        IDCard cartao = new IDCard(2015, 804, 21550041, "Anhembi", "CCO");
        Aluno aluno = new Aluno("Gui", 18, cartao);

        System.out.println(aluno);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCartao().getUniversidade());
    }
}
