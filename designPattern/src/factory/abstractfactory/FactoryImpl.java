package factory.abstractfactory;

public class FactoryImpl {
    public static void main(String[] args) {
        AbstractFactory animals = FactoryProducer.getFactory("Animals");
        Animals dog = animals.getAnimals("Dog");
        Animals cat = animals.getAnimals("Cat");
        dog.play();
        cat.play();
        AbstractFactory kind = FactoryProducer.getFactory("Kind");
        Kind fish = kind.getKind("Fish");
        Kind poultry = kind.getKind("Poultry");
        fish.play();
        poultry.play();
    }
}
