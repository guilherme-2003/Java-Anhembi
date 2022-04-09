public class Pessoa {
    private String nome;
    private double salario;

    public Pessoa(){
        nome = "Não cadastrado";
        salario = 0;
    }

    public Pessoa(String nomePessoa, double salarioPessoa){
        nome = nomePessoa;
        salario = salarioPessoa;
    }

    public void exibir() {
        System.out.println(nome.toUpperCase() + " R$" + salario);
    }
}
