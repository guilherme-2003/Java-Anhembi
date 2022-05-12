import java.util.Scanner;

public class Exemplo04Qui07_04 {
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
        Exemplo04Qui07_04 p = new Exemplo04Qui07_04();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome\n> ");
        String nome = entrada.nextLine();
        System.out.print("Digite a sua idade\n> ");
        int idade = entrada.nextInt();
        System.out.print("Digite a sua altura\n> ");
        double altura = entrada.nextDouble();
        
        p.setNome(nome);
        p.setIdade(idade);
        p.setAltura(altura);

        System.out.println("Acessando dados...");
        System.out.println("Seu nome é " + p.getNome() + ", você tem " + idade + " anos e " + altura + "m de altura");

        entrada.close();
    }
}