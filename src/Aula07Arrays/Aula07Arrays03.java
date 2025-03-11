package Aula07Arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }


        {
            int[] numeros = new int[]{11, 22, 33, 44, 55, 65, 77, 88, 99};
            for (int num : numeros) {
                System.out.println(num);

            }
        }
    }

}