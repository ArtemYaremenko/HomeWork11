import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 1992;
        int currentYear = LocalDate.now().getYear();
        byte clientOS = 1;
        int distanceDelivery = 45;
        //Task 1
        System.out.println("Task 1");
        checkYear(year);
        //Task2
        System.out.println("\nTask 2");
        installApp(clientOS, currentYear);
        //Task 3
        System.out.println("\nTask 3");
        int deliveryDays = calculateDeliveryDays(distanceDelivery);
        if (deliveryDays == 0) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Доставка в пределах " + distanceDelivery + " км занимает " + deliveryDays + " суток");
        }
    }

    //Task 1
    public static void checkYear(int year) {
        if (year > 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Task 2
    public static void installApp(byte clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //Task 3
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}
