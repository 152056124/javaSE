package factory.abstractfactory;

public abstract class AbstractFactory {
    public abstract Animals getAnimals(String animals);
    public abstract Kind getKind(String kind);
}
