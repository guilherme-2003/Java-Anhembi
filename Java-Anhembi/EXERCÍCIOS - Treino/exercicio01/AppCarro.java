public class AppCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Volkswagem", "Gol", 50, 10, 1000);

        carro1.andar(5);

        System.out.println(carro1.exibir());

        carro1.abastecer(10);

        System.out.println(carro1.exibir());
    }
}
