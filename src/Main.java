// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int accumulation = 29000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start);
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int growth = birthRate - deathRate;
        for (int i = 1; i <= 10; i = i + 1) {
            population = population + population * growth / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int accumulationAmount = 15000;
        int total = 0;
        int percent = 7;
        while (total < 12_000_000) {
            total = total + (total * percent) / 100;
            total = total + accumulationAmount;
            System.out.println("Месяц " + total + " рублей");

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int accumulationAmount = 15000;
        int total = 0;
        int percent = 7;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + (total * percent) / 100;
            total = total + accumulationAmount;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);

            }

        }
        System.out.println(total);
    }

    public static void task6() {
        System.out.println("Задача 6");
        int accumulation = 15000;
        int total = 0;
        int percent = 7;
        int i = 0;
        int month = 108;
        for (; i <= month; i++) {
            total = total + (total * percent) / 100;
            total = total + accumulation;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);

            }

        }
        System.out.println(total);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int i = 7;
        for (i = 1; i < 31; i++) {
            if (i % 7 == 0)
                System.out.println("Сегодня пятница " + i + " число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int i = 79;
        int past = 1823;
        int future = 2123;
        for (i = 0; i <= 2123; i = i + 79) {
            if (i >= past && i <= future)
                System.out.println(i);
        }
    }
}