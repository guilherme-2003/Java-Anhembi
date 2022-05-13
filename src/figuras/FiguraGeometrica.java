package figuras;
public abstract class FiguraGeometrica {
    private String nome;

    public FiguraGeometrica(String nome){
        this.nome = nome;
    }

    public double calcularArea(){
        return 0;
    }

    public String getNome(){
        return this.nome;
    }

}
