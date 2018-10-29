package behavioral.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Microsoft implements Iterable<Microsoft> {

    public Microsoft() {

    }

    private String name;

    private final Set<Microsoft> products = new LinkedHashSet<>();


    public void add(final Microsoft productName) {
        products.add(productName);
    }

    @Override
    public final Iterator<Microsoft> iterator() {
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
