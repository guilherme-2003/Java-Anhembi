package aula09_quinta.exercicio02;

public class Proprietario {
    private String nome, telefone;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone= telefone;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n";
    }
}
