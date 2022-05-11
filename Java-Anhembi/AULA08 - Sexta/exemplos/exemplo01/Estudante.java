public class Estudante extends Pessoa1 {
    private int ra;
    private String curso, turma;

    // public Estudante(){}

    public Estudante(String nome, String email, String telefone, int ra){
        super(nome, email, telefone);
        this.ra = ra;
    }

    @Override 
    public String toString() {
        return super.toString() + " RA: " + ra;
    }
}