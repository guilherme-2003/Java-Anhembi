public class Funcionario {
    private String nome;
    private int horas, valor;

    public Funcionario(int horas, int valor){
        this.horas = horas;
        this.valor = valor;
    }

    @Override
    public int toInt(){
        return horas * valor;
    }
}
