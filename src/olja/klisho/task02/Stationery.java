package olja.klisho.task02;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
abstract public class Stationery {

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
