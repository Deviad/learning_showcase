package creational.factory;

interface IAnimalFactory {
    default Object getAnimalType(Class<?> className) throws Exception {
        return className.getDeclaredConstructor().newInstance();
    }
}
