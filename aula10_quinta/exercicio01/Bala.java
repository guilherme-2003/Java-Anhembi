package exercicio01;
public class Bala {
    int x, y;

    public Bala(int x, int y){ 
        this.x = x;
        this.y = y;
    }

    public void setPosicaoX(int x){
        this.x = x;
    }

    public int getPosicaoX(int x){
        return x;
    }

    public void setPosicaoY(int y){
        this.y = y;
    }

    public int getPosicaoY(int y){
        return y;
    }
}
