package aula09_quinta.exemplo01;

public class IDCard {
    private int anoIngresso, codigo, RA;
    private String universidade, curso;

    public IDCard(int anoIngresso, int codigo, int RA, String universidade, String curso){
        this.anoIngresso = anoIngresso;
        this.codigo = codigo;
        this.RA = RA;
        this.universidade = universidade;
        this.curso = curso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public String toString(){
        return "    Ano ingresso: " + anoIngresso + "\n" +
               "    Código: " + codigo + "\n" +
               "    RA: " + RA + "\n" +
               "    Universidade: " + universidade + "\n" + 
               "    Curso: " + curso + "\n";
    }

}
