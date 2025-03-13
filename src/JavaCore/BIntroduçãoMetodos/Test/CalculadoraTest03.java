package JavaCore.BIntroduçãoMetodos.Test;

import JavaCore.BIntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        {
            double result = calculadora.divideDoisNumeros(10, 2);
            System.out.println(result);

            System.out.println("---------------------------------------");

            calculadora.imprimimeDivisaoDeDoisNumeros(10, 10);
        }

    }
}