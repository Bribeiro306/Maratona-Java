package Maratona_Java;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while , do while , for

        int count = -1;
        while (count < 10)
            System.out.println(++count);


        count = 0;
        do {
            System.out.println("DentroDoWhile " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
