package JavaCore.BIntroduçãoMetodos.Dominio;

public class Calculadora {
    public void somaDoisNumero() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumero() {
        System.out.println(123 - 21);
    }

    public void multipliqueDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void imprimimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 90;
        num2 = 21;
    }
}
