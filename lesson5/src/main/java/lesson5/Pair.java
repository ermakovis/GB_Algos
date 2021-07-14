package lesson5;

import java.util.Objects;

public class Pair {
    private final double weight;
    private final double value;

    public Pair(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Double.compare(pair.weight, weight) == 0 && Double.compare(pair.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, value);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
