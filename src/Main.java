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
        // Пишем код для задачи 1
        int treasure = 15_000;
        int deadMansChest = 0;
        int month = 0;
        while (deadMansChest < 2_459_000) {
            deadMansChest = deadMansChest + treasure;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + deadMansChest + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

        for (number = 10; number > 0;) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int birth = 17;
        int death = 8;
        int population = 12_000_000;
        for (int year = 1; year < 11; year++) {
            population = population + (population/1000*birth) - (population/1000*death);
            System.out.println("Год " +year+ " численность населения составит " +population+ " человек");
        }


    }
    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int monthPercent = 7;
        int month = 1;
        float deadMansChest = 15_000F;
        while (deadMansChest < 12_000_000) {
            deadMansChest = deadMansChest + deadMansChest*monthPercent/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + deadMansChest + " рублей");
        }


    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int monthPercent = 7;
        int month = 1;
        float deadMansChest = 15_000F;
        while (deadMansChest < 12_000_000) {
            deadMansChest = deadMansChest + deadMansChest*monthPercent/100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deadMansChest + " рублей");
            }
        }


    }

    public static void task6() {
        System.out.println("Задача 6");

        int monthPercent = 7;
        int month = 1;
        float deadMansChest = 15_000F;
        for (; month <= 9*12;) {
            deadMansChest = deadMansChest + deadMansChest * monthPercent / 100;
            month++;
            if (month %6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deadMansChest + " рублей");
            }
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        int friday = 3;
        int day = 1;

        while (day <= 31) {
            if (day == friday) {
                System.out.println("Сегодня пятница, " +day+ " число. Необходимо подготовить отчет.");
                friday += 7;
            }
            day++;

        }

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int cycle = 79;
        int year = 0;
        int currentYear = 2023;

        for (; year <= (currentYear + 100); year = year + cycle ) {
                if (year >= (currentYear-200) && year <= (currentYear + 100)) {
                System.out.println(year);
            }
        }
    }

}