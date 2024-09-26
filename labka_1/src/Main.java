import java.util.Scanner;
import java.util.Objects;

public class Main {

    static Scanner in = new Scanner(System.in);


    public static void q1() {
        ////////// Задание 1 ///////////
        System.out.println("Задание 1");
        int number = in.nextInt();
        int step = 0;

        System.out.println(number);
        while (number != 1) {
            step++;
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
        }
        System.out.println("КОличество шагов " + step);
    }

    public static void q2() {
        ////////// Задание 2 ///////////
        System.out.println("Задание 2");
        int number1 = in.nextInt();
        int summa = 0;
        int[] array = new int[number1];

        for (int i = 0; i < number1; i++) {
            int j = new Scanner(System.in).nextInt();
            array[i] = j;
        }

        for (int i = 0; i < number1; i++) {
            if (i % 2 == 0) {
                summa = summa + array[i];
            } else {
                summa = summa - array[i];
            }
        }
        System.out.println("Сумма = " + summa);

    }

    public static void q3() {
        ////////// Задание 3 ///////////
        System.out.println("Задание 3");
        int[] coord_nach = {0, 0};
        int[] coord_end = {0, 0};

        coord_end[0] = in.nextInt();
        coord_end[1] = in.nextInt();

        while (true) {
            String direction = in.next();
            if (Objects.equals(direction, "стоп")) break;
            int step = in.nextInt();

            switch (direction) {
                case "восток" -> coord_nach[0] += step;
                case "запад" -> coord_nach[0] -= step;
                case "север" -> coord_nach[1] += step;
                case "юг" -> coord_nach[1] -= step;
            }
        }
        System.out.println(2); // наикротчайший путь всегда составляет 2 шага
    }

    public static void q4() {
        ////////// Задание 4 ///////////
        System.out.println("Задание 4");
        int path_count = in.nextInt();
        int max_height = 0;10
        int number_path = 0;
        for (int j = 0; j < path_count; j++) {
            int tunnel_count = in.nextInt();
            int min_path_height = Integer.MAX_VALUE;
            for (int i = 0; i < tunnel_count; i++) {
                int current_height = in.nextInt();
                min_path_height = Integer.min(current_height, min_path_height);
            }
            if (min_path_height>max_height){
                max_height = min_path_height;
                number_path++;
            }
        }
        System.out.println(number_path);
        System.out.println(max_height);
    }

    public static void q5() {
        ////////// Задание 5 ///////////
        boolean flag = true;
        System.out.println("Задание 5");
        int number = in.nextInt();
        if (number>=100 & number<=999){
            int first = number/100;
            int second = (number/10)%10;
            int third = number%100;
            if ((first * second * third % 2 == (first + second + third) % 2) & (first * second * third % 2 == 0)){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        else{
            flag = false;
        }


        System.out.println(flag);
    }

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
    }
}