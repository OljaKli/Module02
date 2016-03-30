package olja.klisho.task02;

import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Notepad extends Stationery {

    private final Double price;
    private final String label;

    public Notepad(Double price, String label) {

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
        Notepad notepad = (Notepad) o;
        return Objects.equals(price, notepad.price) &&
                Objects.equals(label, notepad.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, label);
    }
}
