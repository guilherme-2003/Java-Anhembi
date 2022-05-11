public class Robo {
    private int max_linhas, max_colunas, x, y;
    private char direcao;

    public Robo(int max_linhas, int max_colunas, char direcao){
        this.x = 0;
        this.y = 0;
        this.max_colunas = max_colunas;
        this.max_linhas = max_linhas;
        this.direcao = 'N';
    }
    public Robo(int max_colunas, int max_linhas, int x, int y, char direcao){
        this.x = x;
        this.y = y;
        this.max_colunas = max_colunas;
        this.max_linhas = max_linhas;
        this.direcao = 'N';
    }

    public void girarPara(char direcao){
        if(direcao == 'N' || direcao == 'n' || direcao == 'S' || direcao == 's' || direcao =='L' || direcao == 'l' || direcao == 'O' || direcao == 'o'){
            this.direcao = direcao;
        }
    }

    public String mostrarPosicao(){
        return x + "," + y;
    }
    
    public void andar(){
        if(x < max_linhas){
            if(direcao == 'L' || direcao == 'l'){
                x++;
            }
        }
        if(x > -max_linhas && x <= max_linhas){
            if(direcao == 'O' || direcao == 'O'){
                x--;
            }
        }
        if(y < max_colunas){
            if(direcao == 'N' || direcao == 'n'){
                y++;
            }
        }
        if(y > -max_colunas && y <= max_colunas){
            if(direcao == 'S' || direcao == 's'){
                y--;
            }
        }
    }

}
