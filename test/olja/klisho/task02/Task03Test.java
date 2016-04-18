package olja.klisho.task02;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ola-Mola on 10/04/16.
 */
public class Task03Test {

    @Test
    public void testStationeryPrice() throws Exception {
        Employee employee1 = new Employee("Pavel", "Barashkin", Stationery.STARTER_KIT);
        System.out.println(employee1);

        BigDecimal priceOfSet = employee1.stationeryPrice();

        assertEquals(BigDecimal.valueOf(167), priceOfSet);
    }
}