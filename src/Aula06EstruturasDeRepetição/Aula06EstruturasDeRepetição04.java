package Aula06EstruturasDeRepetição;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // Condição é que o valor da parcela deve ser maior ou igual a 1000
        double ValorCarro = 30000;

        for (int parcela = 1; parcela <= ValorCarro; parcela++) {

            double ValorParcela = ValorCarro / parcela;


            if (ValorParcela <= 1000) break;

            System.out.println("Valor Parcela " + parcela + " $ " + ValorParcela);

        }


    }


}
