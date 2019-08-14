package factory.ordinary;

public class AnimalsFactory {
    public static Animals getAnimals(String animalsType){
        if(animalsType == null){
            return null;
        }
        if(animalsType.equalsIgnoreCase("Dog")){
            return new Dog();
        }else if(animalsType.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        return null;
    }
}
