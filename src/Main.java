public class Main {
    public static void main(String[] args) {
        task1();
        task2();

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
        int clientOS = 0;
        int clientDeviceYear = 2013;
        if (clientOS == 0) ;
        {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }


        }
    }
}