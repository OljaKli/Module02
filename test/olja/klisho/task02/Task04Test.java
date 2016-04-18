package olja.klisho.task02;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ola-Mola on 16/04/16.
 */
public class Task04Test {
//
//    public static <T> void sort(List<T> list,
//                                Comparator<? super T> c)

    @Test
    public void testSortByPrice() throws Exception {
        List<Stationery> starterKit = new ArrayList<>(Stationery.STARTER_KIT);
        System.out.println(starterKit);
        starterKit.sort(new Stationery.PriceComparator());
        System.out.println("Sort by price:");
        System.out.println(starterKit);

        for (int i = 1; i < starterKit.size(); i++) {
            Stationery s1 = starterKit.get(i-1);
            Stationery s2 = starterKit.get(i);
            assertTrue(s2.getPrice().compareTo(s1.getPrice()) > 0);
        }
    }

    @Test
    public void testSortByLabel() throws Exception {
        List<Stationery> starterKit = new ArrayList<>(Stationery.STARTER_KIT);
        System.out.println(starterKit);
        Collections.sort(starterKit);
        System.out.println("Sort by label:");
        System.out.println(starterKit);

        for (int i = 1; i < starterKit.size(); i++) {
            Stationery s1 = starterKit.get(i-1);
            Stationery s2 = starterKit.get(i);
            assertTrue(s2.getLabel().compareTo(s1.getLabel()) > 0);
        }
    }

    @Test
    public void testGeneralSort() throws Exception {
        List<Stationery> list1 = new ArrayList<>(6);

        list1.add(new Pen(BigDecimal.valueOf(100.0), "big", Coloured.CorporateColour.BLACK));
        list1.add(new Rubber(BigDecimal.valueOf(90.1), "sterka"));
        list1.add(new Pencil (BigDecimal.valueOf(80.1), "big", Coloured.CorporateColour.BLACK));
        list1.add(new Scissors(BigDecimal.valueOf(70.1), "cutter"));
        list1.add(new Stapler(BigDecimal.valueOf(60.1), "stap"));
        list1.add(new Notepad(BigDecimal.valueOf(50.1), "note"));

        System.out.println(list1);
        list1.sort(new Stationery.NameAndPriceComparator());
        System.out.println("Sorted by name and price:");
        System.out.println(list1);

//        for (int i = 1; i < list1.size(); i++) {
//            Stationery s1 = list1.get(i-1);
//            Stationery s2 = list1.get(i);
//            assertTrue(s2.getLabel().compareTo(s1.getLabel()) > 0);
//    }
}}