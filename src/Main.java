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


         // Задача 6

        int age = 19;
        int salary = 58000;
        int limitYoungerPerson = salary * 2;
        int limitAdultPerson = salary * 3;
        if (age>=23&&salary>=80000) {
            System.out.println(" Мы готовы выдать вам кредитную карту с лимитом " + (limitAdultPerson * 1.5) + " рублей ");
        }else if (age>=23&&salary<80000&&salary>=50000){
            System.out.println(" Мы готовы выдать вам кредитную карту с лимитом " + (limitAdultPerson * 1.2) + " рублей ");
        }else if (age>=23&&salary<50000) {
            System.out.println(" Мы готовы выдать вам кредитную карту с лимитом " + limitAdultPerson + " рублей ");
        }else if (age<23&&salary>=80000) {
            System.out.println(" Мы готовы выдать вам кредитную карту с лимитом " + (limitYoungerPerson * 1.5) + " рублей ");
        }else if (age<23&&salary>=50000&&salary<80000) {
            System.out.println(" Мы готовы выдать вам кредитную карту с лимитом " + (limitYoungerPerson * 1.2) + " рублей ");
        }else {
            System.out.println(" Мы готовы выдать вам кредитную карту с лимитом " + limitYoungerPerson + " рублей ");
        }

        // Задача 7

        age = 25;
        salary = 60000;
        double wantedSum = 330000;
        double baseRate = 10;
        double maxMonthlyPayment = salary / 2;
        double monthlyCreditPayment3080 = ((wantedSum/100*(baseRate-0.7)) + wantedSum)/12;
        double monthlyCreditPayment30 = ((wantedSum/100*baseRate) + wantedSum)/12;
        double monthlyCreditPayment2580 = ((wantedSum/100*(baseRate-0.7+0.5)) + wantedSum)/12;
        double monthlyCreditPayment25 = ((wantedSum/100*(baseRate+0.5)) + wantedSum)/12;
        double monthlyCreditPayment2280 = ((wantedSum/100*(baseRate-0.7+1)) + wantedSum)/12;
        double monthlyCreditPayment22 = ((wantedSum/100*(baseRate+1)) + wantedSum)/12;
        if (age >= 30 && salary >= 80000 && maxMonthlyPayment >= monthlyCreditPayment3080) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment3080 + " рублей . Одобрен! ");
        }else if (age >= 30 && salary >= 80000 && maxMonthlyPayment < monthlyCreditPayment3080) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment3080 + " рублей . Отказано! ");
        }else if (age >= 30 && salary < 80000 && maxMonthlyPayment >= monthlyCreditPayment30) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment30 + " рублей . Одобрен! ");
        }else if (age >= 30 && salary < 80000 && maxMonthlyPayment < monthlyCreditPayment30) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment30 + " рублей . Отказано! ");
        }else if (age<30&&age>=23&&salary>=80000&&maxMonthlyPayment>=monthlyCreditPayment2580) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment2580 + " рублей . Одобрен! ");
        }else if (age<30&&age>=23&&salary>=80000&&maxMonthlyPayment<monthlyCreditPayment2580) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment2580 + " рублей . Отказано! ");
        }else if (age<30&&age>=23&&salary<80000&&maxMonthlyPayment>=monthlyCreditPayment25) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment25 + " рублей . Одобрен! ");
        }else if (age<30&&age>=23&&salary<80000&&maxMonthlyPayment<monthlyCreditPayment25) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment25 + " рублей . Отказано! ");
        }else if (age < 23 && salary >= 80000 && maxMonthlyPayment >= monthlyCreditPayment2280) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment2280 + " рублей . Одобрен! ");
        }else if (age < 23 && salary >= 80000 && maxMonthlyPayment < monthlyCreditPayment2280) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment2280 + " рублей . Отказано! ");
        }else if (age < 23 && salary < 80000 && maxMonthlyPayment >= monthlyCreditPayment22) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment22 + " рублей . Одобрен! ");
        }else if (age < 23 && salary < 80000 && maxMonthlyPayment < monthlyCreditPayment22) {
            System.out.println(" Максимальный платеж при заработной плате " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyCreditPayment22 + " рублей . Отказано! ");
        }



        }
        }






































