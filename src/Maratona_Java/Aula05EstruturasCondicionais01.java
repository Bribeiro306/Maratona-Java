package Maratona_Java;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // IF

        int idade = 14;
        boolean isAutorizadoComprar = idade >= 18;
        if (isAutorizadoComprar) {
            System.out.println("Autorizado comprar bebida");
        }

        // ! (NOT)
        if (!isAutorizadoComprar) {
            System.out.println("Não autorizado comprar bebiba");
        }

        {
            // Else If

            int notas = 5;
            boolean isPassarDeAno = notas >= 6;
            if (isPassarDeAno) {
                System.out.println("Parabéns");
            } else
                System.out.println("Não passou");
        }
    }
}



