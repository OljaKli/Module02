package olja.klisho.task02;

import olja.klisho.task02.Coloured.CorporateColour;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Employee {

    @Test
    public void stationeryInspector() {

        List<Stationery> employee = new ArrayList<>();

        Pen pen1 = new Pen(BigDecimal.valueOf(100.0), "big", CorporateColour.BLACK);
        employee.add(pen1);
        Rubber rubber1 = new Rubber(BigDecimal.valueOf(10.1), "big");
        employee.add(rubber1);
        CorporateColour colour = pen1.getColour();
        String label = pen1.getLabel();
        BigDecimal pen1Price = pen1.getPrice();
        System.out.println(colour);
        System.out.println(employee);
        System.out.println(pen1.getLabel());
        Stationery objPen = employee.get(0);
        System.out.println(objPen.getClass());
        System.out.println(objPen.getPrice());
        BigDecimal a = stationeryPrice(employee);
        System.out.println(a);
    }


    public static BigDecimal stationeryPrice (List<Stationery> employee){
        BigDecimal totalPrice = BigDecimal.ZERO;
       for (int index = 0; index < employee.size(); index++) {
           BigDecimal itemPrice = employee.get(index).getPrice();
           totalPrice = totalPrice.add(itemPrice);
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

}
