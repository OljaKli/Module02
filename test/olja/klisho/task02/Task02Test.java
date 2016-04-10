package olja.klisho.task02;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ola-Mola on 30/03/16.
 */
public class Task02Test {

    @Test
    public void testStationeryPrice() throws Exception {
        List<Stationery> employee = new ArrayList<>();

        Pen pen1 = new Pen(BigDecimal.valueOf(100), "big", Coloured.CorporateColour.BLACK);
        employee.add(pen1);

        Rubber rubber1 = new Rubber(BigDecimal.valueOf(10), "big");
        employee.add(rubber1);

        Scissors scissors1 = new Scissors(BigDecimal.valueOf(20), "godofscissors" );
        employee.add(scissors1);

        Stapler stapler1 = new Stapler(BigDecimal.valueOf(10), "theoffice");
        employee.add(stapler1);

        Notepad notepad1 = new Notepad(BigDecimal.valueOf(10), "blacknote");
        employee.add(notepad1);

        Pencil pencil1 = new Pencil(BigDecimal.valueOf(10.11), "parker", Coloured.CorporateColour.GREEN);
        employee.add(pencil1);

        BigDecimal price = Employee.stationeryPrice(employee);


        //System.out.println(price);
        assertEquals(BigDecimal.valueOf(160.11), price);

    }
}