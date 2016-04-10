package olja.klisho.task02;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Notepad extends Stationery {

    private final String label;

    public Notepad(BigDecimal price, String label) {

        super(price);
        this.label = label;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Notepad notepad = (Notepad) o;
        return Objects.equals(label, notepad.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
