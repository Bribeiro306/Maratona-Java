package Aula08ArraysMultidimensionais;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses do ano
        // 28,31,30,31,29 datas do meses
        int[][] dias = new int[3][3];
        dias[0][0] = 28;
        dias[0][1] = 31;
        dias[0][2] = 30;
        dias[1][0] = 31;
        dias[1][1] = 29;
        dias[1][2] = 26;
        dias[2][0] = 27;
        dias[2][1] = 21;
        dias[2][2] = 22;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------------------------");

        for (int[] arraysbase : dias) {
            for (int num : arraysbase)
                System.out.println(num);
        }
    }
}




