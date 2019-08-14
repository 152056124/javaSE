package factory.abstractfactory;

public class FactoryProducer {
    public static  AbstractFactory getFactory(String str){
        if (str == null){
            return null;
        }
        if(str.equalsIgnoreCase("Animals")){
            return new AnimalsFactory();
        }else if(str.equalsIgnoreCase("Kind")){
            return new KindFactory();
        }
        return null;

    }
}
