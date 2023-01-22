public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int dateRelease = 2016;
        if (clientOS == 1 && dateRelease > 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1 && dateRelease <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && dateRelease > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        short year = 2004;
        if ((year % 400) == 0) {
            System.out.println("високосный год");
        } else if ((year % 100) == 0) {
            System.out.println("невисокосный год");
        } else if ((year % 4) == 0) {
            System.out.println("високосный год");
        } else
            System.out.println("невисокосный год");
    }


    public static void task4() {
        System.out.println("Задача 4");
        short deliveryRange = 80, deliveryTime;
        if (deliveryRange <= 20) {
            deliveryTime = 1;
        } else if (deliveryRange > 20 && deliveryRange <= 60) {
            deliveryTime = 2;
        } else if (deliveryRange > 60 && deliveryRange <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;

        }
        if (deliveryTime == 0) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 6;
        switch (monthNumber) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
            default:
                break;

        }

    }
}