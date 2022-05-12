import java.util.Scanner;

public class Robo {
    private char direcao;
    
    public void set_direcao(char direcao){
        this.direcao = direcao;
        if(direcao == 'N'){
            System.out.println("Indo para o norte!\n");
        }else if(direcao == 'S'){
            System.out.println("Indo para o sul!\n");
        }else if(direcao == 'L'){
            System.out.println("Indo para o leste\n!");
        }else if(direcao == 'O'){
            System.out.println("Indo para o Oeste!\n");
        }else if(direcao != 'Z'){
            System.out.println("\nDireção inválida!\nPor favor, digite uma direção existente.\n");
        }
    }
    public char get_direcao(){
        return direcao;
    }

    public class Main{
        public static void main(String[] args) {
            Robo p = new Robo();
            Scanner entrada = new Scanner(System.in);
            int indice = 0;

            while(indice == 0){
                System.out.print("Digite a direção que o robô deve seguir\n(N - Norte, S - Sul, L - Leste, O - Oeste, Z - Sair)\n> ");
                char sentido = entrada.next().charAt(0);

                sentido = Character.toUpperCase(sentido);

                p.set_direcao(sentido);

                if(sentido == 'Z'){
                    indice = 1;
                }
            }

            entrada.close();
        }
    }

}
