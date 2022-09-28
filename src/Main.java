import java.time.LocalDate;

public class Main {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = (year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            return true;
        } else {
            return false;
        }
    }

    public static void printLeapYear(int year) {
        if (isLeapYear(year) == true) {
            System.out.println(year + " — високосный год.");
        } else {
            System.out.println(year + " — не високосный год.");
        }
    }

    public static void printOSAndYear(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS.");
            } else {
                System.out.println("Установите обычную версию приложения для iOS.");
            }
        } else if (clientOS == 1) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android.");
            } else {
                System.out.println("Установите обычную версию приложения для Android.");
            }
        }
    }

    public static void printDeliveryTerm(int deliveryDistance) {
        byte deliveryTerm = 1;
        if (deliveryDistance > 20) {
            deliveryTerm++;
        }
        if (deliveryDistance > 60) {
            deliveryTerm++;
        }
        System.out.println("Количество дней доставки — " + deliveryTerm + ".");
    }

    public static void main(String[] args) {
        // Задание - 1
        System.out.println("Задача №1");
        int year = 2000;
        printLeapYear(year);

        // Задание - 2
        System.out.println("Задача №2");
        int clientOS = 1;
        int deviceYear = 2019;
        printOSAndYear(clientOS, deviceYear);

        // Задание - 3
        System.out.println("Задача №3");
        int deliveryDistance = 95;
        printDeliveryTerm(deliveryDistance);
    }

}