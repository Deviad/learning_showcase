package structural.adapter;

class Calculator
{   Rect rectangle;
    double getArea(Rect r)
    {
        rectangle=r;
        return rectangle.l * rectangle.w;
    }
}
