package creational.factory;

interface IAnimalFactory {
    default IAnimal getAnimalType(Class<?> className) throws Exception {
        return (IAnimal) className.getDeclaredConstructor().newInstance();
    }
}
