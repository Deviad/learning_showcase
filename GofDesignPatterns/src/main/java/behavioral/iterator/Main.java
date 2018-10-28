package behavioral.iterator;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;




class Microsoft implements Iterable<Microsoft> {

    public Microsoft() {

    }

    private String name;

    private Set<Microsoft> products = new HashSet<>();


    public void add(final Microsoft productName) {
        products.add(productName);
    }

    @Override
    public Iterator<Microsoft> iterator() {
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
public class Main {
    public static void main(String ...args) {
        Microsoft msft = new Microsoft();
        msft.add(new Microsoft().setName("Windows 1"));
        msft.add(new Microsoft().setName("Windows 3.5"));
        msft.add(new Microsoft().setName("Windows 95"));
        msft.add(new Microsoft().setName("Windows 98"));
        msft.add(new Microsoft().setName("Windows ME"));
        msft.add(new Microsoft().setName("Windows NT"));
        System.out.print("[");
        for(Microsoft product : msft) {
            System.out.print(" " + product.getName() + " ");
        }
        System.out.print("]");
    }
}
