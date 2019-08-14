package factory.abstractfactory;

public class AnimalsFactory extends AbstractFactory {
    @Override
    public Animals getAnimals(String animals) {
        if(animals == null){
            return null;
        }
        if(animals.equalsIgnoreCase("Dog")){
            return new Dog();
        }else if(animals.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        return null;
    }

    @Override
    public Kind getKind(String kind) {
        return null;
    }
}
