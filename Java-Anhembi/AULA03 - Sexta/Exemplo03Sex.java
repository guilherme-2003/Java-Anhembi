public class Exemplo03Sex {
    public static void main(String[] args) {
        int cont = 0; 
        int soma = 0;

        while(cont < 5){
            System.out.println(cont + "+");
            soma = soma + cont;
            cont++;
        }
        System.out.println("= " + soma);
    }
}
