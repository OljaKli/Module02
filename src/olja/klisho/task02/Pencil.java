package olja.klisho.task02;

import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Pencil extends Stationery implements Coloured {

    private final Double price;
    private final String label;
    private final CorporateColour colour;

    public Pencil (Double price, String label, CorporateColour colour) {
        this.price = price;
        this.label = label;
        this.colour = colour;

    }

    public CorporateColour getColour() {
        return this.colour;
    }

    public Double getPrice () {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pencil pencil = (Pencil) o;
        return Objects.equals(price, pencil.price) &&
                Objects.equals(label, pencil.label) &&
                Objects.equals(colour, pencil.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, label, colour);
    }
}
