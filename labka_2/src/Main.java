import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static Scanner in = new Scanner(System.in);


    public static void q1() {
        ////////// Задание 1 ///////////
        System.out.println("Задание 1");
        String str = in.nextLine();
        String max_unicum = "";
        int tmp = 0;
        for (int i = tmp; i < str.length(); i++) {
            String current_str = "";
            for (int j = tmp; j < str.length(); j++) {
                if (current_str.contains(String.valueOf(str.charAt(j)))) {
                    if (max_unicum.length() < current_str.length()) {
                        max_unicum = current_str;
                    }
                    tmp++;
                    break;
                }
                else {
                    current_str += str.charAt(j);
                    if (j == str.length() - 1) {
                        if (max_unicum.length() < current_str.length()) {
                            max_unicum = current_str;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("Макс подстрока  " + max_unicum);


    }



    public static void q2() {
        ////////// Задание 2 ///////////
        System.out.println("");
        System.out.println("Задание 2");
        int[] massive_1 = {1, 2, 3, 7, 9};
        int[] massive_2 = {8, 1, 5, 2, 4};
        int a_l = massive_1.length;
        int b_l = massive_2.length;
        int[] result = new int[a_l + b_l];
        int result_idx = 0;
        for (int i: massive_1) {
            result[result_idx] = i;
            result_idx++;
        }
        for (int j: massive_2) {
            result[result_idx] = j;
            result_idx++;
        }
        Arrays.sort(result);
        for (int i=0; i<(a_l+b_l); i++){
            System.out.print(result[i] + " ");
        }
        System.out.println("");
    }

    public static void q3() {
        ////////// Задание 3 ///////////
        System.out.println("");
        System.out.println("Задание 3");
        int[] massive_1 = {-100, 1, -23,  8, 12, -2, 13, 47};
        int a_l = massive_1.length;
        int time_summ = 0;
        int max_summ = Integer.MIN_VALUE;
        for (int k =0; k<a_l; k++){


            for (int step =2; step<=a_l; step++){

                time_summ = massive_1[k];
                for  (int i = k+1; i < step; i++) {

                    time_summ = time_summ+ massive_1[i];


                }
                if (max_summ<time_summ){
                    max_summ=time_summ;

                }

            }
        }
        System.out.println("Максимальная сумма подмасивов: " + max_summ );
    }

    public static void q4 () {
        ////////// Задание 4 ///////////
        System.out.println("");
        System.out.println("Задание 4");
        int[][] massive_1 =
                {{3, 6, 9, 12},
                        {2, 5, 8, 11},
                        {1, 4, 7, 10}};

        int massive_1_str = massive_1.length;
        int massive_1_col = massive_1[0].length;
        int[][] result = new int[massive_1_col][massive_1_str];
        for (int i = massive_1_str - 1; i >= 0; i--) {
            for (int j = 0; j < massive_1_col; j++) {
                result[j][massive_1_str - i - 1] = massive_1[i][j];
            }
        }
        System.out.println("повернутый массив на 90 градусов по часовой стрелке"   );
        System.out.println(Arrays.deepToString(result));
    }

    public static void q5() {
        ////////// Задание 5 ///////////
        System.out.println("");
        System.out.println("Задание 5");
        int[] massive_1 = {-100, 1, -23, 7, 9, -2, 13, 5, 7};
        int a_l = massive_1.length;
        int target = 14;
        for  (int i = 0; i < a_l-1; i++){
            for  (int j = i+1; j < a_l; j++){
                if (massive_1[i]+massive_1[j]==target){

                    System.out.println("2 элемента, сумма которых равна " + target + ". Это " + massive_1[i]  + " и " + massive_1[j] );
                }
            }
        }
    }

    public static void q6() {
        ////////// Задание 6 ///////////
        System.out.println("");
        System.out.println("Задание 6");
        int[][] massive_1 =
                {{16, 2, 3, 24, 35},
                {6, -97, 83, 9, -10}};
            int summ = 0;
            for (int[] str: massive_1) {
                for (int el : str) {
                    summ = summ + el;
                }
            }
        System.out.println("Сумма всех элементов двумерного массива равна: " + summ );
    }

    public static void q7() {
        ////////// Задание 7 ///////////
        System.out.println("");
        System.out.println("Задание 7");
        int[][] massive_1 =
                {{16, 2, 3, 24, 35},
                        {6, -97, 83, 9, -10}};
        int a_l = massive_1.length;
        int[] maxi = new int[a_l];
        for (int str = 0; str < a_l; str++) {
            int max_element = Integer.MIN_VALUE;
            for (int el = 0; el < massive_1[str].length; el++) {
                if (max_element < massive_1[str][el]) {
                    max_element = massive_1[str][el];
                }
                maxi[str] = max_element;
            }
        }
        for (int i =0; i<maxi.length; i++){
            System.out.println("Максимальные элемент в строке " + (i+1) + " двумерного массива: " + maxi[i]);
        }

    }
    public static void q8 () {
        ////////// Задание 8 ///////////
        System.out.println("");
        System.out.println("Задание 8");
        int[][] massive_1 =
                {{3, 6, 9, 12},
                        {2, 5, 8, 11},
                        {1, 4, 7, 10}};

        int massive_1_str = massive_1.length;
        int massive_1_col = massive_1[0].length;
        int[][] result = new int[massive_1_col][massive_1_str];
        for (int i = 0; i < massive_1_str; i++) {
            for (int j = massive_1_col - 1; j >= 0; j--) {
                result[massive_1_col - j - 1][i] = massive_1[i][j];
            }
        }
        System.out.println("повернутый массив на 90 градусов по часовой стрелке"   );
        System.out.println(Arrays.deepToString(result));
    }

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
    }
}