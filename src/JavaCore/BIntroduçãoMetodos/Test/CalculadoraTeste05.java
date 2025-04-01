package JavaCore.BIntroduçãoMetodos.Test;

import JavaCore.BIntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(new int[]{1, 2, 3, 4, 5});

        calculadora.somaVarArgs(numeros);
    }

}
