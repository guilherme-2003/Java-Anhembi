package aula09_quinta.exercicio02;

public class Cachorro {
    private String nome, raca, cor;
    private int anoNasc;
    private Proprietario proprietario;

    public Cachorro(String nome, String raca, String cor, int anoNasc, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNasc = anoNasc;
        this.proprietario = proprietario;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
               "Raça: " + raca + "\n" +
               "Cor: " + cor + "\n" +
               "Ano Nascimento: " + anoNasc + "\n" +
               "\nProprietário: " + "\n" + proprietario;
    }
}
