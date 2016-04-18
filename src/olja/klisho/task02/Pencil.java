package olja.klisho.task02;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Pencil extends Stationery implements Coloured {

    private final CorporateColour colour;

    public Pencil(BigDecimal price, String label, CorporateColour colour) {
        super(price, label);
        this.colour = colour;

    }

    public CorporateColour getColour() {
        return this.colour;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pencil pencil = (Pencil) o;
        return colour == pencil.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pencil{");
        sb.append("price=").append(getPrice());
        sb.append(", label='").append(getLabel()).append('\'');
        sb.append(", colour='").append(getColour()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
