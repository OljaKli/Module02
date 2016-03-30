package olja.klisho.test.olja.klisho.task02;

import olja.klisho.task02.*;
import org.junit.Test;

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

        Pen pen1 = new Pen(100.0, "big", Coloured.CorporateColour.BLACK);
        employee.add(pen1);

        Rubber rubber1 = new Rubber(10.0, "big");
        employee.add(rubber1);

        Scissors scissors1 = new Scissors(20.0, "label11" );
        employee.add(scissors1);

        Stapler stapler1 = new Stapler(10.0, "staplerlab");
        employee.add(stapler1);

        Notepad notepad1 = new Notepad(10.0, "blacknote");
        employee.add(notepad1);

        Pencil pencil1 = new Pencil(10.11, "pencilLab", Coloured.CorporateColour.GREEN);
        employee.add(pencil1);

        Double price = Employee.stationeryPrice(employee);


        //System.out.println(price);
        assertEquals(160.11, price, 0.0001);

    }
}