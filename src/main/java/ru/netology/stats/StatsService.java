package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long ans = 0;
        for (long sale : sales) {
            ans += sale;
        }
        return ans;
    }


    public long averageSales(long[] sales) {
        long sum = sum(sales);
        return sum / 12;
    }


    public int maxSalesMonth(long[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minSalesMonth(long[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int count = 0;
        long below = averageSales(sales);
        for (long sale : sales) {
            if (sale > below) {
                count++;
            }
        }
        return count;
    }

    public int salesAboveAverage(long[] sales) {
        int count = 0;
        long above = averageSales(sales);
        for (long sale : sales) {
            if (sale < above) {
                count++;
            }
        }
        return count;
    }
}