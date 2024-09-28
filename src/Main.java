public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 2
        System.out.println("Задача 2");

        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версиюверсию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 3
        System.out.println("Задача 3");

        int year = 1949;
        if (year < 1584) {
            System.out.println("Год " + year + " не является высокостным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год " + year + " является высокостным");
        } else {
            System.out.println("Год " + year + " не является высокостным");
        }
        // task 4
        System.out.println("Задача 4");

        int deliveryDistance = 99;
        int days;

        if (deliveryDistance < 20) {
            days=1;
            System.out.println("Потребуется дней: " + days + " при доставке на " + deliveryDistance + " км");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days=2;
            System.out.println("Потребуется дней: " + days + " при доставке на " + deliveryDistance + " км");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days=3;
            System.out.println("Потребуется дней: " + days + " при доставке на " + deliveryDistance + " км");
        } else {
            System.out.println("На " + deliveryDistance + " км доставки нет");
        }
        // task 5
        System.out.println("Задача 5");

        int monthNumber = 8;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}