package aula09_quinta.exercicio02;

public class Main {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("Gui", "(11) 98765-9089");
        Cachorro cachorro = new Cachorro("Shelby", "Pitbull", "Caramelo", 2009, proprietario);

        System.out.println(cachorro);
    }
}
