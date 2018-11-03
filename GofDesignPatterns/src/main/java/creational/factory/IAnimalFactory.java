package creational.factory;

import java.lang.reflect.Constructor;

interface IAnimalFactory {
    default Constructor<?> getAnimalType(Class<?> className) throws Exception {
        return className.getDeclaredConstructor();
    }
}
