package olja.klisho.task02;

import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Stapler extends Stationery{

    private final Double price;
    private final String label;

    public Stapler(Double price, String label) {

        this.price = price;
        this.label = label;
    }

    public Double getPrice () {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stapler stapler = (Stapler) o;
        return Objects.equals(price, stapler.price) &&
                Objects.equals(label, stapler.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, label);
    }
}
