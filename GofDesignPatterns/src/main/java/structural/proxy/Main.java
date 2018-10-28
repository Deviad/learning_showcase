package structural.proxy;

/*
    Maybe we could use also composition instead of extending from Subject.
 */

abstract class Subject
{
    public abstract void doSomeWork();
}


class ConcreteSubject extends Subject
{

    @Override
    public void doSomeWork()
    {
        System.out.println(" This is from a concrete subject");
    }
}

class Proxy extends Subject
{
    Subject cs;
    @Override
    public void doSomeWork()
    {
        System.out.println("Proxy call happening now");
        //Lazy initialization
        if (cs == null)
        {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}

public class Main {
    public static void main(String ...args) {
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
