package structural.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

interface Graphic {
    void print();
}

class CompositeGraphic implements Graphic {

    List<Graphic> childGraphics = new ArrayList<>();


    @Override
    public void print() {
        for(Graphic graphic: childGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}

class Ellipse implements Graphic {
    public void print() {
        System.out.println("Ellipse");
    }
}


public class Main {
    public static void main(String ...args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        graphic1.add(ellipse1);
        graphic2.add(ellipse2);
    }
}
