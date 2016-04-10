package olja.klisho.task01;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Ola-Mola on 16/03/16.
 */
public class Pen {

    private final String color;
    private final String label;
    private final BigDecimal price;

    public Pen(String color, String label, BigDecimal price) {
        this.color = color;
        this.label = label;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color) &&
                Objects.equals(label, pen.label) &&
                Objects.equals(price, pen.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, label, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("olja.klisho.task02.Pen{");
        sb.append("color='").append(color).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
