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
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("На вашей ОС приложение еще не поддерживается.");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2004;
        float number = year / 4;
        int year100 = year / 100;
        float year400 = year / 400;
        if (year / number == 4 || (year == year100 * 100 && year / year400 == 400)) {
            System.out.println(year + " год - високосный!");
        } else {
            System.out.println(year + " год - не високосный!");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 100;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет " + deliveryDay + " день!");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Доставка займет " + (deliveryDay + 1) + " дня!");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Доставка займет " + (deliveryDay + 2) + " дня!");
            } else {
                System.out.println("К сожалению, доставки нет!");
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1: case 2: case 12:
                System.out.println("Это зима!");
                break;
            case 3: case 4: case 5:
                System.out.println("Это весна!");
                break;
            case 6: case 7: case 8:
                System.out.println("Это лето!");
                break;
            case 9: case 10: case 11:
                System.out.println("Это осень!");
                break;
            default:
                System.out.println("Не корректное число!");
        }
    }
}