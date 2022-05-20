package aula08_quinta.figuras;

public class Losango extends FiguraGeometrica {
    
    private double d1, d2;

    public Losango(String nome, double d1, double d2){
        super(nome);
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double calcularArea(){
        return (d1 * d2) / 2;
    }
}
