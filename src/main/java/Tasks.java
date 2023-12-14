import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasks {
    public static void task1() {
        try (Scanner scNum = new Scanner(System.in)) {
            int a = scNum.nextInt();
            if (a > 7) {
                System.out.print("Привет");
            }
        } catch (InputMismatchException e) {
            System.out.print("Некоректный тип данных");
        }

    }

    public static void task2() {
        Scanner scNum = new Scanner(System.in);
        String name = scNum.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.print("Привет, " + name);
        } else System.out.print("Нет такого имени");
    }

    public static void task3(int[] mass) {
        for (int a : mass) {
            if (a % 3 == 0) {
                System.out.print(a);
            }
        }
    }
}
