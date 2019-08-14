package factory.ordinary;

public class AnimalsImpl {
    public static void main(String[] args) {
        Animals cat = AnimalsFactory.getAnimals("Cat");
        Animals dog = AnimalsFactory.getAnimals("Dog");
        cat.play();
        dog.play();
    }
}
