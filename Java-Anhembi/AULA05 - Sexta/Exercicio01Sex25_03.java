import java.util.Random;

public class Exercicio01Sex25_03 {
    public static void main(String[] args) {
        final int QTDE_NUMEROS = 10;
        final int MAX_INT = 51;
        Random sorteio = new Random();
        int numeros[] = new int[QTDE_NUMEROS];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sorteio.nextInt(MAX_INT);
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\n");

        for (int i = numeros.length-1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
