public class Pessoa1 {
    protected String nome, email, telefone;

    public Pessoa1(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override // Anotação indicando que o método foi sobrescrito
    public String toString(){
        return "Nome: " + nome;
    }
}
