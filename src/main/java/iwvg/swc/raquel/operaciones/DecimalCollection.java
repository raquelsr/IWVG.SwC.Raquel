package iwvg.swc.raquel.operaciones;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;
    
    static final String EMPTY_COLLECTION = "Empty collection";

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    
    public double media() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION);
        }
        return this.sum() / this.size();
    }

}
