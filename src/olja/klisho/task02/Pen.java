package olja.klisho.task02;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Ola-Mola on 27/03/16.
 */
public class Pen extends Stationery implements Coloured {

    private final String label;
    private final CorporateColour colour;


    public Pen (BigDecimal price, String label, CorporateColour colour) {

     super(price);
     this.label = label;
     this.colour = colour;

    }

    public CorporateColour getColour () {
        return this.colour;
    }

    public String getLabel () {
        return this.label;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pen pen = (Pen) o;
        return Objects.equals(label, pen.label) &&
                colour == pen.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label, colour);
    }
}
