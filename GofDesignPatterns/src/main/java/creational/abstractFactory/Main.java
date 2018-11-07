package creational.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface ICityCar {
    String carName();
}

interface ILuxuryCar {
    String carName();
}

interface ICarFactory {
    ICityCar getCityCar();
    ILuxuryCar getLuxuryCar();
}

class JapaneseCityCar implements ICityCar {

    @Override
    public String carName() {
        return "Toyota is a city car";
    }
}

class ItalianCityCar implements ICityCar {

    @Override
    public String carName() {
        return "Fiat is a city car";
    }
}


class ItalianLuxuryCar implements ILuxuryCar {

    @Override
    public String carName() {
        return "Ferrari is a luxury car";
    }
}

class JapaneseLuxuryCar implements ILuxuryCar {

    @Override
    public String carName() {
        return "Lexus is a luxury car";
    }
}

class ItalianCarFactory implements ICarFactory {

    @Override
    public ICityCar getCityCar() {
        return new ItalianCityCar();
    }

    @Override
    public ILuxuryCar getLuxuryCar() {
        return new ItalianLuxuryCar();
    }
}



class JapaneseCarFactory implements ICarFactory {

    @Override
    public ICityCar getCityCar() {
        return new JapaneseCityCar();
    }

    @Override
    public ILuxuryCar getLuxuryCar() {
        return new JapaneseLuxuryCar();
    }
}

public class Main {

    public static void main(String ...args) {
        ItalianCarFactory italianCarFactory = new ItalianCarFactory();
        JapaneseCarFactory japaneseCarFactory = new JapaneseCarFactory();

        ICityCar japaneseCityCar = japaneseCarFactory.getCityCar();
        ILuxuryCar japaneseLuxuryCar = japaneseCarFactory.getLuxuryCar();

        ICityCar italianCitycar = italianCarFactory.getCityCar();
        ILuxuryCar italianLuxuryCar = italianCarFactory.getLuxuryCar();

        System.out.println(italianCitycar.carName());
        System.out.println(italianLuxuryCar.carName());
        System.out.println(japaneseCityCar.carName());
        System.out.println(japaneseLuxuryCar.carName());
    }
}
