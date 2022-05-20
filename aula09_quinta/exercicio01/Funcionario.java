package aula09_quinta.exercicio01;

public class Funcionario {
    private String nome, ocupacao;
    private Data dataNasc;
    private Data dataCont;

    public Funcionario(String nome, String ocupacao, Data dataNasc, Data dataCont) {
        this.nome = nome;
        this.ocupacao = ocupacao;
        this.dataNasc = dataNasc;
        this.dataCont = dataCont;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
               "Ocupação: " + ocupacao + "\n" +
               "Data Nascimento: " + dataNasc + "\n" +
               "Data Contratação: " + dataCont;
    }
}

