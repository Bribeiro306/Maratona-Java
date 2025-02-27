package Maratona_Java;

public class Aula_04_Operadores {
    public static void main(String[] args) {
       /*  Operadores = (+)  (-)  (/)  (*)
       divisão de dois numeros inteiros o resultado é um numero inteiro
        */

        int numero1 = 10;
        int numero2 = 20;
        int resultado = (numero1 + numero2);

        System.out.println (resultado);
    // %
       int resto = 20 % 2;

       System.out.println(resto);

       // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDeDez = 10!=10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        // && (AND) || (OR) !

        int Salario = 5000;
        int Idade = 40;
        boolean isDentroDaLeiMaiorQueTrinta = Idade >= 30 && Salario >= 4000;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);


        double ValorTotalContaCorrente = 200;
        double ValorPoupança = 10000;
        int ValorVideoGame = 5400;
        boolean isVideogameCompravel = ValorTotalContaCorrente >= ValorVideoGame || ValorPoupança >= ValorVideoGame;

        System.out.println("isVideoGameCompravel " + isVideogameCompravel);

    }

}






