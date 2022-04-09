public class AppImpressora {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        impressora.exibir(5.0);
        impressora.exibir(5.0, 5.0);
        impressora.exibir(5.0, "5.0");
        impressora.exibir("5.0", 5.0);
        impressora.exibir(5, 5, "5.0");
    }
}
