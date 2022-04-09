public class AppPlacar {
    public static void main(String[] args) {
        Placar p = new Placar();
        Placar p1 = new Placar("Santos", "Palmeiras");Placar p2 = new Placar("Santos", 5, "Palmeiras", 0);

        p.exibir();
        p1.exibir();
        p2.exibir();
    }
}
