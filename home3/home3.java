import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class home3 {

    private static final String TASK_MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Задача 1"
            + "\n\t2 - Задача 2"
            + "\n\t5 - Вернуться в главное меню"
            + "\n\t0 - Выход";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(TASK_MENU);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Такого действия не существует!");
                    break;
            }
        }
    }

    public static void task1() {
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него четные числа");
        ArrayList<Integer> num_arr = new ArrayList<>(); 
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) { 
            num_arr.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Исходный массив: " + num_arr);
        for (int i = 0; i < num_arr.size(); i++) {
            if (num_arr.get(i) % 2 == 0) {
                num_arr.remove(i);
                i--;
            }
        }

        System.out.println("Массив нечетных чисел: " + num_arr + "\n");
    }

    public static void task2() {
        System.out.println("Задан целочисленный список ArrayList." +
                " Найти минимальное, максимальное и среднее ариф. из этого списка\n");

        ArrayList<Integer> num2_arr = new ArrayList<>(); 
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            num2_arr.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Дан массив: " + num2_arr + "\n");
        int min = num2_arr.get(0);
        int max = num2_arr.get(0);
        int sum = 0;

        for (int i = 0; i < num2_arr.size(); i++) {
            max = max < num2_arr.get(i) ? num2_arr.get(i) : max;
            min = min > num2_arr.get(i) ? num2_arr.get(i) : min;
            sum += num2_arr.get(i);
        }

        System.out.println("Максимальное число в массиве : " + max +
                "\nМинимальное число в массиве : " + min +
                "\nсреднее арифметическое в массиве : " + sum / num2_arr.size());
    }

}
