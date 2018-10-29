package behavioral.iterator;

public class Main {
    public static void main(String ...args) {
        Microsoft msft = new Microsoft();
        msft.add(new Product().setName("Windows 1"));
        msft.add(new Product().setName("Windows 3.5"));
        msft.add(new Product().setName("Windows 95"));
        msft.add(new Product().setName("Windows 98"));
        msft.add(new Product().setName("Windows ME"));
        msft.add(new Product().setName("Windows NT"));
        System.out.print("[");
        for(Product product : msft) {
            System.out.print(" " + product.getName() + " ");
        }
        System.out.print("]");
    }
}
