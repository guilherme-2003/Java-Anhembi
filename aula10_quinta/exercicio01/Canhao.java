package exercicio01;
public class Canhao {
    Bala bala;
    double alcanceMaximo;

    public void disparar(double velocidade, double angulo){
        angulo = Math.toRadians(angulo);
        alcanceMaximo = ((2 * Math.pow(velocidade, 2)) * ((Math.sin(angulo) * Math.cos(angulo)) / 9.81));
    }

    public double getAlcanceMaximo(){
        return alcanceMaximo;
    }

    public Bala setBala(Bala bala){
        return bala;
    }
}
