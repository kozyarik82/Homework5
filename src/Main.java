public class Main {
    public static void main(String[] args) {

        // Задача 1+2

        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }


      // Задача 3

        int year = 2022;
        if(year%4==0) {
            System.out.println(year + " год является високосным ");
        }else {
            System.out.println(year + " год не является високосным ");}

      // Задача 4

        int deliveryDistance = 22;
        int deliveryDay = 1;
        if(deliveryDistance<=20) {
            System.out.println(" Потребуется " + deliveryDay + " день ");
        }else if(deliveryDistance>20&&deliveryDistance<=60) {
            System.out.println(" Потребуется " + (deliveryDay + 1) + " дня ");
        }else if(deliveryDistance>60&&deliveryDistance<=100) {
            System.out.println(" Потребуется " + (deliveryDay + 2) + " дня ");
        }else if(deliveryDistance>100&&deliveryDistance<=140) {
            System.out.println(" Потребуется " + (deliveryDay + 3) + " дня ");
        }

        // Задача 5

        int monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень ");
                break;
            default:
                System.out.println(monthNumber + " месяца не существует ");
        }







        }









      }














