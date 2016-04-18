package olja.klisho.task02;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Ola-Mola on 27/03/16.
 */
abstract public class Stationery implements Comparable<Stationery> {

    public static final List<Stationery> STARTER_KIT = Collections.unmodifiableList(new ArrayList<Stationery>(3) {
        {
            add(new Notepad(BigDecimal.valueOf(77), "the office"));
            add(new Pencil(BigDecimal.valueOf(80), "Big", Coloured.CorporateColour.BLACK));
            add(new Rubber(BigDecimal.valueOf(10), "with elephant"));

        }
    });


    private final BigDecimal price;
    private final String label;

    public Stationery(BigDecimal price, String label) {
        this.price = price;
        this.label = label;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery that = (Stationery) o;
        return Objects.equals(price, that.price) &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, label);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stationery{");
        sb.append("price=").append(price);
        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public static class PriceComparator implements Comparator<Stationery> {

        @Override
        public int compare(Stationery o1, Stationery o2) {
            BigDecimal price1 = o1.getPrice();
            BigDecimal price2 = o2.getPrice();
            return price1.compareTo(price2);

        }
    }


//    public static class NameComparator implements Comparator<Stationery> {
//
//        @Override
//        public int compare(Stationery o1, Stationery o2) {
//            String name1 = o1.getLabel();
//            BigDecimal price2 = o2.getPrice();
//            return price1.compareTo(price2);
//
//        }
    //}

    @Override
    public int compareTo (Stationery other) {
        return this.getLabel().compareTo(other.getLabel());
    }

        public static class NameAndPriceComparator implements Comparator<Stationery> {

        @Override
        public int compare (Stationery o1, Stationery o2) {
            String label1 = o1.getLabel();
            String label2 = o2.getLabel();

            BigDecimal price1 = o1.getPrice();
            BigDecimal price2 = o2.getPrice();

            final int a = label1.compareTo(label2);
            if (a == 0) {
                return price1.compareTo(price2);
            } else  {
                return a;
            }

        }
    }
}
