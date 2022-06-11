package ru.netology.stats.StatsService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findTotalSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 180;
        int actualSale = service.totalSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
    @Test
    public void findAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 15;
        int actualSale = service.averageSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 8;
        int actualSale = service.maxSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
    @Test
    public void findMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 9;
        int actualSale = service.minSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
    @Test
    public void findBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 5;
        int actualSale = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
    @Test
    public void findAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 5;
        int actualSale = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }
}
