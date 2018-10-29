package behavioral.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Microsoft implements Iterable<Product> {

    public Microsoft() {

    }

    private String name;

    private final Set<Product> products = new LinkedHashSet<>();


    public void add(final Product product) {
        products.add(product);
    }

    @Override
    public final Iterator<Product> iterator() {
        return products.iterator();
    }

    public String getName() {
        return name;
    }

    public Microsoft setName(String name) {
        this.name = name;
        return this;
    }
}
