package aula04_quinta;

public class Exemplo03Qui07_04 {
    private String nome;
    private int idade;
    private double altura;
    
    public void setNome(String nome){
        if (nome.contains("#")) {
            System.out.println("nome com #");
        }else {
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public static void main(String[] args) {
        Exemplo03Qui07_04 p = new Exemplo03Qui07_04();

        p.setNome("Guilherme");
        p.setIdade(18);
        p.setAltura(1.90);

        System.out.println("Acessando dados...");
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getAltura());
    }
}
