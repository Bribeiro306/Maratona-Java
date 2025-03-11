package Aula05EstruturasCondicionais;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo

        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("final de Semana");
                break;
            case 2:
                System.out.println("dia útil");
                break;
            case 3:
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("dia útil");
                break;
            case 5:
                System.out.println("dia útil");
                break;
            case 6:
                System.out.println("dia útil");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
        }
    }
}