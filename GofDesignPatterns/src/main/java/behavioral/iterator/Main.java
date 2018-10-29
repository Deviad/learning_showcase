package behavioral.iterator;

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
