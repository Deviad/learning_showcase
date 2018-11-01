package structural.composite;

public class Main {
    public static void main(String ...args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic1.add(ellipse1);
        graphic2.add(ellipse2);
        graphic3.add(graphic1);
        graphic3.add(graphic2);
        graphic3.print();
    }
}
