package factory.abstractfactory;

public class KindFactory extends AbstractFactory {
    @Override
    public Animals getAnimals(String animals) {
        return null;
    }

    @Override
    public Kind getKind(String kind) {
        if (kind == null){
            return null;
        }
        if(kind.equalsIgnoreCase("Fish")){
            return new Fish();
        }else if(kind.equalsIgnoreCase("Poultry")){
            return new Poultry();
        }
        return null;
    }
}
