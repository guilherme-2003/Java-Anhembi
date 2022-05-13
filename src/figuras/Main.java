package figuras;

public class Main {
    public static void main(String[] args) {
        // ArrayList<> lista = new ArrayList();
        FiguraGeometrica[] vetor = new FiguraGeometrica[10];
        vetor[0] = new Circulo("circle", 3);
        vetor[1] = new Circulo("c2", 4);
        vetor[2] = new Quadrado("q1", 5);
        vetor[3] = new Quadrado("q2", 6);
        vetor[4] = new Triangulo("t1", 2, 3);
        vetor[5] = new Triangulo("t2", 4, 3);
        vetor[6] = new Losango("l1", 5, 3);
        vetor[7] = new Losango("l2", 4, 7);
        vetor[8] = new Elipse("e1", 6, 9);
        vetor[9] = new Elipse("e2", 4, 6);

        for(FiguraGeometrica fig : vetor){
            System.out.println(fig.getNome());
            System.out.println(fig.calcularArea());
        }
        /* Circulo c1 = new Circulo("circulo", 2);
        Quadrado q1 = new Quadrado("quadrado", 3);
        Triangulo t1 = new Triangulo("triangulo", 4, 5);
        FiguraGeometrica f1 = new FiguraGeometrica("sla");

        System.out.println(c1.getNome());
        System.out.println(c1.calcularArea());

        System.out.println(q1.getNome());
        System.out.println(q1.calcularArea());

        System.out.println(t1.getNome());
        System.out.println(t1.calcularArea()); */

    }
}
