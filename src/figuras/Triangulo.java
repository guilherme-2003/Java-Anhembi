package figuras;
public class Triangulo extends FiguraGeometrica{
    
    private double base, altura;

    public Triangulo(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }

}