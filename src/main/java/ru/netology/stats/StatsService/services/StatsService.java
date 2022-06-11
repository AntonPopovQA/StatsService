package ru.netology.stats.StatsService.services;

public class StatsService {
    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
    }

    public int totalSales(int[] sales) { // Метод расчета суммы всех продаж
        int sum = 0;
        for (int a = 0; a < sales.length; a++) {
            sum += sales[a];
        }
        return sum;
    }

    public int averageSales(int[] sales) { // Метод расчета средней суммы продаж в месяц
        int sum = 0;
        for (int a : sales) {
            sum += a;
        }
        return sum / sales.length;
    }

    public int maxSales(int[] sales) { // Метод расчета месяца в котором осуществлены продажи на максимальную сумму
        int maxMonth = 0;
        int month = 0;
        for (int b : sales) {
            if (b >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) { // Метод расчета месяца в котором осуществлены продажи на минимальную сумму
        int minMonth = 0;
        int month = 0;
        for (int b : sales) {
            if (b <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) { // Метод расчета кол-ва месяцев, в которых продажи были ниже среднего
        int sum = 0;
        for (int c : sales) {
            if (c < averageSales(sales)) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public int aboveAverageSales(int[] sales) { // Метод расчета кол-ва месяцев, в которых продажи были выше среднего
        int sum = 0;
        for (int c : sales) {
            if (c > averageSales(sales)) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}
