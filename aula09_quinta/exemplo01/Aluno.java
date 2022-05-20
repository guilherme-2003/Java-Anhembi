package aula09_quinta.exemplo01;

public class Aluno {
    private String nome;
    private int idade;
    private IDCard cartao;

    public Aluno(String nome, int idade, IDCard cartao){
        this.nome = nome;
        this.idade = idade;
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public IDCard getCartao() {
        return cartao;
    }

    public String toString(){
        return "Nome: " + nome + "\n" +
               "Idade: " + idade + "\n" +
               "IDCard: \n" + cartao + "\n";
    }
}
