package olja.klisho.task01;

import java.util.Objects;

/**
 * Created by Ola-Mola on 16/03/16.
 */
public class Pen {

    private String color;
    private String label;
    private Double Price;

    public Pen(String color, String label, Double price) {
        this.color = color;
        this.label = label;
        this.Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color) &&
                Objects.equals(label, pen.label) &&
                Objects.equals(Price, pen.Price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, label, Price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("olja.klisho.task01.Pen{");
        sb.append("color='").append(color).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", price=").append(Price);
        sb.append('}');
        return sb.toString();
    }
}
