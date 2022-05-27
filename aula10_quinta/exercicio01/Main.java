package exercicio01;
public class Main {
    public static void main(String[] args) {
        
        Canhao canhao = new Canhao();
        canhao.setBala(new Bala(0, 0));
        
        canhao.disparar(15, 25);
        System.out.println(canhao.getAlcanceMaximo());

        canhao.disparar(20, 25);
        System.out.println(canhao.getAlcanceMaximo());
    }
}
