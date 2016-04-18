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

    //  @Test
//    public void stationeryInspector() {
//
//        List<Stationery> employee = new ArrayList<>();
//
//        Pen pen1 = new Pen(BigDecimal.valueOf(100.0), "big", CorporateColour.BLACK);
//        employee.add(pen1);
//        Rubber rubber1 = new Rubber(BigDecimal.valueOf(10.1), "big");
//        employee.add(rubber1);
//        CorporateColour colour = pen1.getColour();
//        String label = pen1.getLabel();
//        BigDecimal pen1Price = pen1.getPrice();
//        System.out.println(colour);
//        System.out.println(employee);
//        System.out.println(pen1.getLabel());
//        Stationery objPen = employee.get(0);
//        System.out.println(objPen.getClass());
//        System.out.println(objPen.getPrice());
//        BigDecimal a = stationeryPrice(employee);
//        System.out.println(a);
//    }

    private final String name;
    private final String surname;
    private final List<Stationery> set = new ArrayList<>(6);

    //
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Stationery> getSet() {
        return set;
    }

    //
    public Employee(String name, String surname, List<Stationery> set) {
        this.name = name;
        this.surname = surname;
        this.set.addAll(set);
        //addAll - adding from another collection

    }


    public BigDecimal stationeryPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Stationery st : set) {
            BigDecimal itemPrice = st.getPrice();
            totalPrice = totalPrice.add(itemPrice);
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", set=").append(set);
        sb.append('}');
        return sb.toString();
    }
}
