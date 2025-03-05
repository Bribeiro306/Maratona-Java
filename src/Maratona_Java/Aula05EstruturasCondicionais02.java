package Maratona_Java;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        Elo < 800 Categoria Bronze
        Elo >= 800 && Elo < 1600 Categoria Diamante
        Elo >= 1600 Categoria Challenger  */

        int elo = 2000;
        String categoria;

        if (elo < 800) {
            categoria = "Bronze";
        } else if  (elo >= 800 && elo <1600 ) {
                categoria = "Diamante";}
        else {
            categoria = "Challenger";
        }
            System.out.println(categoria);

        }
    }