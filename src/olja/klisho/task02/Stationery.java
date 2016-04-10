package olja.klisho.task02;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Ola-Mola on 27/03/16.
 */
abstract public class Stationery {

    public static final List<Stationery> STARTER_KIT = Collections.unmodifiableList(new ArrayList<Stationery>(3) {
        {
            add(new Notepad(BigDecimal.valueOf(77), "the office"));
            add(new Pencil(BigDecimal.valueOf(80), "Big", Coloured.CorporateColour.BLACK));
            add(new Rubber(BigDecimal.valueOf(10), "with elephant"));

        }
    });

//    static {
//        STARTER_KIT.add(new Pen(BigDecimal.valueOf(80), "Big", Coloured.CorporateColour.BLACK));
//    }

    private final BigDecimal price;

    public Stationery(BigDecimal price) {
        this.price = price;
    }

    public  BigDecimal getPrice(){
        return this.price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery that = (Stationery) o;
        return Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
