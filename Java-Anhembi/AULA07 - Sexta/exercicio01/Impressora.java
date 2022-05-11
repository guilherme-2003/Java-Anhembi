public class Impressora {
    public void exibir(double num) {
        System.out.println(num);
    }
    public void exibir(double num1, double num2) {
        System.out.println(num1 + ", " + num2);
    }
    public void exibir(double num, String texto) {
        System.out.println(num + ", " + texto);
    }
    public void exibir(String texto, double num) {
        System.out.println(texto + ", " + num);
    }
    public void exibir(int num1, int num2, String texto) {
        System.out.println(num1 + ", " + num2 + ", " + texto);
    }
}
