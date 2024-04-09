package ru.netology.javaqa.javarest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthServiceTest {

    @Test

    public void testCalcNumberMonthsRest() {
        RestMonthService service = new RestMonthService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testNumberMonthsRest() {
        RestMonthService service = new RestMonthService();

        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

}
