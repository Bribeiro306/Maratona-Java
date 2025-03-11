package Aula07Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte , short , int , float e double o valor padrão é = 0
        //  char o valor padrão é Unicode = (\u0000)
        // String: O valor padrão é =  nulo
        // Booleano: O valor padrão é = false


        String[] nomes = new String[3];
        nomes[0] = "joão";
        nomes[1] = "Fernando";
        nomes[2] = "Bruno";
        for (int i = 0; i < nomes.length; i++) {


            System.out.println(nomes[i]);

        }


    }
}
