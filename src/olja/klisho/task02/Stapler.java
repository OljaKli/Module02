package olja.klisho.task02;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Stapler extends Stationery{

    private final String label;

    public Stapler(BigDecimal price, String label) {

        super(price);
        this.label = label;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Stapler stapler = (Stapler) o;
        return Objects.equals(label, stapler.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
