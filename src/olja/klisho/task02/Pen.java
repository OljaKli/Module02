package olja.klisho.task02;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Pen extends Stationery implements Coloured {

    private final Double price;
    private final String label;
    private final CorporateColour colour;

    public Pen (Double price, String label, CorporateColour colour) {

     this.price = price;
     this.label = label;
     this.colour = colour;

    }

    public CorporateColour getColour () {
        return this.colour;
    }

    public String getLabel () {
        return this.label;
    }

    public Double getPrice () {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(price, pen.price) &&
                Objects.equals(label, pen.label) &&
                Objects.equals(colour, pen.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, label, colour);
    }
}
